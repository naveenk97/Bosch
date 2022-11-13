package com.bosch.dynamicform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.dynamicform.api.DynamicFormApi;


@RestController
public class DynamicFormController implements DynamicFormApi {

	@Override
	public ResponseEntity<String> saveDynamicForm() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> getByCategoryAndSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	/*
	 * private final DynamicFormService dynamicFormService;
	 * 
	 * public DynamicFormController(DynamicFormServiceImpl dynamicFormService) {
	 * this.dynamicFormService = dynamicFormService; }
	 * 
	 * @Override public ResponseEntity<String> saveDynamicForm() { return new
	 * ResponseEntity<>(dynamicFormService.saveDynamicFormService(dynamicForm),
	 * HttpStatus.OK); }
	 * 
	 * @Override public ResponseEntity<String> getByCategoryAndSubCategory() {
	 * return new
	 * ResponseEntity<>(dynamicFormService.getByCategoryAndSubCategory(categoryName,
	 * subCategoryName), HttpStatus.OK); }
	 */

}
