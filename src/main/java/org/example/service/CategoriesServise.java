package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.CategoriesDto;
import org.example.entity.Categories;
import org.example.repository.CategoriesRepository;
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
        if(!isIdentical(categoriesDto.getCategory())){
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
    public boolean isIdentical(String newcategory){
        for(Categories category : this.getAllCategories()){
            if(category.getCategory()==newcategory){
                return false;
            }
        }
        return true;
    }

}
