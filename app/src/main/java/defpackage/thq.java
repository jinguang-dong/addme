package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thq extends tph implements tqs {
    private static volatile tqy M;
    public static final thq a;
    public tho A;
    public thf B;
    public thm C;
    public thk D;
    public thh E;
    public thn F;
    public tpn G;
    public int H;
    public int I;
    public thg J;
    public thd K;
    public boolean L;
    private int N;
    private int O;
    public the b;
    public int c = -1;
    public int d = -1;
    public tpm e;
    public tpj f;
    public int g;
    public boolean h;
    public int i;
    public long j;
    public long k;
    public long l;
    public int m;
    public thp n;
    public int o;
    public int p;
    public boolean q;
    public thi r;
    public thl s;
    public boolean t;
    public float u;
    public ttj v;
    public float w;
    public float x;
    public float y;
    public tpm z;

    static {
        thq thqVar = new thq();
        a = thqVar;
        tph.A(thq.class, thqVar);
    }

    private thq() {
        tpa tpaVar = tpa.a;
        this.e = tpaVar;
        this.f = toa.a;
        this.i = -1;
        this.m = -1;
        this.o = 1;
        this.p = 1;
        this.u = 1.0f;
        this.x = -1.0f;
        this.y = -1.0f;
        this.z = tpaVar;
        this.G = tpi.a;
        trb trbVar = trb.a;
    }

    @Override // defpackage.tph
    public final Object a(int i, Object obj) {
        tqy tpdVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tpl tplVar = svp.j;
            String str = clFzVRcygwbq.SYjiuEL;
            tpl tplVar2 = svp.g;
            return new trc(a, "\u0004%\u0000\u0002\u0001A%\u0000\u0004\u0000\u0001ဉ\u0002\u0002င\u0003\u0003င\u0004\u0004\u0013\u0005\u0019\u0006᠌\u0006\u0007ဇ\u0007\bင\b\tဂ\t\nဂ\n\u000bဂ\u000b\fင\f\rဉ\r\u000e᠌\u000f\u000fဇ\u0013\u0010ခ\u0014\u0011ဉ\u0015\u0012ခ\u0016\u0013ခ\u0017\u0014ခ\u0019\u0015\u0013\u0016ဉ\u001a\u0017ဉ\u001b\u0018ဉ\u001c\u0019ဉ\u001d\u001aဉ\u001e\u001bဉ\u001f\u001c' ဉ\u0011\"᠌%'ဉ\u0012+᠌\u000e,ဇ\u00101᠌ :ဉ3>ဉ6Aဇ7", new Object[]{"N", "O", "b", "c", "d", "e", "f", "g", tplVar, "h", "i", "j", "k", "l", "m", str, "p", tplVar2, "t", "u", "v", "w", "x", zflNUOOzDfM.WBHqv, "z", "A", "B", "C", "D", nWEkBGOQPWQp.qohegJGAzGhYUmO, "F", "G", "r", "I", svp.i, "s", "o", tplVar2, "q", "H", svp.h, "J", "K", "L"});
        }
        if (i2 == 3) {
            return new thq();
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
        tqy tqyVar = M;
        if (tqyVar != null) {
            return tqyVar;
        }
        synchronized (thq.class) {
            tpdVar = M;
            if (tpdVar == null) {
                tpdVar = new tpd(a);
                M = tpdVar;
            }
        }
        return tpdVar;
    }
}
