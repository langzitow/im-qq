package cn.ywt.usermanage.util.redis.config;


import org.springframework.beans.factory.annotation.Value;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class MyJedisPoolConfig {

    private MyJedisPoolConfig(){
    }

    private static String host;
    private static int port;
    private static String password;
    private static int timeout=3000;
    private static Integer db;


    @Value("${spring.redis.host}")
    public void setRedisHost(String host) {
        MyJedisPoolConfig.host = host;
    }

    @Value("${spring.redis.port}")
    public void setRedisPort(int redisPort) {
        MyJedisPoolConfig.port = redisPort;
    }

    @Value("${spring.redis.password}")
    public void setAuth(String password) {
        MyJedisPoolConfig.password = password;
    }

    @Value("${spring.redis.db}")
    public void setDb(int db){
        MyJedisPoolConfig.db = db;
    }

    private static class innerClass {

        //静态内部类保存一个jedisPool的实例
        private static JedisPool jedisPool = new JedisPool(getConfig(), host, port,timeout, password,db);

        private static JedisPoolConfig getConfig() {
            JedisPoolConfig poolConfig = new JedisPoolConfig();
            //========= jedisPool的一些配置=============================
            poolConfig.setMaxTotal(10000);//最大连接数
            poolConfig.setMaxIdle(50);//最多空闲数
            poolConfig.setMaxWaitMillis(5 * 1000);//当池中没有连接时，最多等待5秒
            return poolConfig;
        }
    }
    public static JedisPool getJedisPool(){

        return innerClass.jedisPool;
    }

}
