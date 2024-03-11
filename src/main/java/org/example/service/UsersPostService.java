package org.example.service;

import org.example.Dto.UsersPostDto;
import org.example.entity.UsersPost;
import org.example.repository.UsersPostRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersPostService {
    private final UsersPostRepository repository;
    private final UsersService usersService;

    public UsersPostService(UsersPostRepository repository, UsersService usersService) {
        this.repository = repository;
        this.usersService = usersService;
    }
    public String addUsersPost(UsersPostDto post){
        UsersPost usersPost=new UsersPost(post.getTitle(),post.getContent(),post.getImage(),post.getCategory(),usersService.getUsersPostById(post.getUser()), post.getCreateAt());
//        usersService.getUsersPostById(post.getUser()).getListofPost().add(usersPost);
        repository.save(usersPost);
        return "Added";
    }


}
