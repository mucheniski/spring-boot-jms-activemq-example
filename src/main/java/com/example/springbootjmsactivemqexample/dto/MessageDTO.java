package com.example.springbootjmsactivemqexample.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MessageDTO {

    private String subject;
    private String message;

}
