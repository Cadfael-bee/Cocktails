package com.my.store.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_info")
public class User {

	@Id
	@NonNull
	private Integer id;

	@NonNull
	private String userName;

	@NonNull
	private String fName;

	@NonNull
	private String lName;

	@NonNull
	private String email;

	@NonNull
	private String password;

	@NonNull
	private Boolean news;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Order> orders = new ArrayList<>();
	
}
