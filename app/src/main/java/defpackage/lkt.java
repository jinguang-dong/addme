package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkt {
    private long a;
    private boolean b;
    private byte c;

    public lkt() {
    }

    public final lku a() {
        if (this.c == 3) {
            return new lku(this.a, this.b);
        }
        throw new IllegalStateException();
    }

    public final void b(long j) {
        this.a = j;
        this.c = (byte) (this.c | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 2);
    }

    public final lej d() {
        if (this.c == 3) {
            return new lej(this.b, this.a);
        }
        throw new IllegalStateException();
    }

    public final void e(long j) {
        this.a = j;
        this.c = (byte) (this.c | 2);
    }

    public final void f(boolean z) {
        this.b = z;
        this.c = (byte) (this.c | 1);
    }

    public lkt(lej lejVar) {
        this.b = lejVar.a;
        this.a = lejVar.b;
        this.c = (byte) 3;
    }

    public lkt(lku lkuVar) {
        this.a = lkuVar.a;
        this.b = lkuVar.b;
        this.c = (byte) 3;
    }
}
