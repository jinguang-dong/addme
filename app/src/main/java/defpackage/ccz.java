package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccz {
    public final cda a;
    public final int b;
    public final int c;

    public ccz(cda cdaVar, int i, int i2) {
        this.a = cdaVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccz)) {
            return false;
        }
        ccz cczVar = (ccz) obj;
        return a.ao(this.a, cczVar.a) && this.b == cczVar.b && this.c == cczVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
