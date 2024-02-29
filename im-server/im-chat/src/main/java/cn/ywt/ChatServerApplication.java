package cn.ywt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.ywt.mapper")
@SpringBootApplication
public class ChatServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ChatServerApplication.class,args);
    }
}
