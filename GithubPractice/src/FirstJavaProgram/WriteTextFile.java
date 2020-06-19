package FirstJavaProgram;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String TestFile = "D:\\temp1.txt";
		//Created object of java File class.
		File FC = new File(TestFile);
		FC.createNewFile();

		//Writing In to file.
		//Create Object of java FileWriter and BufferedWriter class.
		FileWriter FW = new FileWriter(TestFile);
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("Assignment practice");
		BW.newLine();
		BW.write("Testing the Code");
		BW.close();

	}

}
