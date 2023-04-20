package com.sb.crudoperation.binding;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class PlanScreen {
	
	@Id
	@GeneratedValue
	private Integer sno;
	private String planname;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String plancategory;
	

}
