package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfv {
    public final cfd a;
    public final cfp b;
    public final int c = 0;
    public final int d = 65535;
    public final Object e = null;

    public /* synthetic */ cfv(cfd cfdVar, cfp cfpVar) {
        this.a = cfdVar;
        this.b = cfpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfv)) {
            return false;
        }
        cfv cfvVar = (cfv) obj;
        if (!a.ao(this.a, cfvVar.a) || !a.ao(this.b, cfvVar.b)) {
            return false;
        }
        int i = cfvVar.c;
        if (!a.p(0, 0)) {
            return false;
        }
        int i2 = cfvVar.d;
        if (!a.p(65535, 65535)) {
            return false;
        }
        Object obj2 = cfvVar.e;
        return a.ao(null, null);
    }

    public final int hashCode() {
        cfd cfdVar = this.a;
        return (((((cfdVar == null ? 0 : cfdVar.hashCode()) * 31) + this.b.h) * 961) + 65535) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) cfj.a()) + ", fontSynthesis=" + ((Object) cfk.a()) + ", resourceLoaderCacheKey=null)";
    }
}
