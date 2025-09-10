package defpackage;

import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tvl extends tph implements tqs {
    public static final tvl a;
    private static volatile tqy b;
    private int c;
    private tqm d;
    private tqm e;
    private tvg f;
    private tvg g;
    private tqm h;
    private tvg i;
    private tqm j;
    private tqm k;

    static {
        tvl tvlVar = new tvl();
        a = tvlVar;
        tph.A(tvl.class, tvlVar);
    }

    private tvl() {
        tqm tqmVar = tqm.a;
        this.d = tqmVar;
        this.e = tqmVar;
        this.h = tqmVar;
        this.j = tqmVar;
        this.k = tqmVar;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\b\u0000\u0001\u0001\u0014\b\u0005\u0000\u0000\u00012\u00052\u0007ဉ\n\bဉ\u0003\t2\u00122\u0013ဉ\u000b\u00142", new Object[]{"c", "d", tvh.a, "e", tvd.a, "g", clFzVRcygwbq.rpRHmoXS, "k", tva.a, "h", tvi.a, "i", "j", tvj.a});
        }
        if (i2 == 3) {
            return new tvl();
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
        tqy tqyVar = b;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (tvl.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
