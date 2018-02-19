package com.myorg.ecomm.categories.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 
 * @author sspallam
 *
 */

@Entity
public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String categoryName;
	private String categoryType;
	private String mappingCategory;
	private String categoryDescription;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @return the categoryType
	 */
	public String getCategoryType() {
		return categoryType;
	}
	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	/**
	 * @return the mappingCategory
	 */
	public String getMappingCategory() {
		return mappingCategory;
	}
	/**
	 * @param mappingCategory the mappingCategory to set
	 */
	public void setMappingCategory(String mappingCategory) {
		this.mappingCategory = mappingCategory;
	}
	/**
	 * @return the categoryDescription
	 */
	public String getCategoryDescription() {
		return categoryDescription;
	}
	/**
	 * @param categoryDescription the categoryDescription to set
	 */
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	

}
