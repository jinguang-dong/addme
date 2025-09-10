package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lai {
    private int a;
    private int b;
    private byte c;

    public final laj a() {
        if (this.c == 3) {
            return new laj(this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public final void c(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }
}
