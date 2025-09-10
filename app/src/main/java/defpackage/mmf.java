package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmf {
    public final mmi a;
    public final mly b;
    public final RectF c;
    public final float d;
    public final int e;
    public final long f;

    public mmf() {
        throw null;
    }

    public static mme a() {
        mme mmeVar = new mme();
        mmeVar.e(mmi.OFF);
        mmeVar.g(mly.UNKNOWN);
        mmeVar.d(new RectF(-1.0f, -1.0f, -1.0f, -1.0f));
        mmeVar.b(0.0f);
        mmeVar.c(0);
        mmeVar.f(0L);
        return mmeVar;
    }

    public static mmf b() {
        return a().a();
    }

    public final boolean c() {
        RectF rectF = this.c;
        return rectF.centerX() >= 0.0f && rectF.centerY() >= 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmf) {
            mmf mmfVar = (mmf) obj;
            if (this.a.equals(mmfVar.a) && this.b.equals(mmfVar.b) && this.c.equals(mmfVar.c)) {
                if (Float.floatToIntBits(this.d) == Float.floatToIntBits(mmfVar.d) && this.e == mmfVar.e && this.f == mmfVar.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ Float.floatToIntBits(this.d);
        long j = this.f;
        return ((this.e ^ (iHashCode * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        RectF rectF = this.c;
        mly mlyVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(mlyVar) + ", " + String.valueOf(rectF) + ", " + this.d + ", " + this.e + ", " + this.f + "}";
    }

    public mmf(mmi mmiVar, mly mlyVar, RectF rectF, float f, int i, long j) {
        this.a = mmiVar;
        this.b = mlyVar;
        this.c = rectF;
        this.d = f;
        this.e = i;
        this.f = j;
    }
}
