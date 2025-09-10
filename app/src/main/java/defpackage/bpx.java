package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpx {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List i;
    public final long j;
    public final long k;

    public bpx(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpx)) {
            return false;
        }
        bpx bpxVar = (bpx) obj;
        return a.q(this.a, bpxVar.a) && this.b == bpxVar.b && a.q(this.c, bpxVar.c) && a.q(this.d, bpxVar.d) && this.e == bpxVar.e && Float.compare(this.f, bpxVar.f) == 0 && a.p(this.g, bpxVar.g) && this.h == bpxVar.h && a.ao(this.i, bpxVar.i) && a.q(this.j, bpxVar.j) && a.q(this.k, bpxVar.k);
    }

    public final int hashCode() {
        int iR = a.r(this.a) * 31;
        float f = this.f;
        boolean z = this.e;
        long j = this.d;
        int iR2 = ((((((((iR + a.r(this.b)) * 31) + a.r(this.c)) * 31) + a.r(j)) * 31) + a.o(z)) * 31) + Float.floatToIntBits(f);
        List list = this.i;
        return (((((((((iR2 * 31) + this.g) * 31) + a.o(this.h)) * 31) + list.hashCode()) * 31) + a.r(this.j)) * 31) + a.r(this.k);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) bpu.a(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) bkf.c(this.c)) + ", position=" + ((Object) bkf.c(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) bqe.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + LmJPKwPBa.rPaSC + ((Object) bkf.c(this.j)) + ", originalEventPosition=" + ((Object) bkf.c(this.k)) + ')';
    }
}
