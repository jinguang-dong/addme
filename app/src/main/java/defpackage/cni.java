package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cni {
    public final Object a;
    public final Object b;

    public cni(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cni)) {
            return false;
        }
        cni cniVar = (cni) obj;
        return Objects.equals(cniVar.a, this.a) && Objects.equals(cniVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
