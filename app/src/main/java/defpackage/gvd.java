package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvd {
    public final String a;
    public final String b;

    public gvd(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvd)) {
            return false;
        }
        gvd gvdVar = (gvd) obj;
        return a.ao(this.a, gvdVar.a) && a.ao(this.b, gvdVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ToggleUiData(label=" + this.a + ", contentDescription=" + this.b + ")";
    }

    public /* synthetic */ gvd(String str) {
        this(str, null);
    }
}
