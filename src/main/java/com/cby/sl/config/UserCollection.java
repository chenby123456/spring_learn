package com.cby.sl.config;

import com.cby.sl.entity.User;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @ConfigurationProperties注解的使用
 * 需要注意的是如果是要注入到一个map中，那么map的命名是有一定的要求的
 * map的命名格式必须是配置文件中最后一个相同的key
 *
 * spring.users.parent.id=1
 * spring.users.parent.userName=chenby
 * spring.users.parent.mobile=18301148265
 *
 * spring.users.wife.id=2
 * spring.users.wife.userName=liyj
 * spring.users.wife.mobile=15737178039
 *
 * 如上，map命名必须是users，否则无法注入
 */
@Configuration
@ConfigurationProperties(prefix = "spring")
public class UserCollection {
    private Map<String, User> users;

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }
}
