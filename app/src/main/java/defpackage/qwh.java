package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwh extends tph implements tqs {
    public static final qwh a;
    public static final tql j;
    private static volatile tqy k;
    public int b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public tpn g;
    public boolean h;
    public tpw i;

    static {
        qwh qwhVar = new qwh();
        a = qwhVar;
        tph.A(qwh.class, qwhVar);
        j = tph.E(qwa.a, qwhVar, qwhVar, 334728578, Ctry.MESSAGE);
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006'\u0007ဇ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new qwh();
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
        tqy tqyVar = k;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (qwh.class) {
            tpdVar = k;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                k = tpdVar;
            }
        }
        return tpdVar;
    }

    private qwh() {
        String str = IQwwK.QvHgJsag;
        this.c = str;
        this.e = str;
        this.f = str;
        this.g = tpi.a;
        this.i = trb.a;
    }
}
