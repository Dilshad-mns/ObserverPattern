package Observers.model.Assignment;

import java.util.Date;

public class Assignment {
	public Assignment(String title, String description, Date dateStamp) {
		super();
		this.title = title;
		this.description = description;
		this.dateStamp = dateStamp;
	}
	private String title;
	private String description;
	private Date dateStamp;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateStamp() {
		return dateStamp;
	}
	public void setDateStamp(Date dateStamp) {
		this.dateStamp = dateStamp;
	}
}
