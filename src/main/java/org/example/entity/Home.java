package org.example.entity;

import org.example.Dto.UsersDto;
import org.example.Dto.UsersPostDto;
import org.example.repository.UsersRepository;
import org.example.service.UsersPostService;
import org.example.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class Home {
    private final UsersService usersService;
    private final UsersPostService usersPostService;
    public Home(UsersService service, UsersPostService usersPostService) {
        this.usersService = service;
        this.usersPostService = usersPostService;
    }

    @GetMapping()
    public String message() {
        return "Damir Ablahat";
    }

    @GetMapping("/name/{name}")
    public String answer(@PathVariable String name){
        return "You say "+name;
    }
    @PostMapping("/users")
    public String send(@RequestBody UsersDto user){
        return usersService.addUsers(user);
    }
    @PostMapping("/usersposts")
    public String send2(@RequestBody UsersPostDto post){
        return usersPostService.addUsersPost(post);
    }
   @GetMapping("/usersget")
   public List<Users> getAll(){
       return usersService.getAllUsers();
    }


}
