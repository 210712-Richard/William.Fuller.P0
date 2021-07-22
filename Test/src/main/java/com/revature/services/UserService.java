package com.revature.services;

import com.revature.data.UserDAO;
import com.revature.beans.User;        
        
public class UserService {

    private getUser ud = new UserDAO();

    public User login(String name) {
        User u = ud.getUser(name);
        ud.writeToFile();
        return u;
    }
}
