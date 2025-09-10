package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class olm {
    public int a;
    public Object b;
    private byte c;
    private int d;

    public final void a() {
        this.b = "";
    }

    public final void b() {
        this.c = (byte) 1;
    }

    public final void c() {
        if (this.c != 1 || this.b == null || this.a == 0 || this.d == 0) {
            throw new IllegalStateException();
        }
        int i = oln.a;
    }

    public final void d() {
        this.d = 1;
    }

    public final lzc e() {
        Object obj;
        if (this.c != 3 || (obj = this.b) == null) {
            throw new IllegalStateException();
        }
        return new lzc(this.a, this.d, (lzl) obj);
    }

    public final void f(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final void g(int i) {
        this.d = i;
        this.c = (byte) (this.c | 2);
    }
}
