package com.axin;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException {
        System.setProperty("java.rmi.server.codebase", "http://127.0.0.1:8000/");
        Registry registry = LocateRegistry.createRegistry(1099);
        PhoneImpl phone = new PhoneImpl();
        registry.rebind("phone", phone);
        System.out.println("registry started...");
    }
}
