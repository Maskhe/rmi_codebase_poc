package com.axin;

import java.io.Serializable;

public class Message implements Serializable {
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
