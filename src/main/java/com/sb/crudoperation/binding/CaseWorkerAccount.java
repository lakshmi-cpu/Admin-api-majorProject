package com.sb.crudoperation.binding;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CaseWorkerAccount {
	
	@Id
	@GeneratedValue
	private Integer sno;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer caseworkerid;
	private String name;
	private String email;
	private Long mobilenumber;
	private String gender;
	private Long ssn;
	

}
