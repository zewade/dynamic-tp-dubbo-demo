package cn.zewade.dynamictpdubbodemo.provider;

import cn.zewade.dynamictpdubbodemo.api.HelloDubboService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author wade
 * @date 2022/11/21 10:06
 **/
@DubboService
public class HelloDubboServiceImpl implements HelloDubboService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
