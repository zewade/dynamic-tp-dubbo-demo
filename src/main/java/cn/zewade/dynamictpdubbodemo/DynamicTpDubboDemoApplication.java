package cn.zewade.dynamictpdubbodemo;

import com.dtp.core.spring.EnableDynamicTp;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo(scanBasePackages = "cn.zewade.dynamictpdubbodemo.provider")
@EnableDynamicTp
@SpringBootApplication
public class DynamicTpDubboDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicTpDubboDemoApplication.class, args);
    }

}
