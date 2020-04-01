package io.milind.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/") // its accessible by everyone... even if user is not logged in
	public String home() {
		
		return("<h1>Welcome</h1>");
	}
	
	@GetMapping("/admin") // its accessible by admin role
	public String admin() {
		
		return("<h1>Welcome admin</h1>");
	}
	
	@GetMapping("/user") // its accessible by logged in user i.e.both admin and user
	public String user() {
		
		return("<h1>Welcome user</h1>");
	}
}
