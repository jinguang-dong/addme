package defpackage;

import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import com.google.android.apps.camera.ui.hotshot.yElM.PNlJufQ;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sqj extends tph implements tqs {
    public static final sqj a;
    private static volatile tqy n;
    public int b;
    public int c;
    public int d;
    public String e = "";
    public boolean f;
    public boolean g;
    public boolean h;
    public long i;
    public int j;
    public snm k;
    public long l;
    public boolean m;

    static {
        sqj sqjVar = new sqj();
        a = sqjVar;
        tph.A(sqj.class, sqjVar);
    }

    private sqj() {
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0006᠌\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဂ\n\f᠌\u000b\rဉ\f\u000eဃ\r\u000fဇ\u000e", new Object[]{PNlJufQ.PMHmjtCc, "c", rgk.i, "d", rgk.k, "e", "f", "g", "h", "i", "j", rgk.j, "k", "l", mPfBwqXsnpXI.huDKsjWFCMnNy});
        }
        if (i2 == 3) {
            return new sqj();
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
        tqy tqyVar = n;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (sqj.class) {
            tpdVar = n;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                n = tpdVar;
            }
        }
        return tpdVar;
    }
}
