package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbj {
    public static final cbj a = new cbj(0.0f, new ukr(0.0f), 0);
    public final float b;
    public final int c;
    public final ukr d;

    public cbj(float f, ukr ukrVar, int i) {
        this.b = f;
        this.d = ukrVar;
        this.c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbj)) {
            return false;
        }
        cbj cbjVar = (cbj) obj;
        return this.b == cbjVar.b && a.ao(this.d, cbjVar.d) && this.c == cbjVar.c;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.b) * 31) + this.d.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.b + ", range=" + this.d + ", steps=" + this.c + ')';
    }
}
