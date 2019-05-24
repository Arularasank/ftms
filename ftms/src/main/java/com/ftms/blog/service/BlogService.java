package com.ftms.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ftms.blog.dao.PostingDAO;
import com.ftms.blog.model.Posting;

@Component
public class BlogService {
	
	@Autowired
	private PostingDAO postingDAO;
	
	public List<Posting> getPostings(){
		return postingDAO.findAll(); 
	}
	
	public Posting addPosting(Posting posting){
		return postingDAO.save(posting);
	}

}
