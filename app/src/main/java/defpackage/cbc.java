package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbc {
    public final String a;
    public final uep b;

    public cbc(String str, uep uepVar) {
        this.a = str;
        this.b = uepVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbc)) {
            return false;
        }
        cbc cbcVar = (cbc) obj;
        return a.ao(this.a, cbcVar.a) && a.ao(this.b, cbcVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str != null ? str.hashCode() : 0;
        uep uepVar = this.b;
        return (iHashCode * 31) + (uepVar != null ? uepVar.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}
