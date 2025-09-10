package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sse extends tph implements tqs {
    public static final sse a;
    private static volatile tqy h;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;

    static {
        sse sseVar = new sse();
        a = sseVar;
        tph.A(sse.class, sseVar);
    }

    private sse() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"b", "c", sri.s, OPuAVreQM.ySTXwPD, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new sse();
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
        synchronized (sse.class) {
            tpdVar = h;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                h = tpdVar;
            }
        }
        return tpdVar;
    }
}
