package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqg {
    public final Object a;
    public final our b;
    public our c;
    private ouk d;
    private our e;
    private ouk f;
    private fsc g;
    private fsc h;

    public fqg() {
        our ourVar = new our();
        this.b = ourVar;
        this.a = new Object();
        our ourVarC = ourVar.c();
        this.e = ourVarC;
        this.f = d(ourVarC);
        our ourVarC2 = this.e.c();
        this.c = ourVarC2;
        this.d = d(ourVarC2);
        ourVar.d(new fsc());
        our ourVar2 = this.e;
        fsc fscVar = new fsc();
        ourVar2.d(fscVar);
        this.h = fscVar;
        our ourVar3 = this.c;
        fsc fscVar2 = new fsc();
        ourVar3.d(fscVar2);
        this.g = fscVar2;
    }

    private final ouk d(our ourVar) {
        ouk oukVar = new ouk(new ouj(this, ourVar, 1));
        ourVar.d(oukVar);
        return oukVar;
    }

    public final our a(our ourVar) {
        our ourVarC = ourVar.c();
        synchronized (this.a) {
            if (this.g.a()) {
                our ourVarC2 = this.e.c();
                this.c = ourVarC2;
                ourVarC2.d(new fhf(5));
                this.d = d(this.c);
                our ourVar2 = this.c;
                fsc fscVar = new fsc();
                ourVar2.d(fscVar);
                this.g = fscVar;
            }
            paq paqVarA = this.d.a();
            if (paqVarA != null) {
                ourVarC.d(paqVarA);
            }
        }
        return ourVarC;
    }

    public final our b() {
        return this.b.c();
    }

    public final our c(our ourVar) {
        our ourVarC = ourVar.c();
        synchronized (this.a) {
            if (this.h.a()) {
                our ourVarC2 = this.b.c();
                this.e = ourVarC2;
                ourVarC2.d(new fhf(3));
                this.f = d(this.e);
                our ourVar2 = this.e;
                fsc fscVar = new fsc();
                ourVar2.d(fscVar);
                this.h = fscVar;
                our ourVarC3 = this.e.c();
                this.c = ourVarC3;
                ourVarC3.d(new fhf(4));
                this.d = d(this.c);
                our ourVar3 = this.c;
                fsc fscVar2 = new fsc();
                ourVar3.d(fscVar2);
                this.g = fscVar2;
            }
            paq paqVarA = this.f.a();
            if (paqVarA != null) {
                ourVarC.d(paqVarA);
            }
        }
        return ourVarC;
    }
}
