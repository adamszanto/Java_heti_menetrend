public class A {
    private B value = new B();
}

// Dependency Injection = Sosem az osztályon belül hozzuk létre, hanem kívülről kapjuk meg
// Ahol new az osztályon belül jelenik meg, az nem OK megoldás.
class C {
    private B value;

    public C(B value) {
        this.value = value;
    }
}

class D {
    private B value;

    // Init block:
    {
        value = new B();
    }
}

class E {
    private B value;

    public E() {
        this.value = new B();
    }
}
