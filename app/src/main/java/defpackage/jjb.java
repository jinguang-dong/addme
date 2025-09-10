package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjb {
    public final ltf a;
    public final srw b;
    public final Float c;
    public final boolean d;
    public final boolean e;
    public final jjq f;
    public final lkk g;
    public final boolean h;

    public jjb() {
        throw null;
    }

    public static jja a() {
        jja jjaVar = new jja();
        jjaVar.b(false);
        jjaVar.c(false);
        jjaVar.f(new jjp(null).a());
        jjaVar.e(lkk.AUTO);
        jjaVar.d(false);
        return jjaVar;
    }

    public final boolean equals(Object obj) {
        srw srwVar;
        Float f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jjb) {
            jjb jjbVar = (jjb) obj;
            if (this.a.equals(jjbVar.a) && ((srwVar = this.b) != null ? srwVar.equals(jjbVar.b) : jjbVar.b == null) && ((f = this.c) != null ? f.equals(jjbVar.c) : jjbVar.c == null) && this.d == jjbVar.d && this.e == jjbVar.e && this.f.equals(jjbVar.f) && this.g.equals(jjbVar.g) && this.h == jjbVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        srw srwVar = this.b;
        if (srwVar == null) {
            iJ = 0;
        } else if (srwVar.C()) {
            iJ = srwVar.j();
        } else {
            int iJ2 = srwVar.aT;
            if (iJ2 == 0) {
                iJ2 = srwVar.j();
                srwVar.aT = iJ2;
            }
            iJ = iJ2;
        }
        int i = ((iHashCode * 1000003) ^ iJ) * 1000003;
        Float f = this.c;
        return ((((((((((i ^ (f != null ? f.hashCode() : 0)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237);
    }

    public final String toString() {
        lkk lkkVar = this.g;
        jjq jjqVar = this.f;
        srw srwVar = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(srwVar) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + String.valueOf(jjqVar) + ", " + String.valueOf(lkkVar) + ", " + this.h + "}";
    }

    public jjb(ltf ltfVar, srw srwVar, Float f, boolean z, boolean z2, jjq jjqVar, lkk lkkVar, boolean z3) {
        this.a = ltfVar;
        this.b = srwVar;
        this.c = f;
        this.d = z;
        this.e = z2;
        this.f = jjqVar;
        this.g = lkkVar;
        this.h = z3;
    }
}
