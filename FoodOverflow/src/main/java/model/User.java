package model;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class User {
	private String firstName;
	private String lastName;
	private String userName;
	private float weight;
	private float height;
	private float imc; //Indice masa corporal
}