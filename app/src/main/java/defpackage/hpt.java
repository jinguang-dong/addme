package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpt implements hps {
    final /* synthetic */ hps a;
    final /* synthetic */ long b;

    public hpt(hps hpsVar, long j) {
        this.a = hpsVar;
        this.b = j;
    }

    @Override // defpackage.hps
    public final hpr a(long j) {
        hpr hprVarB = this.a.b(j);
        if (hprVarB == null) {
            return null;
        }
        long j2 = hprVarB.a - j;
        if (Math.abs(j2) <= this.b) {
            return hprVarB;
        }
        return null;
    }

    @Override // defpackage.hps
    public final hpr b(long j) {
        return this.a.b(j);
    }

    public final String toString() {
        return String.valueOf(this.a) + "[maxTimeDiffNs=" + this.b + "]";
    }
}
