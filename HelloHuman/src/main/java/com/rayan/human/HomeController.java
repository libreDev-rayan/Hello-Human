package com.rayan.human;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController

// times 
public class HomeController {

	 @RequestMapping("/")
	    public String index(@RequestParam(value="name", required=false, defaultValue="Human")String searchQuery 
	    		,@RequestParam(value="last_name", required=false ,defaultValue="")String searchSecondQuery
	    		,@RequestParam(value="times", required=false , defaultValue = "1" )Integer times){
	        
		 String result="";
		 
		 for(int i=0 ;i < times ; i++) {
			 result += " Hello  " +searchQuery +"  "+ searchSecondQuery +"  ";
	        }		 
		 	return result;
	
	 }

}