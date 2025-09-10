package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fne {
    public static final fne a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final int e;

    static {
        fnd fndVar = new fnd((byte[]) null);
        fndVar.a = 1;
        a = fndVar.a();
    }

    public fne() {
        throw null;
    }

    public final boolean a() {
        int i = this.e;
        if (i == 0) {
            throw null;
        }
        if (i != 2) {
            Optional optional = this.d;
            if (!optional.isPresent()) {
                return false;
            }
            if (((fnj) optional.get()).equals(fnj.SUPPORTED_INSTALLED)) {
                return false;
            }
        }
        return !c();
    }

    public final boolean b() {
        int i = this.e;
        if (i == 0) {
            throw null;
        }
        if (i != 3) {
            return false;
        }
        Optional optional = this.d;
        if (!optional.isEmpty()) {
            if (!((fnj) optional.get()).equals(fnj.SUPPORTED_INSTALLED)) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        int i = this.e;
        if (i != 0) {
            return i == 1 && this.d.isEmpty();
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fne)) {
            return false;
        }
        fne fneVar = (fne) obj;
        int i = this.e;
        int i2 = fneVar.e;
        if (i != 0) {
            return i == i2 && this.b.equals(fneVar.b) && this.c.equals(fneVar.c) && this.d.equals(fneVar.d);
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.e;
        a.aF(i);
        int iHashCode = ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        return this.d.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        int i = this.e;
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "SUPPORTED" : "UNSUPPORTED" : "UNKNOWN";
        Optional optional = this.b;
        Optional optional2 = this.c;
        Optional optional3 = this.d;
        return "{" + str + ", " + String.valueOf(optional) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional3) + "}";
    }

    public fne(int i, Optional optional, Optional optional2, Optional optional3) {
        this.e = i;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
    }
}
