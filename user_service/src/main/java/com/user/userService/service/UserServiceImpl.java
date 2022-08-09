package com.user.userService.service;



import java.util.List;
import org.springframework.stereotype.Service;

import com.user.userService.entity.User;

@Service 
public class UserServiceImpl implements  UserService
{

	List<User> list=List.of(
			new User(1311L,"sourav","6350075433"),
			new User(1312L,"bakliwal","7734861942"),
			new User(1313L,"yadav","989899898")
			);
			 
	
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user->user.getUserid().equals(id)).findAny().orElse(null);	
}
	
	

}
