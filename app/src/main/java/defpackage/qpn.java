package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpn {
    public final boolean a;
    private final sbp b;

    public qpn() {
        throw null;
    }

    public final sbp a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qpn) {
            qpn qpnVar = (qpn) obj;
            if (this.a == qpnVar.a && ujp.aH(this.b, qpnVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public qpn(boolean z, sbp sbpVar) {
        this.a = z;
        sbpVar.getClass();
        this.b = sbpVar;
    }
}
