package com.ftms.blog.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ftms.blog.model.Posting;
import com.ftms.blog.service.BlogService;

import ch.qos.logback.classic.Logger;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/blog/post")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@GetMapping(value="/getPosting")
	public List<Posting> getPostings(){
		return blogService.getPostings();
	}
	
	@PostMapping(value="/addPosting")
	public Posting addPosting(@RequestParam("postName") String postName, @RequestParam("fileName") MultipartFile file){
		Posting posting = new Posting();
		try{
			byte[] imgFile = file.getBytes();
			posting.setPostName(postName);
			posting.setFile(imgFile);
			return blogService.addPosting(posting);
		}catch(Exception e){
			e.printStackTrace();
			return posting;
		}
		
	}

}
