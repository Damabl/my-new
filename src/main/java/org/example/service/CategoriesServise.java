package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.CategoriesDto;
import org.example.entity.Categories;
import org.example.repository.CategoriesRepository;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CategoriesServise {
    private final CategoriesRepository categoriesRepository;
    public String addCategory(CategoriesDto categoriesDto){
        Categories categories=new Categories();
        if (categoriesDto.getCategory() == null || categoriesDto.getCategory().isEmpty()) {
            return "Category cannot be empty";
        }else
        if(categoriesRepository.findByCategory(categoriesDto.getCategory()).isPresent()){
            return "This category already exists";
        }else{
            categories.setCategory(categoriesDto.getCategory());
        }
        categoriesRepository.save(categories);
        return "added";
    }
    public List<Categories> getAllCategories(){
        return categoriesRepository.findAll();
    }
    public Categories getCategoryById(Long id) throws ChangeSetPersister.NotFoundException {
        return categoriesRepository.findById(id).orElseThrow(ChangeSetPersister.NotFoundException::new);
    }

}
