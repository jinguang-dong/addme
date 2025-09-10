package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ate implements afr {
    public final long a;
    private final boolean b;
    private final float c;
    private final bkx d = null;

    public ate(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.afn
    public final /* synthetic */ afv a(ayc aycVar) {
        return a.bi(aycVar);
    }

    @Override // defpackage.afr
    public final buo b(ocq ocqVar) {
        return new asg(ocqVar, this.b, this.c, new atd(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ate)) {
            return false;
        }
        ate ateVar = (ate) obj;
        if (this.b != ateVar.b || !cht.b(this.c, ateVar.c)) {
            return false;
        }
        bkx bkxVar = ateVar.d;
        if (!a.ao(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = ateVar.a;
        long j3 = bkv.a;
        return a.q(j, j2);
    }

    @Override // defpackage.afr
    public final int hashCode() {
        int iO = (a.o(this.b) * 31) + Float.floatToIntBits(this.c);
        long j = bkv.a;
        return (iO * 961) + a.r(this.a);
    }
}
