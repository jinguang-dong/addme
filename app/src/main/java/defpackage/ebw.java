package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebw {
    public final String a;
    public final int b;

    public ebw(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebw)) {
            return false;
        }
        ebw ebwVar = (ebw) obj;
        return a.ao(this.a, ebwVar.a) && this.b == ebwVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.aQ(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + ((Object) cpn.v(this.b)) + ')';
    }
}
