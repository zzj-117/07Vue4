package ybw.mall.mall_server.controllers;

import org.springframework.web.bind.annotation.*;
import ybw.mall.mall_server.entity.User;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    public static ArrayList<User> userlist = new ArrayList<User>();

    @RequestMapping(path="/isexist",method = RequestMethod.GET)
    public boolean IsExist(@RequestParam("username") String username){
        boolean bRet = false;
        for(int i=0;i<userlist.size();i++){
            if (userlist.get(i).getUsername().equals(username)){
                bRet = true;
                break;
            }
        }
        return bRet;
    }
    @RequestMapping(path="/login",method = RequestMethod.POST)
    public boolean Login(@RequestBody User user){
        boolean bRet = userlist.contains(user);
        return bRet;
    }
    @RequestMapping(path="/register",method = RequestMethod.POST)
    public  boolean Register(@RequestBody User user){
        userlist.add(user);
        return true;
    }
}
