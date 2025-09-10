package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eql {
    public static final eqk a = new eqj();
    public final Object b;
    public final eqk c;
    public final String d;
    public volatile byte[] e;

    public eql(String str, Object obj, eqk eqkVar) {
        eoz.h(str);
        this.d = str;
        this.b = obj;
        eoz.k(eqkVar);
        this.c = eqkVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eql) {
            return this.d.equals(((eql) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
