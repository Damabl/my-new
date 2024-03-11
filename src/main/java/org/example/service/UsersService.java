package org.example.service;

import org.example.Dto.UsersDto;
import org.example.entity.Users;
import org.example.entity.UsersPost;
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

        Users existingUser = repository.findByGmail(user.getGmail());
        if(existingUser != null) {
            return "Пользователь с таким email уже существует";
        }else

        // Проверка, что firstname и lastname не пустые
        if(user.getFirstname().isEmpty() || user.getLastname().isEmpty()) {
            return "Имя и фамилия должны быть заполнены";
        }else

        // Проверка, что пароль содержит как минимум 6 символов и содержит как минимум одну цифру и одну букву
        if(user.getPassword().length() < 6 || !containsDigit(user.getPassword()) || !containsLetter(user.getPassword())) {
            return "Пароль должен содержать как минимум 6 символов и включать как минимум одну цифру и одну букву";
        }
        Users users=new Users(user.getGmail(),user.getFirstname(),user.getLastname(),user.getAvatar(),user.isGender(),user.getDate(),user.getPassword());
        repository.save(users);
        return "Added";
    }
    // Метод для проверки наличия цифры в строке
    private boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Метод для проверки наличия буквы в строке
    private boolean containsLetter(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }
    public Users getUsersPostById(Long id){
        return repository.getById(id);
    }
    public List<Users> getAllUsers(){
        return repository.findAll();
    }
}
