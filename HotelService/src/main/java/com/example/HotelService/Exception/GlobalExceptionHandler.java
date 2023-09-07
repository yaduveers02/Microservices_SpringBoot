package com.example.HotelService.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//	
//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<Map<String, Object>> notFoundHandler;
//}

//this will work as a central exception handler for complete project. All exceptions declared by us will be passed through this class.
@RestControllerAdvice
public class GlobalExceptionHandler {

//	this indicate that whenever ResourceNotFoundException occur this method is run and we can fetch all attributes of it 
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handlerResourceNotFoundException(ResourceNotFoundException ex){
		Map<String, Object> map = new HashMap<>();
		map.put("message", ex.getMessage());
		map.put("success", false);
		map.put("status", HttpStatus.NOT_FOUND);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
	}
}
