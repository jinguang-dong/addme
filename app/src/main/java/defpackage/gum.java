package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gum {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private final gub b;
    private final boolean c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private rwc e;
    private rwc f;
    private final mdy g;
    private final nmt h;

    public gum(gub gubVar, mdy mdyVar, hbj hbjVar) {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
        this.b = gubVar;
        this.g = mdyVar;
        this.h = new nmt(0.02f, null);
        this.c = hbjVar.p(gyp.e);
    }

    private final boolean g() {
        lnl lnlVarB;
        rwc rwcVarA = this.b.a();
        if (rwcVarA.h() && (lnlVarB = ((hpa) ((got) rwcVarA.c()).a).b()) != null) {
            return this.h.b(lnlVarB.r, lnlVarB.p);
        }
        return false;
    }

    private final boolean h() {
        return this.f.h() && ((gul) this.f.c()).a > 15.0f;
    }

    public final synchronized void a() {
        a.set(true);
    }

    final synchronized void b() {
        this.e = rwc.j(Long.valueOf(SystemClock.uptimeMillis()));
        if (!this.d.getAndSet(false) || h()) {
            return;
        }
        mdy mdyVar = this.g;
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.ADVICE_HEEDED;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = snj.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        snj snjVar = (snj) tpcVarM2.b;
        snjVar.c = 4;
        snjVar.b |= 1;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        snj snjVar2 = (snj) tpcVarM2.l();
        snjVar2.getClass();
        sodVar2.V = snjVar2;
        sodVar2.c |= 67108864;
        mdyVar.I(tpcVarM);
    }

    final synchronized void c() {
        this.g.g();
        this.d.set(true);
    }

    final synchronized void d(float f) {
        g();
        this.f = rwc.j(new gul(f));
    }

    public final synchronized void e() {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
        this.d.set(false);
    }

    public final synchronized boolean f() {
        if (this.c && g() && h() && (!this.e.h() || SystemClock.uptimeMillis() - ((Long) this.e.c()).longValue() >= 2000)) {
            if (!a.get()) {
                return true;
            }
        }
        return false;
    }
}
