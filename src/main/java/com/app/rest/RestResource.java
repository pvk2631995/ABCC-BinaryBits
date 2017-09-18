package com.app.rest;

import java.io.BufferedOutputStream;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;


//import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
//import java.nio.file.Paths;
//import com.sun.jersey.core.header.FormDataContentDisposition;
//import com.sun.jersey.multipart.FormDataParam;


import org.apache.velocity.app.VelocityEngine;
//import org.hibernate.validator.internal.util.logging.Log_.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;
import org.springframework.ui.velocity.VelocityEngineUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.app.config.MailConfig;
import com.app.domain.Player;
import com.app.sms.*;
//import com.application.controller.RestController;
//import com.application.model.login_details;
import com.app.reposiotry.sportrepository;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Component
public class RestResource extends Way2Sms{
	
	@Autowired
	private sportrepository spr;
	
	@Autowired
	private VelocityEngine velocityEngine;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	  private Environment env;
	
	 public void setMailSender(JavaMailSender mailSender) {
	        this.mailSender = mailSender;
	    }

	    public void setVelocityEngine(VelocityEngine velocityEngine) {
	        this.velocityEngine = velocityEngine;
	    }
	/*@Autowired
	private  JavaMailSender  javaMailService;*/

	//==========save the player in email id============//
	
	@Path("/{id}")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public Response checkEmployee(@PathParam("id") String empntid, com.app.domain.login_details employee) {
//		empService.save(employee);
//		logger.debug("Added:: " + employee);
//		return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
		String id = employee.getEmpntid();
		String pwd = employee.getEmppwd();
		System.out.println(id+" "+pwd);
		boolean status = false;
		try {
			status = RestResource.checkEmp(employee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(status == true){
			return Response.ok().entity("<message>Logged In Successfully...!</message>").build();
		}
		else{
			return Response.status(Status.NOT_FOUND).build();
		}
		
	}
	
	//Database Connection for emp check
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abcc","root","root");  
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }     
	    return con;  
	    }  
	
		//Check whether emp is present ***execute query***
		public static boolean checkEmp(com.app.domain.login_details emp) throws Exception{
		
		Connection con = RestResource.getConnection();
		
		ResultSet Result,rs;
		
//		Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery("select * from stock_in");
//        
//        while (rs.next()){
//        	String temp_empntid = rs.getString("empntid");
//        	String temp_emppwd = rs.getString("emppwd");
//        }
//        
		
//        PreparedStatement ps = con.prepareStatement("SELECT * from login_details where empntid = ? and emppwd = ?");
//        ps.setString(1, emp.getEmpntid());
//        ps.setString(2, emp.getEmppwd());
       
        Statement st = con.createStatement();
        rs = st.executeQuery("SELECT * FROM login_details where empntid = '"+emp.getEmpntid()+"'and emppwd = '"+emp.getEmppwd()+"'");
        //Result = ps.executeQuery();
        
        if(rs.next()){
        	return true;
        }
        else{
        	return false;
        }
				
	}
	
}