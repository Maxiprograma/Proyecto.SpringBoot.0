package com.example.SpringBootRest.excepciones;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BussinesException extends Exception{

    public BussinesException(String msg){
        super(msg);
    }

}