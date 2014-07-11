package localdb;

import java.util.ArrayList;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileContact filecontact = new FileContact("test.txt");
		filecontact.addtocontact(1,"yjw","01012345678");
		filecontact.addtocontact(2,"tyt","01122535798");
		
		ArrayList<ContactDao> contactlist = filecontact.getContacts();
		
		for(ContactDao ctd : contactlist) {
			System.out.println(ctd.getId());
			System.out.println(ctd.getName());
			System.out.println(ctd.getPhone());
		}
	}
}
