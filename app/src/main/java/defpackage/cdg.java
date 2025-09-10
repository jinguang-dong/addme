package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdg {
    public final cdf a;
    public final cde b;

    public cdg(cde cdeVar) {
        this.a = null;
        this.b = cdeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdg)) {
            return false;
        }
        cdg cdgVar = (cdg) obj;
        if (!a.ao(this.b, cdgVar.b)) {
            return false;
        }
        cdf cdfVar = cdgVar.a;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ')';
    }

    public cdg() {
        this(new cde(null));
    }
}
