package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.OrderEntity;

@Repository
public interface OrderDao extends CrudRepository<OrderEntity, Integer> {

}
