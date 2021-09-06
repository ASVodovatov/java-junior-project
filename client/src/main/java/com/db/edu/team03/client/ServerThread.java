package com.db.edu.team03.client;

import java.io.IOException;

public class ServerThread extends Thread{
    private final Connection connection;

    public ServerThread(Connection connection){
        this.connection = connection;
    }

    @Override
    public void run(){
        while (true) {
            try {
                System.out.println(connection.receiveMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
