package com.bosch.dynamicform.api;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-11T13:42:11.996+05:30")
@Api(value = "UserManagementApi")*/
@RequestMapping(value="/api/v1/form")
@CrossOrigin
@RestController
//@Hidden
public interface DynamicFormApi {

	
	@ApiResponses(value = { @ApiResponse(code = 200, message ="OK. Store Dynamic form", response = String.class),
	  @ApiResponse(code = 400, message = "Bad Request", response = String.class),
	  @ApiResponse(code = 405, message = "Method Not Allowed", response =String.class),
	  @ApiResponse(code = 500, message = "Internal Server Error", response =String.class) 
	})
    @RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.POST)
   // @PreAuthorize("permitAll")
    public ResponseEntity<String> saveDynamicForm();

	@ApiResponses(value = { @ApiResponse(code = 200, message ="OK. Store Dynamic form", response = String.class),
			@ApiResponse(code = 400, message = "Bad Request", response = String.class),
			@ApiResponse(code = 405, message = "Method Not Allowed", response =String.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response =String.class)
	})
    @RequestMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, consumes = {
            MediaType.APPLICATION_JSON_VALUE }, method = RequestMethod.GET)
    public ResponseEntity<String> getByCategoryAndSubCategory();
}