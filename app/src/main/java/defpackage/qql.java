package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qql {
    public String a;
    public uyd b;
    public String c;
    public Long d;
    public qsj e;
    public Predicate f;
    public qop g;
    private boolean h;
    private uzu i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private byte n;

    public final qqm a() {
        uzu uzuVar;
        Predicate predicate;
        if (this.n != 31 || (uzuVar = this.i) == null || (predicate = this.f) == null) {
            throw new IllegalStateException();
        }
        return new qqm(this.a, this.h, uzuVar, this.b, this.c, this.d, this.j, this.e, this.k, this.l, predicate, this.g, this.m);
    }

    public final void b(int i) {
        this.m = i;
        this.n = (byte) (this.n | 16);
    }

    public final void c(boolean z) {
        this.h = z;
        this.n = (byte) (this.n | 1);
    }

    public final void d(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 2);
    }

    public final void e(int i) {
        this.l = i;
        this.n = (byte) (this.n | 8);
    }

    public final void f(uzu uzuVar) {
        uzuVar.getClass();
        this.i = uzuVar;
    }

    public final void g(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 4);
    }
}
