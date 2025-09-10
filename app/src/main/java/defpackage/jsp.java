package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsp implements jsq {
    private final jrg a;
    private lnl b = null;

    public jsp(jrg jrgVar) {
        this.a = jrgVar;
    }

    @Override // defpackage.jsq
    public final jsl a() {
        return jsl.MOTION_BLUR;
    }

    @Override // defpackage.jsq
    public final synchronized boolean b(lnl lnlVar, lnl lnlVar2) {
        lnl lnlVar3 = this.b;
        if (lnlVar3 != null && Math.abs(lnlVar.c - lnlVar3.c) <= 100000000) {
            float fA = this.a.a(lnlVar, lnlVar3) * lnlVar.d;
            this.b = lnlVar;
            if (fA <= 1.0E9f) {
                return false;
            }
            this.b = null;
            return true;
        }
        this.b = lnlVar;
        return false;
    }
}
