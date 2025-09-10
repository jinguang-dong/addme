package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kag extends kad {
    public final long c;
    final lnx d;
    final rwc e;
    rwc f;
    rwc g;
    final float h;
    final float i;
    boolean j;
    boolean k;

    public kag(long j, float f, float f2, lnx lnxVar) {
        rvk rvkVar = rvk.a;
        this.e = rvkVar;
        this.f = rvkVar;
        this.g = rvkVar;
        this.c = j;
        this.h = f;
        this.i = f2;
        this.d = lnxVar;
    }

    @Override // defpackage.kad
    public final rwc c() {
        return this.e;
    }

    @Override // defpackage.kad
    public final seo d() {
        Long lValueOf = Long.valueOf(this.c);
        return seo.e(lValueOf, lValueOf);
    }

    @Override // defpackage.kad
    public final boolean f() {
        return true;
    }
}
