package com.faks.faks.model.command.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;


@Getter
@Setter
public class ApiBaseCommand<T> {

    @Valid
    private T command;

    public static <T> ApiBaseCommand<T> createApiBaseCommand(T command) {
        ApiBaseCommand<T> c = new ApiBaseCommand<>();
        c.setCommand(command);
        return c;
    }
}
