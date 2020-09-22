package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Product;
import repository.ProductRepository;
import service.ProductService;

@RestController

public class ProductController {

	@Autowired
	private ProductService service;

	@PostMapping("/AddProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}

	@PostMapping("/AddProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}

	@GetMapping("/Products")
	public List<Product> findAllProducts() {
		return service.getProducts();
	}

	@GetMapping("/Product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}

	@PutMapping("/update")
	public Product updatProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteProduct(id);
	}
}
