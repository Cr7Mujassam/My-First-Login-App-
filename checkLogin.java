package com.in28minutes.springboot.web.springbootfirstwebapplication.newLogin;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class checkLogin {
	
	public String name;
	public String pass;
	public String ConfirmPass;
	
	public boolean passcheck() {
		//System.out.println(name + " " + pass + " " + ConfirmPass);
		if(pass.length()==ConfirmPass.length()) {
			return true;
		}
		return false;
	}
	
	public List<String> save(){
		List<String> li= new ArrayList<>();
		li.add(name);
		li.add(pass);
		return li;
	}
	
	{
		System.out.println(name + " " + pass);
	}
}
