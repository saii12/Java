package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		// BufferedReader, BufferedWriter 클래스 활용
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			// sc.nextInt(); 와 같음(입력한 값을 읽고 숫자로 이루어진 문자열을 int(정수)로 바꾸는 것)
			int inputCount = Integer.parseInt(reader.readLine());

			int[] values = new int[inputCount];
			
			for(int i=0 ; i<inputCount ; i++) {
				
				// 입력한 값으로 배열을 만드는데 각 요소를 띄어쓰기로 구분한다 ex) 3 5 이렇게 입력하면 이걸 배열로 인식해서 3을 a로, 5를 b로 대입
				String[] line = reader.readLine().split(" ");
				int a = Integer.parseInt(line[0]); 
				int b = Integer.parseInt(line[1]);
				
				values[i] = a + b;
			}
			
			for(int i=0 ; i<inputCount ; i++) {
				writer.write(Integer.toString(values[i]));
				writer.newLine(); // 줄바꿈
			}
			
			// 버퍼에 있는 데이터를 flush() 메서드로 출력
			writer.flush();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				if(writer != null) writer.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		/*Scanner sc = new Scanner(System.in);
		
		int inputCount = sc.nextInt();
		
		int[] values = new int[inputCount];
		
		for(int i=0 ; i<inputCount ; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			values[i] = a + b;
		}
		
		for(int i=0 ; i<inputCount ; i++) {
			System.out.println(values[i]);
		}
		*/
	}
}
