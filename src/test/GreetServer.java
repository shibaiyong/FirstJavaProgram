package test;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetServer extends Thread {
    private ServerSocket serversocket;
    public GreetServer(int port) throws IOException {
        serversocket = new ServerSocket(port);
        serversocket.setSoTimeout(100000);
    }

    public void run(){
        while(true){
        try{
                Socket server = serversocket.accept();
                System.out.println("远程主机的地址"+server.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println("客户端发来贺电："+in.readUTF());
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("hello client from SERVER:" + server.getLocalSocketAddress() + "\nGoodbye!");
                //

        }catch (SocketTimeoutException e){
            System.out.println("Socket timeout");
        }catch(IOException ee){
            ee.printStackTrace();
        }
        }
    }
}
