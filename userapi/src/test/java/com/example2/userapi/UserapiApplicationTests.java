package com.example2.userapi;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;


@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest
class UserapiApplicationTests
{
	
	@Autowired
	private My_Service service;
	
    @Autowired
	private MockMvc mockmvc;
	
    @MockBean
	private user_Repository repository;
    
    private List<user1> create_list() 
	{
		List<user1> userlist = new ArrayList<user1>();
		userlist.add(new user1("parnika","Parnika Katiyar","pk@gmail.com","qwer",123456789,"jkl"));
		userlist.add(new user1("krish","Krish Singh","ks@gmail.com","qaz",16321078,"bnm"));
		userlist.add(new user1("Tom","Tom Rai","tr@gmail.com","ghjk",138446071,"asd"));
		userlist.add(new user1("har","Harry","hr@gmail.com","vcb",10986432,"lkh"));
		Mockito.when(repository.findAll()).thenReturn(userlist);
		return userlist;
	}
    
    
    @Test
    public void get_user() throws Exception 
    {
    	   String uri = "/all";
    	   List<user1> userlist = create_list();
    	   MvcResult Result = mockmvc.perform(MockMvcRequestBuilders.get(uri)).andReturn();
    	   ObjectMapper mapper = new ObjectMapper(); //provides functionality for reading and writing JSON
    	   String st1=mapper.writeValueAsString(userlist);
    	   String st2= Result.getResponse().getContentAsString();
    	   st1.equals(st2);
    }
    
    private user1 user1 = new user1 ("katiyar","Parnika Katiyar","pk@gmail.com","qwer",123456789,"jkl");
    
    @Test
	public void add_user_test()
	{
		
		when(repository.save(user1)).thenReturn(user1);
		assertEquals(user1,repository.save(user1));
	}
	
    @Test
	public void update_Test()
	{
    	user1.setUsername("katiyar");
		when(repository.save(user1)).thenReturn(user1);
		assertEquals(user1,repository.save(user1));
	}
    
    @Test
	public void delete_user_Test()
	{
		service.delete_user(user1);
		verify(repository,times(1)).delete(user1);
	}
    
}	
