package com;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

//@Embeddable
public class EmployeePK implements Serializable 
{
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="key_1",nullable=false,insertable=false,updatable=false)
	private Long keyOne;

}
