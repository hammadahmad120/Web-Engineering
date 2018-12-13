import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket skt = new Socket("localhost", 1234);

		BufferedInputStream bin = new BufferedInputStream(skt.getInputStream());
		int i;
		while ((i = bin.read()) != '-1') {
			System.out.print((char) i);
		}
		bin.close();
		skt.close();
	}
}