package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pok {
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public byte g;

    public final void a(int i) {
        this.f = i;
        this.g = (byte) (this.g | 32);
    }

    public final void b(int i) {
        this.c = i;
        this.g = (byte) (this.g | 4);
    }

    public final void c(int i) {
        this.d = i;
        this.g = (byte) (this.g | 8);
    }

    public final void d(long j) {
        this.e = j;
        this.g = (byte) (this.g | 16);
    }

    public final void e() {
        this.g = (byte) (this.g | 64);
    }

    public final void f() {
        this.g = (byte) (this.g | 16);
    }

    public final void g(int i) {
        this.c = i;
        this.g = (byte) (this.g | 8);
    }

    public final void h(int i) {
        this.d = i;
        this.g = (byte) (this.g | 2);
    }
}
