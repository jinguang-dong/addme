package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnd extends bne {
    private final long a;
    private float b = 1.0f;
    private bkw c;

    public bnd(long j) {
        this.a = j;
    }

    @Override // defpackage.bne
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.bne
    protected final void b(bmv bmvVar) {
        bmvVar.r(this.a, 0L, (62 & 4) != 0 ? a.ac(bmvVar.m(), 0L) : 0L, (62 & 8) != 0 ? 1.0f : this.b, (62 & 16) != 0 ? bmx.a : null, (62 & 32) != 0 ? null : this.c, (62 & 64) != 0 ? 3 : 0);
    }

    @Override // defpackage.bne
    protected final boolean c(float f) {
        this.b = f;
        return true;
    }

    @Override // defpackage.bne
    protected final boolean d(bkw bkwVar) {
        this.c = bkwVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnd)) {
            return false;
        }
        long j = this.a;
        long j2 = ((bnd) obj).a;
        long j3 = bkv.a;
        return a.q(j, j2);
    }

    public final int hashCode() {
        long j = bkv.a;
        return a.r(this.a);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) bkv.g(this.a)) + ')';
    }
}
