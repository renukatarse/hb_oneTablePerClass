package com.scp.emp123;


	import org.hibernate.*;  
	import org.hibernate.cfg.*;  
	  
	public class Store_Data {  
	public static void main(String[] args) {  
	    AnnotationConfiguration cfg=new AnnotationConfiguration();  
	    Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
	      
	    Transaction t=session.beginTransaction();  
	      
	    Employee123 e1=new Employee123();  
	    e1.setName("sono"); 
	    
	      
	    Regular_employee e2=new Regular_employee();  
	    e2.setName("Amol Sonvane");  
	    e2.setSalary(50000);  
	    e2.setBonus(5);  
	      
	    Contract_Employee e3=new Contract_Employee();  
	    e3.setName("Sharavani sonvane");  
	    e3.setPay_per_hour(1000);  
	    e3.setContract_duration("15 hours");  
	      
	    session.persist(e1);  
	    session.persist(e2);  
	    session.persist(e3);  
	      
	    t.commit();  
	    session.close();  
	    System.out.println("success");  
	}  
	}


