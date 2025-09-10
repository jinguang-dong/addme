package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caq {
    public final bnj a;
    public final int b;

    public caq(bnj bnjVar, int i) {
        this.a = bnjVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof caq)) {
            return false;
        }
        caq caqVar = (caq) obj;
        return a.ao(this.a, caqVar.a) && this.b == caqVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}
