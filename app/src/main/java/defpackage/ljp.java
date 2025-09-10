package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljp {
    private int a;
    private int b;
    private boolean c;
    private byte d;

    public ljp() {
    }

    public final ljq a() {
        if (this.d == 7) {
            return new ljq(this.a, this.b, this.c);
        }
        throw new IllegalStateException();
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    public final void d(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    public ljp(ljq ljqVar) {
        this.a = ljqVar.a;
        this.b = ljqVar.b;
        this.c = ljqVar.c;
        this.d = (byte) 7;
    }
}
