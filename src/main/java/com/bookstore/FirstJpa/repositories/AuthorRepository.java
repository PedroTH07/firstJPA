package com.bookstore.FirstJpa.repositories;

import com.bookstore.FirstJpa.models.AuthorModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {

    AuthorModel findAuthorModelByName(String name);
}
