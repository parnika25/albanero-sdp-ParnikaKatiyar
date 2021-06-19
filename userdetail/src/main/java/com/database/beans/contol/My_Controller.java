package com.database.beans.contol;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.database.beans.input.user1;
import com.database.beans.repo.user_Repository;
import com.database.beans.service.My_Service;


@Controller
@RequestMapping(path="/userdetail")
public class My_Controller 
{
	@Autowired
	private user_Repository repository;
	
	@Autowired
	private My_Service service;
	
	@PostMapping(path="/add") 
	  public @ResponseBody String addNewUser (@RequestParam String username, @RequestParam String full_name, @RequestParam String email_id, @RequestParam String address, @RequestParam long mobli_no, @RequestParam String currentOrganization)
	  {
		    user1 n = new user1();
		    n.setUsername(username);
		    n.setFull_name(full_name);
		    n.setEmail_id(email_id);
		    n.setAddress(address);
		    n.setMobile_no(mobli_no);
		    n.setCurrentOrganization(currentOrganization);
		    repository.save(n);
		    return "Saved";
	  }
	
	 @GetMapping(path="/all")
	  public @ResponseBody Iterable<user1> getAllUsers() 
	  {
	  
	    return repository.findAll();
	  }
	  
	  @PutMapping(path="/update/user/{username}")
		public String update(@PathVariable String username)
		{
			user1 u = service.update(username);
			return u.toString();
		}
	  
	  @DeleteMapping(path="/delete/user/{username}")
		public String delete(@PathVariable String username)
		{
			service.delete(username);
			return "Delete by username : " +username;
		
		}
			  
}
