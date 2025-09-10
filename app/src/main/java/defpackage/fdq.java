package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdq implements jhc, jhe, jhf, jhg, jgz {
    public final Object a = new Object();
    public our b;
    public our c;
    public our d;
    public fsc e;
    public fsc f;
    public fsc g;
    public final fqg h;

    public fdq(fqg fqgVar) {
        this.h = fqgVar;
        our ourVarB = fqgVar.b();
        this.d = ourVarB;
        our ourVarC = fqgVar.c(ourVarB);
        this.c = ourVarC;
        this.b = fqgVar.a(ourVarC);
        our ourVar = this.d;
        fsc fscVar = new fsc();
        ourVar.d(fscVar);
        this.g = fscVar;
        our ourVar2 = this.c;
        fsc fscVar2 = new fsc();
        ourVar2.d(fscVar2);
        this.f = fscVar2;
        our ourVar3 = this.b;
        fsc fscVar3 = new fsc();
        ourVar3.d(fscVar3);
        this.e = fscVar3;
    }

    public static fdq h(fqg fqgVar) {
        fqgVar.getClass();
        a.I(true);
        return new fdq(fqgVar);
    }

    @Override // defpackage.jhc
    public final void ea() {
        synchronized (this.a) {
            this.b.close();
        }
    }

    @Override // defpackage.jhe
    public final void eb() {
        synchronized (this.a) {
            if (f()) {
                our ourVarA = this.h.a(this.c);
                this.b = ourVarA;
                fsc fscVar = new fsc();
                ourVarA.d(fscVar);
                this.e = fscVar;
            }
        }
    }

    @Override // defpackage.jhf
    public final void ej() {
        synchronized (this.a) {
            if (g()) {
                fqg fqgVar = this.h;
                our ourVarC = fqgVar.c(this.d);
                this.c = ourVarC;
                fsc fscVar = new fsc();
                ourVarC.d(fscVar);
                this.f = fscVar;
                our ourVarA = fqgVar.a(this.c);
                this.b = ourVarA;
                fsc fscVar2 = new fsc();
                ourVarA.d(fscVar2);
                this.e = fscVar2;
            }
        }
    }

    @Override // defpackage.jgz
    public final void et() {
        synchronized (this.a) {
            this.d.close();
        }
    }

    @Override // defpackage.jhg
    public final void eu() {
        synchronized (this.a) {
            this.c.close();
        }
    }

    public final boolean f() {
        boolean zA;
        synchronized (this.a) {
            zA = this.e.a();
        }
        return zA;
    }

    public final boolean g() {
        boolean zA;
        synchronized (this.a) {
            zA = this.f.a();
        }
        return zA;
    }

    public final our i() {
        our ourVar;
        synchronized (this.a) {
            ourVar = this.b;
        }
        return ourVar;
    }

    public final our j() {
        our ourVar;
        synchronized (this.a) {
            ourVar = this.d;
        }
        return ourVar;
    }

    public final our k() {
        our ourVar;
        synchronized (this.a) {
            ourVar = this.c;
        }
        return ourVar;
    }
}
