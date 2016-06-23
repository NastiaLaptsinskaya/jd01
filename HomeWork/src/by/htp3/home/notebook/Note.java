package by.htp3.home.notebook;
import java.util.*;
import java.text.SimpleDateFormat;

public class Note {
	

//////////////////////////////////////////////
	private String note;
	private String hash;
	private Date date;
//////////////////////////////////////////////
	Note(String note){
		this.note = note;
		this.setDate(); 
		this.hash = "Default hash";
	}
	
/*	Note(String note, int year, int month, int day){
		this.note = note;
		this.date = new Date(year, month, day) ; 
		this.hash = "Default hash";
	}*/
	
	public Date getDate() {
		return this.date;
	}

	public void setDate() {
		//this.date = Calendar.getInstance().getTime();
		this.date = new Date();
		
	}

	Note(String note, String hash){
		this.note = note;
		this.hash = hash;
	}
	
	Note(){
		
	}
//////////////////////////////////////////////
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public Note changeNote(String newNote){
		this.note = newNote;
		return this;
	}
	
	public void showNote(){
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm");
		System.out.println(format1.format(this.date)); //25.02.2013 09:03
		System.out.println(this.note);
	}
	
	//void set(int field, int value
	// System.out.println (new java.util.Date ().toString ());
	// new java.util.Calendar().getTime();
	//java.util.Calendar.getInstance().getTime();

}
