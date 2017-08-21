package com.df.controller;

import com.df.component.mq.JmsProducers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuchengdong@qbao.com on 2017/8/21.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private JmsProducers jmsProducers;

    @RequestMapping("/sendJms/{msg}")
    public String sendJms(@PathVariable(name = "msg") String msg) {
        jmsProducers.sendMessage(msg);
        return "ok";
    }
}