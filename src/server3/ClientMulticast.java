package server3;

import java.io.*;
import java.net.*;

public class ClientMulticast {

    public static void main(String[] args) throws IOException {
     byte[] bufferIn= new byte[1024];
   int porta =6789;
   String gruppo = "255.4.5.6";
   MulticastSocket socket = new MulticastSocket(porta);
   socket.joinGroup(InetAdress.getByName(gruppo));
   DatagramPacket packet in = new DatagramPacket (bufferIn, bufferIn.lenght);
   socket.receive(packetIn);
   System.out.println("Ho ricevuto dati di lunghezza:"+packetIn.getLenght()+"da"+ packetIn.getAdress().toString()+"porta"+packetIn.getPort());
   System.out.write(packetIn.getData(), 0, packetIn.getLenght());
   System.out.println();
   socket.leaveGroup(InetAdress.getByName(gruppo));
   socket.close();
    }
    
}
