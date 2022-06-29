package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "order_id",unique = true,nullable = false)
	private String orderId;
	@Column(name = "order_name",nullable = false)
	private String orderName;
	@Column(name = "order_price",nullable = false)
	private double price;
	@Column(name = "order_catagory")
	@Enumerated(EnumType.STRING)
	private OrderCatagory orderCatagory;
	

}
