package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UserCon{
    @Autowired
    List<User> UserList;

    //create user -Post APIs

    //add a user

    @PostMapping("user")
    public String addUser(@RequestBody User myUser)
    {
        UserList.add(myUser);
        return "User added";
    }



    // get api

    //get all user:

    @GetMapping("users")
    public List<User> getAllUsers()
    {
        return  UserList;
    }


    //update user :

    // send a user id :id1 and status:s1

    @PutMapping("user/id/{id}/status")
    public String setUserStatusById(@PathVariable Integer id,@RequestParam boolean flag)
    {
        for(User user : UserList)
        {
            if(user.getUserId().equals(id))
            {
                user.setUserStatus(flag);
                return "user: "   + id  + "updated to " +  flag;
            }
        }

        return "Invalid id";
    }


    //delete api

    @DeleteMapping("user/id/{id}")
    public String removeTodoById(@PathVariable Integer id)
    {
        for(User user : UserList)
        {
            if(user.getUserId().equals(id))
            {
                UserList.remove(user);
                return "user: "   + id  + " removed";
            }
        }

        return "Invalid id";
    }


}


