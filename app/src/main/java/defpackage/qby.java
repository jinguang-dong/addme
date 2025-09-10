package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qby implements syf {
    final /* synthetic */ long a;
    final /* synthetic */ qbz b;
    final /* synthetic */ int c;
    final /* synthetic */ tpc d;

    public qby(qbz qbzVar, int i, tpc tpcVar, long j) {
        this.c = i;
        this.d = tpcVar;
        this.a = j;
        this.b = qbzVar;
    }

    @Override // defpackage.syf
    public final void a(Throwable th) {
        qbu.g(th, "%s: failure when sampling log!", "MddEventLogger");
    }

    @Override // defpackage.syf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        rwc rwcVar = (rwc) obj;
        if (rwcVar.h()) {
            this.b.r(this.c, this.d, this.a, (svo) rwcVar.c());
        }
    }
}
