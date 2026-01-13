package com.springbootstudy.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstudy.app.domain.Dish;
import com.springbootstudy.app.mapper.DishMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DishService {

	private static final int PAGE_SIZE = 10;
	private static final int PAGE_GROUP = 10;
	
	@Autowired
	private DishMapper dishMapper;
	
	// 게시글 리스트를 읽어와 반환하는 메서드
	public List<Dish> DishList() {
		log.info("DishService : dishList()");
		return dishMapper.dishList();
	}
}
