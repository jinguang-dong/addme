package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class hik extends hig {
    final /* synthetic */ hil a;

    public hik(hil hilVar) {
        this.a = hilVar;
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void a() {
        hil hilVar = this.a;
        hilVar.a.setVisibility(0);
        hilVar.b.setEnabled(true);
        hilVar.e.a(true);
    }

    @Override // defpackage.hig, defpackage.mcz, defpackage.mda
    public final void b() {
        this.a.b.setEnabled(false);
    }

    @Override // defpackage.hig
    public void c() {
        hil hilVar = this.a;
        hilVar.e.a(false);
        if (hilVar.a.getAlpha() != 0.0f) {
            hilVar.c.reverse();
        }
    }

    @Override // defpackage.hig
    public void e(boolean z) {
        hil hilVar = this.a;
        hilVar.e.a(false);
        if (!z) {
            hilVar.a.setAlpha(0.0f);
            hilVar.c.cancel();
        } else if (hilVar.a.getAlpha() != 0.0f) {
            hilVar.c.reverse();
        }
    }

    @Override // defpackage.hig
    public void f(boolean z, boolean z2) {
        this.a.h(false, z2);
    }
}
