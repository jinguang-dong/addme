package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn extends cwo implements cwf {
    final cwh a;
    final /* synthetic */ cwp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwn(cwp cwpVar, cwh cwhVar, cwr cwrVar) {
        super(cwpVar, cwrVar);
        this.b = cwpVar;
        this.a = cwhVar;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        cwh cwhVar2 = this.a;
        cwb cwbVar = cwhVar2.getLifecycle().a;
        if (cwbVar == cwb.a) {
            this.b.g(this.c);
            return;
        }
        cwb cwbVar2 = null;
        while (cwbVar2 != cwbVar) {
            d(dx());
            cwbVar2 = cwbVar;
            cwbVar = cwhVar2.getLifecycle().a;
        }
    }

    @Override // defpackage.cwo
    public final void b() {
        this.a.getLifecycle().c(this);
    }

    @Override // defpackage.cwo
    public final boolean c(cwh cwhVar) {
        return this.a == cwhVar;
    }

    @Override // defpackage.cwo
    public final boolean dx() {
        return this.a.getLifecycle().a.a(cwb.d);
    }
}
