package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class esv implements esw, fbc {
    private static final cnj a = fbe.a(20, new etz(1));
    private final fbf b = new fbf();
    private esw c;
    private boolean d;
    private boolean e;

    static esv d(esw eswVar) {
        esv esvVar = (esv) a.a();
        eoz.k(esvVar);
        esvVar.e = false;
        esvVar.d = true;
        esvVar.c = eswVar;
        return esvVar;
    }

    @Override // defpackage.esw
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.esw
    public final Class b() {
        return this.c.b();
    }

    @Override // defpackage.esw
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.fbc
    public final fbf dF() {
        return this.b;
    }

    @Override // defpackage.esw
    public final synchronized void e() {
        this.b.a();
        this.e = true;
        if (this.d) {
            return;
        }
        this.c.e();
        this.c = null;
        a.b(this);
    }

    final synchronized void f() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            e();
        }
    }
}
