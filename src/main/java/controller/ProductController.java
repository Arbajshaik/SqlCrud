package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.ProductRequest;
import entity.Product;
import repository.ProductRepository;
import service.ProductService;


@RequestMapping("/productcategory")
@RestController
@Validated
public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/product")
	public Product addProduct(@Valid @RequestBody ProductRequest productRequest) {
		return service.saveProduct(productRequest);
	}

	/*
	 * @PostMapping("/Products") public List<Product> addProducts(@RequestBody
	 * List<Product> products) { return service.saveProducts(products); }
	 */

	@GetMapping("/products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) throws Exception {
		return service.getProductById(id);
	}

	@GetMapping("/Product/{name}")
	 public Product findProductByname(@PathVariable String name){
	 return service.getProductByname(name);
	}

	@PutMapping("/product")
	public Product updatProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/product/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}