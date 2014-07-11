package localdb;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileContact filecontact = new FileContact("test.txt");
		filecontact.addtocontact(1,"yjw","01012345678");
		filecontact.addtocontact(2,"tyt","01122535798");
		
//        ContactDao contactdao = new ContactDao();
        
	}
}
