package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gux {
    private static final sgv b = sgv.g("gux");
    public final mdy a;
    private final Executor c;
    private rwc d;
    private rwc e;
    private rwc f;
    private final int g;

    public gux(int i, mdy mdyVar) {
        rvk rvkVar = rvk.a;
        this.d = rvkVar;
        this.e = rvkVar;
        this.f = rvkVar;
        this.g = i;
        this.a = mdyVar;
        this.c = ojl.bZ("FramingHintLog");
    }

    public final synchronized void a() {
        this.d = rwc.j(new guz(this.g, System.currentTimeMillis()));
    }

    public final synchronized void b() {
        if (this.d.h()) {
            mdy mdyVar = this.a;
            sqp sqpVarA = ((guz) this.d.c()).a(System.currentTimeMillis());
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.FRAMING_HINT_STATUS;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar = tpcVarM.b;
            sod sodVar = (sod) tphVar;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            sqpVarA.getClass();
            sodVar2.ab = sqpVarA;
            sodVar2.d |= 2;
            mdyVar.I(tpcVarM);
        }
    }

    public final synchronized void c(sqn sqnVar) {
        if (this.e.h()) {
            ((guy) this.e.c()).a(sqnVar);
        }
    }

    public final synchronized void d() {
        if (!this.e.h()) {
            ((sgt) b.b().M(1055)).s("framing hint heed but no hint is showing.");
            return;
        }
        ((guy) this.e.c()).b(System.currentTimeMillis());
    }

    public final synchronized void e(rwc rwcVar) {
        if (!this.d.h()) {
            ((sgt) b.b().M(1056)).s("Log framing shown hint but status info is not available.");
            return;
        }
        ((guz) this.d.c()).b();
        guy guyVar = new guy(this.g, ((guz) this.d.c()).a, System.currentTimeMillis(), rwcVar);
        if (this.f.h()) {
            Long l = (Long) this.f.c();
            l.longValue();
            guyVar.a = rwc.j(l);
        }
        this.e = rwc.j(guyVar);
    }

    public final synchronized void f() {
        if (this.d.h()) {
            ((guz) this.d.c()).c();
        } else {
            ((sgt) b.b().M(1057)).s("Update framing hint but status info is not available.");
        }
    }

    public final synchronized void g() {
        if (this.e.h()) {
            this.f = rwc.j(Long.valueOf(System.currentTimeMillis()));
            this.c.execute(new hdk(this, ((guy) this.e.c()).c(System.currentTimeMillis()), 1));
            this.e = rvk.a;
        }
    }
}
