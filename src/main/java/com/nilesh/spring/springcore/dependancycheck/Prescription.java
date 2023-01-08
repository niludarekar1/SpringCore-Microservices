package com.nilesh.spring.springcore.dependancycheck;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", pName=" + pName + ", medicines=" + medicines + "]";
	}
	private int id;
	private String pName;
	private List<String> medicines;
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	} 
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
}
