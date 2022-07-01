package com.example.demo.model;

import javax.persistence.Column;
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
	@Column(name = "coupon_id",unique = true,nullable = false)
	private String couponId;
	@Column(name = "coupon_code",unique = true,nullable = false)
	private String couponCode;
	@Column(name = "discount_price",nullable = false)
	private double discountPrice;

}
