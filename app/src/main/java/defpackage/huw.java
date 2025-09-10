package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huw {
    public static final huw a = new huw(mxm.PORTRAIT, true);
    public final mxm b;
    public final boolean c;

    public huw(mxm mxmVar, boolean z) {
        mxmVar.getClass();
        this.b = mxmVar;
        this.c = z;
    }

    public static /* synthetic */ huw c(huw huwVar, boolean z) {
        return new huw(huwVar.b, z);
    }

    public final huv a(boolean z) {
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            return this.c ? huv.a : huv.b;
        }
        if (iOrdinal == 1) {
            return this.c ? huv.c : huv.d;
        }
        if (iOrdinal == 2) {
            return this.c ^ z ? huv.d : huv.c;
        }
        if (iOrdinal == 3) {
            return this.c ? huv.b : huv.a;
        }
        throw new uet();
    }

    public final boolean b() {
        return this.b.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof huw)) {
            return false;
        }
        huw huwVar = (huw) obj;
        return this.b == huwVar.b && this.c == huwVar.c;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + a.o(this.c);
    }

    public final String toString() {
        return "SerengetiOrientation(deviceOrientation=" + this.b + ", defaultDirection=" + this.c + ")";
    }
}
