package com.df.tbakendcontroller.testcontroller;

import com.df.tbakenddomain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    @ResponseBody
    public User helloTest(){
        return new User("hello world!",28);
    }
}
