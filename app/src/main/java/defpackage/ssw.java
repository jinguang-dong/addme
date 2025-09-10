package defpackage;

import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssw extends tph implements tqs {
    public static final ssw a;
    private static volatile tqy q;
    public int b;
    public int d;
    public int e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public float k;
    public float m;
    public float n;
    public float o;
    public float p;
    public String c = "";
    public tpw l = trb.a;

    static {
        ssw sswVar = new ssw();
        a = sswVar;
        tph.A(ssw.class, sswVar);
    }

    private ssw() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tခ\b\n\u001b\u000bခ\t\fခ\n\rခ\u000b\u000eခ\f", new Object[]{"b", "c", "d", "e", ssj.i, "f", "g", "h", "i", "j", "k", "l", ssv.class, PNlJufQ.uEKtriZ, "n", "o", "p"});
        }
        if (i2 == 3) {
            return new ssw();
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
        tqy tqyVar = q;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (ssw.class) {
            tpdVar = q;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                q = tpdVar;
            }
        }
        return tpdVar;
    }
}
