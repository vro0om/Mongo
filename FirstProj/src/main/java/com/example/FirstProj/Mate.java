package com.example.FirstProj;

import org.springframework.stereotype.Component;

@Component("amore")
public class Mate {
	private String name;
	private String status;
	private int phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Mate [name=" + name + ", status=" + status + ", phone=" + phone + "]";
	}

	
}
