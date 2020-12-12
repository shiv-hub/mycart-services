package com.mycartservices.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mycartservices.exception.ResourceNotFoundException;
import com.mycartservices.model.ProductView;
import com.mycartservices.repository.ProductViewRepository; 


@CrossOrigin
@RestController
@RequestMapping("/pvc")
public class ProductViewController {
	@Autowired
	ProductViewRepository repository;

	@GetMapping("/products")
	public List<ProductView> getAllProducts() {
		return repository.findAll();
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<ProductView> getProductById(@PathVariable(value = "id") long id)
			throws ResourceNotFoundException {
		ProductView productview = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));
		return ResponseEntity.ok().body(productview);
	}

	@PostMapping("/product")
	public ProductView createProdcut (@RequestBody ProductView product) {
		return repository.save(product);
	}

	@PutMapping("/product/{id}")
	public ResponseEntity<ProductView> updateProduct(@PathVariable(value = "id") long id,
			 @RequestBody ProductView prod) throws ResourceNotFoundException {
		ProductView product = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Productnot found for this id :: " + id));

		product.setName(prod.getName());
		product.setPrice(prod.getPrice());
		product.setDescription(prod.getDescription());
		product.setDiscount(prod.getDiscount());
		product.setCategoryId(prod.getCategoryId());
		product.setBrand(prod.getBrand());
		product.setExpDate(prod.getExpDate());
		product.setMfdDate(prod.getMfdDate());
		product.setStartDate(prod.getStartDate());
		product.setEndDate(prod.getEndDate());
		
		final ProductView updated = repository.save(product);
		return ResponseEntity.ok(updated);
	}

	@DeleteMapping("/product/{id}")
	public Map<String, Boolean> deleteProdcut(@PathVariable(value = "id") long id)
			throws ResourceNotFoundException {
		ProductView product = repository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));

		repository.delete(product);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	
}
}