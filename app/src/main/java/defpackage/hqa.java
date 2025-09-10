package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqa implements paq {
    public final lsy a;
    private Bitmap e;
    private int f;
    private boolean d = false;
    private par b = par.c;
    private boolean c = false;

    public hqa(lsy lsyVar) {
        this.a = lsyVar;
    }

    public final synchronized int a() {
        return this.f;
    }

    public final synchronized Bitmap b() {
        return this.e;
    }

    public final synchronized par c() {
        return this.b;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.e = null;
    }

    public final synchronized void d(Bitmap bitmap, int i) {
        if (!this.d) {
            this.e = bitmap;
            this.f = i;
            if (!this.c) {
                this.c = true;
            }
        }
    }

    public final synchronized void e(par parVar) {
        if (this.b == par.c) {
            parVar.compareTo(par.b);
        }
        par parVar2 = this.b;
        par parVar3 = par.a;
        if (!parVar2.equals(parVar3)) {
            parVar.equals(parVar3);
        }
        this.b = parVar;
    }

    public final synchronized boolean f() {
        return this.c;
    }

    public final synchronized int g() {
        return this.b.d() ? 2 : 1;
    }
}
