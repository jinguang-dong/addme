package defpackage;

import android.graphics.PointF;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mln implements mma {
    public final Executor a;
    public final pbn b;
    public final mma d;
    public volatile boolean c = false;
    public volatile rwc e = rvk.a;
    private final AtomicInteger f = new AtomicInteger(0);
    private volatile long g = -1;

    public mln(mls mlsVar, rwc rwcVar, pbn pbnVar) {
        this.b = pbnVar;
        a.I(rwcVar.h());
        this.d = mlsVar;
        this.a = (Executor) rwcVar.c();
    }

    @Override // defpackage.mlz
    public final owf a(PointF pointF) {
        synchronized (this) {
            this.f.set(0);
            this.g = -1L;
        }
        return this.d.a(pointF);
    }

    @Override // defpackage.mmh
    public final paq b(rwc rwcVar, rwc rwcVar2) {
        synchronized (this) {
            this.e = rwcVar;
        }
        return new ktu(this, this.d.b(rwcVar, rwcVar2), 10);
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        this.d.d(mhpVar);
    }

    @Override // defpackage.mmh
    public final void e(mmg mmgVar) {
        this.d.e(mmgVar);
    }

    @Override // defpackage.pon
    public final void eS() {
        synchronized (this) {
        }
    }

    @Override // defpackage.mmh
    public final void f(poj pojVar) {
        int iIncrementAndGet;
        if (pojVar.d() - this.g < 18000000) {
            pojVar.close();
            return;
        }
        if (!this.c) {
            this.c = true;
            synchronized (this) {
                this.f.set(0);
                this.g = pojVar.d();
            }
            this.a.execute(new lor(this, pojVar, 9));
            return;
        }
        pojVar.close();
        synchronized (this) {
            iIncrementAndGet = this.f.incrementAndGet();
        }
        if (iIncrementAndGet > 7) {
            this.a.execute(new mjh(this, 18));
        }
    }

    @Override // defpackage.mmh
    public final void g(mmg mmgVar) {
        this.d.g(mmgVar);
    }

    @Override // defpackage.mlz
    public final void h() {
        this.d.h();
    }

    @Override // defpackage.mmh
    public final boolean i() {
        return this.d.i();
    }
}
