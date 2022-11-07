package com.deevyanshu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Tourist {
	
	@Id
	@Max(9999)
	private long id;
	
	@NotBlank
	@Size(max = 15)
	@Pattern(regexp="^[A-Za-z]*$")
	private String firstName;
	
	@NotBlank
	@Size(max = 12)
	private String lastName;
	
	@NotBlank
	private String gender;
	
	@NotNull
	@Max(90)
	@Min(10)
	private int age;
	
	@NotBlank
	@Pattern(regexp="^[A-Za-z]*$")
	private String fromPlace;
	
	@NotNull
	@Min(1)
	private int numberOfDays;
	
	public Tourist() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Tourist(long id, String firstName, String lastName, String gender, int age, String fromPlace,
			int numberOfDays) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfDays = numberOfDays;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	
	

}
