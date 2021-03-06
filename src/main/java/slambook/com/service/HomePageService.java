package slambook.com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import slambook.com.model.User;

public interface HomePageService {

	public void addFriend(User u, User friend);

	public User getUserByEmail(String string);

	public void loadFriends(User user, HttpSession httpSession);

}
