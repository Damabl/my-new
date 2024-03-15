package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.UsersPostDto;
import org.example.entity.UsersPost;
import org.example.repository.UsersPostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersPostService {
    private final UsersPostRepository usersPostRepository;
    private final UsersService usersService;
    private final CategoriesServise categoriesServise;

    public String addUsersPost(UsersPostDto post){
        UsersPost usersPost=new UsersPost();
        if (post.getTitle() == null || post.getTitle().isEmpty()) {
            return "Title cannot be empty";
        }else{
            usersPost.setTitle(post.getTitle());
        }
        if (post.getContent() == null || post.getContent().isEmpty()) {
            return "Content cannot be empty";
        }else{
            usersPost.setContent(post.getContent());
        }
        if(categoriesServise.isIdentical(post.getCategory())){
            return "This category do not exists";
        }else {
            usersPost.setContent(post.getContent());
        }

        usersPost.setImage(post.getImage());
        usersPost.setCategory(post.getCategory());
        usersPost.setUser(usersService.getUserById(post.getUser()));
        usersPost.setCreateAt(post.getCreateAt());
        usersPostRepository.save(usersPost);
        return "Added";
    }
    public UsersPost getPostById(Long id){
        return usersPostRepository.getById(id);
    }
    public List<UsersPost> getAllUsersPost(){
        return usersPostRepository.findAll();
    }


}
