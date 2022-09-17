package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.*;

@RestController
@CrossOrigin("*")
public class myController {
	
	@Autowired
	public RefundService refundService;

	@GetMapping("/pan/{panNo}")
	public TreeMap<Integer, String> getRefundData(@PathVariable("panNo") String panNo) throws IOException {
		StringBuilder sBuilder=new StringBuilder();
		List<String>ans=new ArrayList();
		TreeMap<Integer, String>map=new TreeMap<>();
		IntStream.range(2000, 2023).parallel().forEach
		(
				i->{
			try {
				map.put(i,this.refundService.getRefundStatusData(panNo,i));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	);
		
		return map;
	}

}
