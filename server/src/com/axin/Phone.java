package com.axin;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Phone extends Remote {
    Object sendMessage(Message msg) throws RemoteException;
}
