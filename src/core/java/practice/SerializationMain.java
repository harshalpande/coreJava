package core.java.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		SerializationTest serTest = new SerializationTest("Harshal", "Shankarlal", 32);
//		System.out.println("Before: " + serTest.toString());
		File file = new File("serialization.ser");
		
//		FileOutputStream fos = new FileOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeObject(serTest);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationTest readObject = (SerializationTest) ois.readObject();
		
		System.out.println("After: " + readObject.toString());
		System.out.println("Static Gender : " + readObject.gender);
		
	}

}
