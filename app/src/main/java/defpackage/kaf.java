package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaf extends kad {
    public final ltd c;
    final kbz d;
    public final long e;
    final rwc f;

    public kaf(long j, kbz kbzVar, ltd ltdVar, rwc rwcVar) {
        this.e = j;
        this.c = ltdVar;
        this.d = kbzVar;
        this.f = rwcVar;
    }

    @Override // defpackage.kad
    public final rwc c() {
        return this.f;
    }

    @Override // defpackage.kad
    public final seo d() {
        long j = this.e;
        return seo.e(Long.valueOf(j - kai.b), Long.valueOf(j + kai.c));
    }

    @Override // defpackage.kad
    public final boolean f() {
        return false;
    }
}
