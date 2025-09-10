package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pem {
    private boolean a;
    private byte b;
    private int c;
    private int d;
    private int e;

    public final pen a() {
        int i;
        int i2;
        int i3;
        if (this.b != 1 || (i = this.c) == 0 || (i2 = this.d) == 0 || (i3 = this.e) == 0) {
            throw new IllegalStateException();
        }
        return new pen(i, i2, i3, this.a);
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        this.c = i;
    }

    public final void c(int i) {
        if (i == 0) {
            throw null;
        }
        this.d = i;
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        this.e = i;
    }
}
