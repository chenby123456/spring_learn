package com.cby.sl.controller;

import com.cby.sl.config.UserCollection;
import com.cby.sl.entity.User;
import com.cby.sl.service.SlService;
import com.cby.sl.utils.ContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "sl")
public class SlController {

    @Autowired
    private ContextAware contextAware;
    @Autowired
    private UserCollection userCollection;

    @RequestMapping(value = "test")
    public String getObject(){
        SlService object = contextAware.getObject(SlService.class);
        object.test();
        Map<String, User> map = userCollection.getUsers();
        return "SUCCESS";
    }

}
