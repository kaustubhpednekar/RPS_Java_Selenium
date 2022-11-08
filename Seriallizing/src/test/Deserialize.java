package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {

	public static void main(String[] args) 
	{
		Rectangle dsr1 = (Rectangle)deSerializeFrimFileToObject("rectSerialized");
		System.out.println(dsr1.area());
		System.out.println(dsr1.perimeter());
	}
	
	public static Object deSerializeFrimFileToObject(String fileName)
	{
		try {
			FileInputStream fis = new  FileInputStream(new File(fileName));
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object dso = ois.readObject();
			ois.close();
			fis.close();
			return dso;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
