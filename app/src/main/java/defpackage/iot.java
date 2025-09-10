package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iot {
    public final nkw a;
    public final sqg b;
    public final int c;
    public final long d;
    public final int e;

    public iot() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iot) {
            iot iotVar = (iot) obj;
            if (this.a.equals(iotVar.a)) {
                int i = this.e;
                int i2 = iotVar.e;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(iotVar.b) && this.c == iotVar.c && this.d == iotVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.e;
        a.aQ(i);
        int iHashCode2 = (((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
        long j = this.d;
        return ((this.c ^ (iHashCode2 * 1000003)) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public iot(nkw nkwVar, int i, sqg sqgVar, int i2, long j) {
        this.a = nkwVar;
        this.e = i;
        this.b = sqgVar;
        this.c = i2;
        this.d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int i = this.e;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder("{");
        sb.append(strValueOf);
        String str = clFzVRcygwbq.QnZ;
        sb.append(str);
        sb.append(string);
        sb.append(str);
        sb.append(strValueOf2);
        sb.append(str);
        sb.append(this.c);
        sb.append(str);
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
