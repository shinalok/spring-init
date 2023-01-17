package com.kfr.springinit.web.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lombok_test (){
        String name = "alshin";
        int amount = 1;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //assertThat(dto.getName().equals(name+"A"));
        assertThat(dto.getName()).isEqualTo(name);

    }
}
