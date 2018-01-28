package com.example.rikharthu.proxy.office;

// More info: https://www.javatpoint.com/proxy-pattern
public class ProxyPatternClient {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Ashwani Rajput");
        access.grantInternetAccess();
    }
}