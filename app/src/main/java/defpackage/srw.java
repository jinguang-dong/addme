package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import com.google.vr.audio.Cf.qcjAcSmlN;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class srw extends tph implements tqs {
    public static final srw a;
    private static volatile tqy o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public int i;
    public tpw j = trb.a;
    public boolean k;
    public int l;
    public int m;
    public int n;

    static {
        srw srwVar = new srw();
        a = srwVar;
        tph.A(srw.class, srwVar);
    }

    private srw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007᠌\u0006\b\u001b\tဇ\u0007\n᠌\b\u000b᠌\t\f᠌\n", new Object[]{"b", IQwwK.CJoebeqRuoJp, "d", "e", "f", "g", "h", "i", sri.n, qcjAcSmlN.ivqmbeFlnqa, srz.class, "k", "l", sri.o, "m", sri.m, "n", sri.l});
        }
        if (i2 == 3) {
            return new srw();
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
        tqy tqyVar = o;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (srw.class) {
            tpdVar = o;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                o = tpdVar;
            }
        }
        return tpdVar;
    }
}
