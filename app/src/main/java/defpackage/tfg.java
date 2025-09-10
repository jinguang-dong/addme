package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfg extends AmbientMode.AmbientCallback {
    public final double a;
    public final double b;
    public final double c;
    private final double d;
    private final double e;
    private final double f;

    public tfg(double d, double d2, double d3) {
        super((byte[]) null);
        this.d = 0.3d;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.e = 0.6d;
        this.f = 0.25d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tfg)) {
            return false;
        }
        tfg tfgVar = (tfg) obj;
        double d = tfgVar.d;
        if (this.a != tfgVar.a || this.b != tfgVar.b || this.c != tfgVar.c) {
            return false;
        }
        double d2 = tfgVar.e;
        double d3 = tfgVar.f;
        return true;
    }

    public final int hashCode() {
        return (((((((((thu.e(0.3d) * 31) + thu.e(this.a)) * 31) + thu.e(this.b)) * 31) + thu.e(this.c)) * 31) + thu.e(0.6d)) * 31) + thu.e(0.25d);
    }

    public final String toString() {
        Object[] objArr = {Double.valueOf(0.3d), Double.valueOf(this.a), Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(0.6d), Double.valueOf(0.25d)};
        String[] strArrSplit = "xThresholdMeters;yThresholdMeters;zThresholdMeters;tiltThresholdDegrees;centerVisibilityThreshold;centerVisibilityStrictThreshold".split(";");
        StringBuilder sb = new StringBuilder("tfg[");
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
