package com.capgemini.springmvc.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
@Data
public class PersonBean implements Serializable {
	private String name;
	private Date dob;

}
