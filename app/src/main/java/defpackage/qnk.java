package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qnk {
    public final syx a;
    public final int b;
    public final int c;
    public final boolean d;

    public qnk() {
        throw null;
    }

    public static qtj a() {
        qtj qtjVar = new qtj((char[]) null);
        qtjVar.a = 11;
        qtjVar.d = 2;
        qtjVar.b = true;
        qtjVar.c = (byte) 7;
        return qtjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qnk) {
            qnk qnkVar = (qnk) obj;
            syx syxVar = this.a;
            if (syxVar != null ? syxVar.equals(qnkVar.a) : qnkVar.a == null) {
                if (this.b == qnkVar.b && this.c == qnkVar.c && this.d == qnkVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        syx syxVar = this.a;
        int iHashCode = syxVar == null ? 0 : syxVar.hashCode();
        int i = this.b;
        return (true != this.d ? 1237 : 1231) ^ ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", " + this.b + ", " + this.c + ", " + this.d + "}";
    }

    public qnk(syx syxVar, int i, int i2, boolean z) {
        this.a = syxVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }
}
