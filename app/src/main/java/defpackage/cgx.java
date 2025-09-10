package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgx implements chg {
    private final long a;

    public cgx(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        cgh.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.chg
    public final float a() {
        return bkv.a(this.a);
    }

    @Override // defpackage.chg
    public final long b() {
        return this.a;
    }

    @Override // defpackage.chg
    public final /* synthetic */ chg c(chg chgVar) {
        return chp.p(this, chgVar);
    }

    @Override // defpackage.chg
    public final /* synthetic */ chg d(uif uifVar) {
        return chp.q(this, uifVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgx)) {
            return false;
        }
        long j = this.a;
        long j2 = ((cgx) obj).a;
        long j3 = bkv.a;
        return a.q(j, j2);
    }

    public final int hashCode() {
        long j = bkv.a;
        return a.r(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) bkv.g(this.a)) + ')';
    }

    @Override // defpackage.chg
    public final void e() {
    }
}
