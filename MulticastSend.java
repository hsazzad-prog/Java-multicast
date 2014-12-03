
import java.net.*;
import java.io.*;

public class MulticastSend {

public static void main (String [ ] args) {
byte ttl=(byte) 1;
try
{
MulticastSocket mSocket = new MulticastSocket();
InetAddress mAddr = InetAddress.getByName("224.0.0.1");
String sendString = "Hello from Server";
byte [ ] buffer = sendString.getBytes();
DatagramPacket dp = new DatagramPacket(buffer, buffer.lenght, mAddr, 5001);
mSocket.send(dp);


mSocket.close();

}
catch (SocketException se)
{
System.out.println("Socket Exception:"+se);
}
catch (IOException e)
{
System.out.println("Exception: "+e);
}
}
}