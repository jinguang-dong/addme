package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkh {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        bdq.s(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public bkh(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkh)) {
            return false;
        }
        bkh bkhVar = (bkh) obj;
        return Float.compare(this.a, bkhVar.a) == 0 && Float.compare(this.b, bkhVar.b) == 0 && Float.compare(this.c, bkhVar.c) == 0 && Float.compare(this.d, bkhVar.d) == 0 && a.q(this.e, bkhVar.e) && a.q(this.f, bkhVar.f) && a.q(this.g, bkhVar.g) && a.q(this.h, bkhVar.h);
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
        long j = this.h;
        long j2 = this.g;
        return (((((((iFloatToIntBits * 31) + a.r(this.e)) * 31) + a.r(this.f)) * 31) + a.r(j2)) * 31) + a.r(j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(acv.p(this.a));
        String str = cdVQ.ueio;
        sb.append(str);
        sb.append(acv.p(this.b));
        sb.append(str);
        sb.append(acv.p(this.c));
        sb.append(str);
        sb.append(acv.p(this.d));
        String string = sb.toString();
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.e;
        if (!a.q(j4, j) || !a.q(j, j2) || !a.q(j2, j3)) {
            return "RoundRect(rect=" + string + ", topLeft=" + ((Object) bkd.a(j4)) + ", topRight=" + ((Object) bkd.a(j)) + ", bottomRight=" + ((Object) bkd.a(j2)) + ", bottomLeft=" + ((Object) bkd.a(j3)) + ')';
        }
        int i = (int) (4294967295L & j4);
        int i2 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "RoundRect(rect=" + string + ", radius=" + acv.p(Float.intBitsToFloat(i2)) + ')';
        }
        return "RoundRect(rect=" + string + ", x=" + acv.p(Float.intBitsToFloat(i2)) + ", y=" + acv.p(Float.intBitsToFloat(i)) + ')';
    }
}
