package com.example.springbootjmsactivemqexample.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel(description = "Representation of a Message")
@Getter
@Setter
@ToString
public class MessageDTO {

    @ApiModelProperty(example = "To ActiveMQ")
    private String subject;

    @ApiModelProperty(example = "Body of message to send any text")
    private String message;

}
