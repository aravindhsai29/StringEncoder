package com.example.demo.Controller;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.EncoderRepo;
import com.example.demo.model.CharacterEncoder;

@Component
public class Service {
	
	@Autowired
	private EncoderRepo encoderRepo;
	
	public String getResult(String input) {
		CharacterEncoder ce = new CharacterEncoder();
		ce.setInput(input);
		
		CharacterEncoder dummy = new CharacterEncoder();
		dummy.setInput(input);
		dummy.setOutput("1");
		
		
//		Optional<CharacterEncoder> oce = Optional.ofNullable(encoderRepo.findByInput(input));
//
//		
//		if(oce.isPresent()) {
//			return oce.get().getOutput();
//		}
		
		StringBuilder result = new StringBuilder();
		
		
		HashMap<String,String> setter = new HashMap<>();
		setter.put("aaa","1");
		setter.put("aba","2");
		
		if(input.length() < 3)
		{
			return "0";
		}
		else
		{
			for(int i = 0 ; i <  input.length();i++)
			{
				int tmp = i+3;
				if(tmp < input.length())
				{
					if(setter.containsKey(input.substring(i,i+3)))
				{
						result.append(setter.get(input.substring(i,i+3)));
							i+=2;
				}
				}
			}
			
			
			
		}
		
		String result1 = result.toString();
		ce.setOutput(result1);
		
		encoderRepo.save(ce);
		
		return result1;
		 
		
	}
	
	
	
}
