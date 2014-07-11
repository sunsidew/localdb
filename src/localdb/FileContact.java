package localdb;

import java.io.BufferedReader;
import java.io.FileReader;
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
		ArrayList<ContactDao> list = new ArrayList<ContactDao>();
		
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fr);
			String line;
			String[] array;
			
			while ((line = bufferedReader.readLine()) != null) {
				array = line.split("\\|");
				ContactDao contactDao = new ContactDao(Integer.parseInt(array[0]),array[1],array[2]);
				list.add(contactDao);
			}
			
			bufferedReader.close();
			fr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
}
