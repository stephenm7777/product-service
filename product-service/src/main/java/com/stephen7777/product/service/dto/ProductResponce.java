package com.stephen7777.product.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
@Data
@Builder 
@AllArgsConstructor 
@NoArgsConstructor 

public class ProductResponce {
	@Id 
	private String id; 
	private String name; 
	private String description; 
	private BigDecimal price; 
}
