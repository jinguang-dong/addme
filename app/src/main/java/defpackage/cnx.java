package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnx {
    private int a;
    private int b;

    public final int a() {
        return this.b | this.a;
    }

    public final void b(int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public final void c(int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}
