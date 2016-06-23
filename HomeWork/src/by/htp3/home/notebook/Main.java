package by.htp3.home.notebook;

public class Main {
	public static void main(String[] args) {

		Note note1 = new Note("First note");
		note1.setDate();
		System.out.println(note1.getDate());
		note1.showNote();
		note1.changeNote("second");

		NoteBook a = NoteBook.getInstance();
		NoteBook b = NoteBook.getInstance();

		a.addNote(note1);
		a.addNote("Sdr");
		System.out.println(a.getNoteBook());
		a.showNoteBook();

		a.searchNote("Sdr");
	}

}
