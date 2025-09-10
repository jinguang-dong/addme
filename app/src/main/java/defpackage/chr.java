package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chr implements chq {
    private final float a;
    private final float b;

    public chr(float f, float f2) {
        this.a = f;
        this.b = f2;
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
    public final /* synthetic */ float dg(long j) {
        return chp.J(this, j);
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
    public final /* synthetic */ long dq(float f) {
        return chp.K(this, f);
    }

    @Override // defpackage.chq
    public final /* synthetic */ long dr(float f) {
        return chp.R(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chr)) {
            return false;
        }
        chr chrVar = (chr) obj;
        return Float.compare(this.a, chrVar.a) == 0 && Float.compare(this.b, chrVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ')';
    }
}
