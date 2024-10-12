package com.npt.app.model;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Rider extends BaseModel{

	
	private @NonNull String name;
	
	private @NonNull DictionaryValue gender;
	
	private @NonNull String emailId;
	
	private @NonNull String phoneNumber;
	
	private @NonNull DictionaryValue country;
	
	private @NonNull DictionaryValue status;
	
	private @NonNull Date dob;
	
}
