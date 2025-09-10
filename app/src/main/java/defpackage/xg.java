package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class xg {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    private final long e;
    private final xf f;
    private final uly g = new uly(false, umc.a);

    public xg(boolean z, long j, long j2, long j3, long j4, xf xfVar) {
        this.a = z;
        this.b = j;
        this.e = j2;
        this.c = j3;
        this.d = j4;
        this.f = xfVar;
    }

    public final void a(Object obj) {
        if (this.g.b()) {
            this.f.b(obj);
            return;
        }
        throw new IllegalStateException("Output " + this.c + " at " + ((Object) qd.a(this.b)) + " for " + this.d + " was completed multiple times!");
    }

    public final void b(int i) {
        a(new qp(i));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg)) {
            return false;
        }
        xg xgVar = (xg) obj;
        return this.a == xgVar.a && a.q(this.b, xgVar.b) && a.q(this.e, xgVar.e) && this.c == xgVar.c && this.d == xgVar.d && a.ao(this.f, xgVar.f);
    }

    public final int hashCode() {
        int iO = a.o(this.a);
        xf xfVar = this.f;
        long j = this.d;
        long j2 = this.c;
        return (((((((((iO * 31) + a.r(this.b)) * 31) + a.r(this.e)) * 31) + a.r(j2)) * 31) + a.r(j)) * 31) + xfVar.hashCode();
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.a + ", cameraFrameNumber=" + ((Object) qd.a(this.b)) + ", cameraTimestamp=" + ((Object) pz.a(this.e)) + ", outputSequence=" + this.c + ", outputNumber=" + this.d + ", outputListener=" + this.f + ')';
    }
}
