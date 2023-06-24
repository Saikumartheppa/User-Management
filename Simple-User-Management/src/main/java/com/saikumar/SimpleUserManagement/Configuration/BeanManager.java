package com.saikumar.SimpleUserManagement.Configuration;

import com.saikumar.SimpleUserManagement.Model.Type;
import com.saikumar.SimpleUserManagement.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
    public List<User> getUserList(){
        User initUser = new User(0,"saikumar","saikumarz123","sai@gmail.com","asbcd","9090909090", Type.ADMIN);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
