package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gsg extends tph implements tqs {
    public static final gsg a;
    private static volatile tqy f;
    public int c;
    public boolean e;
    public String b = "";
    public String d = "";

    static {
        gsg gsgVar = new gsg();
        a = gsgVar;
        tph.A(gsg.class, gsgVar);
    }

    private gsg() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007", new Object[]{"b", "c", "d", GAQqzWiWWcYOgy.QrK});
        }
        if (i2 == 3) {
            return new gsg();
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
        synchronized (gsg.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
