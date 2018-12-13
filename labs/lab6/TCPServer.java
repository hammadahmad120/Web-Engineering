import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	public static void main(String[] args) throws IOException {

		ServerSocket srvr = new ServerSocket(1234);
		Socket skt = srvr.accept();
		BufferedOutputStream bout = new BufferedOutputStream(skt.getOutputStream());
		bout.write("Class!! Wake Up pleaseE!".getBytes());
		//push and close the data
		bout.flush();
		bout.close();
		skt.close();
		srvr.close();
	}
}