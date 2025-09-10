package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bte implements bsu {
    public int a;
    public int b;
    public long c = 0;
    public long d = btf.b;
    public long e = 0;

    private final void dv() {
        long j = this.c >> 32;
        long j2 = this.d;
        this.a = ukc.p((int) j, cho.d(j2), cho.b(j2));
        long j3 = this.c & 4294967295L;
        long j4 = this.d;
        this.b = ukc.p((int) j3, cho.c(j4), cho.a(j4));
        int i = this.a;
        long j5 = this.c;
        this.e = (((i - ((int) (j5 >> 32))) / 2) << 32) | (((r0 - ((int) (j5 & 4294967295L))) / 2) & 4294967295L);
    }

    public abstract void df(long j, uiq uiqVar);

    public /* synthetic */ Object g() {
        return null;
    }

    public int s() {
        return (int) (this.c & 4294967295L);
    }

    public int t() {
        return (int) (this.c >> 32);
    }

    protected final void u(long j) {
        if (a.q(this.c, j)) {
            return;
        }
        this.c = j;
        dv();
    }

    protected final void v(long j) {
        if (a.q(this.d, j)) {
            return;
        }
        this.d = j;
        dv();
    }

    public void w(long j, bmz bmzVar) {
        df(j, null);
    }
}
