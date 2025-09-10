package defpackage;

import com.google.android.apps.camera.jni.facebeautification.GFS.CZAHo;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snh extends tph implements tqs {
    public static final snh a;
    private static volatile tqy v;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public snf h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public sng q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private boolean w;

    static {
        snh snhVar = new snh();
        a = snhVar;
        tph.A(snh.class, snhVar);
    }

    private snh() {
    }

    public static /* synthetic */ void b(snh snhVar) {
        snhVar.b |= 2097152;
        snhVar.w = true;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new trc(a, "\u0004\u0014\u0000\u0001\u0002\u0016\u0014\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"b", "c", "d", "e", "f", mNLbzhCxd.TOYvtE, snl.b, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", CZAHo.KrwVGJez});
        }
        if (i2 == 3) {
            return new snh();
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
        tqy tqyVar = v;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (snh.class) {
            tpdVar = v;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                v = tpdVar;
            }
        }
        return tpdVar;
    }
}
