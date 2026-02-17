package org.example.child;

import org.example.inter.Mobile;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Redmi implements Mobile {
    @Override
    public void call(){
        System.out.println("redmi call the mobile");
    }
}
