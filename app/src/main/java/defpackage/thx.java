package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thx extends tph implements tqs {
    public static final thx a;
    private static volatile tqy h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private int i;

    static {
        thx thxVar = new thx();
        a = thxVar;
        tph.A(thx.class, thxVar);
    }

    private thx() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"i", "b", "c", GAQqzWiWWcYOgy.inpcTgLj, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new thx();
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
        synchronized (thx.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
