/**
 * 
 */
package com.myorg.ecomm.categories.repository;

import org.springframework.data.repository.CrudRepository;

import com.myorg.ecomm.categories.model.Category;

/**
 * @author sspallam
 *
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
	public Category findById(String id);

}
