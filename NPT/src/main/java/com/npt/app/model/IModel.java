package com.npt.app.model;

import java.util.Date;

public interface IModel {

	public Long getId() ;

	public void setId(Long id);

	public Long getVersion() ;

	public void setVersion(Long version);

	public Date getCreationDate() ;

	public void setCreationDate(Date creationDate);
	
	public Date getLastUpdateDate() ;

	public void setLastUpdateDate(Date lastUpdateDate) ;

	public String getCreateBy() ;

	public void setCreateBy(String createBy) ;

	public String getLastUpdateBy() ;
	
	public void setLastUpdateBy(String lastUpdateBy) ;
}
