package contentSec;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTxt {

	public String read(String path, String fileName) {
		
		File file = new File(path, fileName);
		BufferedReader br;
		String retStr="";
		
		try {
			br = new BufferedReader(new FileReader(file));   //버퍼리더로 읽을 파일을 설정
			String line;
			
			while((line = br.readLine())!=null ) {
				retStr += line + "\n";
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return retStr;
	}
	
	public void write(String Path, String FileName, String Content) {
		File file = new File(Path, FileName);
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(Content);
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
