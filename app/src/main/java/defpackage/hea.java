package defpackage;

import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hea extends hdz {
    public hea(heb hebVar, long j) {
        super(hebVar, lte.a(null, j, "STUB", ltf.UNKNOWN, false), hebVar.f.instant(), Optional.empty());
    }

    @Override // defpackage.hdz
    public final syu a() {
        e("ShotStub: persisted");
        return syq.a;
    }

    @Override // defpackage.hdz
    public final void b() {
        e("ShotStub: deleted");
    }

    @Override // defpackage.hdz
    public final void c(String str) {
        f(str);
    }

    @Override // defpackage.hdz
    public final void d(Instant instant, String str) {
        f(str);
    }

    @Override // defpackage.hdz
    public final void g(Integer num) {
        f("ShotStub: makingProgress");
    }

    @Override // defpackage.hdz
    public final void h(Instant instant) {
        e("ShotStub: markStuck");
    }

    @Override // defpackage.hdz
    public final void i() {
        e("ShotStub: started");
    }

    @Override // defpackage.hdz
    public final void j() {
        e("ShotStub: canceled");
    }
}
