package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class lnb extends lmy {
    final /* synthetic */ lnc b;

    public lnb(lnc lncVar) {
        this.b = lncVar;
    }

    @Override // defpackage.lmy, defpackage.mcz, defpackage.mda
    public final void a() {
        lnc lncVar = this.b;
        lncVar.a.setVisibility(0);
        lncVar.b = true;
        lncVar.c.start();
    }

    @Override // defpackage.lmy, defpackage.mcz, defpackage.mda
    public final void b() {
        lnc lncVar = this.b;
        lncVar.b = false;
        lncVar.c.stop();
        lncVar.a.setVisibility(8);
    }

    @Override // defpackage.lmy
    public void d() {
    }
}
