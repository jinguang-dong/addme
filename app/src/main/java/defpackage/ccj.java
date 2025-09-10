package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccj {
    private final Object a;
    private final int b;
    private final int c;
    private final String d = "";

    public ccj(Object obj, int i, int i2) {
        this.a = obj;
        this.b = i;
        this.c = i2;
    }

    public final ccl a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            cgh.b("Item.end should be set first");
        }
        return new ccl(this.a, this.b, i, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccj)) {
            return false;
        }
        ccj ccjVar = (ccj) obj;
        return a.ao(this.a, ccjVar.a) && this.b == ccjVar.b && this.c == ccjVar.c && a.ao(this.d, ccjVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "MutableRange(item=" + this.a + GAQqzWiWWcYOgy.PLAsLT + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }
}
