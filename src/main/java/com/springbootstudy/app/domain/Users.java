package com.springbootstudy.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
	private int user_id;
	private String username;
	private int birthdate;
	private int rdate;
	private String password;
	private String nickname;
	private String phone;
	private String address;
	private String gender;
}
