package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ssd extends tph implements tqs {
    public static final ssd a;
    private static volatile tqy i;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public long g;
    public long h;

    static {
        ssd ssdVar = new ssd();
        a = ssdVar;
        tph.A(ssd.class, ssdVar);
    }

    private ssd() {
    }

    @Override // defpackage.tph
    public final Object a(int i2, Object obj) {
        tqy tpdVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            tpl tplVar = rgk.k;
            return new trc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", tplVar, "d", tplVar, "e", sri.r, "f", "g", LmJPKwPBa.VxS});
        }
        if (i3 == 3) {
            return new ssd();
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
        synchronized (ssd.class) {
            tpdVar = i;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                i = tpdVar;
            }
        }
        return tpdVar;
    }
}
