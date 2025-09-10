package defpackage;

import android.util.Size;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;
import com.google.googlex.gcam.creativecamera.allin.jni.ImageConversionJniImpl;
import com.google.googlex.gcam.image.YuvUtils;
import j$.lang.Iterable$EL;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fip {
    private static final scn E;
    private static final scn F;
    public static final sgv a = sgv.g("fip");
    public static final scn b;
    public final lrp C;
    public final jod D;
    private final tgp G;
    private final owf H;
    private final Executor I;
    private final Duration J;
    private volatile tcd K;
    private final hbj L;
    private final ggg M;
    private final jod N;
    public final int c;
    public final syw e;
    public final teg f;
    public final paq g;
    public final sbv h;
    public final pbn i;
    public final flw j;
    public final fji l;
    public final lsw m;
    public volatile boolean n;
    public boolean v;
    public final ovx k = new ovx(true);
    public volatile fnp o = null;
    public int p = 0;
    public int q = 0;
    public fmg r = null;
    public fmg s = null;
    public boolean t = false;
    public boolean u = false;
    public Optional w = Optional.empty();
    public Optional x = Optional.empty();
    public spe y = spe.UNKNOWN;
    public final AtomicInteger z = new AtomicInteger(0);
    public final AtomicBoolean A = new AtomicBoolean(false);
    public final AtomicBoolean B = new AtomicBoolean(false);
    public final List d = new ArrayList();

    static {
        scn scnVarL = scn.L(spe.COMMAND_FAILED, spe.HDR_FAILED, spe.FIRST_VF_CAPTURE_FAILED, spe.SECOND_VF_CAPTURE_FAILED, spe.MERGE_FAILED, spe.FIRST_VF_CAPTURE_TOO_MANY_PEOPLE, spe.SECOND_VF_CAPTURE_TOO_MANY_PEOPLE);
        E = scnVarL;
        scl sclVar = new scl();
        sclVar.j(scnVarL);
        sclVar.d(spe.CANCELLED_BY_USER);
        sclVar.d(spe.CANCELLED_BY_DISTANCE);
        sclVar.d(spe.CANCELLED_BY_AVAILABILITY);
        b = sclVar.g();
        F = scn.H(spe.SECOND_VF_CAPTURE_FAILED, spe.SECOND_VF_CAPTURE_TOO_MANY_PEOPLE);
    }

    public fip(Executor executor, syw sywVar, final teg tegVar, ggg gggVar, sbv sbvVar, tgp tgpVar, pbn pbnVar, jod jodVar, uem uemVar, uem uemVar2, lrp lrpVar, owf owfVar, Executor executor2, final hbj hbjVar, final int i, paq paqVar, final ggg gggVar2, fji fjiVar, lsw lswVar) {
        this.c = i;
        this.e = sywVar;
        this.f = tegVar;
        this.M = gggVar;
        this.g = paqVar;
        this.G = tgpVar;
        this.h = sbvVar;
        this.i = pbnVar;
        this.N = jodVar;
        this.D = ((fjr) uemVar).a();
        this.j = ((flx) uemVar2).a();
        this.C = lrpVar;
        this.H = owfVar;
        this.l = fjiVar;
        this.I = executor2;
        this.L = hbjVar;
        this.J = Duration.ofMillis(((Integer) hbjVar.a(gyi.f).orElse(20000)).intValue());
        this.m = lswVar;
        final Instant instantNow = Instant.now();
        executor.execute(new Runnable() { // from class: fih
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, uem] */
            @Override // java.lang.Runnable
            public final void run() {
                gzi gziVar = gyi.a;
                hbj hbjVar2 = hbjVar;
                tds tdsVar = new tds(instantNow, Optional.empty(), hbjVar2.o(gyi.n), hbjVar2.o(gyi.q));
                teg tegVar2 = tegVar;
                AllInNativeImpl allInNativeImpl = (AllInNativeImpl) tegVar2.b;
                long j = allInNativeImpl.b;
                int i2 = i;
                AllInNativeImpl.a(allInNativeImpl.startSessionImpl(j, i2));
                synchronized (tegVar2) {
                    Map map = tegVar2.i;
                    Integer numValueOf = Integer.valueOf(i2);
                    if (map.containsKey(numValueOf)) {
                        throw new IllegalArgumentException("Session already started.");
                    }
                    tdy tdyVar = tegVar2.d;
                    ((tgb) tdyVar.a).a();
                    Object objA = tdyVar.b.a();
                    ((tfl) tdyVar.c).a();
                    map.put(numValueOf, new tdx(tdsVar, (rtl) objA));
                }
                fip fipVar = this.a;
                fipVar.n = true;
                fipVar.j.l();
            }
        });
    }

    private final void p() {
        synchronized (this) {
            fmg fmgVar = this.r;
            if (fmgVar != null) {
                fmgVar.close();
            }
            fmg fmgVar2 = this.s;
            if (fmgVar2 != null) {
                fmgVar2.close();
            }
        }
        this.e.execute(new fem(this, 9));
    }

    private static final void q(Throwable th) {
        if (th instanceof tez) {
            gzi gziVar = gyi.a;
        }
    }

    public final synchronized sbp a() {
        return sbp.j(this.d);
    }

    public final tcd b(pjr pjrVar) {
        tcd tcdVarA = this.N.a(pjrVar);
        synchronized (this) {
            if (this.t) {
                return tcdVarA;
            }
            ovx ovxVar = this.k;
            boolean z = true;
            if (this.K != null && !this.K.equals(tcdVarA)) {
                z = false;
            }
            ovxVar.a(Boolean.valueOf(z));
            return tcdVarA;
        }
    }

    public final synchronized void c(ltd ltdVar) {
        int i;
        if (!this.u && !this.v && (i = this.q) < this.p) {
            this.q = i + 1;
            this.d.add(ltdVar);
            lss lssVarA = this.C.a(ltdVar);
            lssVarA.getClass();
            this.j.a(lssVarA);
            lssVarA.J(String.format("Shot belongs to groupId: %s", Integer.valueOf(this.c)));
            return;
        }
        ((sgt) a.c().M(160)).I("GroupId:%s has completed capture=%s, processing=%s, sessionClosed=%s ignoring shotId:%s", Integer.valueOf(this.c), Boolean.valueOf(this.t), Boolean.valueOf(this.u), Boolean.valueOf(this.v), Integer.valueOf(ltdVar.a));
    }

    public final synchronized void d(ltd ltdVar, long j) {
        fnh fnhVar = (fnh) ((Optional) this.H.dL()).orElse(null);
        if (fnhVar == null) {
            ((sgt) a.c().M(161)).s("Missing active anchor buffer, skipping.");
            return;
        }
        fmg fmgVar = (fmg) fnhVar.a(j).orElse(null);
        if (fmgVar != null) {
            if (j(ltdVar) && this.r == null) {
                this.r = fmgVar;
                return;
            }
            if (this.s == null) {
                this.s = fmgVar;
            }
        }
    }

    public final synchronized void e(fjl fjlVar) {
        spe speVar;
        fjl fjlVar2 = fjl.BY_CAPTURE_COMMAND;
        if (fjlVar == fjlVar2) {
            this.p--;
        }
        if (fjlVar == fjlVar2 || ((fjlVar == fjl.BY_USER && !this.t) || ((fjlVar == fjl.BY_DISTANCE && !this.t) || (fjlVar == fjl.BY_AVAILABILITY && !this.t)))) {
            this.j.j();
            int iOrdinal = fjlVar.ordinal();
            if (iOrdinal == 0) {
                speVar = spe.CANCELLED_BY_USER;
            } else if (iOrdinal == 1) {
                speVar = spe.CANCELLED_BY_DISTANCE;
            } else if (iOrdinal == 2) {
                speVar = spe.COMMAND_FAILED;
            } else {
                if (iOrdinal != 3) {
                    throw new RuntimeException(null, null);
                }
                speVar = spe.CANCELLED_BY_AVAILABILITY;
            }
            g(speVar);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x0040
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void f(defpackage.spe r9) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.v     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto Lb
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L3e
        Lb:
            int r0 = r8.p     // Catch: java.lang.Throwable -> L3b
            j$.util.Optional r2 = r8.w     // Catch: java.lang.Throwable -> L3b
            j$.util.Optional r7 = r8.x     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r2.isPresent()
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L21
            boolean r1 = r7.isPresent()
            if (r1 == 0) goto L21
            r4 = r3
        L21:
            if (r0 == 0) goto L29
            if (r0 != r3) goto L28
            if (r4 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.Optional r3 = j$.util.Optional.empty()
            int r0 = defpackage.sbp.d
            sbp r4 = defpackage.sex.a
            j$.util.Optional r6 = j$.util.Optional.empty()
            r1 = r8
            r5 = r9
            r1.m(r2, r3, r4, r5, r6, r7)
            return
        L3b:
            r0 = move-exception
            r1 = r8
        L3d:
            r9 = r0
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L40
            throw r9
        L40:
            r0 = move-exception
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fip.f(spe):void");
    }

    public final void g(spe speVar) {
        boolean z;
        int i;
        fkf fkfVar;
        synchronized (this) {
            i = 1;
            if (speVar != null) {
                try {
                    this.y = speVar;
                    this.j.m(speVar);
                    if (speVar != spe.SUCCESS) {
                        z = (!this.t && E.contains(speVar)) || F.contains(speVar);
                        f(speVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = true;
            this.k.a(true);
            i();
        }
        if (z) {
            fji fjiVar = this.l;
            int i2 = this.c;
            switch (speVar.ordinal()) {
                case 10:
                    fkfVar = fkf.DISTANCE;
                    break;
                case 11:
                case 12:
                    fkfVar = fkf.TOO_MANY_PEOPLE;
                    break;
                case 13:
                    fkfVar = fkf.UNSUPPORTED_SCENE;
                    break;
                default:
                    fkfVar = fkf.UNKNOWN;
                    break;
            }
            fiz fizVar = (fiz) fjiVar;
            if (fizVar.b.l(i2)) {
                fji fjiVar2 = fizVar.a;
                ((fje) fjiVar2).d.execute(new fjw(fjiVar2, fkfVar, i));
            }
        }
    }

    public final void h() {
        this.C.getClass();
        synchronized (this) {
            List list = this.d;
            if (this.v) {
                return;
            }
            Iterable$EL.forEach(list, new fio(this, 1));
        }
    }

    public final void i() {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = true;
            if (this.t && this.p == 0) {
                z2 = !this.u;
                this.u = true;
                if (!this.v) {
                    f(this.y);
                }
                this.d.toArray();
            } else {
                z2 = false;
            }
            if (this.y != spe.SUCCESS || !this.u) {
                z = false;
            }
        }
        if (z2) {
            fji fjiVar = this.l;
            lsw lswVar = this.m;
            if (z) {
                lswVar.c().ifPresent(new fio(((fiz) fjiVar).a, 3));
            }
        }
    }

    public final synchronized boolean j(ltd ltdVar) {
        return ltdVar.equals(this.d.get(0));
    }

    public final synchronized boolean k() {
        return this.u;
    }

    public final Optional l(int i, int i2) {
        if (!this.L.p(gzd.a)) {
            return Optional.empty();
        }
        tpc tpcVarM = tno.a.m();
        tpc tpcVarM2 = tnm.a.m();
        int iAt = a.at(i);
        if (!tpcVarM2.b.C()) {
            tpcVarM2.o();
        }
        tph tphVar = tpcVarM2.b;
        tnm tnmVar = (tnm) tphVar;
        tnmVar.b |= 1;
        tnmVar.c = iAt;
        int i3 = i2 - 2;
        if (!tphVar.C()) {
            tpcVarM2.o();
        }
        tnm tnmVar2 = (tnm) tpcVarM2.b;
        tnmVar2.b |= 2;
        tnmVar2.d = i3;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tno tnoVar = (tno) tpcVarM.b;
        tnm tnmVar3 = (tnm) tpcVarM2.l();
        tnmVar3.getClass();
        tnoVar.c = tnmVar3;
        tnoVar.b |= 1;
        return Optional.of((tno) tpcVarM.l());
    }

    public final void m(Optional optional, Optional optional2, List list, final spe speVar, Optional optional3, Optional optional4) {
        synchronized (this) {
            if (this.v) {
                return;
            }
            int i = 1;
            this.v = true;
            try {
                int i2 = 0;
                final boolean z = !list.isEmpty() && optional3.isPresent();
                flw flwVar = this.j;
                flwVar.k();
                synchronized (flwVar) {
                    our ourVar = flwVar.d;
                    if (ourVar == null || flwVar.e || flwVar.f == null) {
                        ((sgt) flw.a.b().M(269)).s("Session not started or already closed, skipping.");
                    } else {
                        tpc tpcVar = flwVar.g;
                        tpc tpcVarN = flwVar.n();
                        if (!tpcVar.b.C()) {
                            tpcVar.o();
                        }
                        spf spfVar = (spf) tpcVar.b;
                        soy soyVar = (soy) tpcVarN.l();
                        spf spfVar2 = spf.a;
                        soyVar.getClass();
                        spfVar.k = soyVar;
                        spfVar.b |= 256;
                        spf spfVar3 = (spf) tpcVar.l();
                        lss lssVar = flwVar.f;
                        flwVar.e = true;
                        ourVar.close();
                        ((mdo) lssVar.o()).E = spfVar3;
                    }
                }
                if (!optional.isEmpty() && !optional4.isEmpty()) {
                    Object obj = optional.get();
                    Object obj2 = optional4.get();
                    ((fjk) obj).g.ifPresent(new fkj(i));
                    if (z) {
                        Collection.EL.stream(list).skip(1L).forEach(new flb(this, (fig) obj2, (fjk) obj, optional3, 1));
                    }
                    Optional map = optional2.map(new Function() { // from class: fim
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo30andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj3) {
                            fjj fjjVar = new fjj((fjk) obj3);
                            fjjVar.b(!z);
                            fjjVar.g = this.a.l(5, ezh.h(speVar));
                            return fjjVar.a();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    fjj fjjVar = new fjj((fjk) obj);
                    fjjVar.b(map.isEmpty() && !z);
                    fjjVar.g = l(4, ezh.h(speVar));
                    fjk fjkVarA = fjjVar.a();
                    final ArrayList arrayList = new ArrayList();
                    arrayList.add(fjkVarA);
                    map.ifPresent(new Consumer() { // from class: fin
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void d(Object obj3) {
                            sgv sgvVar = fip.a;
                            boolean z2 = z;
                            arrayList.add(!z2 ? 1 : 0, (fjk) obj3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Iterable$EL.forEach(arrayList, new fio(obj2, i2));
                    if (z) {
                        tee teeVar = (tee) list.get(0);
                        lsf lsfVar = (lsf) ((fjk) obj).k.b;
                        if (teeVar.b.b) {
                            lsfVar.g = jma.b;
                            hgc.h(lsfVar);
                        } else {
                            lsfVar.g = jma.c;
                        }
                        fjj fjjVar2 = new fjj((fjk) obj);
                        fjjVar2.a = (ShotMetadata) optional3.get();
                        fjjVar2.c(teeVar.a);
                        fjjVar2.b(true);
                        fjjVar2.f = this.m.a("jpg");
                        fjjVar2.g = l(3, 3);
                        ((fig) obj2).g(fjjVar2.a());
                    }
                    jod jodVar = this.D;
                    jod.i();
                    optional2.ifPresent(new fio(jodVar, 2));
                }
            } finally {
                p();
            }
        }
    }

    public final /* synthetic */ void n(syu syuVar, rwu rwuVar, fon fonVar) {
        try {
            syuVar.get(this.J.toMillis(), TimeUnit.MILLISECONDS);
            synchronized (this) {
                if (!this.t && !this.v) {
                    this.j.c(rwuVar.c(), fonVar.f().dN(), fonVar.f().dO() == fnt.TRACKING);
                    fji fjiVar = this.l;
                    if (((fiz) fjiVar).b.l(this.c)) {
                        fji fjiVar2 = ((fiz) fjiVar).a;
                        flg flgVar = ((fje) fjiVar2).b;
                        flgVar.getClass();
                        ((fje) fjiVar2).d.execute(new fem(flgVar, 15));
                    }
                }
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((sgt) ((sgt) a.b().i(e)).M(167)).z("Guidance failed for groupId:%s, isTimeout %s", this.c, e instanceof TimeoutException);
            q(e.getCause() != null ? e.getCause() : e);
            g(e.getCause() instanceof tez ? spe.FIRST_VF_CAPTURE_TOO_MANY_PEOPLE : spe.FIRST_VF_CAPTURE_FAILED);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, tcd] */
    /* JADX WARN: Type inference failed for: r4v13, types: [sgt, shi] */
    public final void o(boolean z, final fon fonVar, poj pojVar, pjr pjrVar) {
        ?? r2;
        final tdx tdxVarA;
        final Size size;
        fok fokVarF;
        final teg tegVar;
        fem femVar;
        syu syuVarL;
        YuvWriteView yuvWriteView;
        boolean z2;
        pbn pbnVar = this.i;
        pbnVar.f("AllIn#wrapYuvWriteView");
        YuvWriteView yuvWriteViewC = this.G.c(pojVar);
        pbnVar.g();
        try {
            try {
                pbnVar.f("AllInProcessor#captureImage");
                int i = 10;
                if (z) {
                    final int i2 = this.c;
                    tcd tcdVarB = this.N.b(pjrVar);
                    this.K = tcdVarB;
                    this.o = fonVar.f().dN();
                    rwu rwuVarAa = gsn.aa();
                    rwuVarAa.e();
                    teg tegVar2 = this.f;
                    fem femVar2 = new fem(pojVar, i);
                    try {
                        tegVar2.a(i2).g(tcdVarB);
                        tdxVarA = tegVar2.a(i2);
                        r2 = tdxVarA.d;
                        r2.getClass();
                        size = (r2 == tcd.g || r2 == tcd.i) ? new Size(yuvWriteViewC.a(), yuvWriteViewC.b()) : new Size(yuvWriteViewC.b(), yuvWriteViewC.a());
                        fokVarF = fonVar.f();
                    } catch (Throwable th) {
                        th = th;
                        r2 = femVar2;
                    }
                    try {
                        if (fokVarF.dO() == fnt.TRACKING) {
                            tei teiVar = tdxVarA.b;
                            if (!((tds) teiVar).d || tegVar2.g.dL() == fpa.TRACKING) {
                                foy foyVar = (foy) tegVar2.h.orElseThrow(new mae(12));
                                foi foiVarC = foyVar.c(fokVarF.p());
                                foi foiVarC2 = foyVar.c(fokVarF.dN());
                                ImageConversionJniImpl imageConversionJniImpl = tegVar2.j;
                                int iN = ske.n(r2);
                                final tdv tdvVar = new tdv(fonVar, foiVarC2, foiVarC, iN);
                                tes tesVar = tegVar2.c;
                                int i3 = sbp.d;
                                tdxVarA.k(tdvVar, tesVar.a(foyVar, size, tdvVar, sex.a));
                                if (((tds) teiVar).c) {
                                    try {
                                        YuvReadView yuvReadViewS = rup.s(yuvWriteViewC);
                                        final YuvImage yuvImage = new YuvImage(yuvReadViewS.b(), yuvReadViewS.a(), yuvReadViewS.c());
                                        YuvWriteView yuvWriteViewT = rup.t(yuvImage);
                                        long j = yuvReadViewS.a;
                                        tegVar = tegVar2;
                                        try {
                                            long jC = YuvWriteView.c(yuvWriteViewT);
                                            if (j != 0) {
                                                yuvWriteView = yuvWriteViewT;
                                                z2 = true;
                                            } else {
                                                yuvWriteView = yuvWriteViewT;
                                                z2 = false;
                                            }
                                            rnt.B(z2, "src view is null");
                                            rnt.B(jC != 0, "dst view is null");
                                            try {
                                                rnt.B(yuvReadViewS.b() == yuvWriteView.b(), "src and dst width must be equal");
                                                rnt.B(yuvReadViewS.a() == yuvWriteView.a(), "src and dst height must be equal");
                                                rnt.B(yuvReadViewS.c() == yuvWriteView.d(), "src and dst yuv_format must be equal");
                                                if (!YuvUtils.yuvToYuvImpl(j, jC)) {
                                                    femVar = femVar2;
                                                    tegVar = tegVar;
                                                    try {
                                                        throw new IOException("Failed to copy image.");
                                                    } catch (IOException e) {
                                                        e = e;
                                                        ((sgt) ((sgt) teg.a.b().i(e)).M((char) 5844)).s("Failed to copy image.");
                                                        syuVarL = ske.L(e);
                                                        syuVarL.c(femVar, tegVar.f);
                                                        this.I.execute(new dwq(this, syuVarL, rwuVarAa, fonVar, 3, null));
                                                        ggg.c();
                                                    }
                                                }
                                                femVar = femVar2;
                                                Callable callable = new Callable() { // from class: tea
                                                    @Override // java.util.concurrent.Callable
                                                    public final Object call() throws tez {
                                                        YuvImage yuvImage2 = yuvImage;
                                                        tegVar.d(tdxVarA, i2, fonVar, tdvVar, rup.t(yuvImage2), size);
                                                        yuvImage2.c();
                                                        return null;
                                                    }
                                                };
                                                tegVar = tegVar;
                                                syuVarL = ske.Q(callable, tegVar.f);
                                            } catch (IOException e2) {
                                                e = e2;
                                                femVar = femVar2;
                                                tegVar = tegVar;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                            femVar = femVar2;
                                            ((sgt) ((sgt) teg.a.b().i(e)).M((char) 5844)).s("Failed to copy image.");
                                            syuVarL = ske.L(e);
                                            syuVarL.c(femVar, tegVar.f);
                                            this.I.execute(new dwq(this, syuVarL, rwuVarAa, fonVar, 3, null));
                                            ggg.c();
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        tegVar = tegVar2;
                                    }
                                } else {
                                    femVar = femVar2;
                                    tegVar2.d(tdxVarA, i2, fonVar, tdvVar, yuvWriteViewC, size);
                                    tegVar = tegVar2;
                                    syuVarL = syq.a;
                                }
                                syuVarL.c(femVar, tegVar.f);
                                this.I.execute(new dwq(this, syuVarL, rwuVarAa, fonVar, 3, null));
                                ggg.c();
                            }
                        }
                        ((sgt) teg.a.c().M(5842)).E("First capture failed due to tracking: arCoreTrackingState=%s, allInTrackingStatus=%s.", fokVarF.dO(), tegVar2.g.dL());
                        throw new tey("Camera isn't tracking.");
                    } catch (Throwable th2) {
                        th = th2;
                        r2.run();
                        throw th;
                    }
                }
                int i4 = this.c;
                rwu rwuVarAa2 = gsn.aa();
                rwuVarAa2.e();
                teg tegVar3 = this.f;
                tcd tcdVarB2 = this.N.b(pjrVar);
                fem femVar3 = new fem(pojVar, i);
                try {
                    tdx tdxVarA2 = tegVar3.a(i4);
                    tdxVarA2.g(tcdVarB2);
                    fok fokVarF2 = fonVar.f();
                    if (fokVarF2.dO() != fnt.TRACKING) {
                        throw new tey("Camera isn't tracking.");
                    }
                    foy foyVar2 = (foy) tegVar3.h.orElseThrow(new mae(11));
                    foi foiVarC3 = foyVar2.c(fokVarF2.p());
                    foi foiVarC4 = foyVar2.c(fokVarF2.dN());
                    ImageConversionJniImpl imageConversionJniImpl2 = tegVar3.j;
                    int iN2 = ske.n(tcdVarB2);
                    tdxVarA2.l(new tdv(fonVar, foiVarC4, foiVarC3, iN2));
                    tdxVarA2.e();
                    femVar3.run();
                    this.j.g(rwuVarAa2.c(), fonVar.f().dN(), fonVar.f().dO() == fnt.TRACKING);
                    ggg.c();
                } catch (Throwable th3) {
                    femVar3.run();
                    throw th3;
                }
            } catch (tew | tey | tez e5) {
                ((sgt) ((sgt) a.b().i(e5)).M(181)).z("Process capture frame failed for groupId:%s, isFirstCapture:%s", this.c, z);
                q(e5);
                g(e5 instanceof tez ? z ? spe.FIRST_VF_CAPTURE_TOO_MANY_PEOPLE : spe.SECOND_VF_CAPTURE_TOO_MANY_PEOPLE : z ? spe.FIRST_VF_CAPTURE_FAILED : spe.SECOND_VF_CAPTURE_FAILED);
            }
        } finally {
            this.i.g();
        }
    }
}
