package com.project.ProjectUser.DTO;

public class UserDTO {
   
		private long userId;
		private String userName;
		private String email;
		private long phoneNumber;
		private String city;
		private String password;
		
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password=password;
		}
}
