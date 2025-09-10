package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sto extends tph implements tqs {
    public static final sto a;
    private static volatile tqy i;
    public int b;
    public boolean c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public float h;

    static {
        sto stoVar = new sto();
        a = stoVar;
        tph.A(sto.class, stoVar);
    }

    private sto() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005", new Object[]{"b", "c", "d", "e", "f", TOnSyMaYeslEl.JONtxABKFYbHqN, "h"});
        }
        if (i3 == 3) {
            return new sto();
        }
        if (i3 == 4) {
            return new tpc(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        tqy tqyVar = i;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sto.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
