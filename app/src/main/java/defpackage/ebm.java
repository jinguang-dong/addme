package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebm {
    public final String a;
    public final int b;

    public ebm(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebm)) {
            return false;
        }
        ebm ebmVar = (ebm) obj;
        return a.ao(this.a, ebmVar.a) && this.b == ebmVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
