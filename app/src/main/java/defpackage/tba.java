package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tba extends tph implements tqs {
    public static final tba a;
    private static volatile tqy j;
    public int b;
    public int c;
    public long d;
    public uyd e;
    public tax f;
    public suo g;
    public tpw h;
    public taz i;
    private byte k = 2;

    static {
        tba tbaVar = new tba();
        a = tbaVar;
        tph.A(tba.class, tbaVar);
    }

    private tba() {
        toj tojVar = toj.b;
        this.h = trb.a;
        tqh tqhVar = tqh.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0001\u0002\u0002ဉ\u0004\u0003ᐉ\u0005\t\u001b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\b", new Object[]{"b", "f", "g", "h", tbc.class, "c", svp.e, "d", GAQqzWiWWcYOgy.iKOfO, "i"});
        }
        if (i2 == 3) {
            return new tba();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = j;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tba.class) {
            tpdVar = j;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                j = tpdVar;
            }
        }
        return tpdVar;
    }
}
