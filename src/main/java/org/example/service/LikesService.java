package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.LikeDto;
import org.example.entity.Likes;
import org.example.repository.LikeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikesService {
    private final UsersService usersService;
    private final UsersPostService usersPostService;
    private final LikeRepository likeRepository;
    public String addLike(LikeDto likeDto){
        Likes likes=new Likes();
        if(isLiked(likeDto.getUser(),likeDto.getUserpost())){
            return "This post already liked";
        }
        likes.setUser(usersService.getUserById(likeDto.getUser()));
        likes.setPost(usersPostService.getPostById(likeDto.getUserpost()));
        likeRepository.save(likes);
        return "added";
    }
    public List<Likes> getAllLikes(){
        return likeRepository.findAll();
    }
    public boolean isLiked(Long userId,Long postId){
        for (Likes like: this.getAllLikes()){
            if(like.getUser().getId()==userId&&like.getPost().getId()==postId){
                return true;
            }
        }
        return false;
    }
}
