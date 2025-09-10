package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gpq {
    public String a;
    public Runnable b;
    public Drawable c;
    public rwc d;
    public int e;
    public int f;
    private long g;
    private int h;
    private int i;
    private rwc j;
    private boolean k;
    private long l;
    private byte m;

    public gpq() {
        throw null;
    }

    public final gpr a() {
        int i;
        int i2;
        if (this.m != 31 || (i = this.e) == 0 || (i2 = this.f) == 0) {
            throw new IllegalStateException();
        }
        return new gpr(this.g, this.a, this.b, this.c, i, i2, this.d, this.h, this.i, this.j, this.k, this.l);
    }

    public final void b(int i) {
        this.i = i;
        this.m = (byte) (this.m | 4);
    }

    public final void c(int i) {
        this.h = i;
        this.m = (byte) (this.m | 2);
    }

    public final void d(gpo gpoVar) {
        this.j = rwc.i(gpoVar);
    }

    public final void e(boolean z) {
        this.k = z;
        this.m = (byte) (this.m | 8);
    }

    public final void f(long j) {
        this.g = j;
        this.m = (byte) (this.m | 1);
    }

    public final void g(long j) {
        this.l = j;
        this.m = (byte) (this.m | 16);
    }

    public gpq(gpr gprVar) {
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.j = rvkVar;
        this.g = gprVar.a;
        this.a = gprVar.b;
        this.b = gprVar.c;
        this.c = gprVar.d;
        this.e = gprVar.k;
        this.f = gprVar.l;
        this.d = gprVar.e;
        this.h = gprVar.f;
        this.i = gprVar.g;
        this.j = gprVar.h;
        this.k = gprVar.i;
        this.l = gprVar.j;
        this.m = (byte) 31;
    }

    public gpq(byte[] bArr) {
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.j = rvkVar;
    }
}
