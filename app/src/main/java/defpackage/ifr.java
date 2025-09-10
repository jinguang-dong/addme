package defpackage;

import com.google.android.gms.analytics.EQvQ.UvOvSgfD;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ifr extends tph implements tqs {
    public static final ifr a;
    private static volatile tqy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ifr ifrVar = new ifr();
        a = ifrVar;
        tph.A(ifr.class, ifrVar);
    }

    private ifr() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"b", "c", UvOvSgfD.AIdWLu, "e"});
        }
        if (i2 == 3) {
            return new ifr();
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
        tqy tqyVar = f;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ifr.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
