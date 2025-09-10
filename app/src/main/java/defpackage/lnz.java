package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnz implements lny {
    final /* synthetic */ lny a;
    final /* synthetic */ long b;

    public lnz(lny lnyVar, long j) {
        this.a = lnyVar;
        this.b = j;
    }

    @Override // defpackage.lny
    public final lnx a(long j) {
        lnx lnxVarB = this.a.b(j);
        if (lnxVarB == null) {
            return null;
        }
        long j2 = lnxVarB.a - j;
        if (Math.abs(j2) <= this.b) {
            return lnxVarB;
        }
        return null;
    }

    @Override // defpackage.lny
    public final lnx b(long j) {
        return this.a.b(j);
    }

    @Override // defpackage.lny
    public final void c() {
        this.a.c();
    }

    public final String toString() {
        return String.valueOf(this.a) + "[maxTimeDiffNs=" + this.b + "]";
    }
}
