package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cge {
    public final ccm a;
    public final long b;
    private final cdn c;

    public /* synthetic */ cge(ccm ccmVar, long j) {
        this.a = ccmVar;
        int length = ccmVar.b.length();
        int iB = cdn.b(j);
        iB = iB < 0 ? 0 : iB;
        iB = iB > length ? length : iB;
        int iA = cdn.a(j);
        int i = iA >= 0 ? iA : 0;
        length = i <= length ? i : length;
        this.b = (iB == cdn.b(j) && length == cdn.a(j)) ? j : byx.k(iB, length);
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cge)) {
            return false;
        }
        long j = this.b;
        cge cgeVar = (cge) obj;
        long j2 = cgeVar.b;
        long j3 = cdn.a;
        if (a.q(j, j2)) {
            cdn cdnVar = cgeVar.c;
            if (a.ao(null, null) && a.ao(this.a, cgeVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = cdn.a;
        return (iHashCode + a.r(this.b)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextFieldValue(text='");
        sb.append((Object) this.a);
        sb.append("', selection=");
        long j = cdn.a;
        StringBuilder sb2 = new StringBuilder("TextRange(");
        long j2 = this.b;
        sb2.append(cdn.b(j2));
        sb2.append(", ");
        sb2.append(cdn.a(j2));
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(", composition=null)");
        return sb.toString();
    }
}
