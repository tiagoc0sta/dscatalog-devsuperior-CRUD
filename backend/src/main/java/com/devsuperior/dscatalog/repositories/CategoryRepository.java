package com.devsuperior.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dscatalog.entities.Category;

//essa é a camada de acesso a dados
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
