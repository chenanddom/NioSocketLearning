package com.itdom.multiplecontact;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class MyObjectInputStream extends ObjectInputStream {

    public MyObjectInputStream(InputStream in) throws IOException {
        super(in);
    }

    protected MyObjectInputStream() throws IOException {
    super();
    }
}
