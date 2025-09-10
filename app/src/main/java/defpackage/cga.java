package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cga extends ceo {
    public final String c;
    public final cfz d;
    public final cfp e;
    public final int f;
    private final boolean g;

    public cga(String str, cfz cfzVar, cfp cfpVar) {
        super(2, cgc.a, new cfo(new cfl[0]));
        this.c = str;
        this.d = cfzVar;
        this.e = cfpVar;
        this.f = 0;
        this.g = true;
    }

    @Override // defpackage.cfc
    public final cfp b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cga)) {
            return false;
        }
        cga cgaVar = (cga) obj;
        if (!a.ao(this.c, cgaVar.c) || !a.ao(this.d, cgaVar.d) || !a.ao(this.e, cgaVar.e)) {
            return false;
        }
        int i = cgaVar.f;
        if (!a.p(0, 0)) {
            return false;
        }
        boolean z = cgaVar.g;
        return true;
    }

    public final int hashCode() {
        return (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.h) * 961) + 1231;
    }

    public final String toString() {
        return "Font(GoogleFont(\"" + this.c + "\", bestEffort=true), weight=" + this.e + ", style=" + ((Object) cfj.a()) + ')';
    }

    @Override // defpackage.cfc
    public final void c() {
    }
}
