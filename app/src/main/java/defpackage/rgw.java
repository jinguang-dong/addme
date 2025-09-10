package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgw extends tpf implements tqs {
    public static final rgw a;
    private static volatile tqy e;
    public int b;
    public rhg c;
    public rgg d;
    private tnl f;
    private tua g;
    private rgq h;
    private byte i = 2;

    static {
        rgw rgwVar = new rgw();
        a = rgwVar;
        tph.A(rgw.class, rgwVar);
    }

    private rgw() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0005\u0000\u0001\u0002\u0015\u0005\u0000\u0000\u0004\u0002ဉ\u0001\bᐉ\u0007\u000bᐉ\n\u0013ᐉ\u0011\u0015ᐉ\u0013", new Object[]{JvFFEwFNdCrxf.veJSsLzcTau, "c", "f", "d", "g", "h"});
        }
        if (i2 == 3) {
            return new rgw();
        }
        if (i2 == 4) {
            return new tpe(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = e;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rgw.class) {
            tpdVar = e;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                e = tpdVar;
            }
        }
        return tpdVar;
    }
}
