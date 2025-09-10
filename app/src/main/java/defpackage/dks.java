package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dks implements dli {
    public final Object a;
    private final ack b;
    private final /* synthetic */ int c;

    public dks(ack ackVar, uiq uiqVar, int i) {
        this.c = i;
        this.b = ackVar;
        this.a = uiqVar;
    }

    @Override // defpackage.dli
    public final float a() {
        return this.c != 0 ? 0.5f : 1.0f;
    }

    @Override // defpackage.dli
    public final float b() {
        return this.c != 0 ? 0.7f : 1.0f;
    }

    @Override // defpackage.dli
    public final ack c() {
        int i = this.c;
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this.c == 0) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && a.ao(this.b, ((dks) obj).b);
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dks dksVar = (dks) obj;
        return a.ao(this.b, dksVar.b) && this.a == dksVar.a;
    }

    public final int hashCode() {
        if (this.c == 0) {
            return (((((((((((Float.floatToIntBits(1.0f) * 31) + Float.floatToIntBits(1.0f)) * 31) + Float.floatToIntBits(0.2f)) * 31) + Float.floatToIntBits(0.6f)) * 31) + Float.floatToIntBits(0.35f)) * 31) + Float.floatToIntBits(0.55f)) * 31) + this.b.hashCode();
        }
        return (((((((((((((Float.floatToIntBits(0.7f) * 31) + Float.floatToIntBits(0.5f)) * 31) + Float.floatToIntBits(0.2f)) * 31) + Float.floatToIntBits(0.6f)) * 31) + Float.floatToIntBits(0.35f)) * 31) + Float.floatToIntBits(0.55f)) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return this.c != 0 ? "ScalingParams(edgeScale=0.7, edgeAlpha=0.5, minElementHeight=0.2, maxElementHeight=0.6, minTransitionArea=0.35, maxTransitionArea=0.55)" : "ReduceMotionScalingParams(edgeScale=1.0, edgeAlpha=1.0, minElementHeight=0.2, maxElementHeight=0.6, minTransitionArea=0.35, maxTransitionArea=0.55)";
    }

    public dks(dli dliVar, int i) {
        this.c = i;
        this.a = dliVar;
        this.b = ((dks) dliVar).b;
    }

    @Override // defpackage.dli
    public final void d() {
    }

    @Override // defpackage.dli
    public final void e() {
    }

    @Override // defpackage.dli
    public final void f() {
    }

    @Override // defpackage.dli
    public final void g() {
    }
}
