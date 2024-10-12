package com.npt.app.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class DictionaryValue extends BaseModel{

	private Long id;
	
	private String dictionaryValue;
	
	private String param;
	
	private Long dictionarySetId;
	
	private String udf1;
	
	private String udf2;

	private String udf3;
	
	private String udf4;
	
	private String udf5;
	
	private String deprecated;
	
	private int displayOrder;
	
}
