package com.poc.purchaseOrder1.servicesTest;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.poc.purchaseOrder1.entities.UserEntity;
import com.poc.purchaseOrder1.models.Product;
import com.poc.purchaseOrder1.models.Purchase;
import com.poc.purchaseOrder1.models.User;
import com.poc.purchaseOrder1.repository.ProductRepository;
import com.poc.purchaseOrder1.repository.PurchaseRepository;
import com.poc.purchaseOrder1.repository.UserRepository;
import com.poc.purchaseOrder1.services.IProductService;
import com.poc.purchaseOrder1.services.IPurchaseService;
import com.poc.purchaseOrder1.services.IUserService;

@SpringBootTest
public class UserServicesTest {
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
			public void saveUserTest()
			{
			ArrayList<Integer> ary = new ArrayList<>();
			//Optional <UserEntity> ouser = null;
			ary.add(1);
			ary.add(3);
			User user = new User(1,"Shrusti","7654876542", ary);
			when(userService.saveUser(user)).thenReturn(user);
			//assertEquals(user,userService.saveUser(user));
			assertNotNull(userService.saveUser(user));
			}
			@Test
			public void getAllUsers() {
			ArrayList<Integer> ary = new ArrayList<>();
			ary.add(1);
			ary.add(3);
			when(userService.getAllUsers()).thenReturn(Stream
			.of(new User(1,"Daniel","7685763452",ary), new User(2,"John","0956431476",ary)).collect(Collectors.toList()));
			assertEquals(2,userService.getAllUsers().size());
			}
			
//			@Test
//			public void  deleteUserTest(User u) {
//				
//				List<Purchase> list = new ArrayList<>();
//				list.add(new Purchase());
//				list.add(new Purchase());
//				User u1 = new User();
//				
//				when(userService.deleteUser(u1)).thenReturn(1);
//				assertTrue(1 == userService.deleteUser(u1));
//			}
			
			
			 @Test
			 public void deleteUser() {
			 User user = null;
			 userService.deleteUser(user);
			 assertNotNull(userService.deleteUser(user));
			 }}


//@Test
//public void getUserById() {
//int id=1;
//ArrayList<Integer> ary = new ArrayList<>();
//ary.add(1);
//when(userService.getUserById(id)).thenReturn(Stream
//.of(new User(1,"Daniel","7685763452",ary).collect(Collectors.toList()));
//assertEquals(1,userService.getUserById(id).size());
//}
//@Test
//public void getUserById() {
//int id=1;
//ArrayList<Integer> ary = new ArrayList<>();
//ary.add(1);
//when(userService.getUserById(id)).thenReturn(Stream
//.of(new User(1,"Daniel","7685763452",ary).collect(Collectors.toList() ) ) );
//}

//
//
// }
