package com.springbootstudy.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.springbootstudy.app.domain.Category;
import com.springbootstudy.app.domain.Post;

@Mapper
public interface PostMapper {

	public List<Post> postList();
	
	public List<Post> postListByTag(@Param("tag") Integer tag);
	
	public List<Category> categoryList();
	
}
