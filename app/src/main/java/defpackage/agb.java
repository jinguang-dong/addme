package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agb extends bup {
    public buo a;

    public agb(buo buoVar) {
        this.a = buoVar;
    }

    public final void a() {
        bij bijVarB;
        buo buoVar = this.a;
        if (buoVar == null || (bijVarB = buoVar.B()) == null || bijVarB.w) {
            buoVar = null;
        } else {
            M(buoVar);
        }
        this.a = buoVar;
    }

    @Override // defpackage.bij
    public final void cW() {
        a();
    }

    @Override // defpackage.bij
    public final void cZ() {
        buo buoVar = this.a;
        if (buoVar != null) {
            L(buoVar);
        }
    }
}
