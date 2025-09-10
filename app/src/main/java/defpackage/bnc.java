package defpackage;

import com.google.android.apps.camera.toast.vvJ.CGlJpiVWrCQOq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnc extends bne {
    private final long b;
    private final long d;
    private float e;
    private bkw f;
    private final bkl g;
    private final long a = 0;
    private final int c = 1;

    public bnc(bkl bklVar, long j) {
        int i;
        int i2;
        this.g = bklVar;
        this.b = j;
        if (chy.a(0L) < 0 || chy.b(0L) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > bklVar.b() || i2 > bklVar.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.d = j;
        this.e = 1.0f;
    }

    @Override // defpackage.bne
    public final long a() {
        return chp.G(this.d);
    }

    @Override // defpackage.bne
    protected final void b(bmv bmvVar) {
        byi.L(bmvVar, this.g, this.b, (Math.round(Float.intBitsToFloat((int) (bmvVar.m() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bmvVar.m() & 4294967295L))) & 4294967295L), this.e, this.f, 1, 328);
    }

    @Override // defpackage.bne
    protected final boolean c(float f) {
        this.e = f;
        return true;
    }

    @Override // defpackage.bne
    protected final boolean d(bkw bkwVar) {
        this.f = bkwVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnc)) {
            return false;
        }
        bnc bncVar = (bnc) obj;
        if (!a.ao(this.g, bncVar.g)) {
            return false;
        }
        long j = bncVar.a;
        if (!a.q(0L, 0L) || !a.q(this.b, bncVar.b)) {
            return false;
        }
        int i = bncVar.c;
        return a.p(1, 1);
    }

    public final int hashCode() {
        return (((((this.g.hashCode() * 31) + a.r(0L)) * 31) + a.r(this.b)) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.g);
        sb.append(", srcOffset=");
        sb.append((Object) chy.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) cia.a(this.b));
        sb.append(", filterQuality=");
        sb.append((Object) (a.p(1, 0) ? "None" : a.p(1, 1) ? "Low" : a.p(1, 2) ? "Medium" : a.p(1, 3) ? CGlJpiVWrCQOq.lxUtJwuVhG : "Unknown"));
        sb.append(')');
        return sb.toString();
    }
}
