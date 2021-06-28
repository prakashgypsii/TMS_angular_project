package com.myproject.StackRouteCRUD.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="trainers")
public class Trainer {
private Long id;
private String name;
private String email;
private int age;
public Trainer()
{
}
public Trainer(Long id, String name, String email, int age) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Trainer [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
}

}
