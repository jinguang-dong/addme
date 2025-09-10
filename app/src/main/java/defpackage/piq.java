package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class piq {
    public int a = 0;
    public int b = 0;
    public boolean c;
    public final our d;
    private final pmf e;
    private final pmf f;
    private final boolean g;

    public piq(pmf pmfVar, pmf pmfVar2, our ourVar, boolean z) {
        this.c = false;
        this.d = ourVar;
        this.e = pmfVar;
        this.f = pmfVar2;
        this.c = ourVar.b();
        this.g = z;
    }

    public static piq f(pmf pmfVar, pmf pmfVar2, boolean z) {
        our ourVar = new our();
        if (pmfVar != null) {
            ourVar.d(pmfVar);
        }
        if (pmfVar2 != null) {
            ourVar.d(pmfVar2);
        }
        if (pmfVar == null && pmfVar2 == null) {
            ourVar.close();
        }
        return new piq(pmfVar, pmfVar2, ourVar, z);
    }

    public static piq g() {
        return f(null, null, false);
    }

    public final paq a() {
        boolean z;
        synchronized (this) {
            z = this.c;
            if (!z) {
                this.a++;
            }
        }
        c();
        if (z) {
            return null;
        }
        return new pip(this, 1);
    }

    public final paq b() {
        boolean z;
        synchronized (this) {
            z = this.c;
            if (!z) {
                this.b++;
            }
        }
        c();
        if (z) {
            return null;
        }
        return new pip(this, 0);
    }

    public final synchronized void c() {
        pmf pmfVar;
        boolean z = false;
        if (!this.c && this.b == 0 && this.a > 0) {
            z = true;
        }
        pmf pmfVar2 = this.f;
        if (pmfVar2 != null) {
            pmfVar2.a(z);
        }
        if (!this.g && (pmfVar = this.e) != null) {
            pmfVar.a(z);
        }
    }

    public final synchronized boolean d() {
        return this.c;
    }

    public final void e(paq paqVar) {
        this.d.d(paqVar);
    }
}
