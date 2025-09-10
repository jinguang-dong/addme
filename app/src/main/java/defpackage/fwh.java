package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwh implements syf {
    final /* synthetic */ szh a;
    final /* synthetic */ szh b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fwi d;

    public fwh(fwi fwiVar, szh szhVar, szh szhVar2, boolean z) {
        this.a = szhVar;
        this.b = szhVar2;
        this.c = z;
        this.d = fwiVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        this.a.a(th);
        if (this.c) {
            this.b.a(th);
        } else {
            this.b.e(rvk.a);
        }
    }

    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        rwc rwcVarI;
        gdv gdvVar = (gdv) obj;
        if (gdvVar.a()) {
            this.a.a(new IllegalStateException("Video recorder is closed"));
            this.b.e(rvk.a);
            return;
        }
        this.d.m.w(gdo.CAPTURE_SESSION).d(gdvVar);
        if (!this.c) {
            this.a.e((Surface) gdvVar.a.b().c());
            this.b.e(rvk.a);
            return;
        }
        ged gedVar = (ged) gdvVar.a;
        this.a.e((Surface) gedVar.b().c());
        szh szhVar = this.b;
        synchronized (gedVar.j) {
            rnt.L(gedVar.k != gec.CLOSED);
            rwcVarI = rwc.i(gedVar.l.d);
        }
        szhVar.e(rwcVarI);
    }
}
