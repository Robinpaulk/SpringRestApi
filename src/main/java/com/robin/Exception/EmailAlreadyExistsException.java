package com.robin.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "NotFoundException not found")
public class EmailAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	  
    public EmailAlreadyExistsException(String message) {
        super(message);
    }
 
    
}