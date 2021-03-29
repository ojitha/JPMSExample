package com.github.ojitha.provider.b;

import com.github.ojitha.service.a.OjService;
import java.util.logging.*;

public class M implements OjService {
    private static final Logger log = Logger.getLogger(M.class.getName());
    @Override
    public void printHello() {
        log.info("Hello");
    }
}
