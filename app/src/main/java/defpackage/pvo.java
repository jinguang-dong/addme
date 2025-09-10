package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvo extends tph implements tqs {
    public static final pvo a;
    private static volatile tqy h;
    public int b;
    public trn c;
    public boolean e;
    public pvq f;
    public tqm g = tqm.a;
    public tpw d = trb.a;

    static {
        pvo pvoVar = new pvo();
        a = pvoVar;
        tph.A(pvo.class, pvoVar);
    }

    private pvo() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new Object[]{"b", "c", "d", pvg.class, "e", "f", "g", pvn.a});
        }
        if (i2 == 3) {
            return new pvo();
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
        tqy tqyVar = h;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (pvo.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.d;
        if (tpwVar.c()) {
            return;
        }
        this.d = tph.v(tpwVar);
    }
}
