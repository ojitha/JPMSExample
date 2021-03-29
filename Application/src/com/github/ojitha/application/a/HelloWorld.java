package com.github.ojitha.application.a;
import com.github.ojitha.service.a.OjService;

import java.util.ServiceLoader;

public class HelloWorld {
    public static void main(String[] args) {

        ServiceLoader<OjService> sl = ServiceLoader.load(OjService.class);
        OjService l = sl.findFirst().get();
        l.printHello();
    }
}
