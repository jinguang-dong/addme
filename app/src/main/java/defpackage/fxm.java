package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fxm implements paq, fyt, fbl, oyv {
    public static final sgv a = sgv.g("fxm");
    public final kfw A;
    public final ggo B;
    public final fzb C;
    public final mgp D;
    public gem E;
    public final ree F;
    public final cxb G;
    private final owq H;
    private lte I;
    private final ktx J;
    private final nca K;
    private final gay L;
    private final fxz M;
    private final ggg N;
    private final ggg O;
    private final obu P;
    private final ocq Q;
    public final pka b;
    public final out c;
    public final fyd d;
    public final gau g;
    public final fbq h;
    public final mgm i;
    public final gfn j;
    public final gds k;
    public final mfb l;
    public final uem m;
    public final tzj n;
    public final Executor o;
    public final pbn p;
    public final gaw q;
    public final int r;
    public final gbg s;
    public final rwc t;
    public lru u;
    public syu w;
    public fxy x;
    public fxl y;
    public our z;
    public final Object e = new Object();
    public final List f = new ArrayList();
    public boolean v = false;

    public fxm(out outVar, ktx ktxVar, nca ncaVar, ree reeVar, fyd fydVar, gay gayVar, ggg gggVar, fxz fxzVar, cxb cxbVar, gav gavVar, gnt gntVar, fbq fbqVar, kfw kfwVar, mgm mgmVar, ggo ggoVar, gfn gfnVar, gds gdsVar, mfb mfbVar, uem uemVar, tzj tzjVar, ggg gggVar2, fzb fzbVar, gbg gbgVar, rwc rwcVar, owq owqVar, mgp mgpVar, Executor executor, obu obuVar, ocq ocqVar, pbn pbnVar, gaw gawVar) {
        this.h = fbqVar;
        this.A = kfwVar;
        this.b = gntVar.a();
        this.c = outVar;
        this.J = ktxVar;
        this.K = ncaVar;
        this.F = reeVar;
        this.d = fydVar;
        this.L = gayVar;
        this.N = gggVar;
        this.M = fxzVar;
        this.g = gavVar.a();
        this.G = cxbVar;
        this.B = ggoVar;
        this.i = mgmVar;
        this.j = gfnVar;
        this.k = gdsVar;
        this.l = mfbVar;
        this.m = uemVar;
        this.n = tzjVar;
        this.O = gggVar2;
        this.C = fzbVar;
        this.s = gbgVar;
        this.o = executor;
        this.P = obuVar;
        this.Q = ocqVar;
        this.p = pbnVar;
        this.q = gawVar;
        this.r = gawVar.D;
        this.t = rwcVar;
        this.H = owqVar;
        this.D = mgpVar;
    }

    @Override // defpackage.fbl
    public final fda a(ejt ejtVar) {
        gce gceVar = this.B.b;
        gceVar.getClass();
        fys fysVar = ((gcm) gceVar).e.c;
        return fysVar == null ? new fca() : fysVar.a(ejtVar);
    }

    public final void b() {
        this.J.k(fxm.class);
        this.L.c();
        nca ncaVar = this.K;
        ncaVar.h();
        ncaVar.f();
        ((mbj) this.N.a).c(R.raw.video_stop);
        this.O.k();
        fzb fzbVar = this.C;
        synchronized (fzbVar.b) {
            if (fzbVar.h.equals(fza.STARTED)) {
                rwc rwcVar = fzbVar.c;
                if (rwcVar.h()) {
                    ((mci) rwcVar.c()).i();
                }
                rwc rwcVar2 = fzbVar.d;
                if (rwcVar2.h()) {
                }
                rwc rwcVar3 = fzbVar.e;
                if (rwcVar3.h()) {
                    ((ConcurrentLinkedQueue) ((mcd) rwcVar3.c()).f.b).clear();
                }
                fzbVar.h = fza.STOPPED;
            }
        }
        this.s.f();
        this.d.a.f(true);
        gaw gawVar = this.q;
        if (gawVar.K) {
            rwc rwcVar4 = this.t;
            if (rwcVar4.h()) {
                ((mhe) rwcVar4.c()).o(false);
                ((mhe) rwcVar4.c()).s();
                ((mhe) rwcVar4.c()).m(rvk.a);
            }
        }
        if (gawVar.r) {
            gau gauVar = this.g;
            gauVar.o.a(gawVar.n);
        } else if (gawVar.s && !this.k.f("60To30FpsThrottle")) {
            gau gauVar2 = this.g;
            gauVar2.o.a(new Range(60, 60));
        }
        this.u = null;
        this.I = null;
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
        if (oyuVar == oyu.CONSECUTIVE_MISSED_METADATA) {
            gzi gziVar = gym.a;
        }
        if (!oyuVar.n) {
            this.d.c(oyuVar);
        } else {
            gzi gziVar2 = gym.a;
            p(new fjw(this, oyuVar, 12), new fjw(this, oyuVar, 13), 3);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.y == fxl.CLOSED) {
                ((sgt) a.b().M(501)).s("Capture session has been closed.");
                return;
            }
            this.i.a();
            gds gdsVar = this.k;
            gdsVar.b();
            synchronized (gdsVar.i) {
                gdsVar.n = null;
                gdsVar.m = true;
            }
            try {
                o(true, 7).get();
            } catch (Exception e) {
                ((sgt) ((sgt) a.b().i(e)).M(500)).s("Failed to stop recording.");
            }
            this.f.clear();
            m(fxl.CLOSED);
            this.G.x(gdo.CAPTURE_SESSION);
        }
    }

    public final void e() {
        o(false, 2);
        this.d.i(false);
    }

    @Override // defpackage.fyt
    public final void g() {
        this.g.o.a(this.q.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04d8 A[Catch: all -> 0x0588, TryCatch #4 {, blocks: (B:58:0x0440, B:59:0x0444, B:77:0x047e, B:80:0x0485, B:92:0x04d8, B:94:0x04f6, B:95:0x0506, B:83:0x049c, B:85:0x04ae, B:90:0x04c8, B:93:0x04e9, B:115:0x0587, B:60:0x0445, B:62:0x0449, B:64:0x044b, B:66:0x044f, B:67:0x0458, B:69:0x045a, B:70:0x045e, B:73:0x0461, B:74:0x047a), top: B:140:0x0440, outer: #6, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r0v55, types: [syu] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.Object, plc] */
    /* JADX WARN: Type inference failed for: r4v30, types: [our] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, paq] */
    @Override // defpackage.fyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(boolean r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxm.k(boolean):void");
    }

    public final void l(boolean z) {
        this.c.execute(new emz(this, z, 3, (char[]) null));
    }

    public final void m(fxl fxlVar) {
        synchronized (this.e) {
            this.y = fxlVar;
            gem gemVar = this.E;
            if (gemVar != null) {
                gemVar.g = fxlVar.equals(fxl.RECORDING);
            }
        }
    }

    public final boolean n() {
        return this.k.f("VideoRecording");
    }

    public final syu o(boolean z, final int i) {
        syu syuVarI;
        synchronized (this.e) {
            fxl fxlVar = this.y;
            if (fxlVar != fxl.NO_RECORDING && fxlVar != fxl.CLOSED) {
                fxl fxlVar2 = fxl.STOPPING_RECORDING;
                if (fxlVar == fxlVar2) {
                    syu syuVar = this.w;
                    syuVar.getClass();
                    return syuVar;
                }
                m(fxlVar2);
                this.l.j(mfa.RECORD_STOPPING);
                ArrayList arrayList = new ArrayList(this.f);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((fyt) it.next()).d();
                }
                final fxy fxyVar = this.x;
                fxyVar.getClass();
                Object obj = fxyVar.e;
                synchronized (obj) {
                    fxx fxxVar = fxyVar.D;
                    if (fxxVar == fxx.RECORDING || fxxVar == fxx.RECORDING_PAUSED || fxxVar == fxx.STARTING_RECORDING) {
                        fxx fxxVar2 = fxx.STOPPING_RECORDING;
                        fxyVar.l(fxxVar2);
                        fxyVar.k("Stop recording initiated.");
                        synchronized (obj) {
                            int i2 = 1;
                            int i3 = 0;
                            rnt.L(fxyVar.D == fxxVar2);
                            fxyVar.c.a.f(false);
                            gdv gdvVar = fxyVar.E;
                            gdvVar.getClass();
                            final oyn oynVar = gdvVar.a;
                            final szh szhVar = new szh();
                            gbt gbtVarA = fxyVar.a();
                            long jA = fxyVar.f.a(gbtVarA.a());
                            if (z) {
                                fxyVar.p.j(mfc.VIDEO_RECORDER_STOPPING);
                                szhVar.f(fxyVar.j.E ? oynVar.f() : oynVar.h());
                            } else {
                                if (!fxyVar.j.E) {
                                    i3 = 1000 - ((int) jA);
                                }
                                frn frnVar = new frn("CdrRecSession", i3);
                                fxyVar.P.w(gdo.RECORDING_SESSION).d(frnVar);
                                frnVar.execute(new Runnable() { // from class: fxr
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        fxyVar.p.j(mfc.VIDEO_RECORDER_STOPPING);
                                        szhVar.f(oynVar.h());
                                    }
                                });
                            }
                            syn synVarV = syn.v(szhVar);
                            kjl kjlVar = new kjl(fxyVar, gbtVarA, i2);
                            sxo sxoVar = sxo.a;
                            syuVarI = swz.i(swf.j(swz.j(synVarV, kjlVar, sxoVar), Throwable.class, new jmx(fxyVar, i2), sxoVar), new rvu() { // from class: fxp
                                @Override // defpackage.rvu
                                public final Object apply(Object obj2) {
                                    fxy fxyVar2 = fxyVar;
                                    return new kbk((List) obj2, fxyVar2.d, (Bitmap) fxyVar2.l.get(), i);
                                }
                            }, sxo.a);
                        }
                    } else {
                        fxyVar.close();
                        syuVarI = ske.L(new IllegalStateException("Trying to stop with state=" + String.valueOf(fxyVar.D)));
                    }
                }
                this.w = syuVarI;
                this.x = null;
                ske.W(syuVarI, new fpc(this, arrayList, 3, (short[]) null), this.c);
                return this.w;
            }
            ((sgt) a.c().M(520)).v("Trying to stop recording but state is: %s", this.y);
            return ske.M(new kbk(new ArrayList(), new ArrayList(), (Bitmap) null, i));
        }
    }

    protected final void p(Runnable runnable, Runnable runnable2, int i) {
        ske.W(o(false, i), new fpc(runnable, runnable2, 2, (char[]) null), this.c);
    }

    @Override // defpackage.fyt
    public final void q(final kbk kbkVar) {
        this.o.execute(new Runnable() { // from class: fxk
            /* JADX WARN: Failed to find 'out' block for switch in B:45:0x019f. Please report as an issue. */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, mhq] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
            /* JADX WARN: Type inference failed for: r2v53, types: [fyw, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                Map map;
                fxk fxkVar = this;
                kbk kbkVar2 = kbkVar;
                Iterator it = kbkVar2.d.iterator();
                while (true) {
                    fxm fxmVar = fxkVar.a;
                    if (!it.hasNext()) {
                        Iterator it2 = kbkVar2.b.iterator();
                        while (it2.hasNext()) {
                            fxmVar.F.h((gbv) it2.next(), fxmVar.b);
                        }
                        return;
                    }
                    gbw gbwVar = (gbw) it.next();
                    ree reeVar = fxmVar.F;
                    pka pkaVar = fxmVar.b;
                    int i2 = kbkVar2.a;
                    mfa mfaVar = mfa.RECORD_STARTING;
                    mfa mfaVar2 = mfa.RECORD_STARTED;
                    mfb mfbVar = (mfb) reeVar.b;
                    int iA = mfbVar.a(mfaVar, mfaVar2);
                    int iA2 = mfbVar.a(mfa.RECORD_STOPPING, mfa.RECORD_STOPPED);
                    float fFloatValue = ((Float) ((gav) reeVar.g).a().b.dL()).floatValue();
                    tpc tpcVarM = sug.a.m();
                    float seconds = TimeUnit.MILLISECONDS.toSeconds(gbwVar.d);
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    sug sugVar = (sug) tpcVarM.b;
                    sugVar.b |= 1;
                    sugVar.c = seconds;
                    int i3 = gbwVar.a().c().a;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    sug sugVar2 = (sug) tpcVarM.b;
                    sugVar2.b |= 8;
                    sugVar2.e = i3;
                    int i4 = gbwVar.a().c().b;
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar = tpcVarM.b;
                    sug sugVar3 = (sug) tphVar;
                    sugVar3.b |= 4;
                    sugVar3.d = i4;
                    oxp oxpVar = gbwVar.b;
                    oxh oxhVar = oxpVar.d;
                    int i5 = oxhVar == oxh.FPS_AUTO ? -1 : oxhVar.k;
                    if (!tphVar.C()) {
                        tpcVarM.o();
                    }
                    float f = i5;
                    tph tphVar2 = tpcVarM.b;
                    sug sugVar4 = (sug) tphVar2;
                    sugVar4.b |= 16;
                    sugVar4.f = f;
                    int i6 = oxpVar.f;
                    if (!tphVar2.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar3 = tpcVarM.b;
                    sug sugVar5 = (sug) tphVar3;
                    sugVar5.b |= 128;
                    sugVar5.i = i6;
                    int i7 = oxpVar.g;
                    if (!tphVar3.C()) {
                        tpcVarM.o();
                    }
                    sug sugVar6 = (sug) tpcVarM.b;
                    sugVar6.b |= 256;
                    sugVar6.j = i7;
                    gtm gtmVar = (gtm) reeVar.c;
                    boolean zP = gtmVar.p();
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar4 = tpcVarM.b;
                    sug sugVar7 = (sug) tphVar4;
                    sugVar7.b |= 32;
                    sugVar7.g = zP;
                    int i8 = gbwVar.f;
                    if (!tphVar4.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar5 = tpcVarM.b;
                    sug sugVar8 = (sug) tphVar5;
                    sugVar8.b |= 64;
                    sugVar8.h = i8;
                    int i9 = gbwVar.g;
                    if (!tphVar5.C()) {
                        tpcVarM.o();
                    }
                    tph tphVar6 = tpcVarM.b;
                    sug sugVar9 = (sug) tphVar6;
                    sugVar9.b |= 2048;
                    sugVar9.m = i9;
                    long j = gbwVar.k;
                    if (!tphVar6.C()) {
                        tpcVarM.o();
                    }
                    sug sugVar10 = (sug) tpcVarM.b;
                    sugVar10.b |= 512;
                    sugVar10.k = j;
                    Map map2 = gbwVar.l;
                    tpc tpcVarM2 = suf.a.m();
                    Iterator it3 = map2.keySet().iterator();
                    while (true) {
                        Iterator it4 = it;
                        if (it3.hasNext()) {
                            oyu oyuVar = (oyu) it3.next();
                            Integer num = (Integer) map2.get(oyuVar);
                            if (num != null) {
                                gho ghoVar = gho.OFF;
                                oyu oyuVar2 = oyu.VIDEO_BUFFER_DELAY;
                                nkw nkwVar = nkw.UNINITIALIZED;
                                switch (oyuVar) {
                                    case VIDEO_BUFFER_DELAY:
                                        map = map2;
                                        int iIntValue = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar = (suf) tpcVarM2.b;
                                        sufVar.b |= 1;
                                        sufVar.c = iIntValue;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case AUDIO_BUFFER_DELAY:
                                        map = map2;
                                        int iIntValue2 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar2 = (suf) tpcVarM2.b;
                                        sufVar2.b |= 2;
                                        sufVar2.d = iIntValue2;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case VIDEO_TRACK_FAIL_TO_START:
                                        map = map2;
                                        int iIntValue3 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar3 = (suf) tpcVarM2.b;
                                        sufVar3.b |= 4;
                                        sufVar3.e = iIntValue3;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case AUDIO_TRACK_FAIL_TO_START:
                                        map = map2;
                                        int iIntValue4 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar4 = (suf) tpcVarM2.b;
                                        sufVar4.b |= 8;
                                        sufVar4.f = iIntValue4;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case METADATA_DELAY:
                                        map = map2;
                                        int iIntValue5 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar5 = (suf) tpcVarM2.b;
                                        sufVar5.b |= 512;
                                        sufVar5.l = iIntValue5;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case METADATA_NOT_FOUND:
                                        map = map2;
                                        int iIntValue6 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar6 = (suf) tpcVarM2.b;
                                        sufVar6.b |= 1024;
                                        sufVar6.m = iIntValue6;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case AUDIO_RECORD_ERROR:
                                        map = map2;
                                        int iIntValue7 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar7 = (suf) tpcVarM2.b;
                                        sufVar7.b |= 16;
                                        sufVar7.g = iIntValue7;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case MUXER_STOP_ERROR:
                                        map = map2;
                                        int iIntValue8 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar8 = (suf) tpcVarM2.b;
                                        sufVar8.b |= 32;
                                        sufVar8.h = iIntValue8;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case MEDIA_CODEC_ERROR_AUDIO:
                                    case MEDIA_CODEC_ERROR_VIDEO:
                                        map = map2;
                                        int iIntValue9 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar9 = (suf) tpcVarM2.b;
                                        sufVar9.b |= 64;
                                        sufVar9.i = iIntValue9;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case FILE_LOST:
                                        map = map2;
                                        int iIntValue10 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar10 = (suf) tpcVarM2.b;
                                        sufVar10.b |= 128;
                                        sufVar10.j = iIntValue10;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case CONSECUTIVE_MISSED_METADATA:
                                        map = map2;
                                        int iIntValue11 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar11 = (suf) tpcVarM2.b;
                                        sufVar11.b |= 2048;
                                        sufVar11.n = iIntValue11;
                                        it = it4;
                                        map2 = map;
                                        break;
                                    case OTHER:
                                        int iIntValue12 = num.intValue();
                                        if (!tpcVarM2.b.C()) {
                                            tpcVarM2.o();
                                        }
                                        suf sufVar12 = (suf) tpcVarM2.b;
                                        map = map2;
                                        sufVar12.b |= 256;
                                        sufVar12.k = iIntValue12;
                                        it = it4;
                                        map2 = map;
                                        break;
                                }
                            }
                            it = it4;
                        } else {
                            suf sufVar13 = (suf) tpcVarM2.l();
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar7 = tpcVarM.b;
                            sug sugVar11 = (sug) tphVar7;
                            sufVar13.getClass();
                            sugVar11.l = sufVar13;
                            sugVar11.b |= 1024;
                            int i10 = gbwVar.h;
                            if (!tphVar7.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar8 = tpcVarM.b;
                            sug sugVar12 = (sug) tphVar8;
                            sugVar12.b |= 4096;
                            sugVar12.n = i10;
                            int i11 = gbwVar.i;
                            if (!tphVar8.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar9 = tpcVarM.b;
                            sug sugVar13 = (sug) tphVar9;
                            sugVar13.b |= 8192;
                            sugVar13.o = i11;
                            int i12 = gbwVar.j;
                            if (!tphVar9.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar10 = tpcVarM.b;
                            sug sugVar14 = (sug) tphVar10;
                            sugVar14.b |= 16384;
                            sugVar14.p = i12;
                            ggg gggVar = gbwVar.F;
                            int iA3 = gggVar.a(1);
                            if (!tphVar10.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar11 = tpcVarM.b;
                            sug sugVar15 = (sug) tphVar11;
                            sugVar15.b |= 32768;
                            sugVar15.q = iA3;
                            int iA4 = gggVar.a(2);
                            if (!tphVar11.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar12 = tpcVarM.b;
                            sug sugVar16 = (sug) tphVar12;
                            sugVar16.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                            sugVar16.r = iA4;
                            if (!tphVar12.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar13 = tpcVarM.b;
                            sug sugVar17 = (sug) tphVar13;
                            sugVar17.b |= 131072;
                            sugVar17.s = iA;
                            if (!tphVar13.C()) {
                                tpcVarM.o();
                            }
                            sug sugVar18 = (sug) tpcVarM.b;
                            sugVar18.b |= 262144;
                            sugVar18.t = iA2;
                            Iterable iterable = (Iterable) Collection.EL.stream(gbwVar.n).map(new fmu(reeVar, pkaVar, 2)).collect(Collectors.toList());
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            sug sugVar19 = (sug) tpcVarM.b;
                            tpn tpnVar = sugVar19.u;
                            if (!tpnVar.c()) {
                                sugVar19.u = tph.t(tpnVar);
                            }
                            Iterator it5 = iterable.iterator();
                            while (it5.hasNext()) {
                                sugVar19.u.g(((sui) it5.next()).g);
                            }
                            int i13 = gbwVar.o;
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar14 = tpcVarM.b;
                            sug sugVar20 = (sug) tphVar14;
                            sugVar20.b |= ImageMetadata.LENS_APERTURE;
                            sugVar20.v = i13;
                            float f2 = gbwVar.q;
                            if (!tphVar14.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar15 = tpcVarM.b;
                            sug sugVar21 = (sug) tphVar15;
                            sugVar21.b |= ImageMetadata.SHADING_MODE;
                            sugVar21.w = f2;
                            long j2 = gbwVar.r;
                            if (!tphVar15.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar16 = tpcVarM.b;
                            sug sugVar22 = (sug) tphVar16;
                            sugVar22.b |= 2097152;
                            sugVar22.x = j2;
                            int i14 = oxpVar.c;
                            if (!tphVar16.C()) {
                                tpcVarM.o();
                            }
                            long j3 = i14;
                            tph tphVar17 = tpcVarM.b;
                            sug sugVar23 = (sug) tphVar17;
                            sugVar23.b |= 4194304;
                            sugVar23.y = j3;
                            boolean z = gbwVar.u;
                            if (!tphVar17.C()) {
                                tpcVarM.o();
                            }
                            sug sugVar24 = (sug) tpcVarM.b;
                            sugVar24.b |= 8388608;
                            sugVar24.z = z;
                            int i15 = ree.i(i2);
                            if (!tpcVarM.b.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar18 = tpcVarM.b;
                            sug sugVar25 = (sug) tphVar18;
                            sugVar25.B = i15 - 1;
                            sugVar25.b |= 33554432;
                            int i16 = gbwVar.y;
                            if (!tphVar18.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar19 = tpcVarM.b;
                            sug sugVar26 = (sug) tphVar19;
                            sugVar26.b |= 134217728;
                            sugVar26.D = i16;
                            int i17 = gbwVar.D;
                            if (!tphVar19.C()) {
                                tpcVarM.o();
                            }
                            tph tphVar20 = tpcVarM.b;
                            sug sugVar27 = (sug) tphVar20;
                            sugVar27.b |= 1073741824;
                            sugVar27.G = i17;
                            int i18 = gbwVar.E;
                            if (!tphVar20.C()) {
                                tpcVarM.o();
                            }
                            sug sugVar28 = (sug) tpcVarM.b;
                            sugVar28.b |= Integer.MIN_VALUE;
                            sugVar28.H = i18;
                            rwc rwcVar = gbwVar.B;
                            if (rwcVar.h()) {
                                float fFloatValue2 = ((Float) rwcVar.c()).floatValue();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                sug sugVar29 = (sug) tpcVarM.b;
                                sugVar29.b |= 268435456;
                                sugVar29.E = fFloatValue2;
                            }
                            rwc rwcVar2 = gbwVar.v;
                            if (rwcVar2.h()) {
                                Object objC = rwcVar2.c();
                                tpc tpcVarM3 = sto.a.m();
                                fzc fzcVar = (fzc) objC;
                                boolean z2 = fzcVar.a;
                                if (!tpcVarM3.b.C()) {
                                    tpcVarM3.o();
                                }
                                tph tphVar21 = tpcVarM3.b;
                                sto stoVar = (sto) tphVar21;
                                stoVar.b |= 1;
                                stoVar.c = z2;
                                boolean z3 = fzcVar.b;
                                if (!tphVar21.C()) {
                                    tpcVarM3.o();
                                }
                                tph tphVar22 = tpcVarM3.b;
                                sto stoVar2 = (sto) tphVar22;
                                stoVar2.b |= 2;
                                stoVar2.d = z3;
                                long j4 = fzcVar.c;
                                if (!tphVar22.C()) {
                                    tpcVarM3.o();
                                }
                                tph tphVar23 = tpcVarM3.b;
                                sto stoVar3 = (sto) tphVar23;
                                stoVar3.b |= 4;
                                stoVar3.e = j4;
                                int i19 = fzcVar.d;
                                if (!tphVar23.C()) {
                                    tpcVarM3.o();
                                }
                                tph tphVar24 = tpcVarM3.b;
                                sto stoVar4 = (sto) tphVar24;
                                stoVar4.b |= 8;
                                stoVar4.f = i19;
                                int i20 = fzcVar.e;
                                if (!tphVar24.C()) {
                                    tpcVarM3.o();
                                }
                                tph tphVar25 = tpcVarM3.b;
                                sto stoVar5 = (sto) tphVar25;
                                stoVar5.b |= 16;
                                stoVar5.g = i20;
                                float f3 = fzcVar.f;
                                if (!tphVar25.C()) {
                                    tpcVarM3.o();
                                }
                                sto stoVar6 = (sto) tpcVarM3.b;
                                stoVar6.b |= 32;
                                stoVar6.h = f3;
                                sto stoVar7 = (sto) tpcVarM3.l();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                sug sugVar30 = (sug) tpcVarM.b;
                                stoVar7.getClass();
                                sugVar30.A = stoVar7;
                                sugVar30.b |= 16777216;
                            }
                            rwc rwcVar3 = gbwVar.x;
                            if (rwcVar3.h()) {
                                Object objC2 = rwcVar3.c();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                sug sugVar31 = (sug) tpcVarM.b;
                                sugVar31.C = (sue) objC2;
                                sugVar31.b |= 67108864;
                            }
                            rwc rwcVar4 = gbwVar.C;
                            if (rwcVar4.h()) {
                                Object objC3 = rwcVar4.c();
                                tpc tpcVarM4 = suc.a.m();
                                vdu vduVar = (vdu) objC3;
                                int i21 = vduVar.a;
                                if (!tpcVarM4.b.C()) {
                                    tpcVarM4.o();
                                }
                                tph tphVar26 = tpcVarM4.b;
                                suc sucVar = (suc) tphVar26;
                                sucVar.b |= 1;
                                sucVar.c = i21;
                                int i22 = vduVar.b;
                                if (!tphVar26.C()) {
                                    tpcVarM4.o();
                                }
                                suc sucVar2 = (suc) tpcVarM4.b;
                                i = 2;
                                sucVar2.b |= 2;
                                sucVar2.d = i22;
                                Size size = vduVar.d;
                                int height = size.getHeight();
                                if (!tpcVarM4.b.C()) {
                                    tpcVarM4.o();
                                }
                                suc sucVar3 = (suc) tpcVarM4.b;
                                sucVar3.b |= 4;
                                sucVar3.e = height;
                                int width = size.getWidth();
                                if (!tpcVarM4.b.C()) {
                                    tpcVarM4.o();
                                }
                                suc sucVar4 = (suc) tpcVarM4.b;
                                sucVar4.b |= 8;
                                sucVar4.f = width;
                                suc sucVar5 = (suc) tpcVarM4.l();
                                if (!tpcVarM.b.C()) {
                                    tpcVarM.o();
                                }
                                sug sugVar32 = (sug) tpcVarM.b;
                                sucVar5.getClass();
                                sugVar32.F = sucVar5;
                                sugVar32.b |= 536870912;
                            } else {
                                i = 2;
                            }
                            Object obj = reeVar.e;
                            ssc sscVarF = ree.f(reeVar.d.a(), false);
                            boolean z4 = gbwVar.c;
                            boolean z5 = ((Integer) ((luj) gtmVar.a).b(luf.d)).intValue() != mus.OFF.e;
                            sug sugVar33 = (sug) tpcVarM.l();
                            int i23 = reeVar.a.a().j;
                            boolean z6 = gbwVar.a.a() == ltg.MARS_STORE;
                            rwc rwcVar5 = gbwVar.w;
                            spo spoVarU = ((gox) reeVar.f).u();
                            mdy mdyVar = (mdy) obj;
                            mdyVar.j = SystemClock.elapsedRealtime();
                            kwp kwpVar = new kwp(sscVarF, pkaVar == pka.FRONT);
                            kwpVar.m(true != z4 ? i : 4);
                            kwpVar.f(z5);
                            kwpVar.k(fFloatValue);
                            if (sugVar33 != null) {
                                tpc tpcVar = (tpc) kwpVar.a;
                                if (!tpcVar.b.C()) {
                                    tpcVar.o();
                                }
                                som somVar = (som) tpcVar.b;
                                som somVar2 = som.a;
                                somVar.p = sugVar33;
                                somVar.b |= 8192;
                            }
                            kwpVar.n(i23);
                            kwpVar.g(z6);
                            kwpVar.d(spoVarU);
                            if (rwcVar5.h()) {
                                kwpVar.h((sru) rwcVar5.c());
                            }
                            int i24 = mdyVar.A;
                            if (i24 != 1) {
                                kwpVar.l(i24);
                                mdyVar.A = 1;
                            }
                            mdyVar.M(kwpVar);
                            fxkVar = this;
                            it = it4;
                        }
                    }
                }
            }
        });
    }

    @Override // defpackage.fyt
    public final void d() {
    }

    @Override // defpackage.fyt
    public final void f() {
    }

    @Override // defpackage.fyt
    public final void h() {
    }

    @Override // defpackage.fyt
    public final void i() {
    }

    @Override // defpackage.fyt
    public final /* synthetic */ void j() {
    }
}
