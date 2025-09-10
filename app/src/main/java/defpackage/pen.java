package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pen {
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;

    public pen() {
        throw null;
    }

    public static pem a() {
        pem pemVar = new pem();
        pemVar.d(false);
        return pemVar;
    }

    public final boolean b() {
        int i = this.b;
        return i == 4 || i == 2;
    }

    public final boolean c() {
        int i = this.d;
        return i == 4 || i == 2;
    }

    public final boolean d() {
        return this.c != 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pen)) {
            return false;
        }
        pen penVar = (pen) obj;
        int i = this.b;
        int i2 = penVar.b;
        if (i == 0) {
            throw null;
        }
        if (i == i2) {
            int i3 = this.c;
            int i4 = penVar.c;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4) {
                int i5 = this.d;
                int i6 = penVar.d;
                if (i5 == 0) {
                    throw null;
                }
                if (i5 == i6 && this.a == penVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.aF(i);
        int i2 = this.c;
        a.aF(i2);
        int i3 = this.d;
        a.aF(i3);
        return (true != this.a ? 1237 : 1231) ^ ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003);
    }

    public final String toString() {
        return "{" + ojl.bu(this.b) + ", " + ojl.bu(this.c) + ", " + ojl.bu(this.d) + ", " + this.a + "}";
    }

    public pen(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.a = z;
    }
}
