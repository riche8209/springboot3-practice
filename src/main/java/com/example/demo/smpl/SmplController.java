package com.example.demo.smpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmplController {

	@GetMapping("/smpl")
	public List<String> smpl() {
		
		System.out.println("## vue to spring called !!");
		
		List<String> result = new ArrayList<>();
		result.add("리스트 1");
		result.add("리스트 2");
		result.add("리스트 3");
		
		return result;
	}
}
