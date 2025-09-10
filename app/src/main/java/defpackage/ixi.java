package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixi implements ixm {
    private final boolean a;
    private final kow b;
    private final pjo c;
    private final nkw d;
    private final Float e;

    public ixi(hbj hbjVar, pjo pjoVar, kow kowVar, nkw nkwVar) {
        this.a = hbjVar.p(gyf.c);
        this.b = kowVar;
        this.c = pjoVar;
        this.d = nkwVar;
        this.e = (Float) hbjVar.e(gyf.d).get();
    }

    @Override // defpackage.ixm
    public final float a() {
        return this.e.floatValue();
    }

    @Override // defpackage.ixm
    public final boolean b() {
        return this.a && this.d.equals(nkw.PHOTO) && this.c.l().equals(pka.BACK) && ((kox) this.b.dL()).equals(kox.ON);
    }

    @Override // defpackage.ixm
    public final boolean c() {
        return this.a;
    }

    @Override // defpackage.ixm
    public final void d() {
    }
}
