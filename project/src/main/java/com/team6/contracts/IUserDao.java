package com.team6.contracts;

import com.team6.entity.User;

public interface IUserDao {
	public boolean addUser(User user);
	public User getUser();
	public void deleteUser();
	public void updateUser();
}
