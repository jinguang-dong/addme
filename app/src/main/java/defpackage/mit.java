package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mit implements mkv {
    final /* synthetic */ mkv a;
    final /* synthetic */ miv b;

    public mit(miv mivVar, mkv mkvVar) {
        this.a = mkvVar;
        this.b = mivVar;
    }

    @Override // defpackage.mkv
    public final void a(long j, long j2) {
        miv mivVar = this.b;
        long jA = j / mivVar.a();
        mivVar.g.set(j);
        mivVar.i.set(TimeUnit.SECONDS.toMillis(j) / j2);
        mivVar.b();
    }

    @Override // defpackage.mkv
    public final void b(long j, long j2) {
        miv mivVar = this.b;
        long jA = j / mivVar.a();
        mkr mkrVar = ((mjk) this.a).a.D;
        mkrVar.k.c(new mkm(mkrVar, jA, j2, 0));
        mivVar.f.set(j);
        synchronized (mivVar.j) {
            mlc mlcVar = mivVar.m;
            mlcVar.getClass();
            mlcVar.b(mivVar.n);
        }
    }
}
