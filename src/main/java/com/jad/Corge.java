package com.jad;
public class Corge {
    private Foo foo;

    // Constructeur
    public Corge(Foo foo) {
        this.foo = null;
        if (foo != null) {
            foo.setCorge(this); 
        }
    }

    // Getter et Setter pour Foo
    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo newFoo) {
        if (this.foo == newFoo) {
            return; 
        }

        if (this.foo != null) {
            Foo oldFoo = this.foo;
            this.foo = null; 
            oldFoo.setCorge(null);
        }
       
        this.foo = newFoo;
        if (newFoo != null && newFoo.getCorge() != this) {
            newFoo.setCorge(this);
        }
    }
}