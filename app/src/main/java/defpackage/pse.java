package defpackage;

import androidx.wear.ambient.AmbientDelegate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pse implements psf {
    public final /* synthetic */ psf a;
    public final /* synthetic */ AmbientDelegate b;
    private final /* synthetic */ int c;

    public /* synthetic */ pse(AmbientDelegate ambientDelegate, psf psfVar, int i) {
        this.c = i;
        this.b = ambientDelegate;
        this.a = psfVar;
    }

    @Override // defpackage.psf
    public final void a(int i) {
        int iN;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                this.a.a(this.b.E());
                return;
            } else {
                this.a.a(this.b.F());
                return;
            }
        }
        prh.c();
        AmbientDelegate ambientDelegate = this.b;
        psj psjVar = (psj) ambientDelegate.c;
        if (psjVar.k()) {
            nuz nuzVarA = ambientDelegate.A();
            iN = ((1 & nuzVarA.b) == 0 || psjVar.c() < nuzVarA.c) ? 13 : 2;
        } else {
            iN = psjVar.n();
        }
        this.a.a(iN);
    }
}
