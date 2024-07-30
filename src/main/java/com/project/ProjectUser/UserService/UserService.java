package com.project.ProjectUser.UserService;

import com.project.ProjectUser.DTO.UserDTO;

public interface UserService {
  public UserDTO getUserDetails(long userId);
  public String addUser(UserDTO userDTO);
  public String updateUser(UserDTO userDTO);
  public String deleteUser(long userId);
  
}
