package com.isa.usersengine;


import com.isa.usersengine.repository.UsersRepository;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        UsersRepository.getRepository()
                .forEach(u -> System.out.println(u.getName()));
    }
}
