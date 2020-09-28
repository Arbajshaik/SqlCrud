package com.example.Crudproj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import antlr.collections.List;
import entity.Product;
import repository.ProductRepository;

@SpringBootApplication

@DataJpaTest

@AutoConfigureTestDatabase(replace = Replace.NONE)

@RunWith(SpringRunner.class)
class DaoTest {

	@Autowired
	private ProductRepository productRepo;
	Product product = new Product();

	@Test
		public void saveProduct() {
			}

}