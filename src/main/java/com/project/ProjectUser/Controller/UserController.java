package com.project.ProjectUser.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.ProjectUser.DTO.UserDTO;
import com.project.ProjectUser.UserService.UserService;

@RestController
@RequestMapping("/User/")
public class UserController {
	@Autowired
	  UserService userService;
	
	@GetMapping("{userId}")
	public UserDTO getUserDetails(@PathVariable long userId) {
		return userService.getUserDetails(userId);
	}
   @PostMapping ("new")
	public String addUser(@RequestBody UserDTO userDTO ) {
	   return userService.addUser(userDTO);
   }
   @PutMapping("update")
   public String updateUser(@RequestBody UserDTO userDTO) {
	   return userService.updateUser(userDTO);
   }
   @DeleteMapping("delete/{userId}")
   public String deleteUser(@PathVariable long userId) {
	 return userService.deleteUser(userId);
   }
}
