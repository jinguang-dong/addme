package defpackage;

import androidx.wear.ambient.AmbientModeSupport;
import com.pairip.VMRunner;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzb {
    public final fyw a;
    public final rwc c;
    public final rwc d;
    public final rwc e;
    public final mcv f;
    public final gau g;
    private final gag k;
    private final rwc l;
    private final pbn m;
    private boolean n;
    private final our o;
    private final hbj p;
    public final Object b = new Object();
    public fza h = fza.UNINITIALIZED;
    public int j = 1;
    public rwc i = rvk.a;

    public fzb(fdq fdqVar, hbj hbjVar, fyw fywVar, gag gagVar, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, mcv mcvVar, gav gavVar, pbn pbnVar) {
        our ourVarJ = fdqVar.j();
        this.o = ourVarJ;
        this.p = hbjVar;
        this.a = fywVar;
        this.k = gagVar;
        this.c = rwcVar;
        this.d = rwcVar2;
        this.e = rwcVar3;
        this.l = rwcVar4;
        this.f = mcvVar;
        this.g = gavVar.a();
        this.m = pbnVar;
        ourVarJ.d(gagVar.dK(new fpe(this, 16), sxo.a));
        if (rwcVar.h()) {
            ourVarJ.d(((mci) rwcVar.c()).a(new mcc(this, 1)));
        }
        if (rwcVar2.h() && ((ggg) rwcVar2.c()).l()) {
            AmbientModeSupport.AmbientController ambientController = new AmbientModeSupport.AmbientController(this, null);
            mcvVar.a.add(ambientController);
            ourVarJ.d(new loe(mcvVar, ambientController, 4));
        }
    }

    public static final boolean f(pka pkaVar) {
        return pkaVar.equals(pka.BACK);
    }

    public final rwc a() {
        long j;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        synchronized (this.b) {
            if (e() && !this.h.equals(fza.UNINITIALIZED) && !this.h.equals(fza.INITIALIZED)) {
                int i6 = this.j;
                boolean z = i6 == 1;
                if (i6 == 0) {
                    throw null;
                }
                boolean z2 = !z;
                boolean z3 = i6 == 2;
                rwc rwcVar = this.l;
                if (rwcVar.h()) {
                    fzf fzfVar = (fzf) rwcVar.c();
                    synchronized (fzfVar.c) {
                        j = fzfVar.f;
                    }
                    synchronized (fzfVar.c) {
                        i4 = fzfVar.e;
                    }
                    synchronized (fzfVar.c) {
                        i5 = fzfVar.d;
                    }
                    i3 = 31;
                    i2 = i5;
                    i = i4;
                } else {
                    j = 0;
                    i = 0;
                    i2 = 0;
                    i3 = 3;
                }
                long j2 = j;
                if (this.i.h()) {
                    f = (float) ((mcg) this.i.c()).c;
                    i3 |= 32;
                } else {
                    f = 0.0f;
                }
                float f2 = f;
                if (i3 == 63) {
                    return rwc.j(new fzc(z2, z3, j2, i, i2, f2));
                }
                throw new IllegalStateException();
            }
            return rvk.a;
        }
    }

    public void b(gaw gawVar) {
        VMRunner.invoke("zhGSAiWzo43otqxX", new Object[]{this, gawVar});
    }

    public final void c(mcg mcgVar) {
        if (e()) {
            rwc rwcVar = this.c;
            if (rwcVar.h()) {
                ((mci) rwcVar.c()).d(mcgVar);
            }
        }
    }

    public void d() {
        VMRunner.invoke("N2tXliw9hNnpDx55", new Object[]{this});
    }

    public final boolean e() {
        return this.n && ((ltv) this.k.dL()).equals(ltv.ON);
    }
}
