package com.exemplo;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class FooTest {

    @Test
    public void testFoo() {
        Bar bar = mock(Bar.class);
        Foo foo = new Foo();

        foo.foo();

        verify(bar, times(1)).someMethod();  // Este teste vai falhar
    }
}
