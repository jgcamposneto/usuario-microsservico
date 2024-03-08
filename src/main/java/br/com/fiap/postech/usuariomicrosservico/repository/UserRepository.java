package br.com.fiap.postech.usuariomicrosservico.repository;

import br.com.fiap.postech.usuariomicrosservico.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<User, String> {
    UserDetails findByLogin(String login);
}
