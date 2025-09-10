package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjs {
    public final String a;
    public final Throwable b;

    public pjs() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjs) {
            pjs pjsVar = (pjs) obj;
            if (this.a.equals(pjsVar.a) && ((th = this.b) != null ? th.equals(pjsVar.b) : pjsVar.b == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + String.valueOf(this.b) + "}";
    }

    public pjs(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }
}
