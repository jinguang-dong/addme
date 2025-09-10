package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nzx {
    public final int a;
    public final int b;
    public final boolean c;
    private final String d;

    public nzx() {
        throw null;
    }

    public static nzw a() {
        nzw nzwVar = new nzw();
        nzwVar.c(0);
        nzwVar.a = "";
        nzwVar.b(-1);
        nzwVar.d(false);
        return nzwVar;
    }

    public static nzx b(int i, Map map, String str) {
        nzw nzwVarA = a();
        nzwVarA.a = rnt.U(str);
        boolean zContainsKey = true;
        if (i != 408) {
            if (i == 413) {
                zContainsKey = map.containsKey("Retry-After");
            } else if (i != 429) {
                if (i == 503) {
                    zContainsKey = map.containsKey("Retry-After");
                } else if (i != 504) {
                    zContainsKey = false;
                }
            }
        }
        nzwVarA.d(zContainsKey);
        nzwVarA.b(i);
        nzwVarA.c(i);
        return nzwVarA.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzx) {
            nzx nzxVar = (nzx) obj;
            if (this.a == nzxVar.a && this.d.equals(nzxVar.d) && this.b == nzxVar.b && this.c == nzxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ ((((this.a ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.d + ", " + this.b + ", " + this.c + "}";
    }

    public nzx(int i, String str, int i2, boolean z) {
        this.a = i;
        this.d = str;
        this.b = i2;
        this.c = z;
    }
}
