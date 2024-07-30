package com.project.ProjectUser.UserService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.ProjectUser.DTO.UserDTO;
import com.project.ProjectUser.Entity.User;
import com.project.ProjectUser.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	  private UserRepository userRepository;

	@Override
	public UserDTO getUserDetails(long userId) {
		Optional <User> user=userRepository.findById(userId);
		 User userEntity =user.get();
		 UserDTO userDTO= new UserDTO();
		 userDTO.setUserId(userEntity.getUserId());userDTO.setUserName(userEntity.getUserName());
		 userDTO.setEmail(userEntity.getEmail()); userDTO.setPhoneNumber(userEntity.getPhoneNumber());
		 userDTO.setCity(userEntity.getCity()); userDTO.setPassword(userEntity.getPassword());
		 return userDTO;
	}

	@Transactional
	@Override
	public String addUser(UserDTO userDTO) {
		 User user=new User();
		 user.setUserId(userDTO.getUserId());user.setUserName(userDTO.getUserName());
		 user.setEmail(userDTO.getEmail()); user.setPassword(userDTO.getPassword());
		 user.setPhoneNumber(userDTO.getPhoneNumber()); user.setCity(userDTO.getCity());
		 userRepository.save(user);
		return "user add successfully";
	}
  @Transactional
	@Override
	public String updateUser(UserDTO userDTO) {
		Optional <User> optional=userRepository.findById(userDTO.getUserId());
		User user = optional.get();
		  user.setUserId(userDTO.getUserId()); user.setUserName(userDTO.getUserName());
		  user.setEmail(userDTO.getEmail()); user.setPassword(userDTO.getPassword());
		  user.setCity(userDTO.getCity()); user.setPhoneNumber(userDTO.getPhoneNumber());
		return "updated successfully";
	}

@Override
public String deleteUser(long userId) {
   userRepository.deleteById(userId);
	return "deleted Succesfully";
}

}
