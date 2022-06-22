package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}