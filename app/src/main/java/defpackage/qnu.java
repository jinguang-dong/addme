package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnu extends tph implements tqs {
    public static final qnu a;
    private static volatile tqy f;
    public int b;
    public long c;
    public trn d;
    private byte g = 2;
    public tpw e = trb.a;

    static {
        qnu qnuVar = new qnu();
        a = qnuVar;
        tph.A(qnu.class, qnuVar);
    }

    private qnu() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", qnq.class});
        }
        if (i2 == 3) {
            return new qnu();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qnu.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }

    public final void b() {
        tpw tpwVar = this.e;
        if (tpwVar.c()) {
            return;
        }
        this.e = tph.v(tpwVar);
    }
}
