package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttw extends tph implements tqs {
    public static final ttw a;
    private static volatile tqy f;
    public int b;
    public ttx c;
    public ttx d;
    public ttx e;

    static {
        ttw ttwVar = new ttw();
        a = ttwVar;
        tph.A(ttw.class, ttwVar);
    }

    private ttw() {
        toj tojVar = toj.b;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\t\u000b\u0003\u0000\u0000\u0000\tဉ\u0002\nဉ\u0005\u000bဉ\b", new Object[]{"b", pAAtrB.ozN, "d", "e"});
        }
        if (i2 == 3) {
            return new ttw();
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
        synchronized (ttw.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
