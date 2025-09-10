package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccl {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public ccl(Object obj, int i, int i2) {
        this(obj, i, i2, null);
    }

    public static /* synthetic */ ccl a(ccl cclVar, Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = cclVar.a;
        }
        int i3 = (i2 & 2) != 0 ? cclVar.b : 0;
        if ((i2 & 4) != 0) {
            i = cclVar.c;
        }
        String str = cclVar.d;
        return new ccl(obj, i3, i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccl)) {
            return false;
        }
        ccl cclVar = (ccl) obj;
        return a.ao(this.a, cclVar.a) && this.b == cclVar.b && this.c == cclVar.c && a.ao(this.d, cclVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public ccl(Object obj, int i, int i2, byte[] bArr) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = "";
        if (i <= i2) {
            return;
        }
        cgh.a("Reversed range is not supported");
    }
}
