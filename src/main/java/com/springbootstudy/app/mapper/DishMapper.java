package com.springbootstudy.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springbootstudy.app.domain.Dish;

@Mapper
public interface DishMapper {

	public List<Dish> dishList();
	
}
