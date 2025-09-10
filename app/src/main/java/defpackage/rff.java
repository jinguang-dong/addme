package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rff {
    public final List a;
    public final List b;

    public rff(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rff)) {
            return false;
        }
        rff rffVar = (rff) obj;
        return a.ao(this.a, rffVar.a) && a.ao(this.b, rffVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Node(nodes=" + this.a + ", attributes=" + this.b + ")";
    }
}
