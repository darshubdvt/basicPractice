package com.evolvusion.test;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.evolvusion.pojo.Employee;

@SuppressWarnings("resource")
public class GettingRestConnection {

	public static void main(String[] args) throws IOException {
			HttpURLConnection con= null;
			
			URL url = new URL("http://localhost:8080/asbaweb");
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			
			OutputStreamWriter out=new OutputStreamWriter(con.getOutputStream());
			
			out.write("");
			
			ClassPathXmlApplicationContext ct= new ClassPathXmlApplicationContext("");
			
			
			Employee em =(Employee) ct.getBean("");
			
			
			
	}

}
