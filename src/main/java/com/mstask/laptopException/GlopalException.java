package com.mstask.laptopException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlopalException {
@ExceptionHandler(BrandNotFoundException.class)
public ResponseEntity<String> re(BrandNotFoundException be) {
	return new ResponseEntity<String>("search for the existing brand",HttpStatus.EXPECTATION_FAILED);
}
}
