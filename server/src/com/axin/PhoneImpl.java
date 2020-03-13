package com.axin;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PhoneImpl extends UnicastRemoteObject implements Phone{
    protected PhoneImpl() throws RemoteException {
    }

    @Override
    public Object sendMessage(Message msg) throws RemoteException {
        System.out.println("sendMessage was invoked by client");
        return new Resp("hello from server");
    }
}
