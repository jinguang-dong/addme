package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gnn {
    public final int a;
    public final int b;
    public final int c;
    public final pka d;
    public final gnm e;
    public final nkw f;
    public final boolean g;
    public final int h;

    public gnn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnn) {
            gnn gnnVar = (gnn) obj;
            if (this.a == gnnVar.a && this.b == gnnVar.b && this.c == gnnVar.c && this.d.equals(gnnVar.d)) {
                int i = this.h;
                int i2 = gnnVar.h;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.e.equals(gnnVar.e) && this.f.equals(gnnVar.f) && this.g == gnnVar.g) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        int i = this.h;
        a.aF(i);
        return (true != this.g ? 1237 : 1231) ^ (((((((iHashCode * 1000003) ^ i) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        int i = this.h;
        String strValueOf = String.valueOf(this.d);
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "ERROR" : "OK" : "UNKNOWN";
        int i2 = this.c;
        int i3 = this.b;
        int i4 = this.a;
        gnm gnmVar = this.e;
        nkw nkwVar = this.f;
        boolean z = this.g;
        return "{" + i4 + ", " + i3 + ", " + i2 + ", " + strValueOf + ", " + str + ", " + String.valueOf(gnmVar) + ", " + String.valueOf(nkwVar) + ", " + z + "}";
    }

    public gnn(int i, int i2, int i3, pka pkaVar, int i4, gnm gnmVar, nkw nkwVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = pkaVar;
        this.h = i4;
        this.e = gnmVar;
        this.f = nkwVar;
        this.g = z;
    }
}
