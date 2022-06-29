package com.example.demo.controller;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderEntity;
import com.example.demo.service.OrderService;

@RestController
public class OrderController {

	private final Environment environment;
	private final OrderService orderService;


	public OrderController(Environment environment, OrderService orderService) {

		this.environment = environment;
		this.orderService = orderService;
	}

	@RequestMapping
	public ResponseEntity<?> getStatus()
	{
		return ResponseEntity.ok("order-ws is up and running on port:"+environment.getProperty("local.server.port"));
	}
	
	@PostMapping("/orders")
	public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderEntity orderEntity)
	{
		OrderEntity oEntity=orderService.createOrder(orderEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(oEntity);
	}
	@GetMapping("/orders")
	public ResponseEntity<Iterable<OrderEntity>> fetchOrders()
	{
		return ResponseEntity.ok(orderService.listOrders());
	}
}
