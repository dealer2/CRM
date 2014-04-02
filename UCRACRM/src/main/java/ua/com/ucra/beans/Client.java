package ua.com.ucra.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;  

@ManagedBean (name="client")
@RequestScoped
public class Client implements Serializable{
	
	private String fullName;
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	

}
