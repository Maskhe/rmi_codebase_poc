package com.axin;

import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Objects;

public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException {
        System.setProperty("java.security.policy", Objects.requireNonNull(Client.class.getClassLoader().getResource("java.policy")).getFile());
        System.setProperty("java.rmi.server.useCodebaseOnly", "false");
        RMISecurityManager rmiSecurityManager = new RMISecurityManager();
        System.setSecurityManager(rmiSecurityManager);

        Registry registry = LocateRegistry.getRegistry(1099);
        Phone phone = (Phone) registry.lookup("phone");
        phone.sendMessage(new Message("hello"));
//        Evil evil = new Evil();
//        registry.rebind("evil", evil);
    }
}
