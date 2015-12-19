package com.varadhisoft.java.exceptions7;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * 
 * @author Shreyas Chinna
 * @date 2015/10/16
 * @version 1.0
 *
 */
class AC {  //
    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }

}

public class AtomicCounter{
	public static void main(String[] args) {
		AC ac = new AC();
		System.out.println(ac.value());
	}
}