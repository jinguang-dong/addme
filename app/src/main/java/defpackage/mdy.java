package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.SystemClock;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Phaser;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mdy implements ksc {
    public static final sgv a = sgv.g("mdy");
    public final hbj B;
    public final lat C;
    public final String b;
    public final uem c;
    public final long d;
    public long e;
    public final jje f;
    public final String g;
    public final String h;
    public final hbc m;
    public final Executor o;
    public long r;
    public final boolean s;
    public final Context t;
    public long v;
    public final boolean w;
    public final hgu y;
    private final AtomicInteger D = new AtomicInteger(0);
    public final List i = new ArrayList();
    public long j = 0;
    public boolean k = true;
    public long l = 0;
    public ssc n = ssc.UNKNOWN_MODE;
    public final LinkedHashMap p = new LinkedHashMap();
    public final Phaser q = new Phaser(1);
    private int E = 1;
    public int z = 1;
    public int A = 1;
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final List x = new ArrayList();

    public mdy(jje jjeVar, Context context, long j, String str, String str2, Executor executor, hbc hbcVar, boolean z, uem uemVar, hgu hguVar, lat latVar, String str3, boolean z2, hbj hbjVar) {
        this.v = -1L;
        this.f = jjeVar;
        this.t = context;
        this.d = j;
        this.g = str;
        this.h = str2;
        this.o = executor;
        this.m = hbcVar;
        this.s = z;
        this.c = uemVar;
        this.y = hguVar;
        this.C = latVar;
        this.b = str3;
        this.v = lwp.b(context);
        this.w = z2;
        this.B = hbjVar;
    }

    public static final sot F(int i, int i2) {
        tpc tpcVarM = sot.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sot sotVar = (sot) tphVar;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        sotVar.c = i3;
        sotVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sot sotVar2 = (sot) tpcVarM.b;
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        sotVar2.d = i4;
        sotVar2.b |= 2;
        return (sot) tpcVarM.l();
    }

    public static final int G(ltf ltfVar) {
        ltf ltfVar2 = ltf.UNKNOWN;
        int iOrdinal = ltfVar.ordinal();
        if (iOrdinal == 1) {
            return 13;
        }
        if (iOrdinal == 2) {
            return 14;
        }
        if (iOrdinal != 3) {
            return (iOrdinal == 9 || iOrdinal == 16 || iOrdinal == 28 || iOrdinal == 18 || iOrdinal == 19) ? 16 : 1;
        }
        return 12;
    }

    private static final sub N(PointF pointF) {
        tpc tpcVarM = sub.a.m();
        if (pointF != null) {
            float f = pointF.x;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sub subVar = (sub) tpcVarM.b;
            subVar.b |= 1;
            subVar.c = f;
            float f2 = pointF.y;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sub subVar2 = (sub) tpcVarM.b;
            subVar2.b |= 2;
            subVar2.d = f2;
        }
        return (sub) tpcVarM.l();
    }

    public static void e(int i, String str, long j, sob sobVar) {
        String str2;
        sgt sgtVar = (sgt) a.a(i != 4 ? Level.WARNING : Level.INFO).M(4740);
        int iJ = ske.j(sobVar.c);
        if (iJ == 0) {
            iJ = 1;
        }
        ltf ltfVar = ltf.UNKNOWN;
        int i2 = iJ - 1;
        if (i2 == 0) {
            str2 = "-UNKNOWN";
        } else if (i2 != 1) {
            switch (i2) {
                case 9:
                    str2 = "-API2BETA_HDR_PLUS";
                    break;
                case 10:
                    str2 = "-API2_LEGACY";
                    break;
                case 11:
                    str2 = "-API2_AUTO_HDR_PLUS";
                    break;
                case 12:
                    str2 = "-API2_ZSL";
                    break;
                case 13:
                    str2 = "-API2_HDR_PLUS";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    str2 = "-API2_LIMITED";
                    break;
                case 15:
                    str2 = "-RECORDING";
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
        } else {
            str2 = "-API1_JPEG";
        }
        sgtVar.G("%s%s %d", str, str2, Long.valueOf(j));
    }

    public static final soa s(pka pkaVar) {
        if (pkaVar == null) {
            return soa.UNKNOWN_CAMERA_DIRECTION;
        }
        ltf ltfVar = ltf.UNKNOWN;
        int iOrdinal = pkaVar.ordinal();
        if (iOrdinal == 0) {
            return soa.FRONT;
        }
        if (iOrdinal == 1) {
            return soa.BACK;
        }
        if (iOrdinal == 2) {
            return soa.UNKNOWN_CAMERA_DIRECTION;
        }
        throw new RuntimeException(null, null);
    }

    public final void A(int i) {
        if (i == 3) {
            this.E = 3;
            return;
        }
        int i2 = this.E;
        if (i2 != 1) {
            i = i2;
        }
        this.E = 1;
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.ENTER_STORAGE_PREFERENCE_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = spt.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        spt sptVar = (spt) tpcVarM2.b;
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        }
        sptVar.c = i3;
        sptVar.b |= 1;
        spt sptVar2 = (spt) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sptVar2.getClass();
        sodVar2.ae = sptVar2;
        sodVar2.d |= 16;
        I(tpcVarM);
    }

    public final void B(int i, long j, long j2, int i2, int i3) {
        tpc tpcVarM = sqw.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sqw sqwVar = (sqw) tphVar;
        sqwVar.c = i - 1;
        sqwVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sqw sqwVar2 = (sqw) tphVar2;
        sqwVar2.b |= 2;
        sqwVar2.d = j;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sqw sqwVar3 = (sqw) tphVar3;
        sqwVar3.b |= 4;
        sqwVar3.e = j2;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        sqw sqwVar4 = (sqw) tphVar4;
        sqwVar4.b |= 16;
        sqwVar4.g = i3;
        if (i2 != 0) {
            if (!tphVar4.C()) {
                tpcVarM.o();
            }
            sqw sqwVar5 = (sqw) tpcVarM.b;
            sqwVar5.f = i2 - 1;
            sqwVar5.b |= 8;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.IN_APP_UPDATE_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar5 = tpcVarM2.b;
        sod sodVar = (sod) tphVar5;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar5.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sqw sqwVar6 = (sqw) tpcVarM.l();
        sqwVar6.getClass();
        sodVar2.ah = sqwVar6;
        sodVar2.d |= 128;
        I(tpcVarM2);
    }

    public final void C(niz nizVar, int i, double d) {
        int i2;
        ltf ltfVar = ltf.UNKNOWN;
        int iOrdinal = nizVar.ordinal();
        if (iOrdinal != 2) {
            i2 = 3;
            if (iOrdinal != 3) {
                i2 = iOrdinal != 4 ? 1 : 4;
            }
        } else {
            i2 = 2;
        }
        if (i2 != 1) {
            tpc tpcVarM = sod.a.m();
            soc socVar = soc.MANUAL_FEATURE_ADJUSTED_EVENT;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar = (sod) tpcVarM.b;
            sodVar.f = socVar.aJ;
            sodVar.b |= 1;
            tpc tpcVarM2 = srr.a.m();
            if (!tpcVarM2.b.C()) {
                tpcVarM2.o();
            }
            tph tphVar = tpcVarM2.b;
            srr srrVar = (srr) tphVar;
            srrVar.c = i - 1;
            srrVar.b |= 1;
            if (!tphVar.C()) {
                tpcVarM2.o();
            }
            tph tphVar2 = tpcVarM2.b;
            srr srrVar2 = (srr) tphVar2;
            srrVar2.d = i2 - 1;
            srrVar2.b = 2 | srrVar2.b;
            if (!tphVar2.C()) {
                tpcVarM2.o();
            }
            srr srrVar3 = (srr) tpcVarM2.b;
            srrVar3.b = 4 | srrVar3.b;
            srrVar3.e = d;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sod sodVar2 = (sod) tpcVarM.b;
            srr srrVar4 = (srr) tpcVarM2.l();
            srrVar4.getClass();
            sodVar2.ay = srrVar4;
            sodVar2.d |= 67108864;
            I(tpcVarM);
        }
    }

    public final void D(int i, long j) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.ZOOM_LOCK_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = sul.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sul sulVar = (sul) tphVar;
        sulVar.c = i - 1;
        sulVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sul sulVar2 = (sul) tpcVarM2.b;
        sulVar2.b |= 2;
        sulVar2.d = j;
        sul sulVar3 = (sul) tpcVarM2.l();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sulVar3.getClass();
        sodVar2.ai = sulVar3;
        sodVar2.d |= 256;
        I(tpcVarM);
    }

    public final void E(int i, boolean z) {
        tpc tpcVarM = stg.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        stg stgVar = (stg) tphVar;
        stgVar.c = i - 1;
        stgVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        stg stgVar2 = (stg) tpcVarM.b;
        stgVar2.b |= 2;
        stgVar2.d = z;
        x(8, null, (stg) tpcVarM.l(), null, null, null, null, null);
    }

    public final void H(ssc sscVar, pka pkaVar, pcs pcsVar, float f, boolean z, float f2, suh suhVar, int i, boolean z2) {
        this.j = SystemClock.elapsedRealtime();
        kwp kwpVar = new kwp(sscVar, pkaVar == pka.FRONT);
        kwpVar.k(f);
        kwpVar.m(true != z ? 2 : 4);
        kwpVar.i(f2);
        kwpVar.n(i);
        tpc tpcVar = (tpc) kwpVar.a;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        som somVar = (som) tpcVar.b;
        som somVar2 = som.a;
        suhVar.getClass();
        somVar.L = suhVar;
        somVar.c |= 1024;
        kwpVar.g(z2);
        if (pcsVar != null) {
            kwpVar.e(pcsVar);
        }
        M(kwpVar);
    }

    public final void I(tpc tpcVar) {
        m(new nxi(tpcVar, 1));
    }

    public final void J(int i, pbw pbwVar, String str) {
        int iAx = a.ax(1);
        if (iAx == 0) {
            iAx = 1;
        }
        int iAx2 = a.ax(i - 1);
        if (iAx2 == 0) {
            iAx2 = 3;
        }
        tpc tpcVarM = ssg.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ssg ssgVar = (ssg) tphVar;
        ssgVar.c = iAx2 - 1;
        ssgVar.b |= 1;
        int i2 = pbwVar.t;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        ssg ssgVar2 = (ssg) tphVar2;
        ssgVar2.b |= 2;
        ssgVar2.d = i2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        ssg ssgVar3 = (ssg) tphVar3;
        ssgVar3.f = iAx - 1;
        ssgVar3.b |= 8;
        if (str != null) {
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            ssg ssgVar4 = (ssg) tpcVarM.b;
            ssgVar4.b |= 4;
            ssgVar4.e = str;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.OPEN_DEVICE_RETRY;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        sod sodVar = (sod) tphVar4;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar4.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        ssg ssgVar5 = (ssg) tpcVarM.l();
        ssgVar5.getClass();
        sodVar2.s = ssgVar5;
        sodVar2.b |= 262144;
        I(tpcVarM2);
    }

    public final void K(ssc sscVar) {
        v(sscVar, 2, rvk.a, 0L, 0L);
    }

    public final void L(int i, long j, long j2, float f, boolean z) {
        kwp kwpVar = new kwp(ssc.IMAX_PANO, false);
        kwpVar.k(1.0f);
        tpc tpcVarM = sqv.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sqv sqvVar = (sqv) tphVar;
        sqvVar.c = i - 1;
        sqvVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sqv sqvVar2 = (sqv) tphVar2;
        sqvVar2.b |= 256;
        sqvVar2.g = j;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sqv sqvVar3 = (sqv) tphVar3;
        sqvVar3.b |= 512;
        sqvVar3.h = j2;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        sqv sqvVar4 = (sqv) tphVar4;
        sqvVar4.b |= 64;
        sqvVar4.e = z;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        sqv sqvVar5 = (sqv) tphVar5;
        sqvVar5.f = 2;
        sqvVar5.b |= 128;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        sqv sqvVar6 = (sqv) tpcVarM.b;
        sqvVar6.b |= 32;
        sqvVar6.d = f;
        sqv sqvVar7 = (sqv) tpcVarM.l();
        if (sqvVar7 != null) {
            tpc tpcVar = (tpc) kwpVar.a;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            som somVar = (som) tpcVar.b;
            som somVar2 = som.a;
            somVar.A = sqvVar7;
            somVar.b |= 1073741824;
        }
        M(kwpVar);
    }

    public final void M(kwp kwpVar) {
        this.q.register();
        this.o.execute(new lsn(this, kwpVar, 15, null));
    }

    public final void a(ssc sscVar, sst sstVar, ssw sswVar, stn stnVar, Long l) {
        this.j = SystemClock.elapsedRealtime();
        tpc tpcVarM = sol.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sol solVar = (sol) tphVar;
        solVar.c = sscVar.T;
        solVar.b |= 1;
        if (sstVar != null) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            sol solVar2 = (sol) tpcVarM.b;
            solVar2.d = sstVar;
            solVar2.b |= 4;
        }
        if (sswVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sol solVar3 = (sol) tpcVarM.b;
            solVar3.e = sswVar;
            solVar3.b |= 16;
        }
        if (stnVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sol solVar4 = (sol) tpcVarM.b;
            solVar4.g = stnVar;
            solVar4.b |= 64;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sol solVar5 = (sol) tpcVarM.b;
            solVar5.b |= 32;
            solVar5.f = jLongValue;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CAPTURE_COMPUTE;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sod sodVar = (sod) tphVar2;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sol solVar6 = (sol) tpcVarM.l();
        solVar6.getClass();
        sodVar2.n = solVar6;
        sodVar2.b |= 512;
        I(tpcVarM2);
    }

    public final void b(boolean z, PointF pointF) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.CONTROL_USED;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = sqd.a.m();
        int i = true != z ? 3 : 2;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sqd sqdVar = (sqd) tpcVarM2.b;
        sqdVar.c = i - 1;
        sqdVar.b |= 1;
        sub subVarN = N(pointF);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sqd sqdVar2 = (sqd) tpcVarM2.b;
        subVarN.getClass();
        sqdVar2.d = subVarN;
        sqdVar2.b |= 2;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sqd sqdVar3 = (sqd) tpcVarM2.l();
        sqdVar3.getClass();
        sodVar2.J = sqdVar3;
        sodVar2.c |= 2048;
        I(tpcVarM);
    }

    public final void c(boolean z, PointF pointF, long j, int i, int i2) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.CONTROL_USED;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = sqe.a.m();
        int i3 = true != z ? 3 : 2;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sqe sqeVar = (sqe) tpcVarM2.b;
        sqeVar.c = i3 - 1;
        sqeVar.b |= 1;
        sub subVarN = N(pointF);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sqe sqeVar2 = (sqe) tphVar;
        subVarN.getClass();
        sqeVar2.d = subVarN;
        sqeVar2.b |= 2;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tph tphVar2 = tpcVarM2.b;
        sqe sqeVar3 = (sqe) tphVar2;
        sqeVar3.b |= 4;
        sqeVar3.e = j;
        int iAw = a.aw(i2);
        if (!tphVar2.C()) {
            tpcVarM2.o();
        }
        tph tphVar3 = tpcVarM2.b;
        sqe sqeVar4 = (sqe) tphVar3;
        int i4 = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        sqeVar4.f = i4;
        sqeVar4.b |= 16;
        if (!tphVar3.C()) {
            tpcVarM2.o();
        }
        sqe sqeVar5 = (sqe) tpcVarM2.b;
        sqeVar5.b |= 32;
        sqeVar5.g = i;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sqe sqeVar6 = (sqe) tpcVarM2.l();
        sqeVar6.getClass();
        sodVar2.K = sqeVar6;
        sodVar2.c |= 4096;
        I(tpcVarM);
    }

    public final void d(sqx sqxVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.INFLIGHT_FALLBACK_RESTORED_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sqxVar.getClass();
        sodVar2.Q = sqxVar;
        sodVar2.c |= 262144;
        I(tpcVarM);
    }

    public final void f(stj stjVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.SERENGETI_MODE_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sodVar2.aG = stjVar;
        sodVar2.e |= 4;
        I(tpcVarM);
    }

    public final void g() {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.ADVICE_SHOWN;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = snk.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        snk snkVar = (snk) tpcVarM2.b;
        snkVar.c = 1;
        snkVar.b = 1 | snkVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        snk snkVar2 = (snk) tpcVarM2.l();
        snkVar2.getClass();
        sodVar2.E = snkVar2;
        sodVar2.c |= 8;
        I(tpcVarM);
    }

    public final void h(snz snzVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.BOTTOM_SHEET_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        snzVar.getClass();
        sodVar2.aj = snzVar;
        sodVar2.d |= 512;
        I(tpcVarM);
    }

    public final void i(String str, Object obj, Object obj2) {
        tpc tpcVarM = stb.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        stb stbVar = (stb) tphVar;
        str.getClass();
        stbVar.b |= 2;
        stbVar.d = str;
        if (obj2 instanceof Boolean) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            stb stbVar2 = (stb) tpcVarM.b;
            stbVar2.c = 1;
            stbVar2.b |= 1;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stb stbVar3 = (stb) tpcVarM.b;
            stbVar3.b |= 4;
            stbVar3.e = zBooleanValue;
            boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            stb stbVar4 = (stb) tpcVarM.b;
            stbVar4.b |= 8;
            stbVar4.f = zBooleanValue2;
        } else if (obj2 instanceof String) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            tph tphVar2 = tpcVarM.b;
            stb stbVar5 = (stb) tphVar2;
            stbVar5.c = 2;
            stbVar5.b |= 1;
            String str2 = (String) obj;
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            tph tphVar3 = tpcVarM.b;
            stb stbVar6 = (stb) tphVar3;
            str2.getClass();
            stbVar6.b |= 16;
            stbVar6.g = str2;
            String str3 = (String) obj2;
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            stb stbVar7 = (stb) tpcVarM.b;
            str3.getClass();
            stbVar7.b |= 32;
            stbVar7.h = str3;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.PREFERENCE_CHANGE_EVENT;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar4 = tpcVarM2.b;
        sod sodVar = (sod) tphVar4;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar4.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        stb stbVar8 = (stb) tpcVarM.l();
        stbVar8.getClass();
        sodVar2.F = stbVar8;
        sodVar2.c |= 16;
        I(tpcVarM2);
    }

    public final void j(srl srlVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.LENS_SUGGESTION_CHIP_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        srlVar.getClass();
        sodVar2.ao = srlVar;
        sodVar2.d |= 16384;
        I(tpcVarM);
    }

    public final void k(List list) {
        if (list.isEmpty()) {
            return;
        }
        tpc tpcVarM = sod.a.m();
        long j = this.e;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.b |= 134217728;
        sodVar.y = j;
        soc socVar = soc.TAXI_STATE_CHANGE_EVENTS;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sod sodVar2 = (sod) tphVar2;
        sodVar2.f = socVar.aJ;
        sodVar2.b |= 1;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sod sodVar3 = (sod) tpcVarM.b;
        tpw tpwVar = sodVar3.ar;
        if (!tpwVar.c()) {
            sodVar3.ar = tph.v(tpwVar);
        }
        tnq.e(list, sodVar3.ar);
        I(tpcVarM);
    }

    public final void l(stw stwVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.THERMAL_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        stwVar.getClass();
        sodVar2.G = stwVar;
        sodVar2.c |= 256;
        I(tpcVarM);
    }

    public final void m(rww rwwVar) {
        n(ske.Q(new dyo(rwwVar, 18), this.o));
    }

    public final void n(syu syuVar) {
        final ssc sscVar = this.n;
        final long j = this.e;
        final int andIncrement = this.D.getAndIncrement();
        this.q.register();
        ojl.ck(syuVar, new paf() { // from class: mdu
            /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
            @Override // defpackage.paf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(java.lang.Object r9) {
                /*
                    Method dump skipped, instructions count: 367
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.mdu.a(java.lang.Object):void");
            }
        }, this.o);
    }

    public final void o(sta staVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.PORTRAIT_SEGMENTER_INIT_FAILURE;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        staVar.getClass();
        sodVar2.T = staVar;
        sodVar2.c |= 8388608;
        I(tpcVarM);
    }

    public final void p(sts stsVar) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.STATS_3A_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sod sodVar = (sod) tphVar;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        stsVar.getClass();
        sodVar2.af = stsVar;
        sodVar2.d |= 32;
        I(tpcVarM);
    }

    public final void q(sti stiVar) {
        kwp kwpVar = new kwp(ssc.SERENGETI, false);
        kwpVar.k(1.0f);
        kwpVar.j(stiVar);
        M(kwpVar);
    }

    public final void r(int i, float f, float f2, pka pkaVar) {
        int i2;
        tpc tpcVarM = suk.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        suk sukVar = (suk) tphVar;
        sukVar.b |= 1;
        sukVar.c = f;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        suk sukVar2 = (suk) tpcVarM.b;
        sukVar2.b |= 2;
        sukVar2.d = f2;
        soa soaVarS = s(pkaVar);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        suk sukVar3 = (suk) tpcVarM.b;
        sukVar3.e = soaVarS.d;
        sukVar3.b |= 4;
        suk sukVar4 = (suk) tpcVarM.l();
        ltf ltfVar = ltf.UNKNOWN;
        switch (i - 1) {
            case 1:
                i2 = 9;
                break;
            case 2:
                i2 = 10;
                break;
            case 3:
                i2 = 13;
                break;
            case 4:
                i2 = 14;
                break;
            case 5:
                i2 = 15;
                break;
            case 6:
                i2 = 16;
                break;
            case 7:
                i2 = 17;
                break;
            case 8:
                i2 = 18;
                break;
            case 9:
                i2 = 19;
                break;
            case 10:
                i2 = 20;
                break;
            default:
                i2 = 24;
                break;
        }
        x(i2, null, null, null, sukVar4, null, null, null);
    }

    public final void t(int i, String str, Throwable th, int i2, int i3, int i4, List list, List list2, pbw pbwVar, boolean z) {
        tpc tpcVarM = soe.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        soe soeVar = (soe) tphVar;
        soeVar.c = i - 1;
        soeVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        soe soeVar2 = (soe) tphVar2;
        soeVar2.b |= 64;
        soeVar2.h = i4;
        String str2 = this.h;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        soe soeVar3 = (soe) tphVar3;
        str2.getClass();
        soeVar3.b |= 4;
        soeVar3.e = str2;
        if (str != null) {
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            soe soeVar4 = (soe) tpcVarM.b;
            soeVar4.b |= 2;
            soeVar4.d = str;
        }
        if (i2 != -1) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            soe soeVar5 = (soe) tpcVarM.b;
            soeVar5.b |= 8;
            soeVar5.f = i2;
        }
        if (i3 != -1) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            soe soeVar6 = (soe) tpcVarM.b;
            soeVar6.b |= 16;
            soeVar6.g = i3;
        }
        if (th != null) {
            tpc tpcVarM2 = src.a.m();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                tpc tpcVarM3 = srd.a.m();
                String simpleName = cause.getClass().getSimpleName();
                if (!tpcVarM3.b.C()) {
                    tpcVarM3.o();
                }
                srd srdVar = (srd) tpcVarM3.b;
                simpleName.getClass();
                srdVar.b |= 1;
                srdVar.c = simpleName;
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    tpc tpcVarM4 = sre.a.m();
                    String className = stackTraceElement.getClassName();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    sre sreVar = (sre) tpcVarM4.b;
                    className.getClass();
                    sreVar.b |= 1;
                    sreVar.c = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    sre sreVar2 = (sre) tpcVarM4.b;
                    methodName.getClass();
                    sreVar2.b |= 2;
                    sreVar2.d = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!tpcVarM4.b.C()) {
                        tpcVarM4.o();
                    }
                    sre sreVar3 = (sre) tpcVarM4.b;
                    sreVar3.b |= 8;
                    sreVar3.f = lineNumber;
                    String fileName = stackTraceElement.getFileName();
                    if (fileName != null) {
                        if (!tpcVarM4.b.C()) {
                            tpcVarM4.o();
                        }
                        sre sreVar4 = (sre) tpcVarM4.b;
                        sreVar4.b |= 4;
                        sreVar4.e = fileName;
                    }
                    if (!tpcVarM3.b.C()) {
                        tpcVarM3.o();
                    }
                    srd srdVar2 = (srd) tpcVarM3.b;
                    sre sreVar5 = (sre) tpcVarM4.l();
                    sreVar5.getClass();
                    tpw tpwVar = srdVar2.d;
                    if (!tpwVar.c()) {
                        srdVar2.d = tph.v(tpwVar);
                    }
                    srdVar2.d.add(sreVar5);
                }
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                src srcVar = (src) tpcVarM2.b;
                srd srdVar3 = (srd) tpcVarM3.l();
                srdVar3.getClass();
                tpw tpwVar2 = srcVar.b;
                if (!tpwVar2.c()) {
                    srcVar.b = tph.v(tpwVar2);
                }
                srcVar.b.add(srdVar3);
            }
            src srcVar2 = (src) tpcVarM2.l();
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            soe soeVar7 = (soe) tpcVarM.b;
            srcVar2.getClass();
            soeVar7.i = srcVar2;
            soeVar7.b |= 128;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(s((pka) it.next()));
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soe soeVar8 = (soe) tpcVarM.b;
        tpn tpnVar = soeVar8.j;
        if (!tpnVar.c()) {
            soeVar8.j = tph.t(tpnVar);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            soeVar8.j.g(((soa) it2.next()).d);
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        soe soeVar9 = (soe) tpcVarM.b;
        tpw tpwVar3 = soeVar9.m;
        if (!tpwVar3.c()) {
            soeVar9.m = tph.v(tpwVar3);
        }
        tnq.e(list2, soeVar9.m);
        if (pbwVar != pbw.CAMERA_ERROR_CODE_UNKNOWN) {
            int i5 = pbwVar.t;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            soe soeVar10 = (soe) tpcVarM.b;
            soeVar10.b |= 256;
            soeVar10.k = i5;
        }
        if (i == 3) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            soe soeVar11 = (soe) tpcVarM.b;
            soeVar11.b |= 512;
            soeVar11.l = z;
        }
        tpc tpcVarM5 = sod.a.m();
        soc socVar = soc.CAMERA_FAILURE;
        if (!tpcVarM5.b.C()) {
            tpcVarM5.o();
        }
        tph tphVar4 = tpcVarM5.b;
        sod sodVar = (sod) tphVar4;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar4.C()) {
            tpcVarM5.o();
        }
        sod sodVar2 = (sod) tpcVarM5.b;
        soe soeVar12 = (soe) tpcVarM.l();
        soeVar12.getClass();
        sodVar2.l = soeVar12;
        sodVar2.b |= 128;
        I(tpcVarM5);
    }

    public final void u(int i, int i2, int i3, pka pkaVar, int i4) {
        tpc tpcVarM = sog.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sog sogVar = (sog) tphVar;
        sogVar.c = i - 1;
        sogVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sog sogVar2 = (sog) tphVar2;
        sogVar2.d = i2 - 1;
        sogVar2.b |= 2;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        sog sogVar3 = (sog) tpcVarM.b;
        sogVar3.e = i3 - 1;
        sogVar3.b |= 4;
        if (pkaVar != null) {
            soa soaVarS = s(pkaVar);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sog sogVar4 = (sog) tpcVarM.b;
            sogVar4.f = soaVarS.d;
            sogVar4.b |= 8;
        }
        if (i4 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sog sogVar5 = (sog) tpcVarM.b;
            sogVar5.g = i4 - 1;
            sogVar5.b |= 16;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CAMERA_FATAL_ERROR_DIALOG;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar = (sod) tpcVarM2.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        sog sogVar6 = (sog) tpcVarM.l();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sogVar6.getClass();
        sodVar2.aa = sogVar6;
        sodVar2.d |= 1;
        I(tpcVarM2);
    }

    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, syu] */
    public final void v(ssc sscVar, int i, rwc rwcVar, long j, long j2) {
        ssc sscVar2;
        tpc tpcVarM = ssd.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        ssd ssdVar = (ssd) tphVar;
        ssdVar.d = sscVar.T;
        int i2 = 2;
        ssdVar.b |= 2;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        ssd ssdVar2 = (ssd) tphVar2;
        ssdVar2.e = i - 1;
        ssdVar2.b |= 4;
        ssc sscVar3 = this.n;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        ssd ssdVar3 = (ssd) tphVar3;
        ssdVar3.c = sscVar3.T;
        ssdVar3.b |= 1;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        ssd ssdVar4 = (ssd) tphVar4;
        ssdVar4.b |= 16;
        ssdVar4.g = j;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        ssd ssdVar5 = (ssd) tpcVarM.b;
        ssdVar5.b |= 32;
        ssdVar5.h = j2;
        if (sscVar == ssc.FILMSTRIP && this.j != 0 && ((sscVar2 = this.n) == ssc.HDR_PLUS || sscVar2 == ssc.PHOTO_SPHERE || sscVar2 == ssc.PHOTO_CAPTURE || sscVar2 == ssc.VIDEO_CAPTURE || sscVar2 == ssc.PANORAMA)) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.j;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            float fAV = ojl.aV(jElapsedRealtime);
            ssd ssdVar6 = (ssd) tpcVarM.b;
            ssdVar6.b |= 8;
            ssdVar6.f = fAV;
        }
        ssc sscVar4 = this.n;
        if (sscVar4 != ssc.UNKNOWN_MODE && sscVar != ssc.MORE_MODES && sscVar4 != sscVar) {
            n(swz.i(swf.i(rwcVar.h() ? swz.i(rwcVar.c(), new mdv(0), sxo.a) : ske.M(rvk.a), Throwable.class, new mdv(i2), sxo.a), new kve(tpcVarM, 5), this.o));
        }
        this.j = 0L;
        this.n = sscVar;
    }

    @Override // defpackage.ksc
    public final void w(ksa ksaVar, krs krsVar, int i) {
        int i2;
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.OPTIONBAR_OPTION_CHANGE_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = ssk.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        ssk sskVar = (ssk) tpcVarM2.b;
        sskVar.d = i - 1;
        sskVar.b |= 2;
        ssi ssiVar = (ssi) Map.EL.getOrDefault(mdt.a.b, ksaVar, ssi.UNKNOWN);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        ssk sskVar2 = (ssk) tpcVarM2.b;
        sskVar2.c = ssiVar.bc;
        sskVar2.b |= 1;
        switch (krsVar.ordinal()) {
            case 0:
                i2 = 31;
                break;
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 5;
                break;
            case 3:
                i2 = 6;
                break;
            case 4:
                i2 = 42;
                break;
            case 5:
                i2 = 7;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 9;
                break;
            case 8:
                i2 = 10;
                break;
            case 9:
                i2 = 11;
                break;
            case 10:
                i2 = 35;
                break;
            case 11:
                i2 = 36;
                break;
            case 12:
                i2 = 32;
                break;
            case 13:
                i2 = 13;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i2 = 34;
                break;
            case 15:
                i2 = 14;
                break;
            case 16:
                i2 = 15;
                break;
            case 17:
                i2 = 17;
                break;
            case 18:
                i2 = 43;
                break;
            case 19:
                i2 = 19;
                break;
            case 20:
                i2 = 20;
                break;
            case 21:
                i2 = 21;
                break;
            case ImageFormat.RGBA_FP16 /* 22 */:
                i2 = 33;
                break;
            case 23:
                i2 = 18;
                break;
            case 24:
                i2 = 40;
                break;
            case 25:
                i2 = 41;
                break;
            case 26:
                i2 = 22;
                break;
            case 27:
                i2 = 23;
                break;
            case 28:
                i2 = 24;
                break;
            case 29:
                i2 = 25;
                break;
            case 30:
                i2 = 26;
                break;
            case 31:
                i2 = 27;
                break;
            case 32:
                i2 = 28;
                break;
            case 33:
                i2 = 29;
                break;
            case 34:
                i2 = 30;
                break;
            case ImageFormat.YUV_420_888 /* 35 */:
                i2 = 37;
                break;
            case 36:
                i2 = 38;
                break;
            case 37:
                i2 = 39;
                break;
            default:
                throw new RuntimeException(null, null);
        }
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        ssk sskVar3 = (ssk) tpcVarM2.b;
        sskVar3.e = i2 - 1;
        sskVar3.b |= 4;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        ssk sskVar4 = (ssk) tpcVarM2.l();
        sskVar4.getClass();
        sodVar2.R = sskVar4;
        sodVar2.c |= ImageMetadata.LENS_APERTURE;
        I(tpcVarM);
    }

    public final void x(int i, stu stuVar, stg stgVar, snq snqVar, suk sukVar, spq spqVar, ssl sslVar, ssn ssnVar) {
        tpc tpcVarM = sox.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sox soxVar = (sox) tphVar;
        soxVar.c = i - 1;
        soxVar.b |= 1;
        ssc sscVar = this.n;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sox soxVar2 = (sox) tphVar2;
        soxVar2.d = sscVar.T;
        soxVar2.b |= 2;
        if (stuVar != null) {
            if (!tphVar2.C()) {
                tpcVarM.o();
            }
            sox soxVar3 = (sox) tpcVarM.b;
            soxVar3.e = stuVar;
            soxVar3.b |= 8;
        }
        if (stgVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar4 = (sox) tpcVarM.b;
            soxVar4.f = stgVar;
            soxVar4.b |= 16;
        }
        if (snqVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar5 = (sox) tpcVarM.b;
            soxVar5.g = snqVar;
            soxVar5.b |= 32;
        }
        if (sukVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar6 = (sox) tpcVarM.b;
            soxVar6.h = sukVar;
            soxVar6.b |= 64;
        }
        if (spqVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar7 = (sox) tpcVarM.b;
            soxVar7.i = spqVar;
            soxVar7.b |= 128;
        }
        if (sslVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar8 = (sox) tpcVarM.b;
            soxVar8.k = sslVar;
            soxVar8.b |= 512;
        }
        if (ssnVar != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sox soxVar9 = (sox) tpcVarM.b;
            soxVar9.j = ssnVar;
            soxVar9.b |= 256;
        }
        tpc tpcVarM2 = sod.a.m();
        soc socVar = soc.CONTROL_USED;
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar3 = tpcVarM2.b;
        sod sodVar = (sod) tphVar3;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        if (!tphVar3.C()) {
            tpcVarM2.o();
        }
        sod sodVar2 = (sod) tpcVarM2.b;
        sox soxVar10 = (sox) tpcVarM.l();
        soxVar10.getClass();
        sodVar2.m = soxVar10;
        sodVar2.b |= 256;
        I(tpcVarM2);
    }

    public final void y(int i, float f) {
        tpc tpcVarM = spq.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        spq spqVar = (spq) tphVar;
        spqVar.c = i - 1;
        spqVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        spq spqVar2 = (spq) tpcVarM.b;
        spqVar2.b |= 2;
        spqVar2.d = f;
        x(9, null, null, null, null, (spq) tpcVarM.l(), null, null);
    }

    public final void z(int i, String str) {
        tpc tpcVarM = sod.a.m();
        soc socVar = soc.CAMERA_SMARTS_EVENT;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar = (sod) tpcVarM.b;
        sodVar.f = socVar.aJ;
        sodVar.b |= 1;
        tpc tpcVarM2 = sok.a.m();
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        sok sokVar = (sok) tphVar;
        sokVar.c = i - 1;
        sokVar.b |= 1;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        sok sokVar2 = (sok) tpcVarM2.b;
        str.getClass();
        sokVar2.b |= 2;
        sokVar2.d = str;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sod sodVar2 = (sod) tpcVarM.b;
        sok sokVar3 = (sok) tpcVarM2.l();
        sokVar3.getClass();
        sodVar2.N = sokVar3;
        sodVar2.c |= 32768;
        I(tpcVarM);
    }
}
