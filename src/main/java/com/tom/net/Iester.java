package com.tom.net;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Iester {
    public static void main(String[] args) {
       try {

           Socket socket = new Socket("ppt.cc",23);
           Socket socket1 = new Socket("tw.yahpp.com",80);
           InputStream is =socket.getInputStream();
           for (int i = 0; i < 100; i++) {
               int data = is.read();
               System.out.println((char) data);
           }
           //可以去查ASCII,72
       } catch (IOException e) {
           e.printStackTrace();
       }
    }
}
