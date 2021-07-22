package com.revature.data;

import com.revature.beans.User;
import com.revature.beans.UserType;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    //DAO = Database Access Object
    //We can read and write to this file

    private List<User> users;

    static{
        DataSerializer <User> ds = new DataSerializer<User>();
        users = (List<User>)ds.readObjectsFromFile("users.dat");

        //help for myself. If there are no users in the users.dat file (first startup) than I should create a few
        //size become the id
        if(users== null){
            users = new ArrayList<User>();
            users.add(new User(users.size(), "Bill", "Bill@Bill.Bill", java.time.LocalDate.of(1900, 1, 1), 1000));
            users.add(new User(users.size(), "Bob", "Bob@Bob.Bob",  java.time.LocalDate.of(1900, 1, 1), 1000));
            User u = new User(users.size(), "Will", "will@will.will", java.time.LocalDate.of(1900, 1, 1), 1000);
            u.setType(UserType.ADMIN);
            users.add(u);

        }
    }
    public User login(String username) {

        for(User user : users) {
            if(user.getUsername().equals(username)) {
                return user;
            }
        }

        return null;
    }


    public void writeToFile(){
        new DataSerializer<User>().writeObjectsToFile(users, "users.dat");
    }
}
