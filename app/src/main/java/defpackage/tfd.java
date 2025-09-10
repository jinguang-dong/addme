package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfd {
    public final tfc a;
    public final float b;

    public tfd() {
        throw null;
    }

    public static tfb a() {
        tfb tfbVar = new tfb();
        tfbVar.b(tfc.NONE);
        tfbVar.a = (byte) (tfbVar.a | 2);
        tfbVar.c(2.0f);
        return tfbVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfd) {
            tfd tfdVar = (tfd) obj;
            if (this.a.equals(tfdVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(tfdVar.b) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return ((Float.floatToIntBits(this.b) ^ (iHashCode * 1000003)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "{" + String.valueOf(this.a) + ", " + this.b + ", 0.0}";
    }

    public tfd(tfc tfcVar, float f) {
        this.a = tfcVar;
        this.b = f;
    }
}
