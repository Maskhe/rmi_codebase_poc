package com.axin;

import com.axin.Message;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Phone extends Remote {
    Object sendMessage(Message msg) throws RemoteException;
}
