package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djl {
    public final int a;
    public final int b = 0;
    public final cib c;

    public djl(int i, cib cibVar) {
        this.a = i;
        this.c = cibVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof djl) {
            djl djlVar = (djl) obj;
            if (a.p(this.a, djlVar.a)) {
                int i = djlVar.b;
                if (a.p(0, 0) && this.c == djlVar.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 961) + this.c.hashCode();
    }
}
