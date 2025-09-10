package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptj {
    public final cfp a;
    public final int b;

    public ptj(cfp cfpVar) {
        cfpVar.getClass();
        this.a = cfpVar;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptj)) {
            return false;
        }
        ptj ptjVar = (ptj) obj;
        if (!a.ao(this.a, ptjVar.a)) {
            return false;
        }
        int i = ptjVar.b;
        return a.p(0, 0);
    }

    public final int hashCode() {
        return this.a.h * 31;
    }

    public final String toString() {
        return "GoogleSansConfig(weight=" + this.a + ", style=" + cfj.a() + ")";
    }
}
