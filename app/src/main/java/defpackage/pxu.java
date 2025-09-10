package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxu {
    public final String a;

    public pxu() {
        throw null;
    }

    public static pxu a(String str) {
        int i = slm.a;
        slk slkVarE = sll.a.e();
        slkVarE.e(str);
        return new pxu(slkVarE.m().toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof pxu) && this.a.equals(((pxu) obj).a);
    }

    public final int hashCode() {
        a.aF(1);
        return this.a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return this.a;
    }

    public pxu(String str) {
        this.a = str;
    }
}
