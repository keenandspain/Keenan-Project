package edu.tcu.cs.et.domain;
import java.io.Serializable;

/**
 * Class Publisher is called JavaBean, it corresponds to the table Publisher in
 * Database. Each attribute in JavaBean corresponds to each field or column in
 * the table. There should also be setter and getter methods.
 * 
 * @author keenandspain
 *
 */
public class Publisher implements Serializable {
	
	private String name;
	
	private String phone;
	
	private String city;
	
	public Publisher(String name,String phone,String city)
	{
		this.name = name;
		this.phone = phone;
		this.city=city;
	}
	
	public String toString() {
		return "Publisher [name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
