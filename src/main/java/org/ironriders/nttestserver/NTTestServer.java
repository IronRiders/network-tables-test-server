package org.ironriders.nttestserver;

import edu.wpi.first.networktables.*;

public class NTTestServer {

    public static void main(String[] args) {
        NetworkTableInstance serverInst = NetworkTableInstance.create();
        
        serverInst.setNetworkIdentity("test-server");
        serverInst.startServer();

        serverInst.getTable("Server").getEntry("test-server").setBoolean(true);

        NetworkTableInstance clientInst = NetworkTableInstance.getDefault();
        clientInst.setServer("127.0.0.1");
        clientInst.startClient();

        while(true) {}
    }
}