package defpackage;

import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dkr extends bij implements bwx {
    public uif a;
    public aii b;
    public boolean c;
    public AmbientModeSupport.AmbientController d;
    private cbl e;
    private final uiq f = new asj(this, 18);
    private uiq g;

    public dkr(uif uifVar, AmbientModeSupport.AmbientController ambientController, aii aiiVar, boolean z) {
        this.a = uifVar;
        this.d = ambientController;
        this.b = aiiVar;
        this.c = z;
        c();
    }

    public final void c() {
        this.e = new cbl(new ats(this, 15), new ats(this, 16));
        this.g = this.c ? new asj(this, 19) : null;
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        cbw.s(cbnVar);
        cbw.a(cbnVar, this.f);
        cbl cblVar = null;
        if (this.b == aii.a) {
            cbl cblVar2 = this.e;
            if (cblVar2 == null) {
                ujp.c("scrollAxisRange");
            } else {
                cblVar = cblVar2;
            }
            cbw.l(cbnVar, cblVar);
        } else {
            cbl cblVar3 = this.e;
            if (cblVar3 == null) {
                ujp.c("scrollAxisRange");
            } else {
                cblVar = cblVar3;
            }
            cbw.f(cbnVar, cblVar);
        }
        uiq uiqVar = this.g;
        if (uiqVar != null) {
            cbnVar.e(cbm.f, new cbc(null, uiqVar));
        }
        cbnVar.e(cbm.A, new cbc(null, new aal(new ats(this, 17), 19)));
        cbw.c(cbnVar, new cbd(((dlq) ((dme) this.d.a).a.a()).e, 1));
    }
}
