package one_to_one.unidirectional.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="passport_master")
public class Passport {
	@Id
	@Column(name="passport_no",length=25)
	private String passportno;
	@Column(name="passport_name",length=40)
	private String name;
	@Column(name="passport_exp_date")
	private LocalDate expiryDate;
	
	public Passport() {
		
	}
	
	public Passport(String passportno, String name, LocalDate expiryDate) {
		
		this.passportno = passportno;
		this.name = name;
		this.expiryDate = expiryDate;
	}
	public String getPassportno() {
		return passportno;
	}
	public void setPassportno(String passportno) {
		this.passportno = passportno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", name=" + name + ", expiryDate=" + expiryDate + "]";
	}
	
	

}
