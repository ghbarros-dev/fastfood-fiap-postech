package com.guibaarros.fiap.postech.fastfood.application.exceptions.client;

public class ClientNotFoundException extends RuntimeException {

    public ClientNotFoundException(final Long identifier) {
        super("cliente não encontrado com o identificador " + identifier);
    }
}
