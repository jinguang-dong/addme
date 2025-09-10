package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mls implements mma {
    private static final sgv a = sgv.g("mls");
    private final mho b;
    private volatile boolean c;
    private volatile boolean d;
    private volatile boolean e;
    private boolean f;
    private int g;
    private ovx h;
    private rwc i;
    private volatile PointF j;
    private volatile rwc k;
    private final AtomicInteger l;
    private final Executor m;
    private final Executor n;
    private final List o;
    private final pbn p;
    private final pmg q;

    public mls(pmg pmgVar, mhq mhqVar, Executor executor, mhp mhpVar, Executor executor2, Executor executor3, pbn pbnVar) {
        gzi gziVar = has.a;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = 2;
        rvk rvkVar = rvk.a;
        this.i = rvkVar;
        this.k = rvkVar;
        this.l = new AtomicInteger(0);
        this.o = new ArrayList();
        this.h = new ovx(mmf.b());
        mhs mhsVar = new mhs();
        mhsVar.c(executor);
        mhsVar.d("FocusTracking");
        mhsVar.e(new lac(this, 16));
        mhsVar.f(new lac(this, 17));
        mhsVar.g(mhpVar);
        this.b = mhsVar.a();
        this.m = executor2;
        this.n = executor3;
        this.p = pbnVar;
        this.g = 2;
        mhqVar.d(this);
        this.q = pmgVar;
    }

    @Override // defpackage.mlz
    public final owf a(PointF pointF) {
        ArrayList arrayList;
        this.p.f("startTracking");
        synchronized (this) {
            String strP = this.q.p();
            this.i = rnt.V(strP) ? rvk.a : rwc.j(strP);
            ovx ovxVar = new ovx(mmf.b());
            this.h = ovxVar;
            if (this.k.h() && !this.c) {
                this.d = true;
                this.e = true;
                this.j = pointF;
                this.l.set(0);
                synchronized (this) {
                    arrayList = new ArrayList(this.o);
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((mmg) arrayList.get(i)).eQ();
                }
                mme mmeVarA = mmf.a();
                mmeVarA.e(mmi.ON);
                mmeVarA.g(mly.UNKNOWN);
                mmeVarA.d(new RectF(pointF.x, pointF.y, pointF.x, pointF.y));
                mmeVarA.b(1.0f);
                mmeVarA.f(0L);
                ovxVar.a(mmeVarA.a());
                this.p.g();
                return owb.a(ovxVar);
            }
            this.k.h();
            return ovxVar;
        }
    }

    @Override // defpackage.mmh
    public final synchronized paq b(rwc rwcVar, rwc rwcVar2) {
        h();
        this.k = rwcVar2;
        this.f = false;
        return new ktu(this, rwcVar2, 11);
    }

    @Override // defpackage.mho
    public final void d(mhp mhpVar) {
        this.b.d(mhpVar);
    }

    @Override // defpackage.mmh
    public final synchronized void e(mmg mmgVar) {
        this.o.add(mmgVar);
    }

    @Override // defpackage.pon
    public final void eS() {
    }

    @Override // defpackage.mmh
    public final void f(poj pojVar) {
        mmf mmfVarD;
        ovx ovxVar;
        ArrayList arrayList;
        synchronized (this) {
            int i = this.g;
            this.g = i - 1;
            if (i > 0) {
                return;
            }
            if (this.k.h()) {
                if (!this.f) {
                    ((mlx) this.k.c()).a();
                    this.f = true;
                }
                if (this.e) {
                    if (this.d) {
                        this.d = false;
                        mmfVarD = ((mlx) this.k.c()).c(pojVar, this.j);
                    } else {
                        String strP = this.q.p();
                        if (!this.i.h() || rnt.V(strP) || strP.equals(this.i.c())) {
                            mmfVarD = ((mlx) this.k.c()).d(pojVar);
                        } else {
                            this.i.c();
                            mmfVarD = ((mlx) this.k.c()).d(pojVar);
                        }
                        this.i = rnt.V(strP) ? rvk.a : rwc.j(strP);
                    }
                    mmf mmfVar = mmfVarD;
                    if (this.c) {
                        ((sgt) a.c().M(4932)).s("tracking is disabled due the thermal issue");
                    } else {
                        if (mmfVar.d < 0.6f) {
                            this.l.incrementAndGet();
                        } else {
                            this.l.set(0);
                        }
                        if (this.l.get() <= 10) {
                            synchronized (this) {
                                ovxVar = this.h;
                            }
                            synchronized (this) {
                                arrayList = new ArrayList(this.o);
                            }
                            this.m.execute(new lqd(ovxVar, mmfVar, arrayList, 11, (int[]) null));
                            return;
                        }
                    }
                    h();
                }
            }
        }
    }

    @Override // defpackage.mmh
    public final synchronized void g(mmg mmgVar) {
        this.o.remove(mmgVar);
    }

    @Override // defpackage.mmh
    public final boolean i() {
        return this.k.h();
    }

    public final synchronized void j(rwc rwcVar) {
        rwc rwcVar2 = this.k;
        if (rwcVar.h()) {
            if (rwcVar2.h() && rwcVar2.c() == rwcVar.c()) {
                h();
                this.k = rvk.a;
            }
            this.n.execute(new mjh((mlx) rwcVar.c(), 19));
        }
    }

    public final void k(boolean z) {
        this.c = z;
        if (z) {
            h();
        }
    }

    @Override // defpackage.mlz
    public final void h() {
        ArrayList arrayList;
        this.p.f(CZAHo.ENdNIFv);
        synchronized (this) {
            if (this.k.h() && this.e) {
                ovx ovxVar = this.h;
                this.e = false;
                this.d = false;
                this.i = rvk.a;
                ((mlx) this.k.c()).b();
                mmf mmfVar = (mmf) ovxVar.d;
                RectF rectF = mmfVar.c;
                mme mmeVarA = mmf.a();
                mmeVarA.d(rectF);
                mmeVarA.f(mmfVar.f);
                mmeVarA.c(mmfVar.e);
                mmeVarA.g(mmfVar.b);
                ovxVar.a(mmeVarA.a());
                synchronized (this) {
                    arrayList = new ArrayList(this.o);
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((mmg) arrayList.get(i)).eV();
                }
                this.p.g();
                return;
            }
            this.p.g();
        }
    }
}
