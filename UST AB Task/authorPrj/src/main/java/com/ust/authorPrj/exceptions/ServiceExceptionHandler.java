package com.ust.authorPrj.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;

@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

    private HashMap<Object, Object> response = new HashMap<>();

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity<Object> handleAuthorNotFoundException(AuthorNotFoundException ex) {
        response.clear();
        response.put("message", ex.getMessage());
        response.put("status", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

    // Handle DuplicateAuthorException
//    @ExceptionHandler(DuplicateAuthorException.class)
//    public ResponseEntity<Object> handleDuplicateAuthorException(DuplicateAuthorException ex) {
//        response.clear();
//        response.put("message", ex.getMessage());
//        response.put("status", HttpStatus.CONFLICT);
//        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
//    }

//    @Override
//    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
//                                                                  HttpHeaders headers,
//                                                                  HttpStatusCode status,
//                                                                  WebRequest request) {
//        response.clear();
//        HashMap<Object, Object> errors = new HashMap<>();
//        List<FieldError> fieldErrors = ex.getFieldErrors();
//        response.put("message", "Validation failed");
//        response.put("status", status);
//        response.put("errors", fieldErrors.stream()
//                .map(fe -> errors.put(fe.getField(),fe.getDefaultMessage()))
//                .toList());
//        return new ResponseEntity<>(response, status);
//    }
}
