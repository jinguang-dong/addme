package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phc {
    public final pdv a;
    public final pgf b;
    private paq c;
    private final ojl d;

    public phc(pdv pdvVar, pgf pgfVar, paq paqVar, ojl ojlVar) {
        this.b = pgfVar;
        this.a = pdvVar;
        this.c = paqVar;
        this.d = ojlVar;
    }

    public final synchronized pdk a() {
        return pgy.k(this.b, this.d);
    }

    public final pdo b() {
        return this.b.c;
    }

    final void c() {
        paq paqVar;
        synchronized (this) {
            paqVar = this.c;
            this.c = null;
        }
        if (paqVar != null) {
            paqVar.close();
        }
    }

    final synchronized boolean d() {
        return this.c != null;
    }

    public final boolean e() {
        return this.b.l();
    }

    public final boolean f() {
        return this.b.m();
    }

    public final String toString() {
        return this.b.toString();
    }
}
