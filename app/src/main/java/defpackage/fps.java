package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fps extends AmbientMode.AmbientCallback {
    public final int a;
    public final int b;

    public fps(int i, int i2) {
        super((byte[]) null);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fps)) {
            return false;
        }
        fps fpsVar = (fps) obj;
        return this.a == fpsVar.a && this.b == fpsVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.a), Integer.valueOf(this.b)};
        String[] strArrSplit = "pointCount;withinDistanceCount".split(";");
        StringBuilder sb = new StringBuilder(MyBPCgKwEjJI.RYsbPIKVTHkuqL);
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
