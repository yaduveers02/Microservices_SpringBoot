package com.MC1.UserServices.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.MC1.UserServices.PayLoad.ApiResponse;
import com.MC1.UserServices.PayLoad.ApiResponse.ApiResponseBuilder;


// this will work as a central exception handler for complete project. All exceptions declared by us will be passed through this class.
@RestControllerAdvice
public class GlobalExceptionHandler {

//	this indicate that whenever ResourceNotFoundException occur this method is run and we can fetch all attributes of it 
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerReesourceNotFoundException(ResourceNotFoundException ex){
		
		String message = ex.getMessage();
		ApiResponse apiResponse = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
}
