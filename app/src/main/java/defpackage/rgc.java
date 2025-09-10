package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgc {
    public final String a;
    public final rwc b;

    public rgc() {
        throw null;
    }

    private static rgc c(String str, String str2) {
        if (true == str.equals(str2)) {
            str2 = null;
        }
        return new rgc(str, rwc.i(str2));
    }

    public final rgc a(String str) {
        str.getClass();
        return c(str, (String) this.b.f());
    }

    public final rgc b(String str) {
        return c(this.a, str);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgc) {
            rgc rgcVar = (rgc) obj;
            if (this.a.equals(rgcVar.a) && this.b.equals(rgcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public rgc(String str, rwc rwcVar) {
        str.getClass();
        this.a = str;
        this.b = rwcVar;
    }
}
