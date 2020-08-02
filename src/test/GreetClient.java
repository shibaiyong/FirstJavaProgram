package test;

import java.io.*;
import java.net.Socket;


public class GreetClient {

    public void run(){
        String str;
        try
        {
            Socket client = new Socket("127.0.0.1",3456);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            BufferedReader BreaderF = new BufferedReader(new InputStreamReader(System.in));
            //类似文件new file()。就是往这里面写东西。
            OutputStream outToServer = client.getOutputStream();
            //将生成的载体对象，转换成流的形式。方便往里面写入数据
            DataOutputStream out = new DataOutputStream(outToServer);
//            while((str = BreaderF.readLine()) != null){
//                out.writeUTF(str+ "from CLIENT" + client.getLocalSocketAddress());
//            }
            do {
                str = BreaderF.readLine();
                out.writeUTF(str+ "from CLIENT" + client.getLocalSocketAddress());
            } while (!str.equals("end"));
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务端发来贺电： " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
