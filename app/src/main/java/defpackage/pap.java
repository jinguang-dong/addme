package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pap {
    public final long a;
    public final long b;

    public pap(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static String b(pap[] papVarArr) {
        if (papVarArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = papVarArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(papVarArr[i].a);
            sb.append("/");
            sb.append(papVarArr[i].b);
            if (i != length - 1) {
                sb.append(",");
            }
            i++;
        }
    }

    public final double a() {
        return this.a / this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof pap) {
            pap papVar = (pap) obj;
            if (this.a == papVar.a && this.b == papVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b)});
    }

    public final String toString() {
        return this.a + "/" + this.b;
    }

    public pap(pap papVar) {
        this.a = papVar.a;
        this.b = papVar.b;
    }
}
