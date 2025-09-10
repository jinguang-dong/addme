package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suf extends tph implements tqs {
    public static final suf a;
    private static volatile tqy o;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;

    static {
        suf sufVar = new suf();
        a = sufVar;
        tph.A(suf.class, sufVar);
    }

    private suf() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b", new Object[]{"b", zflNUOOzDfM.oEkQ, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new suf();
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
        synchronized (suf.class) {
            tpdVar = o;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                o = tpdVar;
            }
        }
        return tpdVar;
    }
}
