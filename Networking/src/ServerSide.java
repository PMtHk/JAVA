import java.io.*;
import java.net.*;

public class ServerSide {
    public static void main(String[] args) throws Exception {
        int port = Integer.parseInt(args[0]);
        int times = Integer.parseInt(args[1]);
        // parseInt() => 문자열 -> 수로 변환.
        ServerSocket ss = new ServerSocket(port);
        // 포트번호를 이용하여, 서버소켓 객체 생성
        int i = 1;
        while ( i <= times ) {
            Socket s = ss.accept(); // 클라이언트 요청을 기다려 Socket 객체 생성
            OutputStream os = s.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            for (int  j=1; j<=10; j++) {
                dos.writeInt(j);
            }
            s.close();
            ++i;
        }
    }
}

// 서버 측
//  서버 소켓 객체를 ServerSocket 클래스로 부터 생성한 다음,
//  클라이언트의 요청을 기다린다(accept() 메소드 이용).
//  클라이언트의 요청이 발생하면, 요청을 받아들여 Socket 객체를 생성.
//  Socket 객체를 이용하여 입/출력을 위한 스트림 생성.
//  통신을 수행.
//  소켓을 닫기.