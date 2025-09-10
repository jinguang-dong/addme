package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuf {
    public final List a;

    public iuf() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iuf) && a.ao(this.a, ((iuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LapReportScopeConfig(entries=" + this.a + ")";
    }

    public iuf(List list) {
        this.a = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ iuf(byte[] bArr) {
        long j = uls.a;
        ulu uluVar = ulu.d;
        this(rnt.ae(new iue[]{new iue(ujp.j(1, uluVar)), new iue(ujp.j(3, uluVar))}));
    }
}
