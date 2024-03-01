package cn.ywt.usermanage.user.status.service.impl;

import cn.ywt.usermanage.user.status.service.UserStatusService;
import cn.ywt.usermanage.util.redis.config.MyJedisPoolConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 *  redis  user status
 */
public class RedisUserStatusServiceImpl implements UserStatusService {
    private static final Logger logger = LoggerFactory.getLogger(RedisUserStatusServiceImpl.class);
    private static final String USER_CONN_STATUS_KEY = "IM:USER_CONN_STATUS:USERID:";

    private JedisPool jedisPool = MyJedisPoolConfig.getJedisPool();


    @Override
    public String online(String userId, String connectorId) {
        logger.debug("[user status] user online: userId: {}, connectorId: {}", userId, connectorId);
        try(Jedis jedis = jedisPool.getResource()){
            String oldConn = jedis.hget(USER_CONN_STATUS_KEY, userId);
            jedis.hset(USER_CONN_STATUS_KEY,userId,connectorId);
            return oldConn;
        }catch (Exception e){
            logger.error(e.getMessage(),e);
            return null;
        }
    }

    @Override
    public void offline(String userId) {
        logger.debug("[user status] user offline: userId: {}", userId);

        try (Jedis jedis = jedisPool.getResource()) {
            jedis.hdel(USER_CONN_STATUS_KEY, userId);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
    }

    @Override
    public String getConnectorId(String userId) {
        try (Jedis jedis = jedisPool.getResource()) {
            return jedis.hget(USER_CONN_STATUS_KEY, userId);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }
}
