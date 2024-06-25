package School.ch2023SecondComputerPro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class text {
	public static void main(String[] args) throws IOException {
		PrintWriter out = null;

		out = new PrintWriter(new FileWriter("hufs.txt")); // hufs.txt 파일 만들기//
		out.println("HUFS"); // 파일에 내용쓰기//
		out.println("1939");
		out.println("한국외국어대학교");
		out.flush(); // 파일 나가기//

		if (out != null) // 파일 저장하기(즉 파일을 닫는것) 위치는 mygit 에 있음)
			out.close();
	}
}
