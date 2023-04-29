//Copy pasted from DemoApplication.java
package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;

//RestController and GetMapping are built-in
@RestController 
public class DemoController //Annotating entire class to be a part of RestController
{




	//Options parameter not included. To run the codes, please go to the respective url, i.e., /lcase, /ucase, /ascii and /prefix
	
	//I've done 3 out of 5 questions.


	@PostMapping("/lcase")
	public String lcase(@RequestBody Map<String,String> value)
	{
		String str = value.get("data");
		StringProbs obj = new StringProbs();
		String subStr = obj.Lcase_func(str);
		return subStr;
	}
	
	@PostMapping("/ucase")
	public String ucase(@RequestBody Map<String,String> value)
	{
		String str = value.get("data");
		StringProbs obj = new StringProbs();
		String subStr = obj.Ucase_func(str);
		return subStr;
	}
	
	@PostMapping("/ascii")
	public String ascii(@RequestBody Map<String,String> value)
	{
		String str = value.get("data");
		StringProbs obj = new StringProbs();
		String subStr = obj.Ascii(str);
		return subStr;
	}
	
	@PostMapping("/prefix")
	public String prefix(@RequestBody Map<String,String> value)
	{
		String str = value.get("data");
		String pref = value.get("options");
		
		StringProbs obj = new StringProbs();
		String subStr = obj.Prefix(str,pref);
		return subStr;
	}
}

/*
1. Go to where mvnw file is there and type ./mvnw spring-boot:run

2. Any controller is for mapping and displaying output only. 
   Not for writing codes. So we shouldn't be writing our codes here.
   
3. Controller is a servlet that runs continuously waiting for Request.
*/
