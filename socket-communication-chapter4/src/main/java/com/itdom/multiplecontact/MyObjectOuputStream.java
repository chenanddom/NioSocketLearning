package com.itdom.multiplecontact;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOuputStream extends ObjectOutputStream {
    public MyObjectOuputStream(OutputStream out) throws IOException {
        super(out);
    }

    protected MyObjectOuputStream() throws IOException, SecurityException {
        super();
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        return;
    }
}
