
import java.net.*;
import java.io.*;

public class MulticastJoin {

public static void main (String [ ] args) {

try
{
MulticastSocket mSocket = new MulticastSocket(5002);
InetAddress mAddr = InetAddress.getByName("224.0.0.1");
mSocket.joinGroup(mAddr);
byte [ ] buffer = new byte[512];

while (true)
{
DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
mSocket.receive(dp);
String str = new String(dp.getData());
System.out.println(buffer);

}

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