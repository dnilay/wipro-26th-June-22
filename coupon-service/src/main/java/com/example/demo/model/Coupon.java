package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "coupon_table")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String couponId;
	private String couponCode;
	private double discountPrice;

}
