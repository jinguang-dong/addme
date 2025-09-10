package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rut {
    private int a;
    private int b;
    private rus c;
    private int d;
    private float e;
    private int f;
    private int g;
    private byte h;

    public final ruu a() {
        if (this.h != 63 || this.c == null) {
            throw new IllegalStateException();
        }
        return new ruu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final void b(int i) {
        this.f = i;
        this.h = (byte) (this.h | 16);
    }

    public final void c(int i) {
        this.g = i;
        this.h = (byte) (this.h | 32);
    }

    public final void d(float f) {
        this.e = f;
        this.h = (byte) (this.h | 8);
    }

    public final void e(rus rusVar) {
        rusVar.getClass();
        this.c = rusVar;
    }

    public final void f(int i) {
        this.b = i;
        this.h = (byte) (this.h | 2);
    }

    public final void g(int i) {
        this.a = i;
        this.h = (byte) (this.h | 1);
    }

    public final void h(int i) {
        this.d = i;
        this.h = (byte) (this.h | 4);
    }
}
