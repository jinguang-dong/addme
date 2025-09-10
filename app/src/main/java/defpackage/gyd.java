package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyd extends tph implements tqs {
    public static final gyd a;
    private static volatile tqy j;
    public int b;
    public int c;
    public int d;
    public tpm e;
    public tpm f;
    public float g;
    public float h;
    public tpw i;

    static {
        gyd gydVar = new gyd();
        a = gydVar;
        tph.A(gyd.class, gydVar);
    }

    private gyd() {
        tpa tpaVar = tpa.a;
        this.e = tpaVar;
        this.f = tpaVar;
        this.i = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003\u0013\u0004\u0013\u0005ခ\u0002\u0006ခ\u0003\u0007\u001b", new Object[]{"b", "c", rgk.b, "d", rgk.k, "e", "f", "g", "h", "i", gyc.class});
        }
        if (i2 == 3) {
            return new gyd();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (gyd.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.i;
        if (tpwVar.c()) {
            return;
        }
        this.i = tph.v(tpwVar);
    }

    public final void c() {
        tpm tpmVar = this.f;
        if (tpmVar.c()) {
            return;
        }
        this.f = tph.s(tpmVar);
    }

    public final void d() {
        tpm tpmVar = this.e;
        if (tpmVar.c()) {
            return;
        }
        this.e = tph.s(tpmVar);
    }
}
