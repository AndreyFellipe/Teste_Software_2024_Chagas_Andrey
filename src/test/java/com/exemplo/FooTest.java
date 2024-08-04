package com.exemplo;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class FooTest {

    @Test
    public void testFoo() {
        Bar bar = mock(Bar.class);
        BarFactory myFactory = new BarFactory() {
            @Override
            public Bar createBar() {
                return bar;
            }
        };

        Foo foo = new Foo(myFactory);
        foo.foo();

        verify(bar, times(1)).someMethod();
    }
}