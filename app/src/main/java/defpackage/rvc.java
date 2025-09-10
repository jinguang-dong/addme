package defpackage;

import com.google.android.material.button.xlT.JvFFEwFNdCrxf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rvc extends tph implements tqs {
    public static final rvc a;
    private static volatile tqy t;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public tpm g = tpa.a;
    public float h;
    public int i;
    public int j;
    public float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;

    static {
        rvc rvcVar = new rvc();
        a = rvcVar;
        tph.A(rvc.class, rvcVar);
    }

    private rvc() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0001\u0000\u0001\u000f\u0002\u0007\u0003\u000b\u0004\f\u0005\u0007\u0006$\u0007\u0001\b\f\t\f\n\u0001\u000b\u000f\f\u000f\r\u000f\u000e\u000f\u000f\u000f\u0010\u000f\u0011\u000f\u0012\u000f", new Object[]{"b", "c", "d", "e", "f", JvFFEwFNdCrxf.aCixmb, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s"});
        }
        if (i2 == 3) {
            return new rvc();
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
        tqy tqyVar = t;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (rvc.class) {
            tpdVar = t;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                t = tpdVar;
            }
        }
        return tpdVar;
    }
}
