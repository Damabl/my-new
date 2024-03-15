package org.example.service;

import org.example.dto.UsersDto;
import org.example.entity.Users;
import org.example.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    private final UsersRepository repository;

    public UsersService(UsersRepository repository) {
        this.repository = repository;
    }

    public String addUsers(UsersDto user){

        Users existingUser = repository.getByGmail(user.getGmail());
        if(existingUser != null) {
            return "Пользователь с таким email уже существует";
        }else

        if(user.getFirstname().isEmpty() || user.getLastname().isEmpty()) {
            return "Имя и фамилия должны быть заполнены";
        }else

        if(user.getPassword().length() < 6 || !containsDigit(user.getPassword()) || !containsLetter(user.getPassword())) {
            return "Пароль должен содержать как минимум 6 символов и включать как минимум одну цифру и одну букву";
        }
        Users users=new Users();
        users.setGmail(user.getGmail());
        users.setFirstname(user.getFirstname());
        users.setLastname(user.getLastname());
        users.setAvatar(user.getAvatar());
        users.setGender(user.isGender());
        users.setDate(user.getDate());
        users.setPassword(user.getPassword());
        repository.save(users);
        return "Added";
    }
    private boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private boolean containsLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    public Users getUserById(Long id){
        return repository.getById(id);
    }
    public List<Users> getAllUsers(){
        return repository.findAll();
    }
}
