package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bge extends bgf {
    public bge(long j, bgq bgqVar) {
        super(j, bgqVar, null, new aks(9));
    }

    @Override // defpackage.bgf
    public final bgf a(uiq uiqVar, uiq uiqVar2) {
        return (bgf) bgr.c(new bgd(uiqVar, uiqVar2));
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final bgj b(uiq uiqVar) {
        return (bgi) bgr.c(new gvz(uiqVar, 1));
    }

    @Override // defpackage.bgf
    public final bgn c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void d() {
        synchronized (bgr.b) {
            z();
        }
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final void e() {
        bgr.r();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final /* synthetic */ void f() {
        bdq.l();
    }

    @Override // defpackage.bgf, defpackage.bgj
    public final /* synthetic */ void g() {
        bdq.l();
    }
}
