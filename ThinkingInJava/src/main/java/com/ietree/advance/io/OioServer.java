package com.ietree.advance.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OioServer {
    private static final int PORT = 7001;

    private static InputStream in;

    public static void main(String[] args) throws Exception {
        // Create ThreadPool
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        // create Socket Server, monitoring 7001 port
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("Server is starting!");
        while (true) {
            // get a socket
            Socket socket = server.accept();
            System.out.println("Accepted a new client!");
            // handle bussiness
            newCachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    handle(socket);
                }
            });
        }
    }

    /**
     * Read data
     * 
     * @param socket
     * @throws IOException
     */
    private static void handle(Socket socket) {
        try {
            byte[] bytes = new byte[1024];
            in = socket.getInputStream();
            while (true) {
                // reading data(blocking)
                int read = in.read(bytes);
                if (read != -1) {
                    System.out.print(new String(bytes, 0, read));
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Socket close!");
            try {
                in.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
