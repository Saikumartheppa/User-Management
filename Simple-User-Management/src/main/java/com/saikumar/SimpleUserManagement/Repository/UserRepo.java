package com.saikumar.SimpleUserManagement.Repository;

import com.saikumar.SimpleUserManagement.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepo {
    @Autowired
    List<User> userList;

   public List<User> getUserList(){
       return userList;
   }
}
