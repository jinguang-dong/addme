package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boh extends bog {
    public final bnh a;
    public String b;
    public boolean c;
    public uif d;
    public final azr e;
    public final azr f;
    public float g;
    public float h;
    private final bnf i;
    private bkw j;
    private long k;
    private final uiq l;

    public boh(bnh bnhVar) {
        this.a = bnhVar;
        bnhVar.e = new aal(this, 9);
        this.b = "";
        this.c = true;
        this.i = new bnf();
        this.d = bnk.c;
        bap bapVar = bap.c;
        this.e = new azz(null, bapVar);
        this.f = new azz(new bki(0L), bapVar);
        this.k = 9205357640488583168L;
        this.g = 1.0f;
        this.h = 1.0f;
        this.l = new aal(this, 10);
    }

    @Override // defpackage.bog
    public final void b(bmv bmvVar) {
        g(bmvVar, 1.0f, null);
    }

    public final long c() {
        return ((bki) this.f.a()).a;
    }

    public final bkw d() {
        return (bkw) this.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.bmv r38, float r39, defpackage.bkw r40) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boh.g(bmv, float, bkw):void");
    }

    public final String toString() {
        return "Params: \tname: " + this.b + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (c() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (c() & 4294967295L)) + "\n";
    }
}
