package localdb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileContact {
	private String filename;

	public FileContact(String filename) {
		this.filename = filename;
	}

	public void addtocontact(int id, String name, String phone) {
		try {
			FileWriter fw = new FileWriter(filename,true);
			fw.write(id+"|"+name+"|"+phone+"\n");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<ContactDao> getContacts() {
		ArrayList<ContactDao> = new 
	}
}
