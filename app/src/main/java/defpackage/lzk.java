package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzk {
    public String a;
    public Drawable b;
    public Runnable c;
    public Runnable d;
    public String e;
    public Runnable f;
    public Runnable g;
    public Runnable h;
    public Runnable i;
    public int j;
    private long k;
    private boolean l;
    private boolean m;
    private boolean n;
    private byte o;

    public lzk() {
    }

    public final lzl a() {
        lzl lzlVarB = b();
        String str = lzlVarB.c;
        boolean z = (str == null && lzlVarB.d == null) ? false : true;
        Runnable runnable = lzlVarB.e;
        rnt.L(z);
        rnt.L(runnable == null || z);
        rnt.L(true);
        if (str != null && lzlVarB.g == null) {
            lzk lzkVar = new lzk(lzlVarB);
            lzkVar.e = str;
            lzlVarB = lzkVar.b();
        }
        if (lzlVarB.a != 0) {
            return lzlVarB;
        }
        lzk lzkVar2 = new lzk(lzlVarB);
        lzkVar2.e(true);
        lzkVar2.f(-1L);
        return lzkVar2.a();
    }

    public final lzl b() {
        int i;
        if (this.o != 15 || (i = this.j) == 0) {
            throw new IllegalStateException();
        }
        return new lzl(this.k, this.l, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.m, i, this.n);
    }

    public final void c(boolean z) {
        this.l = z;
        this.o = (byte) (this.o | 2);
    }

    public final void d(boolean z) {
        this.n = z;
        this.o = (byte) (this.o | 8);
    }

    public final void e(boolean z) {
        this.m = z;
        this.o = (byte) (this.o | 4);
    }

    public final void f(long j) {
        this.k = j;
        this.o = (byte) (this.o | 1);
    }

    public lzk(lzl lzlVar) {
        this.k = lzlVar.a;
        this.l = lzlVar.b;
        this.a = lzlVar.c;
        this.b = lzlVar.d;
        this.c = lzlVar.e;
        this.d = lzlVar.f;
        this.e = lzlVar.g;
        this.f = lzlVar.h;
        this.g = lzlVar.i;
        this.h = lzlVar.j;
        this.i = lzlVar.k;
        this.m = lzlVar.l;
        this.j = lzlVar.n;
        this.n = lzlVar.m;
        this.o = (byte) 15;
    }
}
