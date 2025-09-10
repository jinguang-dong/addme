package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sts extends tph implements tqs {
    public static final sts a;
    private static volatile tqy b;
    private int c;
    private int d;
    private int e;
    private stq f;

    static {
        sts stsVar = new sts();
        a = stsVar;
        tph.A(sts.class, stsVar);
    }

    private sts() {
    }

    public static /* synthetic */ void b(sts stsVar, stq stqVar) {
        stqVar.getClass();
        stsVar.f = stqVar;
        stsVar.c |= 4;
    }

    public static /* synthetic */ void c(sts stsVar, int i) {
        stsVar.d = i - 1;
        stsVar.c |= 1;
    }

    public static /* synthetic */ void d(sts stsVar, int i) {
        stsVar.e = i - 1;
        stsVar.c |= 2;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{JvFFEwFNdCrxf.OZTWryWowvIHjqu, "d", str.a, "e", str.c, "f"});
        }
        if (i2 == 3) {
            return new sts();
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
        synchronized (sts.class) {
            tpdVar = b;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                b = tpdVar;
            }
        }
        return tpdVar;
    }
}
