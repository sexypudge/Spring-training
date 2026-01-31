package com.dev4vn.first_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    @Qualifier("bikini")
    Outfit outfit;

    public void show() {
        outfit.wear();
    }
}
