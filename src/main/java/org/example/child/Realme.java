package org.example.child;

import org.example.inter.Mobile;
import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile {
    @Override
    public void call(){
        System.out.println("Realme call the mobile");
    }
}
