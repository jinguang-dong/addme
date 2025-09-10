package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.camera.focusindicator.FocusIndicatorRingView;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqq {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public qqq(Context context, luw luwVar, gtm gtmVar, hbj hbjVar, jug jugVar) {
        this.e = context;
        this.c = luwVar;
        this.a = gtmVar;
        this.d = hbjVar;
        this.b = jugVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, pjo] */
    private final MeteringRectangle[] P(kge kgeVar) {
        return kqx.g(this.b, (hbj) this.e) ? kgeVar.b(((kqx) this.a).a().a) : kgeVar.b(((kqw) ((oww) this.a).dL()).a);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, owf] */
    private final MeteringRectangle[] Q(PointF pointF, int i) {
        int iIntValue = ((hbj) this.e).p(gza.d) ? ((Integer) this.d.dL()).intValue() : ((pkb) this.b).g();
        rnt.B(iIntValue % 90 == 0, "sensorOrientation must be a multiple of 90");
        rnt.B(iIntValue >= 0, "sensorOrientation must not be negative");
        return P(new fch(pointF, pointF, new nnw(iIntValue % 360), i));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[EDGE_INSN: B:164:0x00ab->B:33:0x00ab BREAK  A[LOOP:2: B:25:0x0087->B:165:?]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(defpackage.oca r20, defpackage.rww r21, defpackage.rvu r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqq.b(oca, rww, rvu):void");
    }

    public static /* synthetic */ boolean e(phe pheVar, pdj pdjVar) {
        return pheVar.b.booleanValue() && pheVar.a().equals(pdjVar.a()) && Arrays.equals(pheVar.e, ((phe) pdjVar).e);
    }

    public static /* synthetic */ boolean f(phe pheVar, pdj pdjVar) {
        return pheVar.c.booleanValue() && pheVar.c().equals(pdjVar.c()) && Arrays.equals(pheVar.f, ((phe) pdjVar).f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(fdq fdqVar) {
        fdqVar.j().d(owl.a(this.b, this.d).dK(new ksq(this, 8), sxo.a));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public final kzl B(owf owfVar, Map map, int i) {
        String str = (String) this.b;
        return new kzl((pfu) this.a, (our) this.e, this.d, this.c, owfVar, map, i, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    public final void C() {
        ?? r0 = this.a;
        pka pkaVarA = ((goi) r0.dL()).a();
        pkaVarA.getClass();
        gyb gybVarG = gsn.G(pkaVarA);
        ssc sscVar = ((nkw) this.e.dL()).v;
        uev uevVar = new uev(gybVarG, sscVar);
        ?? r4 = this.b;
        gyd gydVarQ = (gyd) r4.get(uevVar);
        if (gydVarQ == null && (gydVarQ = (gyd) r4.get(new uev(gybVarG, ssc.UNKNOWN_MODE))) == null) {
            kgw kgwVar = ((goi) r0.dL()).a;
            sscVar.getClass();
            gybVarG.getClass();
            tpc tpcVarM = gyd.a.m();
            tpcVarM.getClass();
            gsn.w(gybVarG, tpcVarM);
            gsn.u(sscVar, tpcVarM);
            gsn.v(kgwVar.d(), tpcVarM);
            gsn.t(tpcVarM);
            tpcVarM.v(rnt.ae(new Float[]{Float.valueOf(kgwVar.d()), Float.valueOf(kgwVar.c())}));
            gsn.s(tpcVarM);
            tpcVarM.u(rnt.ae(new Float[]{Float.valueOf(kgwVar.d()), Float.valueOf(kgwVar.c())}));
            gydVarQ = gsn.q(tpcVarM);
        }
        utl utlVar = (utl) this.c;
        utlVar.e(gydVarQ);
        utlVar.c();
    }

    public final oxj D(pka pkaVar) {
        gzi gziVar = pkaVar == pka.FRONT ? gym.f : gym.g;
        rwc rwcVarI = rwc.i((Integer) ((hbj) this.d).a(gziVar).orElse(null));
        if (!rwcVarI.h()) {
            return (!((gtm) this.a).n((Context) this.e, pkaVar) || ((lty) ((owx) this.c).dL()).equals(lty.RES_1080P)) ? ((jug) this.b).b() ? oxj.RES_1080P_3X4 : oxj.RES_1080P : ((jug) this.b).b() ? oxj.RES_2160P_3X4 : oxj.RES_2160P;
        }
        switch (((Integer) rwcVarI.c()).intValue()) {
            case 144:
                return oxj.RES_QCIF;
            case 240:
                return oxj.RES_QVGA;
            case 288:
                return oxj.RES_CIF;
            case 480:
                return oxj.RES_480P;
            case 720:
                return oxj.RES_720P;
            case 1080:
                return oxj.RES_1080P;
            case 2160:
                return oxj.RES_2160P;
            case 2268:
                return oxj.RES_2268P;
            case 4320:
                return oxj.RES_4320P;
            case 108034:
                return oxj.RES_1080P_3X4;
            case 216034:
                return oxj.RES_2160P_3X4;
            default:
                throw new IllegalArgumentException("Value " + rwcVarI.c().toString() + " for ADB flag " + gziVar.a + " not supported.");
        }
    }

    public final MeteringRectangle[] E() {
        MeteringRectangle[] meteringRectangleArr = kgc.a;
        kgc kgcVar = kgb.a;
        Rect rect = ((kqw) ((oww) this.a).dL()).a;
        return kgc.a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, owf] */
    public final MeteringRectangle[] F(PointF pointF) {
        return P(fch.c(pointF, pointF, ((hbj) this.e).p(gza.d) ? ((Integer) this.d.dL()).intValue() : ((pkb) this.b).g()));
    }

    public final MeteringRectangle[] G(PointF pointF) {
        return Q(pointF, 2);
    }

    public final MeteringRectangle[] H(PointF pointF) {
        return Q(pointF, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bbo, cfy, java.lang.Object] */
    public final bbo I(final cfv cfvVar) {
        uiq uiqVar = new uiq() { // from class: cfe
            /* JADX WARN: Code restructure failed: missing block: B:212:0x0364, code lost:
            
                r0 = (java.util.List) r1.a;
                r2 = r1.b;
             */
            /* JADX WARN: Code restructure failed: missing block: B:213:0x036a, code lost:
            
                if (r0 != null) goto L215;
             */
            /* JADX WARN: Code restructure failed: missing block: B:214:0x036c, code lost:
            
                r0 = new defpackage.cfx(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:215:0x0372, code lost:
            
                r10 = (defpackage.cfi) r10;
                r0 = new defpackage.ceu(r0, r2, r3, r10.a, r5, (defpackage.pfl) r11);
                defpackage.ukc.C(r10.b, null, 4, new defpackage.crd(r0, (defpackage.uhb) null, 1), 1);
                r0 = new defpackage.cfw(r0);
             */
            /* JADX WARN: Removed duplicated region for block: B:233:0x03c1  */
            /* JADX WARN: Removed duplicated region for block: B:234:0x03c3  */
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uiq] */
            @Override // defpackage.uiq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 972
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cfe.a(java.lang.Object):java.lang.Object");
            }
        };
        Object obj = this.a;
        byz byzVar = (byz) obj;
        synchronized (byzVar.a) {
            Object obj2 = ((byz) obj).b;
            cfy cfyVar = (cfy) ((zd) obj2).a(cfvVar);
            if (cfyVar != null) {
                if (cfyVar.b()) {
                    return cfyVar;
                }
            }
            try {
                ?? A = uiqVar.a(new adp(obj, cfvVar, 12, null));
                synchronized (byzVar.a) {
                    Object obj3 = ((byz) obj).b;
                    if (((zd) obj3).a(cfvVar) == null && A.b()) {
                        ((zd) obj3).b(cfvVar, A);
                    }
                }
                return A;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final bbo J(cfd cfdVar, cfp cfpVar) {
        int i = ((ceq) this.c).a;
        if (i != 0 && i != Integer.MAX_VALUE) {
            cfpVar = new cfp(ukc.p(cfpVar.h + i, 1, 1000));
        }
        return I(new cfv(cfdVar, cfpVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r5.a(r8, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r2 == ((defpackage.ufu) r7.d).c) goto L22;
     */
    /* JADX WARN: Path cross not found for [B:22:0x003d, B:25:0x004e], limit reached: 39 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:33:0x0081, B:25:0x004e, B:27:0x0056, B:28:0x005c, B:30:0x0062, B:31:0x0070, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:33:0x0081, B:25:0x004e, B:27:0x0056, B:28:0x005c, B:30:0x0062, B:31:0x0070, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x0028, B:33:0x0081, B:25:0x004e, B:27:0x0056, B:28:0x005c, B:30:0x0062, B:31:0x0070, B:22:0x003d, B:24:0x0047, B:17:0x0034), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007f -> B:33:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(defpackage.uhb r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.vc
            if (r0 == 0) goto L13
            r0 = r8
            vc r0 = (defpackage.vc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vc r0 = new vc
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            int r2 = r0.a
            defpackage.rnt.aN(r8)     // Catch: java.lang.Throwable -> L38
            goto L81
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            defpackage.rnt.aN(r8)     // Catch: java.lang.Throwable -> L38
            goto L47
        L38:
            r8 = move-exception
            goto L8b
        L3a:
            defpackage.rnt.aN(r8)
        L3d:
            java.lang.Object r8 = r7.e     // Catch: java.lang.Throwable -> L38
            r0.c = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r8.d(r0)     // Catch: java.lang.Throwable -> L38
            if (r8 == r1) goto L8a
        L47:
            java.lang.Object r2 = r7.d     // Catch: java.lang.Throwable -> L38
            ufu r2 = (defpackage.ufu) r2     // Catch: java.lang.Throwable -> L38
            r2.add(r8)     // Catch: java.lang.Throwable -> L38
        L4e:
            java.lang.Object r8 = r7.d     // Catch: java.lang.Throwable -> L38
            boolean r2 = r8.isEmpty()     // Catch: java.lang.Throwable -> L38
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r7.e     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r2.i()     // Catch: java.lang.Throwable -> L38
        L5c:
            boolean r6 = defpackage.uqq.c(r5)     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L70
            defpackage.uqq.d(r5)     // Catch: java.lang.Throwable -> L38
            r6 = r8
            ufu r6 = (defpackage.ufu) r6     // Catch: java.lang.Throwable -> L38
            r6.add(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r2.i()     // Catch: java.lang.Throwable -> L38
            goto L5c
        L70:
            r2 = r8
            ufu r2 = (defpackage.ufu) r2     // Catch: java.lang.Throwable -> L38
            int r2 = r2.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r5 = r7.b     // Catch: java.lang.Throwable -> L38
            r0.a = r2     // Catch: java.lang.Throwable -> L38
            r0.c = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r8 = r5.a(r8, r0)     // Catch: java.lang.Throwable -> L38
            if (r8 == r1) goto L8a
        L81:
            java.lang.Object r8 = r7.d     // Catch: java.lang.Throwable -> L38
            ufu r8 = (defpackage.ufu) r8     // Catch: java.lang.Throwable -> L38
            int r8 = r8.c     // Catch: java.lang.Throwable -> L38
            if (r2 != r8) goto L4e
            goto L3d
        L8a:
            return r1
        L8b:
            r7.L(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqq.K(uhb):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uiq] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection] */
    public final void L(Throwable th) {
        ?? r0 = this.e;
        if (r0.u(th)) {
            for (Object objI = r0.i(); uqq.c(objI); objI = r0.i()) {
                Object obj = this.d;
                uqq.d(objI);
                ((ufu) obj).add(objI);
            }
            ?? r3 = this.d;
            if (r3.isEmpty()) {
                return;
            }
            this.a.a(ske.bP(r3));
            ((ufu) r3).clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, uqm] */
    public final boolean M(Object obj) {
        return uqq.c(this.e.j(obj));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, uem] */
    public final jno N(gga ggaVar) {
        rwc rwcVar = (rwc) this.b.a();
        rwcVar.getClass();
        ?? A = this.c.a();
        A.getClass();
        ?? A2 = this.d.a();
        A2.getClass();
        ?? A3 = this.e.a();
        A3.getClass();
        ?? A4 = this.a.a();
        A4.getClass();
        return new jno(rwcVar, A, A2, A3, A4, ggaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, uem] */
    public final qqp a(Executor executor, tzj tzjVar, uem uemVar) {
        qqn qqnVar = (qqn) this.a.a();
        qqnVar.getClass();
        qnl qnlVar = (qnl) this.c.a();
        qnlVar.getClass();
        Object objA = this.d.a();
        executor.getClass();
        tzjVar.getClass();
        ?? r6 = this.e;
        return new qqp(qqnVar, this.b, qnlVar, (rcg) objA, r6, executor, tzjVar, uemVar);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    public final void c(ppb ppbVar) {
        sgj sgjVarListIterator = ppbVar.e.listIterator();
        while (sgjVarListIterator.hasNext()) {
            ppw ppwVar = ((pou) sgjVarListIterator.next()).e;
            Uri uriH = ppwVar.h();
            if (uriH != null && !rnt.V(uriH.getAuthority())) {
                ((ContentResolver) this.e).notifyChange(uriH, null);
                String.valueOf(ppbVar.a);
                uriH.toString();
                ppo ppoVarA = ppo.a(ppwVar.i().e);
                if (ppoVarA.b() || ppoVarA.c()) {
                    String str = true != ppoVarA.b() ? "android.hardware.action.NEW_VIDEO" : "android.hardware.action.NEW_PICTURE";
                    Uri uriH2 = ppwVar.h();
                    String.valueOf(uriH2);
                    Intent intent = new Intent(str, uriH2);
                    intent.addFlags(1073741824);
                    intent.addFlags(1);
                    ((Context) this.a).sendBroadcast(intent);
                }
            }
        }
        this.c.remove(ppbVar.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public final pdj d(pdj pdjVar, pdj pdjVar2) {
        ?? r0 = this.a;
        phd phdVarA = phd.a(pdjVar);
        phdVarA.b = r0.contains(pdjVar.b()) ? pdjVar.b() : pdjVar2.b();
        phdVarA.c = this.e.contains(pdjVar.a()) ? pdjVar.a() : pdjVar2.a();
        phdVarA.d = this.b.contains(pdjVar.c()) ? pdjVar.c() : pdjVar2.c();
        phdVarA.e = this.c.contains(pdjVar.e()) ? pdjVar.e() : pdjVar2.e();
        phdVarA.a = this.d.contains(pdjVar.d()) ? pdjVar.d() : pdjVar2.d();
        MeteringRectangle[] meteringRectangleArrG = pdjVar.g();
        MeteringRectangle[] meteringRectangleArr = pey.b;
        phdVarA.i = Arrays.equals(meteringRectangleArrG, meteringRectangleArr) ? ((phe) pdjVar2).d : pdjVar.g();
        phdVarA.j = Arrays.equals(pdjVar.f(), meteringRectangleArr) ? ((phe) pdjVar2).e : pdjVar.f();
        phdVarA.k = Arrays.equals(pdjVar.h(), meteringRectangleArr) ? ((phe) pdjVar2).f : pdjVar.h();
        return phdVarA.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.lang.Runnable] */
    public final void g() {
        synchronized (this.d) {
            Object obj = this.e;
            ((Handler) obj).removeCallbacks(this.c);
            ((Handler) obj).removeCallbacks(null);
        }
    }

    public final void h() {
        synchronized (this.d) {
            gzi gziVar = gzo.a;
        }
    }

    public final paq i() {
        n(4);
        return new mpc(this, 4, null);
    }

    public final void j() {
        out.a();
        out.a();
        nae naeVar = ((ModeSwitcher) this.b).b;
        naeVar.removeAllViews();
        naeVar.b.clear();
        naeVar.e.clear();
        naeVar.c.clear();
    }

    public final void k(nkx nkxVar, nkw nkwVar, boolean z) {
        nkwVar.getClass();
        ModeSwitcher modeSwitcher = (ModeSwitcher) this.b;
        modeSwitcher.g = nkwVar;
        boolean z2 = modeSwitcher.d;
        nkw nkwVar2 = modeSwitcher.g;
        nae naeVar = modeSwitcher.b;
        naeVar.m = nkxVar;
        naeVar.l = nkwVar2;
        naeVar.h();
        naeVar.r = 2;
        naeVar.c.isEmpty();
        modeSwitcher.d = true;
        modeSwitcher.setEnabled(z);
    }

    public final void l(nkw nkwVar, boolean z) {
        Object obj = ((EnumMap) this.c).get(nkwVar);
        Object obj2 = this.b;
        if (obj == obj2) {
            ((ModeSwitcher) obj2).g(nkwVar, z);
        } else {
            if (!nkwVar.equals(nkw.TIME_LAPSE) && !nkwVar.equals(nkw.SLOW_MOTION)) {
                throw new IllegalArgumentException(mn.i(nkwVar, "Mode ", " is not configured."));
            }
            ((ModeSwitcher) obj2).g(nkw.VIDEO, z);
        }
    }

    public final void m(boolean z) {
        Object obj = this.b;
        if (obj != null) {
            ((ModeSwitcher) obj).setEnabled(z);
        }
    }

    public final void n(int i) {
        ((ModeSwitcher) this.b).setImportantForAccessibility(i);
    }

    public final void o() {
        ModeSwitcher modeSwitcher = (ModeSwitcher) this.b;
        modeSwitcher.setEnabled(false);
        modeSwitcher.d = false;
        nae naeVar = modeSwitcher.b;
        naeVar.r = 1;
        View view = naeVar.g;
        if (view != null) {
            nae.b(view).setTextColor(naeVar.i);
            naeVar.g = null;
        }
    }

    public final lsw p(long j, hqp hqpVar, String str) {
        return q(j, hqpVar, str, Optional.empty());
    }

    public final lsw q(long j, hqp hqpVar, String str, Optional optional) {
        return r(j, hqpVar, str, ((Boolean) ((luj) this.d).b(luf.aN)).booleanValue() ? ltg.MARS_STORE : ltg.MEDIA_STORE, optional);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, tzx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, pbn] */
    public final lsw r(final long j, hqp hqpVar, final String str, final ltg ltgVar, Optional optional) {
        ?? r6 = this.c;
        r6.f("Create fileGroup");
        rww rwwVarY = rnt.y(new rww() { // from class: lsx
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, pbn] */
            @Override // defpackage.rww
            public final Object fr() {
                poy poyVarV;
                qqq qqqVar = this.d;
                ?? r1 = qqqVar.c;
                r1.f("Initialize MediaGroup");
                ltg ltgVar2 = ltgVar;
                String str2 = str;
                long j2 = j;
                if (ltgVar2 == ltg.MARS_STORE) {
                    Object obj = qqqVar.b;
                    lat latVar = (lat) obj;
                    poyVarV = latVar.v((ppu) qqqVar.a, rnt.U(str2), j2);
                } else {
                    Object obj2 = qqqVar.b;
                    lat latVar2 = (lat) obj2;
                    poyVarV = latVar2.v((ppu) latVar2.b, rnt.U(str2), j2);
                }
                r1.g();
                return poyVarV;
            }
        });
        lat latVar = (lat) ((ocq) this.e).a;
        Context contextB = ((imm) latVar.a).b();
        Object obj = latVar.b;
        lsw lswVar = new lsw(rwwVarY, j, hqpVar, str, ltgVar, optional, contextB);
        r6.g();
        return lswVar;
    }

    public final lsw s(long j, boolean z) {
        return z ? p(j, hqp.NIGHT, "NIGHT.RAW") : p(j, hqp.NIGHT, "NIGHT");
    }

    public final lsw t(long j) {
        return p(j, hqp.PANORAMA, "PANO");
    }

    public final lsw u(long j, boolean z) {
        return v(j, hqp.NONE, z);
    }

    public final lsw v(long j, hqp hqpVar, boolean z) {
        return z ? p(j, hqpVar, "RAW") : p(j, hqpVar, null);
    }

    public final lsw w(long j, boolean z) {
        return p(j, hqp.NONE, true != z ? null : "VB");
    }

    public final sru x() {
        tpc tpcVarM = sru.a.m();
        float fFloatValue = ((Float) ((lax) ((ovx) this.c).d).b.get(0)).floatValue();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        sru sruVar = (sru) tpcVarM.b;
        sruVar.b |= 1;
        sruVar.c = fFloatValue;
        return (sru) tpcVarM.l();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owq] */
    public final void y(int i) {
        this.b.a(Integer.valueOf(i));
        this.a.a(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, owq] */
    public final void z(float f) {
        this.d.a(Float.valueOf(f));
    }

    public qqq(FocusIndicatorRingView focusIndicatorRingView, hnq hnqVar, hnn hnnVar, hns hnsVar, rwc rwcVar) {
        this.b = focusIndicatorRingView;
        this.a = hnqVar;
        this.d = hnsVar;
        this.e = hnnVar;
        this.c = rwcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010a A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:36:0x0104, B:38:0x010a, B:40:0x0110, B:42:0x0114, B:44:0x0122, B:46:0x0126, B:48:0x0134, B:50:0x0138, B:51:0x014c, B:52:0x014d, B:53:0x0152), top: B:73:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0110 A[Catch: all -> 0x003c, TryCatch #3 {all -> 0x003c, blocks: (B:13:0x0037, B:36:0x0104, B:38:0x010a, B:40:0x0110, B:42:0x0114, B:44:0x0122, B:46:0x0126, B:48:0x0134, B:50:0x0138, B:51:0x014c, B:52:0x014d, B:53:0x0152), top: B:73:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, uhf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object O(java.lang.String r22, int r23, long r24, defpackage.byz r26, defpackage.rnn r27, defpackage.uhb r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqq.O(java.lang.String, int, long, byz, rnn, uhb):java.lang.Object");
    }

    public qqq(kgn kgnVar, izm izmVar, pbn pbnVar, jug jugVar, jho jhoVar) {
        this.a = kgnVar;
        this.b = izmVar;
        this.c = pbnVar;
        this.e = jugVar;
        this.d = jhoVar;
    }

    public qqq(kqx kqxVar, qpt qptVar, kgw kgwVar, owf owfVar, hbj hbjVar) {
        this.a = kqxVar;
        this.c = qptVar;
        this.b = kgwVar;
        this.e = hbjVar;
        this.d = owfVar;
    }

    public qqq(lat latVar, pbn pbnVar, luj lujVar, ppu ppuVar, ocq ocqVar) {
        this.b = latVar;
        this.c = pbnVar;
        this.d = lujVar;
        this.a = ppuVar;
        this.e = ocqVar;
    }

    public qqq(lqc lqcVar, out outVar, iso isoVar, Context context, gsk gskVar) {
        this.b = lqcVar;
        this.c = outVar;
        this.a = isoVar;
        this.e = context;
        this.d = gskVar;
    }

    public qqq(pfl pflVar, ceq ceqVar, byz byzVar, cfi cfiVar) {
        this.e = pflVar;
        this.c = ceqVar;
        this.a = byzVar;
        this.b = cfiVar;
        this.d = new arc(this, 9);
    }

    public qqq(pkc pkcVar, Intent intent, hfy hfyVar, gnt gntVar, hbj hbjVar) {
        this.c = pkcVar;
        this.a = intent;
        this.e = hfyVar;
        this.b = gntVar;
        this.d = hbjVar;
    }

    public qqq(pkc pkcVar, lvk lvkVar, nfq nfqVar, jho jhoVar, pbn pbnVar) {
        this.e = pkcVar;
        this.b = lvkVar;
        this.c = nfqVar;
        this.a = jhoVar;
        this.d = pbnVar;
    }

    public qqq(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, tzx tzxVar5) {
        this.a = tzxVar;
        this.e = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
        this.b = tzxVar5;
    }

    public qqq(byz byzVar, ut utVar, byz byzVar2, sx sxVar, byi byiVar, qrh qrhVar) {
        utVar.getClass();
        byzVar2.getClass();
        sxVar.getClass();
        byiVar.getClass();
        qrhVar.getClass();
        this.d = byzVar;
        this.b = utVar;
        this.a = byzVar2;
        this.c = sxVar;
        this.e = qrhVar;
    }

    public qqq(fdq fdqVar, Map map, boolean z, ModeSwitcher modeSwitcher) {
        our ourVarJ = fdqVar.j();
        map = z ? sfc.a : map;
        this.c = new EnumMap(nkw.class);
        this.a = new EnumMap(nkw.class);
        this.e = ourVarJ;
        this.b = modeSwitcher;
        gzi gziVar = gzj.a;
        sbv sbvVarM = sbv.m(map);
        this.d = sbvVarM;
        Iterable$EL.forEach(sbvVarM.keySet(), new ktp(this, 11));
    }

    public qqq(hbj hbjVar, pjo pjoVar, nms nmsVar, inu inuVar, uem uemVar, kqp kqpVar) {
        this.e = pjoVar;
        this.b = inuVar;
        this.c = uemVar;
        this.d = kqpVar;
        this.a = (pjoVar.M() && pjoVar.D() && hbjVar.p(gzo.Z)) ? rwc.j(nmsVar.i().j()) : rvk.a;
    }

    public qqq(Map map, owf owfVar, owf owfVar2) {
        map.getClass();
        owfVar.getClass();
        owfVar2.getClass();
        this.b = map;
        this.e = owfVar;
        this.a = owfVar2;
        utl utlVarA = utm.a(null);
        this.c = utlVarA;
        this.d = new ust(utlVarA);
    }

    public qqq(owf owfVar, fgn fgnVar, jwj jwjVar, nkw nkwVar, hyh hyhVar, hbj hbjVar) {
        this.b = hyhVar;
        this.d = jwjVar;
        this.e = nkwVar;
        this.a = hbjVar;
        int i = 1;
        boolean z = fgnVar.b() && fgnVar.e();
        boolean z2 = fgnVar.b() && fgnVar.f();
        pjz pjzVar = (pjz) ((owi) owfVar).a;
        sbk sbkVar = new sbk();
        scn scnVarD = kzz.d(nkwVar, z, z2, false, jwjVar);
        if (scnVarD.isEmpty()) {
            if (pjzVar != pjz.FULL && pjzVar != pjz.SIMPLE && pjzVar != pjz.EXTENDED) {
                i = 0;
            }
            sbkVar.h(new pej(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        } else {
            sbkVar.j(scnVarD);
        }
        this.c = sbkVar.g();
    }

    public qqq(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, char[] cArr) {
        uemVar.getClass();
        this.b = uemVar;
        this.c = uemVar2;
        this.d = uemVar3;
        this.e = uemVar4;
        this.a = uemVar5;
    }

    public qqq(uiq uiqVar, uiu uiuVar) {
        this.a = uiqVar;
        this.b = uiuVar;
        this.c = new uly(false, umc.a);
        this.e = ukc.P(Integer.MAX_VALUE, 0, new np(this, 4), 2);
        this.d = new ufu();
    }

    public qqq(hbj hbjVar, Context context) throws Resources.NotFoundException {
        this.d = new Object();
        this.a = hbjVar;
        String string = context.getResources().getString(R.string.flash_chip_text);
        nao naoVar = new nao();
        naoVar.e = string;
        naoVar.a = true;
        naoVar.h = context;
        naoVar.j = 2;
        naoVar.a();
        nao naoVar2 = new nao();
        naoVar2.h = context;
        naoVar2.j = 2;
        naoVar2.e = context.getResources().getString(R.string.warm_light_on_with_flash);
        naoVar2.a = true;
        naoVar2.a();
        naoVar2.a = false;
        naoVar2.d = new nam() { // from class: naq
            @Override // defpackage.nam
            public final void a(long j) {
            }
        };
        naoVar2.a();
        this.e = new Handler(Looper.getMainLooper());
        this.b = new ovx(false);
        this.c = new mvn(this, 3);
    }

    public qqq(pfu pfuVar, our ourVar, Executor executor, Map map, ScheduledExecutorService scheduledExecutorService, kgw kgwVar, kgn kgnVar, hbj hbjVar) {
        this.a = pfuVar;
        this.e = ourVar;
        this.d = executor;
        this.c = scheduledExecutorService;
        if (hbjVar.p(gza.a) && kgwVar.l().equals(pka.FRONT)) {
            pjr pjrVarA = kgnVar.a();
            pjrVarA.getClass();
            this.b = pjrVarA.a;
        } else {
            pjr pjrVar = (pjr) map.get(lcz.RAW_WIDE);
            pjrVar.getClass();
            this.b = pjrVar.a;
        }
    }

    public qqq(pjo pjoVar, scn scnVar) {
        sbp sbpVarN;
        this.a = pjoVar.q();
        this.e = pjoVar.p();
        this.b = pjoVar.r();
        pjn pjnVar = (pjn) pjoVar;
        this.d = ske.ag((int[]) pjnVar.n(CameraCharacteristics.CONTROL_AVAILABLE_MODES, pjn.c));
        if (!pjnVar.J()) {
            sbpVarN = sbp.l(0);
        } else {
            sbpVarN = sbp.n(0, 1, 2);
        }
        ArrayList arrayList = new ArrayList(sbpVarN);
        if (scnVar.contains(2) && !arrayList.contains(2)) {
            arrayList.add(2);
        }
        if (scnVar.contains(1) && !arrayList.contains(128)) {
            arrayList.add(128);
        }
        this.c = arrayList;
    }

    public qqq(byte[] bArr) {
        this.e = new ovx(false);
        this.a = new ovx(false);
        ovx ovxVar = new ovx(0);
        this.b = ovxVar;
        Float fValueOf = Float.valueOf(0.0f);
        ovx ovxVar2 = new ovx(fValueOf);
        this.d = ovxVar2;
        this.c = new ovx(new lax(((Integer) ovxVar.d).intValue(), sbp.m((Float) ovxVar2.d, fValueOf)));
    }

    public qqq(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, byte[] bArr, byte[] bArr2) {
        uemVar.getClass();
        this.c = uemVar;
        uemVar2.getClass();
        this.d = uemVar2;
        this.e = uemVar3;
        uemVar4.getClass();
        this.b = uemVar4;
        uemVar5.getClass();
        this.a = uemVar5;
    }

    public qqq(Context context, ContentResolver contentResolver, ppj ppjVar) {
        this.d = new Object();
        this.c = new HashMap();
        new HashMap();
        this.a = context;
        this.e = contentResolver;
        this.b = ppjVar;
    }

    public qqq(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, byte[] bArr) {
        uemVar.getClass();
        this.d = uemVar;
        uemVar2.getClass();
        this.e = uemVar2;
        uemVar3.getClass();
        this.a = uemVar3;
        uemVar4.getClass();
        this.c = uemVar4;
        uemVar5.getClass();
        this.b = uemVar5;
    }

    public qqq(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5) {
        uemVar.getClass();
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
        uemVar3.getClass();
        this.c = uemVar3;
        uemVar4.getClass();
        this.d = uemVar4;
        uemVar5.getClass();
        this.e = uemVar5;
    }

    public qqq() {
        this.c = new AtomicBoolean(false);
        this.e = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
    }
}
