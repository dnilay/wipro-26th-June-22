package com.example.demo.service;

import com.example.demo.model.Coupon;

public interface CouponService {
	
	Coupon createCoupon(Coupon coupon);
	Iterable<Coupon> getAllCoupons();

}
