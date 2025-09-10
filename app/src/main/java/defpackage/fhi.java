package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhi {
    public static final fhi a;
    public final boolean b;
    public final int c;
    public final boolean d;

    static {
        leo leoVar = new leo();
        leoVar.f(false);
        leoVar.e(0);
        leoVar.a = (byte) (leoVar.a | 4);
        a = leoVar.d();
    }

    public fhi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhi) {
            fhi fhiVar = (fhi) obj;
            if (this.b == fhiVar.b && this.c == fhiVar.c) {
                boolean z = fhiVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c ^ (((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "{" + this.b + ", " + this.c + ", false}";
    }

    public fhi(boolean z, int i) {
        this.b = z;
        this.c = i;
        this.d = false;
    }
}
