package com.bookstore.FirstJpa.repositories;

import com.bookstore.FirstJpa.models.PublisherModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {

    PublisherModel findPublisherModelByName(String name);
}
