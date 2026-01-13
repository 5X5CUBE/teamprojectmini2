package com.springbootstudy.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootstudy.app.domain.Category;
import com.springbootstudy.app.domain.Post;
import com.springbootstudy.app.mapper.PostMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostService {

	private static final int PAGE_SIZE = 10;
	private static final int PAGE_GROUP = 10;
	
	@Autowired
	private PostMapper postMapper;
	
	// 게시글 리스트를 읽어와 반환하는 메서드
	public List<Post> PostList(Integer selectedCategoryId) {
		log.info("PostService : postList()");
		
		if(selectedCategoryId == null || selectedCategoryId == 0) {
			return postMapper.postList();
		} else {
			return postMapper.postListByTag(selectedCategoryId);
		}
	}
	
	public List<Category> getAllCategories() {
		return postMapper.categoryList();
	}
}
