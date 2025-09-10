package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxx {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private short n;

    public final oxy a() {
        if (this.n == 8191) {
            return new oxy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException();
    }

    public final void b(int i) {
        this.a = i;
        this.n = (short) (this.n | 1);
    }

    public final void c(int i) {
        this.b = i;
        this.n = (short) (this.n | 2);
    }

    public final void d(int i) {
        this.c = i;
        this.n = (short) (this.n | 4);
    }

    public final void e(int i) {
        this.d = i;
        this.n = (short) (this.n | 8);
    }

    public final void f(int i) {
        this.e = i;
        this.n = (short) (this.n | 16);
    }

    public final void g(int i) {
        this.f = i;
        this.n = (short) (this.n | 32);
    }

    public final void h(int i) {
        this.g = i;
        this.n = (short) (this.n | 64);
    }

    public final void i(int i) {
        this.h = i;
        this.n = (short) (this.n | 128);
    }

    public final void j(int i) {
        this.j = i;
        this.n = (short) (this.n | 512);
    }

    public final void k(int i) {
        this.i = i;
        this.n = (short) (this.n | 256);
    }

    public final void l(int i) {
        this.k = i;
        this.n = (short) (this.n | 1024);
    }

    public final void m(int i) {
        this.l = i;
        this.n = (short) (this.n | 2048);
    }

    public final void n(int i) {
        this.m = i;
        this.n = (short) (this.n | 4096);
    }
}
