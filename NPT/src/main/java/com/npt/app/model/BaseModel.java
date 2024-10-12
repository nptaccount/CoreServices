package com.npt.app.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter 
@NoArgsConstructor
@ToString
public class BaseModel implements IModel{
	
	private Long Id;
	
	private Long version;
	
	private Date creationDate;
	
	private Date lastUpdateDate;
	
	private String createBy;
	
	private String lastUpdateBy;
	
}
