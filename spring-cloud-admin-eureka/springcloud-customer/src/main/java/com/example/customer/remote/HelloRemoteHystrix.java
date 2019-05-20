package com.example.customer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName HelloRemoteHystrix
 * @Description TODO
 * @Author liuyy
 * @Date 2019/5/20 17:06
 **/
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "hello "+name+",this message sent failed";
    }
}
