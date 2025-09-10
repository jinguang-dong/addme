package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oam extends oao {
    public final oba a;

    public oam(oar oarVar) {
        super(oarVar);
        this.a = new oba(oarVar);
    }

    @Override // defpackage.oao
    protected final void a() {
        this.a.A();
    }

    public final void b(obg obgVar) {
        z();
        e().b(new nzq(this, obgVar, 5, (char[]) null));
    }

    final void c() {
        oak.a();
        oak.a();
        this.a.e = System.currentTimeMillis();
    }
}
