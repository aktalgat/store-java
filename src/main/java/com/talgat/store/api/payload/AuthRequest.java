package com.talgat.store.api.payload;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AuthRequest {
    @NotNull
    private String login;

    @NotNull
    private String password;

}
