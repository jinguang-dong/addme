package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kya implements kmz {
    public static final sgv a = sgv.g("kya");
    public final ffq b;
    public final pau c;
    private final kxs d;
    private final rwc e;
    private final rwc f;
    private final our g;
    private final pbn h;
    private final pfu i;
    private final qqq j;

    public kya(rwc rwcVar, pfu pfuVar, rwc rwcVar2, our ourVar, ffq ffqVar, pbn pbnVar, qqq qqqVar, pau pauVar, nkw nkwVar, kxs kxsVar) {
        this.d = kxsVar;
        this.e = rwcVar;
        this.f = rwcVar2;
        this.i = pfuVar;
        this.b = ffqVar;
        this.g = ourVar;
        this.h = pbnVar;
        this.j = qqqVar;
        this.c = pauVar;
        if (rwcVar.h() && rwcVar2.h()) {
            pdn pdnVarC = pfuVar.c((pdv) rwcVar2.c(), 3);
            ourVar.d(pdnVarC);
            pdnVarC.l(new fmz(this, nkwVar, 7));
        }
    }

    @Override // defpackage.kmz
    public final owf a() {
        return this.d.a;
    }

    @Override // defpackage.kmz
    public final owf b() {
        return this.d.b();
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("delegate", this.d);
        return rwbVarW.toString();
    }

    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) throws Throwable {
        pbn pbnVar = this.h;
        pbnVar.f("mv-setup");
        Object obj = ggaVar.b;
        rwc rwcVarI = obj instanceof lsc ? rwc.i((lsc) obj) : rvk.a;
        if (!rwcVarI.h()) {
            ((sgt) a.c().M(3651)).v("Capture session not a NightSightCaptureSession: %s", obj);
        }
        boolean zH = rwcVarI.h();
        jno jnoVarN = this.j.N(ggaVar);
        if (zH) {
            pbnVar.f("mv-beginMoments");
            jnoVarN.b();
            pbnVar.h(TOnSyMaYeslEl.VAySKfmkpLmthVa);
            rwc rwcVarA = jnoVarN.a();
            if (rwcVarA.h()) {
                pbnVar.h("mv-attachSession");
                ((lsc) rwcVarI.c()).d = rwc.j(rwcVarA.c());
            }
            pbnVar.g();
        }
        pbnVar.g();
        pbnVar.f("captureImage");
        this.d.c(kmyVar, ggaVar);
        pbnVar.g();
        if (zH) {
            pbnVar.f("mv-endMoments");
            jnoVarN.c();
            pbnVar.g();
        }
    }
}
