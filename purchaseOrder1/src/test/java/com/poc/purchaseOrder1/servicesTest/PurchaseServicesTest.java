package com.poc.purchaseOrder1.servicesTest;

import java.sql.Date;
import java.sql.Timestamp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.poc.purchaseOrder1.models.Product;
import com.poc.purchaseOrder1.models.Purchase;
import com.poc.purchaseOrder1.models.User;
import com.poc.purchaseOrder1.services.IProductService;
import com.poc.purchaseOrder1.services.IPurchaseService;
import com.poc.purchaseOrder1.services.IUserService;

@SpringBootTest
public class PurchaseServicesTest {
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
	public void savePurchase() throws Exception
	{
		Date d=new Date(2020-01-01);
		
	//	Purchase pur = new Purchase (1,1,"bangalore","project1","1","software",1,"2020-01-01",10,9000);
		Purchase pur = new Purchase (1,1,"bangalore","project1","1","software",1,d,10,9000,"Accepted","product1");
		when(purchaseService.savePurchase(pur)).thenReturn(pur);
		assertEquals(pur,purchaseService.savePurchase(pur));
	}
	
	@Test
	public void getAllPurchases() {
		Date d=new Date(2020-01-01);
		Date d1=new Date(2020-03-04);
		User u = null;
		when(purchaseService.getAllPurchases(u)).thenReturn(Stream
				.of(new Purchase(1,1,"bangalore","project1","1","software",1,d,10,9000,"Accepted","product1"), new Purchase(2,1,"Mumbai","project2","1","software",1,d1,10,4000,"Accepted","product2")).collect(Collectors.toList()));
		assertEquals(2,purchaseService.getAllPurchases(u).size());
	}

	 @Test
	 public void deletePurchase() {
	 int prd = 1;
	 //productService.deleteProduct(prd);
	 when(purchaseService.deletePurchase(prd)).thenReturn(prd);
	 assertEquals(1, purchaseService.deletePurchase(prd) );
	 //( userService).deleteProduct(prd));
	 }}


