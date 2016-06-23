package by.htp3.home.notebook;

import java.util.ArrayList;
import java.util.Date;

public class NoteBook {
	
	private static NoteBook instance = null;

	private ArrayList<Note> noteBook;
	
//------------------------------
	private NoteBook() {
	}
//------------------------------
	
	public void setNoteBook(ArrayList<Note> noteBook) {
		this.noteBook = noteBook;
	}
	
	public ArrayList<Note> getNoteBook(){
		return noteBook;
	}
	

	public static NoteBook getInstance() { // We'll be able to create only ONE
											// object of this class
		if (instance == null) {
			instance = new NoteBook();
			instance.noteBook = new ArrayList<Note>();
		}
		return instance;
	}
/*	public NoteBook(){
		noteBook = new ArrayList<Note>();		
	}*/
		
	public void addNote(Note n){
		this.noteBook.add(n);
	}
	public void addNote(String str){
		Note n = new Note(str);
		this.noteBook.add(n);
	}
	
	public void showNoteBook(){
		for(Note note : this.noteBook){
			note.showNote();
			System.out.println("--------------------------------");
		}
	}
	
	public void searchNote(String g){
		for(Note note : this.noteBook){
			String f = note.getNote();
			if(g.equals(f)){
				System.out.println("We have found! ^.^ ");
				System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
				note.showNote();
			}
			
		}	
	}
	/*public Note searchNote(Date d){
	    return Note b;	
	}
	public Note searchNote(){
		return Note bv;	
	}*/
	
	
	
	
}
	
