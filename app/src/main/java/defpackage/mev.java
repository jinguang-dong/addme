package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mev {
    private boolean a;
    private boolean b;
    private byte c;

    public final mew a() {
        if (this.c == 3) {
            return new mew(this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final void c(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 1);
    }

    public final lah d() {
        if (this.c == 3) {
            return new lah(this.b, this.a);
        }
        throw new IllegalStateException();
    }

    public final void e(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public final void f(boolean z) {
        this.a = z;
        this.c = (byte) (this.c | 2);
    }
}
