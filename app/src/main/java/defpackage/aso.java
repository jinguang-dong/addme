package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aso {
    public final Object a;
    public final uiv b;

    public aso(Object obj, uiv uivVar) {
        this.a = obj;
        this.b = uivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aso)) {
            return false;
        }
        aso asoVar = (aso) obj;
        return a.ao(this.a, asoVar.a) && a.ao(this.b, asoVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
