package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlr {
    public int a;
    public String b;
    public short c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;

    public final jls a() {
        if (this.c != 4095 || this.b == null) {
            throw new IllegalStateException();
        }
        return new jls(this.a, this.d, this.e, this.b, this.f, this.g, this.h, this.i, this.j, this.k);
    }

    public final void b(boolean z) {
        this.g = z;
        this.c = (short) (this.c | 64);
    }

    public final void c(boolean z) {
        this.h = z;
        this.c = (short) (this.c | 128);
    }

    public final void d(boolean z) {
        this.i = z;
        this.c = (short) (this.c | 256);
    }

    public final void e(boolean z) {
        this.k = z;
        this.c = (short) (this.c | 1024);
    }

    public final void f(boolean z) {
        this.j = z;
        this.c = (short) (this.c | 512);
    }

    public final void g(int i) {
        this.d = i;
        this.c = (short) (this.c | 2);
    }

    public final void h(int i) {
        this.e = i;
        this.c = (short) (this.c | 4);
    }

    public final void i(int i) {
        this.f = i;
        this.c = (short) (this.c | 8);
    }
}
