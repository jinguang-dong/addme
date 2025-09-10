package defpackage;

import android.animation.ValueAnimator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mto {
    public final int a;
    public final int b;
    public mtq c;
    public ValueAnimator d;
    public float e;

    public mto(int i, int i2, mtq mtqVar) {
        mtqVar.getClass();
        this.a = i;
        this.b = i2;
        this.c = mtqVar;
        this.d = null;
        this.e = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mto)) {
            return false;
        }
        mto mtoVar = (mto) obj;
        return this.a == mtoVar.a && this.b == mtoVar.b && this.c == mtoVar.c && a.ao(this.d, mtoVar.d) && Float.compare(this.e, mtoVar.e) == 0;
    }

    public final int hashCode() {
        int iHashCode = (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        ValueAnimator valueAnimator = this.d;
        return (((iHashCode * 31) + (valueAnimator == null ? 0 : valueAnimator.hashCode())) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "SliderLabelInfo(textResId=" + this.a + ", iconResId=" + this.b + ", countdownDurationOptionState=" + this.c + ", animator=" + this.d + ", additionalXOffset=" + this.e + ")";
    }
}
