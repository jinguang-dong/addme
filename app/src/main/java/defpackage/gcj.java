package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcj implements pdh {
    final /* synthetic */ szh a;
    final /* synthetic */ gcm b;

    public gcj(gcm gcmVar, szh szhVar) {
        this.a = szhVar;
        this.b = gcmVar;
    }

    @Override // defpackage.pdh
    public final void a(pbw pbwVar, long j) {
        gcm gcmVar = this.b;
        synchronized (gcmVar.c) {
            szh szhVar = this.a;
            gaw gawVar = gcmVar.i;
            gawVar.getClass();
            szhVar.a(new hhd(gawVar.a, pbwVar, j));
        }
    }

    @Override // defpackage.pdh
    public final void b() {
        pka pkaVarL;
        gcm gcmVar = this.b;
        synchronized (gcmVar.c) {
            pjp pjpVar = gcmVar.O.a;
            gaw gawVar = gcmVar.i;
            gawVar.getClass();
            pkaVarL = pjpVar.a(gawVar.a).l();
        }
        gcmVar.V.g(pkaVarL);
    }
}
