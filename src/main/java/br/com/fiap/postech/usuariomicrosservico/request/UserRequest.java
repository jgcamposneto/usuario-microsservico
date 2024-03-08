package br.com.fiap.postech.usuariomicrosservico.request;

import br.com.fiap.postech.usuariomicrosservico.entity.enums.UserRole;

public record UserRequest (String login, String password, UserRole role){
}
