package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tak {
    public boolean a;
    public boolean b;
    public boolean c;
    public byte d;

    public final tal a() {
        if (this.d == 7) {
            return new tal(this.a, this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void e(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 4);
    }

    public final void f(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void g(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 1);
    }
}
