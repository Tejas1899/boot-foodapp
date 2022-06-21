package com.ty.bootfoodapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.bootfoodapp.dto.Items;

public interface ItemRepository extends JpaRepository<Items,Integer> {

}
