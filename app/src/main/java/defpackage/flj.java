package defpackage;

import android.content.res.Resources;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
class flj extends flg {
    final /* synthetic */ fln a;

    public flj(fln flnVar) {
        this.a = flnVar;
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void a() {
        fkf fkfVar;
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.g.a(true);
        flnVar.d.h();
        flnVar.e.p();
        flnVar.f.g();
        int i = 16;
        gx gxVar = new gx(this, i, null);
        fke fkeVar = flnVar.j;
        synchronized (fkeVar) {
            fkfVar = fkeVar.f;
        }
        fkeVar.b.execute(new as(fkeVar, fkfVar, gxVar, i));
    }

    @Override // defpackage.flg, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        Duration duration = fln.a;
        fln flnVar = this.a;
        flnVar.j.a();
        flnVar.g.a(false);
        flnVar.h();
    }

    @Override // defpackage.flg
    public void d() {
    }
}
