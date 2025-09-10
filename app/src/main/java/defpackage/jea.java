package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.jni.gxp.Caan.yoGAhrpjU;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jea {
    public static jfh a;

    public static oxj A(gnt gntVar, hbj hbjVar, gtm gtmVar, qqq qqqVar) {
        return hbjVar.p(haf.b) ? qqqVar.D(gntVar.a()) : gtmVar.l(gntVar.a());
    }

    private static int B(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 4 : 5;
        }
        return 2;
    }

    private static int C(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 5;
        }
        return 4;
    }

    private static int D(int i) {
        return i + (-1) != 1 ? 3 : 2;
    }

    private static int E(int i) {
        switch (i - 1) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 1;
        }
    }

    public static Executor a() {
        return new ouy(ojl.bZ("MotionBlurProc"));
    }

    public static void b(hbj hbjVar) {
        if (hbjVar.p(gyp.b)) {
            hbjVar.p(hab.d);
        }
    }

    public static final jae c(hkk hkkVar, izm izmVar) {
        return new jae(izmVar, hkkVar);
    }

    public static boolean f(lcz lczVar, Map map, Map map2, pfu pfuVar, Set set) {
        return g(lczVar, sfd.a, map, map2, pfuVar, set);
    }

    public static boolean g(lcz lczVar, scn scnVar, Map map, Map map2, pfu pfuVar, Set set) {
        if (!map2.containsKey(lczVar)) {
            return false;
        }
        Stream stream = Collection.EL.stream(scnVar);
        map2.getClass();
        if (!stream.allMatch(new fme(map2, 20))) {
            return false;
        }
        scl sclVar = new scl();
        peo peoVar = (peo) map2.get(lczVar);
        peoVar.getClass();
        sclVar.d(peoVar);
        Iterable$EL.forEach(scnVar, new fxu(sclVar, map2, 17));
        map.put(lczVar, pfuVar.g(sclVar.g(), set));
        return true;
    }

    public static final sqs h(thq thqVar, int i, int i2, int i3, int i4) {
        tpc tpcVarM = sqs.a.m();
        the theVar = thqVar.b;
        if (theVar == null) {
            theVar = the.a;
        }
        float f = theVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        sqs sqsVar = (sqs) tphVar;
        sqsVar.b |= 2;
        sqsVar.f = f;
        float f2 = theVar.c;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        sqs sqsVar2 = (sqs) tphVar2;
        sqsVar2.b |= 4;
        sqsVar2.g = f2;
        float f3 = theVar.d;
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        sqs sqsVar3 = (sqs) tphVar3;
        sqsVar3.b |= 16;
        sqsVar3.h = f3;
        float f4 = theVar.e;
        if (!tphVar3.C()) {
            tpcVarM.o();
        }
        tph tphVar4 = tpcVarM.b;
        sqs sqsVar4 = (sqs) tphVar4;
        sqsVar4.b |= 32;
        sqsVar4.i = f4;
        float f5 = theVar.f;
        if (!tphVar4.C()) {
            tpcVarM.o();
        }
        tph tphVar5 = tpcVarM.b;
        sqs sqsVar5 = (sqs) tphVar5;
        sqsVar5.b |= 536870912;
        sqsVar5.C = f5;
        float f6 = theVar.g;
        if (!tphVar5.C()) {
            tpcVarM.o();
        }
        tph tphVar6 = tpcVarM.b;
        sqs sqsVar6 = (sqs) tphVar6;
        sqsVar6.b |= 1073741824;
        sqsVar6.D = f6;
        float f7 = theVar.h;
        if (!tphVar6.C()) {
            tpcVarM.o();
        }
        tph tphVar7 = tpcVarM.b;
        sqs sqsVar7 = (sqs) tphVar7;
        sqsVar7.b |= 128;
        sqsVar7.j = f7;
        float f8 = theVar.i;
        if (!tphVar7.C()) {
            tpcVarM.o();
        }
        tph tphVar8 = tpcVarM.b;
        sqs sqsVar8 = (sqs) tphVar8;
        sqsVar8.b |= 256;
        sqsVar8.k = f8;
        float f9 = theVar.j;
        if (!tphVar8.C()) {
            tpcVarM.o();
        }
        tph tphVar9 = tpcVarM.b;
        sqs sqsVar9 = (sqs) tphVar9;
        sqsVar9.b |= 512;
        sqsVar9.l = f9;
        float f10 = theVar.k;
        if (!tphVar9.C()) {
            tpcVarM.o();
        }
        tph tphVar10 = tpcVarM.b;
        sqs sqsVar10 = (sqs) tphVar10;
        sqsVar10.d |= 32768;
        sqsVar10.au = f10;
        float f11 = theVar.l;
        if (!tphVar10.C()) {
            tpcVarM.o();
        }
        sqs sqsVar11 = (sqs) tpcVarM.b;
        sqsVar11.d |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        sqsVar11.av = f11;
        thp thpVar = thqVar.n;
        if (thpVar == null) {
            thpVar = thp.a;
        }
        float f12 = thpVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar11 = tpcVarM.b;
        sqs sqsVar12 = (sqs) tphVar11;
        sqsVar12.b |= 32768;
        sqsVar12.q = f12;
        float f13 = thpVar.c;
        if (!tphVar11.C()) {
            tpcVarM.o();
        }
        tph tphVar12 = tpcVarM.b;
        sqs sqsVar13 = (sqs) tphVar12;
        sqsVar13.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        sqsVar13.r = f13;
        float f14 = thpVar.d;
        if (!tphVar12.C()) {
            tpcVarM.o();
        }
        tph tphVar13 = tpcVarM.b;
        sqs sqsVar14 = (sqs) tphVar13;
        sqsVar14.b |= ImageMetadata.LENS_APERTURE;
        sqsVar14.v = f14;
        float f15 = thpVar.e;
        if (!tphVar13.C()) {
            tpcVarM.o();
        }
        tph tphVar14 = tpcVarM.b;
        sqs sqsVar15 = (sqs) tphVar14;
        sqsVar15.b |= ImageMetadata.SHADING_MODE;
        sqsVar15.w = f15;
        float f16 = thpVar.f;
        if (!tphVar14.C()) {
            tpcVarM.o();
        }
        tph tphVar15 = tpcVarM.b;
        sqs sqsVar16 = (sqs) tphVar15;
        sqsVar16.b |= 2097152;
        sqsVar16.x = f16;
        float f17 = thpVar.g;
        if (!tphVar15.C()) {
            tpcVarM.o();
        }
        tph tphVar16 = tpcVarM.b;
        sqs sqsVar17 = (sqs) tphVar16;
        sqsVar17.b |= 4194304;
        sqsVar17.y = f17;
        float f18 = thpVar.h;
        if (!tphVar16.C()) {
            tpcVarM.o();
        }
        tph tphVar17 = tpcVarM.b;
        sqs sqsVar18 = (sqs) tphVar17;
        sqsVar18.b |= 8388608;
        sqsVar18.z = f18;
        float f19 = thpVar.i;
        if (!tphVar17.C()) {
            tpcVarM.o();
        }
        tph tphVar18 = tpcVarM.b;
        sqs sqsVar19 = (sqs) tphVar18;
        sqsVar19.b |= 16777216;
        sqsVar19.A = f19;
        float f20 = thpVar.j;
        if (!tphVar18.C()) {
            tpcVarM.o();
        }
        sqs sqsVar20 = (sqs) tpcVarM.b;
        sqsVar20.d |= ImageMetadata.LENS_APERTURE;
        sqsVar20.az = f20;
        thi thiVar = thqVar.r;
        if (thiVar == null) {
            thiVar = thi.a;
        }
        boolean z = thiVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar19 = tpcVarM.b;
        sqs sqsVar21 = (sqs) tphVar19;
        sqsVar21.d |= 131072;
        sqsVar21.ax = z;
        boolean z2 = thiVar.c;
        if (!tphVar19.C()) {
            tpcVarM.o();
        }
        sqs sqsVar22 = (sqs) tpcVarM.b;
        sqsVar22.d |= 262144;
        sqsVar22.ay = z2;
        thl thlVar = thqVar.s;
        if (thlVar == null) {
            thlVar = thl.a;
        }
        boolean z3 = thlVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar20 = tpcVarM.b;
        sqs sqsVar23 = (sqs) tphVar20;
        sqsVar23.d |= 4194304;
        sqsVar23.aC = z3;
        int i5 = thlVar.c;
        if (!tphVar20.C()) {
            tpcVarM.o();
        }
        tph tphVar21 = tpcVarM.b;
        sqs sqsVar24 = (sqs) tphVar21;
        sqsVar24.d |= 8388608;
        sqsVar24.aD = i5;
        boolean z4 = thlVar.d;
        if (!tphVar21.C()) {
            tpcVarM.o();
        }
        tph tphVar22 = tpcVarM.b;
        sqs sqsVar25 = (sqs) tphVar22;
        sqsVar25.d |= 16777216;
        sqsVar25.aE = z4;
        boolean z5 = thlVar.e;
        if (!tphVar22.C()) {
            tpcVarM.o();
        }
        sqs sqsVar26 = (sqs) tpcVarM.b;
        sqsVar26.e |= 1;
        sqsVar26.aK = z5;
        ttj ttjVar = thqVar.v;
        if (ttjVar == null) {
            ttjVar = ttj.a;
        }
        if (!ttjVar.d) {
            ttj ttjVar2 = thqVar.v;
            if (ttjVar2 == null) {
                ttjVar2 = ttj.a;
            }
            float f21 = ttjVar2.b;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar23 = tpcVarM.b;
            sqs sqsVar27 = (sqs) tphVar23;
            sqsVar27.c |= 16;
            sqsVar27.G = f21;
            ttj ttjVar3 = thqVar.v;
            if (ttjVar3 == null) {
                ttjVar3 = ttj.a;
            }
            float f22 = ttjVar3.c;
            if (!tphVar23.C()) {
                tpcVarM.o();
            }
            sqs sqsVar28 = (sqs) tpcVarM.b;
            sqsVar28.c |= 32;
            sqsVar28.H = f22;
            ttj ttjVar4 = thqVar.v;
            if (ttjVar4 == null) {
                ttjVar4 = ttj.a;
            }
            tti ttiVar = ttjVar4.e;
            if (ttiVar == null) {
                ttiVar = tti.a;
            }
            float f23 = ttiVar.b;
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            tph tphVar24 = tpcVarM.b;
            sqs sqsVar29 = (sqs) tphVar24;
            sqsVar29.c |= 128;
            sqsVar29.J = f23;
            ttj ttjVar5 = thqVar.v;
            if (ttjVar5 == null) {
                ttjVar5 = ttj.a;
            }
            tti ttiVar2 = ttjVar5.e;
            if (ttiVar2 == null) {
                ttiVar2 = tti.a;
            }
            float f24 = ttiVar2.c;
            if (!tphVar24.C()) {
                tpcVarM.o();
            }
            tph tphVar25 = tpcVarM.b;
            sqs sqsVar30 = (sqs) tphVar25;
            sqsVar30.c |= 256;
            sqsVar30.K = f24;
            ttj ttjVar6 = thqVar.v;
            if (ttjVar6 == null) {
                ttjVar6 = ttj.a;
            }
            tti ttiVar3 = ttjVar6.e;
            if (ttiVar3 == null) {
                ttiVar3 = tti.a;
            }
            float f25 = ttiVar3.d;
            if (!tphVar25.C()) {
                tpcVarM.o();
            }
            tph tphVar26 = tpcVarM.b;
            sqs sqsVar31 = (sqs) tphVar26;
            sqsVar31.c |= 512;
            sqsVar31.L = f25;
            ttj ttjVar7 = thqVar.v;
            if (ttjVar7 == null) {
                ttjVar7 = ttj.a;
            }
            tti ttiVar4 = ttjVar7.e;
            if (ttiVar4 == null) {
                ttiVar4 = tti.a;
            }
            float f26 = ttiVar4.e;
            if (!tphVar26.C()) {
                tpcVarM.o();
            }
            tph tphVar27 = tpcVarM.b;
            sqs sqsVar32 = (sqs) tphVar27;
            sqsVar32.c |= 1024;
            sqsVar32.M = f26;
            ttj ttjVar8 = thqVar.v;
            if (ttjVar8 == null) {
                ttjVar8 = ttj.a;
            }
            tti ttiVar5 = ttjVar8.e;
            if (ttiVar5 == null) {
                ttiVar5 = tti.a;
            }
            int i6 = ttiVar5.f;
            if (!tphVar27.C()) {
                tpcVarM.o();
            }
            tph tphVar28 = tpcVarM.b;
            sqs sqsVar33 = (sqs) tphVar28;
            sqsVar33.c |= 2048;
            sqsVar33.N = i6;
            ttj ttjVar9 = thqVar.v;
            if (ttjVar9 == null) {
                ttjVar9 = ttj.a;
            }
            tti ttiVar6 = ttjVar9.e;
            if (ttiVar6 == null) {
                ttiVar6 = tti.a;
            }
            float f27 = ttiVar6.g;
            if (!tphVar28.C()) {
                tpcVarM.o();
            }
            tph tphVar29 = tpcVarM.b;
            sqs sqsVar34 = (sqs) tphVar29;
            sqsVar34.c |= 4096;
            sqsVar34.O = f27;
            ttj ttjVar10 = thqVar.v;
            if (ttjVar10 == null) {
                ttjVar10 = ttj.a;
            }
            tti ttiVar7 = ttjVar10.e;
            if (ttiVar7 == null) {
                ttiVar7 = tti.a;
            }
            float f28 = ttiVar7.h;
            if (!tphVar29.C()) {
                tpcVarM.o();
            }
            sqs sqsVar35 = (sqs) tpcVarM.b;
            sqsVar35.c |= 8192;
            sqsVar35.P = f28;
        }
        tho thoVar = thqVar.A;
        if (thoVar == null) {
            thoVar = tho.a;
        }
        int i7 = thoVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar30 = tpcVarM.b;
        sqs sqsVar36 = (sqs) tphVar30;
        sqsVar36.c |= 32768;
        sqsVar36.Q = i7;
        float f29 = thoVar.c;
        if (!tphVar30.C()) {
            tpcVarM.o();
        }
        tph tphVar31 = tpcVarM.b;
        sqs sqsVar37 = (sqs) tphVar31;
        sqsVar37.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        sqsVar37.R = f29;
        float f30 = thoVar.d;
        if (!tphVar31.C()) {
            tpcVarM.o();
        }
        tph tphVar32 = tpcVarM.b;
        sqs sqsVar38 = (sqs) tphVar32;
        sqsVar38.c |= 131072;
        sqsVar38.S = f30;
        float f31 = thoVar.e;
        if (!tphVar32.C()) {
            tpcVarM.o();
        }
        tph tphVar33 = tpcVarM.b;
        sqs sqsVar39 = (sqs) tphVar33;
        sqsVar39.c |= 262144;
        sqsVar39.T = f31;
        float f32 = thoVar.f;
        if (!tphVar33.C()) {
            tpcVarM.o();
        }
        tph tphVar34 = tpcVarM.b;
        sqs sqsVar40 = (sqs) tphVar34;
        sqsVar40.c |= ImageMetadata.LENS_APERTURE;
        sqsVar40.U = f32;
        float f33 = thoVar.g;
        if (!tphVar34.C()) {
            tpcVarM.o();
        }
        tph tphVar35 = tpcVarM.b;
        sqs sqsVar41 = (sqs) tphVar35;
        sqsVar41.c |= ImageMetadata.SHADING_MODE;
        sqsVar41.V = f33;
        float f34 = thoVar.h;
        if (!tphVar35.C()) {
            tpcVarM.o();
        }
        sqs sqsVar42 = (sqs) tpcVarM.b;
        sqsVar42.c |= 2097152;
        sqsVar42.W = f34;
        thf thfVar = thqVar.B;
        if (thfVar == null) {
            thfVar = thf.a;
        }
        int i8 = thfVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar36 = tpcVarM.b;
        sqs sqsVar43 = (sqs) tphVar36;
        sqsVar43.c |= 8388608;
        sqsVar43.Y = i8;
        float f35 = thfVar.c;
        if (!tphVar36.C()) {
            tpcVarM.o();
        }
        tph tphVar37 = tpcVarM.b;
        sqs sqsVar44 = (sqs) tphVar37;
        sqsVar44.c |= 16777216;
        sqsVar44.Z = f35;
        float f36 = thfVar.d;
        if (!tphVar37.C()) {
            tpcVarM.o();
        }
        sqs sqsVar45 = (sqs) tpcVarM.b;
        sqsVar45.c |= 33554432;
        sqsVar45.aa = f36;
        thm thmVar = thqVar.C;
        if (thmVar == null) {
            thmVar = thm.a;
        }
        boolean z6 = thmVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar38 = tpcVarM.b;
        sqs sqsVar46 = (sqs) tphVar38;
        sqsVar46.c |= 67108864;
        sqsVar46.ab = z6;
        boolean z7 = thmVar.c;
        if (!tphVar38.C()) {
            tpcVarM.o();
        }
        tph tphVar39 = tpcVarM.b;
        sqs sqsVar47 = (sqs) tphVar39;
        sqsVar47.d |= 4;
        sqsVar47.ag = z7;
        int i9 = thmVar.d;
        if (!tphVar39.C()) {
            tpcVarM.o();
        }
        tph tphVar40 = tpcVarM.b;
        sqs sqsVar48 = (sqs) tphVar40;
        sqsVar48.c |= 134217728;
        sqsVar48.ac = i9;
        float f37 = thmVar.e;
        if (!tphVar40.C()) {
            tpcVarM.o();
        }
        tph tphVar41 = tpcVarM.b;
        sqs sqsVar49 = (sqs) tphVar41;
        sqsVar49.c |= 268435456;
        sqsVar49.ad = f37;
        float f38 = thmVar.f;
        if (!tphVar41.C()) {
            tpcVarM.o();
        }
        sqs sqsVar50 = (sqs) tpcVarM.b;
        sqsVar50.d |= 32;
        sqsVar50.ai = f38;
        thk thkVar = thqVar.D;
        if (thkVar == null) {
            thkVar = thk.a;
        }
        int i10 = thkVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar42 = tpcVarM.b;
        sqs sqsVar51 = (sqs) tphVar42;
        sqsVar51.d |= 1;
        sqsVar51.ae = i10;
        int i11 = thkVar.c;
        if (!tphVar42.C()) {
            tpcVarM.o();
        }
        sqs sqsVar52 = (sqs) tpcVarM.b;
        sqsVar52.d |= 2;
        sqsVar52.af = i11;
        thh thhVar = thqVar.E;
        if (thhVar == null) {
            thhVar = thh.a;
        }
        boolean z8 = thhVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar43 = tpcVarM.b;
        sqs sqsVar53 = (sqs) tphVar43;
        sqsVar53.d |= 64;
        sqsVar53.aj = z8;
        int i12 = thhVar.c;
        if (!tphVar43.C()) {
            tpcVarM.o();
        }
        tph tphVar44 = tpcVarM.b;
        sqs sqsVar54 = (sqs) tphVar44;
        sqsVar54.d |= 128;
        sqsVar54.ak = i12;
        int i13 = thhVar.d;
        if (!tphVar44.C()) {
            tpcVarM.o();
        }
        tph tphVar45 = tpcVarM.b;
        sqs sqsVar55 = (sqs) tphVar45;
        sqsVar55.d |= 256;
        sqsVar55.al = i13;
        float f39 = thhVar.e;
        if (!tphVar45.C()) {
            tpcVarM.o();
        }
        tph tphVar46 = tpcVarM.b;
        sqs sqsVar56 = (sqs) tphVar46;
        sqsVar56.d |= 512;
        sqsVar56.am = f39;
        float f40 = thhVar.f;
        if (!tphVar46.C()) {
            tpcVarM.o();
        }
        sqs sqsVar57 = (sqs) tpcVarM.b;
        sqsVar57.d |= 1024;
        sqsVar57.an = f40;
        thn thnVar = thqVar.F;
        if (thnVar == null) {
            thnVar = thn.a;
        }
        float f41 = thnVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqs sqsVar58 = (sqs) tpcVarM.b;
        sqsVar58.d |= 16384;
        sqsVar58.ar = f41;
        for (int i14 = 0; i14 < thnVar.c.size(); i14++) {
            tpcVarM.U(thnVar.c.d(i14));
        }
        for (int i15 = 0; i15 < thnVar.d.size(); i15++) {
            tpcVarM.T(thnVar.d.d(i15));
        }
        boolean z9 = thnVar.e;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqs sqsVar59 = (sqs) tpcVarM.b;
        sqsVar59.d |= Integer.MIN_VALUE;
        sqsVar59.aJ = z9;
        for (int i16 = 0; i16 < thqVar.G.size(); i16++) {
            tpcVarM.Q(thqVar.G.d(i16));
        }
        thd thdVar = thqVar.K;
        if (thdVar == null) {
            thdVar = thd.a;
        }
        boolean z10 = thdVar.b;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar47 = tpcVarM.b;
        sqs sqsVar60 = (sqs) tphVar47;
        sqsVar60.e |= 32;
        sqsVar60.aP = z10;
        boolean z11 = thdVar.c;
        if (!tphVar47.C()) {
            tpcVarM.o();
        }
        tph tphVar48 = tpcVarM.b;
        sqs sqsVar61 = (sqs) tphVar48;
        sqsVar61.e |= 64;
        sqsVar61.aQ = z11;
        int iC = C(i);
        if (!tphVar48.C()) {
            tpcVarM.o();
        }
        tph tphVar49 = tpcVarM.b;
        sqs sqsVar62 = (sqs) tphVar49;
        sqsVar62.aF = iC - 1;
        sqsVar62.d |= 33554432;
        int iAm = a.am(thqVar.o);
        if (iAm == 0) {
            iAm = 2;
        }
        if (!tphVar49.C()) {
            tpcVarM.o();
        }
        int iC2 = C(iAm);
        tph tphVar50 = tpcVarM.b;
        sqs sqsVar63 = (sqs) tphVar50;
        sqsVar63.aG = iC2 - 1;
        sqsVar63.d |= 67108864;
        int iC3 = C(i2);
        if (!tphVar50.C()) {
            tpcVarM.o();
        }
        tph tphVar51 = tpcVarM.b;
        sqs sqsVar64 = (sqs) tphVar51;
        sqsVar64.aA = iC3 - 1;
        sqsVar64.d |= ImageMetadata.SHADING_MODE;
        int iAm2 = a.am(thqVar.p);
        if (iAm2 == 0) {
            iAm2 = 2;
        }
        if (!tphVar51.C()) {
            tpcVarM.o();
        }
        int iC4 = C(iAm2);
        tph tphVar52 = tpcVarM.b;
        sqs sqsVar65 = (sqs) tphVar52;
        sqsVar65.aB = iC4 - 1;
        sqsVar65.d |= 2097152;
        boolean z12 = thqVar.q;
        if (!tphVar52.C()) {
            tpcVarM.o();
        }
        sqs sqsVar66 = (sqs) tpcVarM.b;
        sqsVar66.d |= 134217728;
        sqsVar66.aH = z12;
        thg thgVar = thqVar.J;
        if (thgVar == null) {
            thgVar = thg.a;
        }
        boolean z13 = thgVar.c;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar53 = tpcVarM.b;
        sqs sqsVar67 = (sqs) tphVar53;
        sqsVar67.e = 2 | sqsVar67.e;
        sqsVar67.aL = z13;
        boolean z14 = thgVar.d;
        if (!tphVar53.C()) {
            tpcVarM.o();
        }
        tph tphVar54 = tpcVarM.b;
        sqs sqsVar68 = (sqs) tphVar54;
        sqsVar68.e |= 4;
        sqsVar68.aM = z14;
        boolean z15 = thgVar.e;
        if (!tphVar54.C()) {
            tpcVarM.o();
        }
        tph tphVar55 = tpcVarM.b;
        sqs sqsVar69 = (sqs) tphVar55;
        sqsVar69.e |= 8;
        sqsVar69.aN = z15;
        boolean z16 = thgVar.b;
        if (!tphVar55.C()) {
            tpcVarM.o();
        }
        tph tphVar56 = tpcVarM.b;
        sqs sqsVar70 = (sqs) tphVar56;
        sqsVar70.e |= 16;
        sqsVar70.aO = z16;
        float f42 = thgVar.f;
        if (!tphVar56.C()) {
            tpcVarM.o();
        }
        tph tphVar57 = tpcVarM.b;
        sqs sqsVar71 = (sqs) tphVar57;
        sqsVar71.e |= 128;
        sqsVar71.aR = f42;
        int i17 = thqVar.c;
        if (!tphVar57.C()) {
            tpcVarM.o();
        }
        tph tphVar58 = tpcVarM.b;
        sqs sqsVar72 = (sqs) tphVar58;
        sqsVar72.b |= 1024;
        sqsVar72.m = i17;
        int i18 = thqVar.d;
        if (!tphVar58.C()) {
            tpcVarM.o();
        }
        tph tphVar59 = tpcVarM.b;
        sqs sqsVar73 = (sqs) tphVar59;
        sqsVar73.b |= 2048;
        sqsVar73.n = i18;
        int i19 = thqVar.i;
        if (!tphVar59.C()) {
            tpcVarM.o();
        }
        tph tphVar60 = tpcVarM.b;
        sqs sqsVar74 = (sqs) tphVar60;
        sqsVar74.b |= 4096;
        sqsVar74.o = i19;
        long j = thqVar.j;
        if (!tphVar60.C()) {
            tpcVarM.o();
        }
        tph tphVar61 = tpcVarM.b;
        sqs sqsVar75 = (sqs) tphVar61;
        sqsVar75.d |= 2048;
        sqsVar75.ao = j;
        long j2 = thqVar.k;
        if (!tphVar61.C()) {
            tpcVarM.o();
        }
        tph tphVar62 = tpcVarM.b;
        sqs sqsVar76 = (sqs) tphVar62;
        sqsVar76.d |= 4096;
        sqsVar76.ap = j2;
        long j3 = thqVar.l;
        if (!tphVar62.C()) {
            tpcVarM.o();
        }
        tph tphVar63 = tpcVarM.b;
        sqs sqsVar77 = (sqs) tphVar63;
        sqsVar77.d |= 8192;
        sqsVar77.aq = j3;
        int i20 = thqVar.m;
        if (!tphVar63.C()) {
            tpcVarM.o();
        }
        tph tphVar64 = tpcVarM.b;
        sqs sqsVar78 = (sqs) tphVar64;
        sqsVar78.b |= 8192;
        sqsVar78.p = i20;
        boolean z17 = thqVar.h;
        if (!tphVar64.C()) {
            tpcVarM.o();
        }
        tph tphVar65 = tpcVarM.b;
        sqs sqsVar79 = (sqs) tphVar65;
        sqsVar79.b = 262144 | sqsVar79.b;
        sqsVar79.s = z17;
        boolean z18 = thqVar.t;
        if (!tphVar65.C()) {
            tpcVarM.o();
        }
        tph tphVar66 = tpcVarM.b;
        sqs sqsVar80 = (sqs) tphVar66;
        sqsVar80.b |= 268435456;
        sqsVar80.B = z18;
        float f43 = thqVar.u;
        if (!tphVar66.C()) {
            tpcVarM.o();
        }
        tph tphVar67 = tpcVarM.b;
        sqs sqsVar81 = (sqs) tphVar67;
        sqsVar81.b |= Integer.MIN_VALUE;
        sqsVar81.E = f43;
        int iAz = a.az(thqVar.g);
        if (iAz == 0) {
            iAz = 1;
        }
        if (!tphVar67.C()) {
            tpcVarM.o();
        }
        int iE = E(iAz);
        tph tphVar68 = tpcVarM.b;
        sqs sqsVar82 = (sqs) tphVar68;
        sqsVar82.F = a.ah(iE);
        sqsVar82.c |= 8;
        float f44 = thqVar.w;
        if (!tphVar68.C()) {
            tpcVarM.o();
        }
        tph tphVar69 = tpcVarM.b;
        sqs sqsVar83 = (sqs) tphVar69;
        sqsVar83.c |= 64;
        sqsVar83.I = f44;
        float f45 = thqVar.x;
        if (!tphVar69.C()) {
            tpcVarM.o();
        }
        sqs.b((sqs) tpcVarM.b, f45);
        float f46 = thqVar.y;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar70 = tpcVarM.b;
        sqs sqsVar84 = (sqs) tphVar70;
        sqsVar84.d |= 16;
        sqsVar84.ah = f46;
        int iAy = a.ay(thqVar.H);
        int i21 = iAy != 0 ? iAy : 1;
        if (!tphVar70.C()) {
            tpcVarM.o();
        }
        sqs.c((sqs) tpcVarM.b, B(i21));
        int iD = D(i3);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sqs.d((sqs) tpcVarM.b, iD);
        int iD2 = D(i4);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar71 = tpcVarM.b;
        sqs sqsVar85 = (sqs) tphVar71;
        sqsVar85.aI = iD2 - 1;
        sqsVar85.d |= 1073741824;
        boolean z19 = thqVar.L;
        if (!tphVar71.C()) {
            tpcVarM.o();
        }
        sqs sqsVar86 = (sqs) tpcVarM.b;
        sqsVar86.e |= 256;
        sqsVar86.aS = z19;
        for (int i22 = 0; i22 < thqVar.e.size(); i22++) {
            tpcVarM.R(thqVar.e.d(i22));
        }
        for (int i23 = 0; i23 < thqVar.f.size(); i23++) {
            boolean zG = thqVar.f.g(i23);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            sqs sqsVar87 = (sqs) tpcVarM.b;
            tpj tpjVar = sqsVar87.u;
            if (!tpjVar.c()) {
                sqsVar87.u = tph.r(tpjVar);
            }
            sqsVar87.u.f(zG);
        }
        for (int i24 = 0; i24 < thqVar.z.size(); i24++) {
            tpcVarM.S(thqVar.z.d(i24));
        }
        return (sqs) tpcVarM.l();
    }

    public static int i(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            case 12:
                return 14;
            case 13:
                return 15;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 16;
            default:
                return 0;
        }
    }

    public static /* synthetic */ int j(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public static final float k(float f, chq chqVar) {
        return chqVar.dk(f);
    }

    public static final void l(bvo bvoVar, long j, float f, float f2, float f3, float f4, boolean z) {
        if (f < 0.0f || f > Float.intBitsToFloat((int) (bvoVar.m() >> 32))) {
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bvoVar.m() & 4294967295L)) - f3;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat - f2);
        long j2 = jFloatToRawIntBits << 32;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat);
        long j3 = jFloatToRawIntBits3 << 32;
        bmt bmtVar = bvoVar.a;
        bku bkuVar = bmtVar.a.c;
        fnd fndVarQ = bmtVar.q();
        long jP = bmt.p(j, 1.0f);
        long jH = fndVarQ.h();
        long j4 = bkv.a;
        if (!a.q(jH, jP)) {
            fndVarQ.k(jP);
        }
        if (fndVarQ.c != null) {
            fndVarQ.n(null);
        }
        if (!a.ao(fndVarQ.b, null)) {
            fndVarQ.l(null);
        }
        if (!a.p(fndVarQ.a, 3)) {
            fndVarQ.j(3);
        }
        if (fndVarQ.d() != f4) {
            fndVarQ.r(f4);
        }
        if (fndVarQ.c() != 4.0f) {
            fndVarQ.q(4.0f);
        }
        if (!a.p(fndVarQ.f(), z ? 1 : 0)) {
            fndVarQ.o(z ? 1 : 0);
        }
        if (!a.p(fndVarQ.g(), 0)) {
            fndVarQ.p(0);
        }
        if (!a.ao(null, null)) {
            fndVarQ.t();
        }
        if (!a.p(fndVarQ.e(), 1)) {
            fndVarQ.m(1);
        }
        bkuVar.n((jFloatToRawIntBits2 & 4294967295L) | j2, (jFloatToRawIntBits4 & 4294967295L) | j3, fndVarQ);
    }

    public static boolean n(nfm nfmVar) {
        return nfmVar == nfo.a;
    }

    public static void o(cku ckuVar, View view, int i, Size size) {
        ckuVar.j(view.getId(), 3, 0, 3, i);
        if (size.getWidth() != 0) {
            ckuVar.l(view.getId(), size.getWidth());
            ckuVar.i(view.getId(), 6, R.id.snap_panel, 7);
        } else {
            ckuVar.l(view.getId(), 0);
            ckuVar.i(view.getId(), 6, 0, 6);
        }
        ckuVar.i(view.getId(), 7, 0, 7);
    }

    public static void p(cku ckuVar, View view, int i) {
        ckuVar.j(view.getId(), 3, 0, 3, i);
        ckuVar.j(view.getId(), 6, 0, 6, 0);
        ckuVar.j(view.getId(), 7, 0, 7, 0);
    }

    public static void q(ViewGroup viewGroup, ViewGroup viewGroup2, Context context) {
        int measuredHeight = viewGroup.getMeasuredHeight();
        int measuredHeight2 = viewGroup2.getMeasuredHeight();
        if (measuredHeight2 == 0) {
            viewGroup2.measure(0, 0);
            measuredHeight2 = viewGroup2.getMeasuredHeight();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(measuredHeight, measuredHeight2);
        valueAnimatorOfInt.addUpdateListener(new cot(viewGroup2, 10, null));
        valueAnimatorOfInt.addListener(new mnk(viewGroup2, context));
        valueAnimatorOfInt.start();
        viewGroup.setVisibility(8);
    }

    public static void r(ViewGroup viewGroup, ViewGroup viewGroup2) {
        viewGroup.setVisibility(8);
        viewGroup2.setVisibility(0);
    }

    public static final void s(cto ctoVar, mmw mmwVar) {
        if (ctoVar.s == null) {
            ctoVar.s = new ctp();
        }
        ctoVar.s.c(mmwVar.a);
        ctoVar.s.e(mmwVar.b);
    }

    public static pej t(int i) {
        return new pej(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(i));
    }

    public static Set u(float f, Rect rect) {
        HashSet hashSet = new HashSet();
        hashSet.add(new pej(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f)));
        hashSet.add(new pej(CaptureRequest.SCALER_CROP_REGION, rect));
        return hashSet;
    }

    public static Set v(Rect rect, float f) {
        HashSet hashSet = new HashSet();
        hashSet.add(new pej(CaptureRequest.SCALER_CROP_REGION, rect));
        hashSet.add(new pej(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(f)));
        return hashSet;
    }

    public static Intent w(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity");
        intent.putExtra("pref_open_setting_page", "pref_category_storage");
        intent.putExtra("pref_make_setting_page_root", true);
        return intent;
    }

    public static ssc x(ltf ltfVar) {
        ltf ltfVar2 = ltf.UNKNOWN;
        switch (ltfVar.ordinal()) {
            case 0:
                return ssc.UNKNOWN_MODE;
            case 1:
            case 7:
            case 23:
            case 24:
            case 25:
                return ssc.PHOTO_CAPTURE;
            case 2:
            case 3:
            case 26:
                return ssc.HDR_PLUS;
            case 4:
                return ssc.SMART_BURST;
            case 5:
                return ssc.PANORAMA;
            case 6:
                return ssc.PHOTO_SPHERE;
            case 8:
                return ssc.PHOTO_CAPTURE_INTENT;
            case 9:
            case 19:
                return ssc.VIDEO_CAPTURE;
            case 10:
                return ssc.PORTRAIT;
            case 11:
                return ssc.IMAX_PANO;
            case 12:
                return ssc.NIGHT_SIGHT;
            case 13:
                return ssc.TIMELAPSE;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 17:
                return ssc.C;
            case 15:
                return ssc.VIDEO_SNAPSHOT;
            case 16:
                return ssc.CINEMATIC_PAN;
            case 18:
                return ssc.VIDEO_PORTRAIT;
            case 20:
                return ssc.TAXI;
            case 21:
                return ssc.MOTION_LANDSCAPE;
            case ImageFormat.RGBA_FP16 /* 22 */:
                return ssc.MOTION_ACTION_PAN;
            case 27:
                return ssc.COTTAGE;
            case 28:
                return ssc.VEGA;
            case 29:
                return ssc.SERENGETI;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public static void y(mcz mczVar) {
        mczVar.g();
    }

    public static final void z(mdc mdcVar) {
        mdcVar.i();
    }

    public static void d(UUID uuid, Optional optional, boolean z, String str, boolean z2, edw edwVar) {
        String str2 = yoGAhrpjU.MBirtaEIGRXQ;
        try {
            gga ggaVar = edy.a;
            ggaVar.c(str2, "GCreations");
            ggaVar.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            edwVar.c(str2, "CameraBurstID", uuid.toString());
            edwVar.c("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (z) {
                edwVar.c("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", "1");
            }
            optional.isPresent();
            if (z2) {
                String[] strArr = pqq.b;
                for (int i = 0; i < 2; i++) {
                    edwVar.g("DisableAutoCreation", new eex(512), strArr[i], new eex());
                }
            }
            if (hqp.NONE.e().equals(str)) {
                return;
            }
            pqw.p(edwVar, str);
        } catch (edv e) {
            throw new RuntimeException(e);
        }
    }
}
