package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class shu implements she {
    private final she a;
    private final Object b;

    public shu(she sheVar, Object obj) {
        sheVar.getClass();
        this.a = sheVar;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof shu)) {
            return false;
        }
        shu shuVar = (shu) obj;
        return this.a.equals(shuVar.a) && this.b.equals(shuVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return "SpecializedLogSiteKey{ delegate='" + this.a.toString() + "', qualifier='" + obj.toString() + "' }";
    }
}
