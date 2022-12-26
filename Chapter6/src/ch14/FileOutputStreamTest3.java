package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try(fos){
			
			byte[] bs = new byte[26];
			
			byte data = 65;
			for(int i = 0; i< bs.length; i++) {	//A-Z �Է�
				bs[i] = data++;
			}
			
			fos.write(bs, 2, 10);	//�迭 2��°���� 10�� ����Ʈ ���
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}