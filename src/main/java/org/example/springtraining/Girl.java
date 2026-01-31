package org.example.springtraining;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Autowired
    Outfit outfit;

    public void show() {
        outfit.wear();
    }
}