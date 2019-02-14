package com.isa.usersengine.dao;

import com.isa.usersengine.domain.User;
import com.isa.usersengine.repository.UsersRepository;

import javax.ejb.Stateless;
import java.util.List;
import java.util.stream.Collectors;

@Stateless
public class UsersRepositoryDaoBean implements UsersRepositoryDao, UsersRepositoryDaoRemote {

    @Override
    public void addUser(User user) {
        UsersRepository.getRepository().add(user);
    }

    @Override
    public User getUserById(Integer id) {
        return UsersRepository.getRepository().stream()
                .filter(u -> u.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public User getUserByLogin(String login) {
        return UsersRepository.getRepository().stream()
                .filter(u -> u.getLogin().equals(login))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> getUserList() {
        return UsersRepository.getRepository();
    }

    @Override
    public List<String> getUsersNames() {
        return getUserList().stream().map(u -> u.getName()).collect(Collectors.toList());
    }
}
