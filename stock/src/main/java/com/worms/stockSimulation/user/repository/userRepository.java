package com.worms.stockSimulation.user.repository;

import com.worms.stockSimulation.user.aggregate.User;

import java.io.*;
import java.util.ArrayList;

public class userRepository {

    private final ArrayList<User> userList = new ArrayList<>();
    private File file = new File("stock/src/main/java/com/worms/stockSimulation/user/db/user.txt");

    public userRepository() {
        if (!file.exists()) {
            ArrayList<User> defaultUsers = new ArrayList<>();
            defaultUsers.add(new User("user01", 100000000, new ArrayList<>(), new ArrayList<>()));
            defaultUsers.add(new User("user02", 200000000, new ArrayList<>(), new ArrayList<>()));
            defaultUsers.add(new User("user03", 50000000, new ArrayList<>(), new ArrayList<>()));
            defaultUsers.add(new User("user04", 100000000, new ArrayList<>(), new ArrayList<>()));
            defaultUsers.add(new User("user05", 200000000, new ArrayList<>(), new ArrayList<>()));

            saveUsers(defaultUsers);
        }

        loadUsers();
    }

    private void saveUsers(ArrayList<User> Users) {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));

            for (User user : Users) {
                oos.writeObject(user);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            while (true) {
                userList.add((User) ois.readObject());
            }
        } catch (EOFException e){
            System.out.println("회원 정보 읽어오기 완료");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}