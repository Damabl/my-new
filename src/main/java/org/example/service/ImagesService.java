package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.ImagesDto;
import org.example.entity.Images;
import org.example.repository.ImagesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImagesService {
    private final ImagesRepository imagesRepository;
    private final UsersService usersService;

    public String addImages(ImagesDto imagesDto){
        Images img=new Images();
        img.setImg(imagesDto.getImg());
        img.setUser(usersService.getUserById(imagesDto.getUser()));
        imagesRepository.save(img);
        return "added";
    }
    public List<Images> getAllImages(){
        return imagesRepository.findAll();
    }
}
