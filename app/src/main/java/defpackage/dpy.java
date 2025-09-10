package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpy implements afr {
    public final long a;
    private final boolean b = true;
    private final float c = Float.NaN;
    private final bkx d = null;

    public dpy(long j) {
        this.a = j;
    }

    @Override // defpackage.afn
    public final /* synthetic */ afv a(ayc aycVar) {
        return a.bi(aycVar);
    }

    @Override // defpackage.afr
    public final buo b(ocq ocqVar) {
        return new dow(ocqVar, new atd(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpy)) {
            return false;
        }
        dpy dpyVar = (dpy) obj;
        boolean z = dpyVar.b;
        float f = dpyVar.c;
        if (!cht.b(Float.NaN, Float.NaN)) {
            return false;
        }
        bkx bkxVar = dpyVar.d;
        if (!a.ao(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = dpyVar.a;
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
