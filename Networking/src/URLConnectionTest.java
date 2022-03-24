import java.net.*;
import java.io.*;

public class URLConnectionTest {
    public static void main(String[] args) throws Exception {
        URL kbs = new URL("http://www.kbs.co.kr/aboiutkbs/history.html");
        URLConnection kbsCon = kbs.openConnection();
        //URL 객체 이용하여 URLConnection 객체 생성

        System.out.println("문서의 타입: " + kbsCon.getContentType());
        System.out.println("====문서의 내용====");

        InputStream input = kbsCon.getInputStream();
        // InputStream 객체(문자스트림) 생성
        int i = 500;
        int c;

        while (((c = input.read()) != -1) && (--i >0)) {
            // 생성된 문자스트림에서 한글자씩 읽어서 출력.
            System.out.print((char)c);
        }
        input.close();
    }
}
