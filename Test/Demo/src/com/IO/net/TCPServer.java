package com.IO.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        byte [] bytes=new byte[1024];
        int read = is.read(bytes);
        System.out.println(new String(bytes,0,read-1));
        OutputStream os = accept.getOutputStream();
        os.write("干啥？".getBytes());
        accept.close();
        serverSocket.close();
        method();

    }

    private static void method() {
        StringBuffer sb=new StringBuffer("dengxisha");
        StringBuffer reverse = sb.reverse();
        System.out.println(reverse);

    }
}