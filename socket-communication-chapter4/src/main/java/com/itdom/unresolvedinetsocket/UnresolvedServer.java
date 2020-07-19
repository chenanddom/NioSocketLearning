package com.itdom.unresolvedinetsocket;

import java.net.InetSocketAddress;

public class UnresolvedServer {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com",80);
        System.out.println(inetSocketAddress.isUnresolved());

        InetSocketAddress inetSocketAddress2 = new InetSocketAddress("www.baidu.askdhajhdasjdhasj.com",80);
        System.out.println(inetSocketAddress2.isUnresolved());


        InetSocketAddress unresolved = InetSocketAddress.createUnresolved("www.baidu.com", 80);
        System.out.println(unresolved.isUnresolved());

        InetSocketAddress unresolved2 = InetSocketAddress.createUnresolved("www.baidu.1371823dsjdas.com", 80);
        System.out.println(unresolved2.isUnresolved());


    }
}
