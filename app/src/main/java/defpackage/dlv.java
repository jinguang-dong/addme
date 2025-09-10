package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlv {
    public final uiu a;
    public final dmk b;

    public dlv() {
        this((uiu) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlv)) {
            return false;
        }
        dlv dlvVar = (dlv) obj;
        return a.ao(this.a, dlvVar.a) && a.ao(this.b, dlvVar.b);
    }

    public final int hashCode() {
        uiu uiuVar = this.a;
        int iHashCode = uiuVar == null ? 0 : uiuVar.hashCode();
        dmk dmkVar = this.b;
        return (iHashCode * 31) + (dmkVar != null ? dmkVar.hashCode() : 0);
    }

    public final String toString() {
        return "TransformingLazyColumnParentData(heightProvider=" + this.a + ", animationSpecs=" + this.b + ')';
    }

    public dlv(uiu uiuVar, dmk dmkVar) {
        this.a = uiuVar;
        this.b = dmkVar;
    }

    public /* synthetic */ dlv(uiu uiuVar, int i) {
        this(1 == (i & 1) ? null : uiuVar, (dmk) null);
    }
}
