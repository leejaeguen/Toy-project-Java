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
        if (!result.isEmpty()) {
            for (User user : result) {
                System.out.println(user);
            }
        } else {
            System.out.println("등록된 유저가 없습니다.");
        }
    }

    public void findUserBy(String userId) {
        User findUser = ur.findUserBy(userId);
        if (findUser != null) {
            System.out.println(findUser);
        } else {
            System.out.println("아이디가 " + userId + "인 회원을 찾을 수 없습니다.");
        }
    }
}
