package club.fuwenhao.controller;

import club.fuwenhao.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DemoService demoService;


    @RequestMapping("/consumer/user/say")
    public String sayHello() {
        String result = demoService.sayHello("fwh-Controller");
        return result;
    }
}
