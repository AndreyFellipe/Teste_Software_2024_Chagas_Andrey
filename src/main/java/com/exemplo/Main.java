package com.exemplo;

class Bar {
    public void someMethod() {
        // Método que será testado
    }
}

class Foo {
    public void foo() {
        Bar bar = new Bar();
        bar.someMethod();
    }
}
