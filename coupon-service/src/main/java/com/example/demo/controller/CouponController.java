package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Coupon;
import com.example.demo.service.CouponService;

@RestController
public class CouponController {
	
	private final CouponService couponService;

	public CouponController(CouponService couponService) {
	
		this.couponService = couponService;
	}
	@PostMapping("/coupons")
	public ResponseEntity<Coupon> createCoupon(@RequestBody Coupon coupon)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(couponService.createCoupon(coupon));
	}
	@GetMapping("/coupons")
	public ResponseEntity<Iterable<Coupon>> displayAllAvailableCoupons()
	{
		return ResponseEntity.ok(couponService.getAllCoupons());
	}
	

}
