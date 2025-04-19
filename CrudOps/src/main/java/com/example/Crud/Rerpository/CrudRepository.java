package com.example.Crud.Rerpository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Crud.Model.CrudModel;

public interface CrudRepository extends JpaRepository<CrudModel, Long> {

}
