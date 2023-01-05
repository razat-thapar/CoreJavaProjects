package com.wipro.ra20106511.basics.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SerializableClass a = new SerializableClass(20,0);
		File f = new File("src//main//resources//xyz.txt");
		try (FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos); 
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				){
			System.out.println("Serialization Process...");
			System.out.println("value of i : "+ a.i  +" value of j: "+ a.j);
			
			//serialization of object to file xyz.txt
			oos.writeObject(a);
			
			
			System.out.println("De-serialization process...");
			//de-serialization of object from the file xyz.txt. 
			SerializableClass b = (SerializableClass)ois.readObject();
			
			System.out.println("value of i : "+ b.i  +" value of j: "+ b.j);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
