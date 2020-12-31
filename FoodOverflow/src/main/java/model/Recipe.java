package model;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Recipe {
	private String recipeName;
	private User author;
	private List<User> colaborators= new ArrayList();
	
	public boolean isEditable(User user) {
		return  user.equals(user)|| colaborators.contains(user);
	}
}
