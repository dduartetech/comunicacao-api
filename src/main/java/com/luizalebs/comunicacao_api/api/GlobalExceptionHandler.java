package com.luizalebs.comunicacao_api.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        String mensagem = (ex.getMessage() != null) ? ex.getMessage() : "Erro interno na operação de comunicação.";
        return new ResponseEntity<>(mensagem, HttpStatus.BAD_REQUEST);
    }

}
