package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) 
	{
		Rectangle rect = new Rectangle(5.8,9);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		//System.out.println(rect.width);
		
		serializeToFile(rect, "rectSerialized");
	}

	public static void serializeToFile(Object obj, String fileName)
	{
		try {
			FileOutputStream fs = new FileOutputStream(fileName);
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(obj);
			os.close();
			fs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
