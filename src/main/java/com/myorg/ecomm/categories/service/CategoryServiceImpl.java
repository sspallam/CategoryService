/**
 * 
 */
package com.myorg.ecomm.categories.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.ecomm.categories.model.Category;
import com.myorg.ecomm.categories.repository.CategoryRepository;
/**
 * @author sspallam
 *
 */

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category getCategoryData(Long id) {
		
		return  categoryRepository.findOne(id);
	}

	@Override
	public Category createCategoryData(Category data) {
		
		Category categorySaved = categoryRepository.save(data);		
		
		return categorySaved;
	}

	@Override
	public Category updateCategoryData(Category data) {
		
		Category selectedCategory = categoryRepository.findOne(data.getId());
		
		Category savedCategory;
		
		if(selectedCategory!=null){
			selectedCategory = data;
			savedCategory = categoryRepository.save(selectedCategory);
		}else{
			savedCategory = categoryRepository.save(data);
		}
		
		return savedCategory;
	}

	@Override
	public void removeCategoryData(Category data) {
		
		categoryRepository.delete(data);
		
	}

}
