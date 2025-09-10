package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ije extends ndp {
    final /* synthetic */ ijo a;
    final /* synthetic */ hbj b;
    final /* synthetic */ ocq c;
    private boolean d;

    public ije(ocq ocqVar, ijo ijoVar, hbj hbjVar) {
        this.c = ocqVar;
        this.a = ijoVar;
        this.b = hbjVar;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void a() {
        if (this.c.Z()) {
            this.a.f();
        } else if (!this.d) {
            gzi gziVar = gzo.a;
        }
        this.d = false;
    }

    @Override // defpackage.ndp, defpackage.ndo
    public final void e() {
        this.d = true;
        if (this.c.Z()) {
            return;
        }
        this.a.f();
    }
}
