/**
 * 
 */
package com.myorg.ecomm.categories.service;

import com.myorg.ecomm.categories.model.Category;

/**
 * @author sspallam
 *
 */
public interface CategoryService {
	
	public Category getCategoryData(Long id);
	
	public Category createCategoryData(Category data);
	
	public Category updateCategoryData(Category data);
	
	public void removeCategoryData(Category data);

}
