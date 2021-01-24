package test;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
public class GetIP {
	
	public static String ReturnIp() throws SocketException {
		
		try(final DatagramSocket socket = new DatagramSocket()){
			  try {
				socket.connect(InetAddress.getByName("8.8.8.8"), 10002);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return socket.getLocalAddress().getHostAddress();
			}
		
		
	}

	public static void main(String[] args) throws SocketException {
		// TODO Auto-generated method stub

		

		System.out.println(ReturnIp());

}
}