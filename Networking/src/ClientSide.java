import java.io.*;
import java.net.*;

public class ClientSide {
    public static void main(String[] args) throws Exception {
        String server = args[0];
        int port = Integer.parseInt(args[1]);
        Socket c = new Socket(server, port);
        // 서버 주소와 포트번호로 Socket 객체 생성.
        InputStream is = c.getInputStream();
        DataInputStream dis = new DataInputStream(is);

        for (int i=1; i<=10; i++){
            int j=dis.readInt();
            System.out.println("서버로 받은 데이터 " +j+" 출력");
        }
        c.close();
    }
}
// 클라이언트 측
//  연결을 원하는 서버의 주소와 포트번호로 Socket 객체를 생성.
//  Socket 객체를 이용하여 입/출력을 위한 스트림 생성.
//  통신 수행
//  소켓 닫기