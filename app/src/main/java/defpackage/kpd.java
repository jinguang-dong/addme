package defpackage;

import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpd implements ovu, paq {
    public static final sgv a = sgv.g("kpd");
    public final hzs b;
    public final rww c;
    public final Object d = new Object();
    public pjr e = null;
    public pkf f = null;
    public poe g = null;
    public boolean h = false;

    public kpd(hzs hzsVar, rww rwwVar) {
        this.b = hzsVar;
        this.c = rwwVar;
    }

    public final synchronized rwc a() {
        rwc rwcVarI;
        synchronized (this.d) {
            pkf pkfVar = this.f;
            if (pkfVar != null) {
                rwcVarI = rwc.i(pkfVar.k());
                pkfVar.l();
                if (!rwcVarI.h()) {
                    ((sgt) a.c().M(3338)).s("Couldn't fork latest viewfinder image, already closed!");
                }
            } else {
                ((sgt) a.c().M(3337)).s(YyLACfm.hAxhPLPnrccOeLl);
                rwcVarI = rvk.a;
            }
        }
        return rwcVarI;
    }

    @Override // defpackage.ovu
    public final String b() {
        return "LazySmartMeteringProcessor";
    }

    public final void c() {
        synchronized (this.d) {
            pkf pkfVar = this.f;
            if (pkfVar != null) {
                pkfVar.l();
                this.f = null;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        pjr pjrVar;
        synchronized (this.d) {
            if (this.h) {
                return;
            }
            this.h = true;
            if (this.g != null && (pjrVar = this.e) != null) {
                hzs hzsVar = this.b;
                hzsVar.v(hzsVar.a(pjrVar));
            }
            c();
            this.g = null;
        }
    }
}
