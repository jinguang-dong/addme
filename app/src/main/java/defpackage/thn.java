package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thn extends tph implements tqs {
    public static final thn a;
    private static volatile tqy f;
    public float b = -1.0f;
    public tpm c;
    public tpm d;
    public boolean e;
    private int g;

    static {
        thn thnVar = new thn();
        a = thnVar;
        tph.A(thn.class, thnVar);
    }

    private thn() {
        tpa tpaVar = tpa.a;
        this.c = tpaVar;
        this.d = tpaVar;
        toa toaVar = toa.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ခ\u0000\u0002$\u0003$\u0004ဇ\u0001", new Object[]{"g", TOnSyMaYeslEl.kaMzC, "c", "d", "e"});
        }
        if (i2 == 3) {
            return new thn();
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
        synchronized (thn.class) {
            tpdVar = f;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                f = tpdVar;
            }
        }
        return tpdVar;
    }
}
