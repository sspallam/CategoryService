/**
 * 
 */
package com.myorg.ecomm.categories.controller;

import java.net.HttpURLConnection;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.myorg.ecomm.categories.model.Category;
import com.myorg.ecomm.categories.service.CategoryService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author sspallam
 *
 */
@RestController
@Api(value = "Category")
@RequestMapping(value = "/category")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	/**
	 * @param id
	 * @return
	 */
	@GET
	@RequestMapping(method = RequestMethod.GET, value = "/{id}", produces = "application/json")
	@ApiResponses({
			@ApiResponse(code = HttpURLConnection.HTTP_OK, message = "Success", response = Category.class )
	})
	@ResponseStatus(HttpStatus.OK)
	public Category getCategoryData(@ApiParam(name = "id", required = true) @PathVariable("id")  Long id){
		return categoryService.getCategoryData(id);
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Category createCategoryData(@ApiParam(name = "data", required = true) Category data){
		return categoryService.createCategoryData(data);
		
	}
	
	/**
	 * @param data
	 * @return
	 */
	@RequestMapping(method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.CREATED)
	public Category updateCategoryData(@ApiParam(name = "data", required = true)Category data){
		return categoryService.updateCategoryData(data);
		
	}
	/**
	 * @param data
	 */
	@RequestMapping(method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeCategoryData(@ApiParam(name = "data", required = true)Category data){
		categoryService.removeCategoryData(data);
		
	}

}
