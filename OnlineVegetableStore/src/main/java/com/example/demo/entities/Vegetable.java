package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Vegetable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vegetableId;
	private String name;
	private Integer price;
	private Integer quantity;
}
