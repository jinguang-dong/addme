package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fxv implements syf {
    final /* synthetic */ oyn a;
    final /* synthetic */ szh b;
    final /* synthetic */ fxy c;

    public fxv(fxy fxyVar, oyn oynVar, szh szhVar) {
        this.a = oynVar;
        this.b = szhVar;
        this.c = fxyVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        this.b.a(th);
        this.c.G.a();
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        fxy fxyVar = this.c;
        synchronized (fxyVar.e) {
            fxyVar.p.j(mfc.VIDEO_RECORDER_STARTED);
            if (fxyVar.D == fxx.STOPPED) {
                this.a.f();
                return;
            }
            fxyVar.k.a(gas.RECORDING_SESSION_ACTIVE);
            gdm gdmVar = fxyVar.f;
            gdmVar.d(fxyVar.a().a());
            gaw gawVar = fxyVar.j;
            gdmVar.g(gawVar.c);
            gdmVar.h();
            if (fxyVar.g.l()) {
                ske.W(fxyVar.m.b(gawVar.B, fxyVar.I.b()), new fxw(fxyVar, 0), sxo.a);
            }
            if (gawVar.F) {
                fxyVar.s.c(true);
                fxyVar.r.b();
            }
            fxyVar.l(fxx.RECORDING);
            this.b.e(null);
        }
    }
}
