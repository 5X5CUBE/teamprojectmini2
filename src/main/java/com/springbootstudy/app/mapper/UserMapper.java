package com.springbootstudy.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.springbootstudy.app.domain.Users;

@Mapper
public interface UserMapper {
	public void addUser(Users user);
}
