package com.my.store.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_info")
public class User {

	@Id
	private Integer id;

	private String userName;

	private String fName;

	private String lName;

	private String email;

	private String password;

	private Boolean news;

}
