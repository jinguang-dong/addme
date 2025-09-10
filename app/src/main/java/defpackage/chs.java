package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chs implements chq {
    private final float a;
    private final float b;
    private final cig c;

    public chs(float f, float f2, cig cigVar) {
        this.a = f;
        this.b = f2;
        this.c = cigVar;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.a;
    }

    @Override // defpackage.chw
    public final float b() {
        return this.b;
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        if (a.q(cid.b(j), 4294967296L)) {
            return this.c.b(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dh(float f) {
        return chp.L(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float di(int i) {
        return chp.M(this, i);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dj(long j) {
        return chp.N(this, j);
    }

    @Override // defpackage.chq
    public final /* synthetic */ float dk(float f) {
        return chp.O(this, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final /* synthetic */ int mo0do(float f) {
        return chp.P(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dp(long j) {
        return chp.Q(this, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.B(this.c.a(f));
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chs)) {
            return false;
        }
        chs chsVar = (chs) obj;
        return Float.compare(this.a, chsVar.a) == 0 && Float.compare(this.b, chsVar.b) == 0 && a.ao(this.c, chsVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + TOnSyMaYeslEl.wlxwERdRbiN + this.b + ", converter=" + this.c + ')';
    }
}
