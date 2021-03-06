package com.eventapp.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.eventapp.exceptions.ErrorDetail;
import com.eventapp.exceptions.ResourceNotFoundException;

@RestController
@ControllerAdvice //use aop around advice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ErrorDetail> handleResourceNotFoundEx(ResourceNotFoundException ex,WebRequest req){
		ErrorDetail detail=new ErrorDetail();
		detail.setContact("boggitidilipkumar@gmail.com");
		detail.setErrorMessage(req.getDescription(false));
		detail.setMessage(ex.getMessage());
		detail.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(detail,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetail> handleOtherEx(Exception ex,WebRequest req){
		ErrorDetail detail=new ErrorDetail();
		detail.setContact("boggitidilipkumar@gmail.com");
		detail.setErrorMessage(req.getDescription(false));
		detail.setMessage(ex.getMessage());
		detail.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<ErrorDetail>(detail,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		ErrorDetail detail=new ErrorDetail();
		detail.setContact("boggitidilipkumar@gmail.com");
		detail.setErrorMessage(request.getDescription(false));
		detail.setMessage(ex.getMessage());
		detail.setTimeStamp(LocalDateTime.now());
		return new ResponseEntity<Object>(detail,HttpStatus.BAD_REQUEST);
	}
	
	

}
