package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbj implements paq {
    public final pdv a;
    public final kli b;
    public our c;
    public final pfu d;

    public lbj(pfu pfuVar, pdv pdvVar, kli kliVar) {
        pfuVar.getClass();
        pdvVar.getClass();
        this.d = pfuVar;
        this.a = pdvVar;
        this.b = kliVar;
    }

    public final void a() {
        our ourVar = this.c;
        if (ourVar != null) {
            ourVar.close();
        }
        this.c = null;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }
}
