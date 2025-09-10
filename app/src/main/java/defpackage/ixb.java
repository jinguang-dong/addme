package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ixb extends ixa {
    final /* synthetic */ ixf b;

    public ixb(ixf ixfVar) {
        this.b = ixfVar;
    }

    @Override // defpackage.ixa, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        ixf ixfVar = this.b;
        ixfVar.f.m(false);
        ixfVar.g.m(false);
        if (!((iwt) ixfVar.h.dL()).equals(iwt.ACTION)) {
            ixfVar.j.a(true);
            ixfVar.m.k();
            ixfVar.n.a(this);
            rwc rwcVar = ixfVar.i;
            if (rwcVar.h()) {
                ((iwu) rwcVar.c()).b();
            }
        }
        ixfVar.e.Z();
        rwc rwcVar2 = ixfVar.k;
        if (rwcVar2.h()) {
            ((mhe) rwcVar2.c()).l();
            ((mhe) rwcVar2.c()).f();
        }
    }

    @Override // defpackage.ixa, defpackage.mcz, defpackage.mda
    public final void b() throws Resources.NotFoundException {
        ixf ixfVar = this.b;
        ixfVar.j.a(false);
        ixfVar.m.j();
        ixfVar.f.m(true);
        ixfVar.g.m(true);
        ixfVar.n.h(this);
        rwc rwcVar = ixfVar.i;
        if (rwcVar.h()) {
            ((iwu) rwcVar.c()).c(ixfVar.o);
        }
        rwc rwcVar2 = ixfVar.k;
        if (rwcVar2.h()) {
            ((mhe) rwcVar2.c()).s();
            ((mhe) rwcVar2.c()).m(rvk.a);
        }
    }

    @Override // defpackage.ixa
    public void c() {
    }
}
