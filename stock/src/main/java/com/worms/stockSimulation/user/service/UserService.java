package com.worms.stockSimulation.user.service;

import com.worms.stockSimulation.user.aggregate.User;
import com.worms.stockSimulation.user.repository.UserRepository;

import java.util.ArrayList;

public class UserService {
    private final UserRepository ur;
    public UserService() { ur = new UserRepository();}

    public void findAllUsers() {
        ArrayList<User> result = new ArrayList<>();
        result = ur.findAllUsers();
        if (result != null) {
            for (User user : result) {
                System.out.println("User: " + user);
            }
        } else {
            System.out.println("등록된 유저가 없습니다.");
        }
    }
}
