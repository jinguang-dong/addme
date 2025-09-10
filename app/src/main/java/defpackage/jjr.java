package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjr {
    private int a;
    private int b;
    private boolean c;
    private owf d;
    private int e;
    private int f;
    private jjv g;
    private byte h;

    public final jju a() {
        owf owfVar;
        jjv jjvVar;
        if (this.h != 31 || (owfVar = this.d) == null || (jjvVar = this.g) == null) {
            throw new IllegalStateException();
        }
        return new jju(this.a, this.b, this.c, owfVar, this.e, this.f, jjvVar);
    }

    public final void b(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 4);
    }

    public final void c(int i) {
        this.f = i;
        this.h = (byte) (this.h | 16);
    }

    public final void d(jjv jjvVar) {
        jjvVar.getClass();
        this.g = jjvVar;
    }

    public final void e(int i) {
        this.e = i;
        this.h = (byte) (this.h | 8);
    }

    public final void f(owf owfVar) {
        owfVar.getClass();
        this.d = owfVar;
    }

    public final void g(jjs jjsVar) {
        this.b = jjsVar.ordinal();
        this.h = (byte) (this.h | 2);
    }

    public final void h(jjt jjtVar) {
        this.a = jjtVar.ordinal();
        this.h = (byte) (this.h | 1);
    }

    public final void i(int i) {
        f(new owi(Integer.valueOf(i)));
    }
}
