package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Product;
import repository.ProductRepository;

@Service
public class ProductService {
@Autowired
private ProductRepository repository;

public Product saveProduct(Product product) {
	return repository.save(product);
}
public List<Product> saveProducts(List<Product> products) {
	return repository.saveAll(products);
}
public List<Product> getProducts(){
	return repository.findAll();
}

  public Product getProductById(int id){ 
	  return repository.findById(id).orElse(null);
}
 
public String deleteProduct(int id) {
	repository.deleteById(id);
	return "product remove !! " +id;
}
public Product updateProduct(Product product) {
	Product existingProduct=repository.findById(product.getId()).orElse(product);
   existingProduct.setName(product.getName());
   existingProduct.setQuantity(product.getQuantity());
   existingProduct.setPrice(product.getPrice());
return repository.save(existingProduct);
}


}
