package com;
import javax.persistence.Entity;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.IdClass;
import javax.persistence.Id;
@Entity
@Table(name="Employee")
@IdClass(EmployeePK.class)
public class Employee
{
	//@EmbeddedId
	@Id
	//private EmployeePK pk;
	private Long keyOne;
	@Column(name="Emp_Name")
	private String EmpName; 
	public String getEmpName(){return this.EmpName;}
	public void setEmpName(String EmpName){this.EmpName=EmpName;}
}
