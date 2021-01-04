package com.poc.purchaseOrder1.servicesTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.poc.purchaseOrder1.models.Product;
import com.poc.purchaseOrder1.models.User;
import com.poc.purchaseOrder1.services.IProductService;
import com.poc.purchaseOrder1.services.IPurchaseService;
import com.poc.purchaseOrder1.services.IUserService;
//import com.sr.model.User;

@SpringBootTest
public class ProductServicesTest {
@Mock
private IUserService userService;

 @Mock
private IProductService productService;

 @Mock
private IPurchaseService purchaseService;

	 @Test
	void contextLoads() {
	}
	 
	 
	@Test
	public void saveTest()
	{
	Product prd = new Product(1,"Shrusti","desp", "manufacturer", 135);
	when(productService.save(prd)).thenReturn(prd);
	assertNotNull(productService.save(prd));
	}
	
	
	@Test
	public void getAllProducts() {
	when(productService.getAllProducts()).thenReturn(Stream
	.of(new Product(1,"modem","AboutModems","cisco",1000), new Product(2,"Routers","AboutRouters","junitor",5000)).collect(Collectors.toList()));
	assertEquals(2,productService.getAllProducts().size());
	}
	
	 @Test
	 public void deleteProduct() {
	 int prd = 1;
	 //productService.deleteProduct(prd);
	 when(productService.deleteProduct(prd)).thenReturn(prd);
	 assertEquals(1, productService.deleteProduct(prd) );
	 //( userService).deleteProduct(prd));
	 }}


