package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awm implements afr {
    public final long a;
    private final boolean b = true;
    private final float c = Float.NaN;
    private final bkx d = null;

    public awm(long j) {
        this.a = j;
    }

    @Override // defpackage.afn
    public final /* synthetic */ afv a(ayc aycVar) {
        return a.bi(aycVar);
    }

    @Override // defpackage.afr
    public final buo b(ocq ocqVar) {
        return new avt(ocqVar, new atd(this, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awm)) {
            return false;
        }
        awm awmVar = (awm) obj;
        boolean z = awmVar.b;
        float f = awmVar.c;
        if (!cht.b(Float.NaN, Float.NaN)) {
            return false;
        }
        bkx bkxVar = awmVar.d;
        if (!a.ao(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = awmVar.a;
        long j3 = bkv.a;
        return a.q(j, j2);
    }

    @Override // defpackage.afr
    public final int hashCode() {
        int iO = (a.o(true) * 31) + Float.floatToIntBits(Float.NaN);
        long j = bkv.a;
        return (iO * 961) + a.r(this.a);
    }
}
