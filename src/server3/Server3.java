package server3;

import java.io.*;
import java.net.*;
public class Server3 {
    public static void main(String[] args) throws IOException{
 boolean attivo=true;
 byte[] bufferOut = new byte[1024];
int conta = 20;
int porta = 6789;
InetAdress gruppo = InetAdress.getByName("255.4.5.6");
MulticastSocket socket = new MulticastSocket();
String dString = null;
while(attivo){
    dString = new Date().tostring();
    bufferOut = dString.getBytes();
    DatagramPacket packet= new DatagramPacket(bufferOut, bufferOut.lenght, gruppo, porta);
    socket.send(packet);
    try{
        Thread.sleep(1000);
    } catch (InterruptedException ex) {
         ie.printStackTrace();   
     }
    conta--;
    if (conta==0){
        System.out.println("Server in chiusura");
        attivo=false;
    }
    else{
        System.out.println("Server attivo ancora per"+conta+"secondi");
        
    }
}
    }
    
}
