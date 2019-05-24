package com.ftms.blog.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ftms.blog.model.Posting;

public interface PostingDAO extends CrudRepository<Posting, Integer> {
	
	@Override
	List<Posting> findAll();

}
