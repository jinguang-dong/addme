package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sry extends tph implements tqs {
    public static final sry a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public long e;
    public long f;
    public int g;

    static {
        sry sryVar = new sry();
        a = sryVar;
        tph.A(sry.class, sryVar);
    }

    private sry() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = rgk.k;
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005᠌\u0004", new Object[]{"b", "c", tplVar, "d", tplVar, MyBPCgKwEjJI.Ggw, "f", "g", sri.q});
        }
        if (i2 == 3) {
            return new sry();
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
        synchronized (sry.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
