package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mkp extends ndp {
    final /* synthetic */ mkr a;
    private boolean b = false;

    public mkp(mkr mkrVar) {
        this.a = mkrVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        if (this.b) {
            this.b = false;
            return;
        }
        oge ogeVar = this.a.K;
        if (ogeVar != null) {
            ogeVar.b();
        }
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void e() {
        oge ogeVar = this.a.K;
        if (ogeVar != null) {
            ogeVar.b();
            this.b = true;
        }
    }
}
