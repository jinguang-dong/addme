package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxo extends tph implements tqs {
    public static final uxo a;
    private static volatile tqy m;
    public int b;
    public int c;
    public long d;
    public uyd g;
    public int h;
    public long i;
    public uxx j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        uxo uxoVar = new uxo();
        a = uxoVar;
        tph.A(uxo.class, uxoVar);
    }

    private uxo() {
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            tpl tplVar = tyy.g;
            return new trc(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", tplVar, "h", tplVar, "i", "j", "k", "d", "e", nWEkBGOQPWQp.oIPr, "g", "l"});
        }
        if (i2 == 3) {
            return new uxo();
        }
        if (i2 == 4) {
            return new tpc(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        tqy tqyVar = m;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (uxo.class) {
            tpdVar = m;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                m = tpdVar;
            }
        }
        return tpdVar;
    }
}
