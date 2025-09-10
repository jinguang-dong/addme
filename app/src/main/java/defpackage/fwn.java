package defpackage;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.view.Surface;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fwn implements fwk {
    public static final sgv a = sgv.g("fwn");
    private final fwi A;
    private final gav B;
    private final Executor C;
    private final uem D;
    private final uem E;
    private final pbn F;
    private syu G;
    private gep I;
    private final got J;
    private final ree K;
    private final cxb L;
    public final out b;
    public final gnt c;
    public final ndj d;
    public final mez e;
    public final hhc f;
    public final itl h;
    public fxm j;
    public gau k;
    public boolean l;
    public boolean m;
    public gnl n;
    public int o;
    public gem r;
    public final hbj s;
    public final gox t;
    public final qwz u;
    public final ngw v;
    public final cxb w;
    public final gtm x;
    public final cxb y;
    public final ocq z;
    final ndo g = new fwl(this);
    public final itk i = new fwm(this);
    private muj H = qpt.bn();
    public final List p = new ArrayList();
    public final Object q = new Object();

    public fwn(ngw ngwVar, fwi fwiVar, cxb cxbVar, gav gavVar, Executor executor, cxb cxbVar2, uem uemVar, uem uemVar2, gnt gntVar, itl itlVar, out outVar, pbn pbnVar, ndj ndjVar, ocq ocqVar, mez mezVar, ree reeVar, got gotVar, hhc hhcVar, gtm gtmVar, cxb cxbVar3, gox goxVar, hbj hbjVar, qwz qwzVar) {
        this.A = fwiVar;
        this.L = cxbVar;
        this.B = gavVar;
        this.v = ngwVar;
        this.C = executor;
        this.w = cxbVar2;
        this.D = uemVar;
        this.E = uemVar2;
        this.c = gntVar;
        this.h = itlVar;
        this.b = outVar;
        this.F = pbnVar;
        this.d = ndjVar;
        this.z = ocqVar;
        this.e = mezVar;
        this.K = reeVar;
        this.J = gotVar;
        this.f = hhcVar;
        this.x = gtmVar;
        this.y = cxbVar3;
        this.t = goxVar;
        this.s = hbjVar;
        this.u = qwzVar;
    }

    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, tzj] */
    private final void s(gnm gnmVar) {
        synchronized (this.q) {
            gnmVar.name();
            t();
            gas gasVar = (gas) ((ovx) this.k.g).d;
            gas gasVar2 = gas.INITIATING;
            if (gasVar != gasVar2 && gasVar != gas.CAPTURE_SESSION_ACTIVE && gasVar != gas.RECORDING_SESSION_ACTIVE) {
                this.k.a(gasVar2);
                gnl gnlVar = new gnl();
                gnlVar.c(0);
                gnlVar.g(0);
                gnlVar.e(0);
                gnlVar.b(pka.BACK);
                gnlVar.i = 1;
                gnlVar.f(gnm.UNKNOWN_SOURCE);
                gnlVar.d(nkw.UNINITIALIZED);
                gnlVar.a(false);
                gnlVar.f(gnmVar);
                gnt gntVar = this.c;
                gnlVar.b(gntVar.a());
                gnlVar.d(this.v.b());
                this.n = gnlVar;
                pbp pbpVarA = this.F.a("CamcorderControllers#createCaptureSession");
                mez mezVar = this.e;
                mezVar.c();
                mezVar.j(mey.CAPTURE_SESSION_STARTING);
                Collection.EL.stream(this.p).forEach(new fkj(4));
                final fwi fwiVar = this.A;
                out.a();
                final pbp pbpVarA2 = fwiVar.c.a("CamcorderCaptureSessionFactory#createNewSession");
                gaw gawVarA = fwiVar.g.a();
                cxb cxbVar = fwiVar.m;
                gdo gdoVar = gdo.CAPTURE_SESSION;
                cxbVar.w(gdoVar).d(fwiVar.e);
                cxbVar.w(gdoVar).d(fwiVar);
                hbj hbjVar = fwiVar.k;
                gzi gziVar = gym.a;
                fyd fydVar = fwiVar.d;
                fydVar.r = gawVarA;
                fydVar.q.l(gawVarA);
                fydVar.c.c((kgw) gawVarA.X.b);
                fydVar.k.c(new fjw(fydVar, gawVarA, 16));
                ipt iptVar = fwiVar.j;
                iptVar.a = null;
                iptVar.c();
                fxn fxnVar = fwiVar.h;
                out outVar = (out) fxnVar.a.a();
                outVar.getClass();
                ktx ktxVar = (ktx) fxnVar.b.a();
                ktxVar.getClass();
                nca ncaVar = (nca) fxnVar.c.a();
                ncaVar.getClass();
                ree reeVarB = ((gnk) fxnVar.d).a();
                fyd fydVar2 = (fyd) fxnVar.e.a();
                fydVar2.getClass();
                gay gayVar = (gay) fxnVar.f.a();
                gayVar.getClass();
                ggg gggVar = (ggg) fxnVar.g.a();
                gggVar.getClass();
                Object objA = fxnVar.h.a();
                cxb cxbVar2 = (cxb) fxnVar.i.a();
                cxbVar2.getClass();
                gav gavVar = (gav) fxnVar.j.a();
                gavVar.getClass();
                gnt gntVar2 = (gnt) fxnVar.k.a();
                gntVar2.getClass();
                fbq fbqVarA = ((fbr) fxnVar.l).a();
                kfw kfwVar = (kfw) fxnVar.m.a();
                kfwVar.getClass();
                mgm mgmVar = (mgm) fxnVar.n.a();
                mgmVar.getClass();
                ggo ggoVar = (ggo) fxnVar.o.a();
                ggoVar.getClass();
                gfn gfnVarB = ((gfo) fxnVar.p).a();
                ((hbj) fxnVar.q.a()).getClass();
                Object objA2 = fxnVar.r.a();
                mfb mfbVar = (mfb) fxnVar.s.a();
                mfbVar.getClass();
                ?? A = fxnVar.u.a();
                uem uemVar = fxnVar.t;
                A.getClass();
                ggg gggVar2 = (ggg) fxnVar.v.a();
                gggVar2.getClass();
                fzb fzbVar = (fzb) fxnVar.w.a();
                fzbVar.getClass();
                gbg gbgVar = (gbg) fxnVar.x.a();
                gbgVar.getClass();
                rwc rwcVar = (rwc) fxnVar.y.a();
                rwcVar.getClass();
                owq owqVarB = ((imt) fxnVar.z).b();
                mgp mgpVar = (mgp) fxnVar.A.a();
                mgpVar.getClass();
                Executor executor = (Executor) fxnVar.B.a();
                executor.getClass();
                obu obuVar = (obu) fxnVar.D.a();
                obuVar.getClass();
                ocq ocqVar = (ocq) ((tzu) fxnVar.E).a;
                pbn pbnVar = (pbn) fxnVar.F.a();
                pbnVar.getClass();
                final fxm fxmVar = new fxm(outVar, ktxVar, ncaVar, reeVarB, fydVar2, gayVar, gggVar, (fxz) objA, cxbVar2, gavVar, gntVar2, fbqVarA, kfwVar, mgmVar, ggoVar, gfnVarB, (gds) objA2, mfbVar, uemVar, A, gggVar2, fzbVar, gbgVar, rwcVar, owqVarB, mgpVar, executor, obuVar, ocqVar, pbnVar, gawVarA);
                final syu syuVarE = fwiVar.n.e(gawVarA);
                final syu syuVarB = iptVar.b();
                final szh szhVar = new szh();
                final szh szhVar2 = new szh();
                if (gawVarA.L) {
                    fwiVar.a(gawVarA, szhVar, szhVar2, true);
                } else {
                    Surface surfaceA = fwiVar.i.a(gawVarA.d.c());
                    if (surfaceA != null) {
                        szhVar.e(surfaceA);
                        szhVar2.e(rvk.a);
                    } else {
                        fwiVar.a(gawVarA, szhVar, szhVar2, false);
                    }
                }
                syu syuVarB2 = ske.H(syuVarE, syuVarB, szhVar, szhVar2).b(new sxh() { // from class: fwg
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:168:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:172:0x0477 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:96:0x0451 A[Catch: all -> 0x0632, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x002d, B:6:0x0031, B:7:0x004d, B:22:0x0170, B:23:0x017a, B:93:0x040b, B:96:0x0451, B:98:0x0459, B:99:0x046c, B:100:0x0476, B:103:0x047a, B:105:0x0499, B:107:0x04a1, B:109:0x04a7, B:111:0x04c0, B:113:0x04c5, B:112:0x04c3, B:114:0x04df, B:116:0x04e7, B:117:0x04ec, B:119:0x04f0, B:127:0x0519, B:128:0x051b, B:132:0x053f, B:134:0x0552, B:136:0x0580, B:137:0x05a7, B:138:0x05aa, B:140:0x05c8, B:141:0x05e7, B:142:0x05fb, B:122:0x0508, B:124:0x050e, B:126:0x0516, B:129:0x0534, B:131:0x053a, B:147:0x060f, B:153:0x0615, B:159:0x061b, B:160:0x061c, B:161:0x0631, B:24:0x017b, B:25:0x019b, B:40:0x0258, B:42:0x026a, B:44:0x02b4, B:45:0x02c9, B:46:0x02ce, B:48:0x0306, B:50:0x0315, B:51:0x031b, B:53:0x031f, B:56:0x0324, B:58:0x0335, B:61:0x0352, B:64:0x0357, B:66:0x0368, B:65:0x0366, B:67:0x0371, B:69:0x0378, B:70:0x0381, B:72:0x0388, B:74:0x039a, B:75:0x03a8, B:77:0x03ac, B:84:0x03ce, B:80:0x03ba, B:82:0x03c2, B:85:0x03de, B:87:0x03e5, B:88:0x03f2, B:90:0x03f9, B:91:0x0406, B:92:0x040a, B:57:0x0333, B:150:0x0612, B:8:0x004e, B:10:0x00af, B:12:0x00b8, B:14:0x0128, B:16:0x0142, B:17:0x015a, B:20:0x0168, B:21:0x016f, B:156:0x0618, B:15:0x0140, B:11:0x00b3, B:101:0x0477, B:102:0x0479), top: B:167:0x002d, inners: #2, #4, #5 }] */
                    /* JADX WARN: Type inference failed for: r13v5, types: [fyw, java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.Object, owf] */
                    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, pjo] */
                    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, pjo] */
                    @Override // defpackage.sxh
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final defpackage.syu a() {
                        /*
                            Method dump skipped, instructions count: 1589
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwg.a():syu");
                    }
                }, fwiVar.a);
                ojl.ck(syuVarB2, new fqz(fwiVar, 2), fwiVar.b);
                this.o = this.J.e();
                this.G = syuVarB2;
                if (gnmVar.equals(gnm.CAMERA_SWITCH) || gnmVar.equals(gnm.JUPITER_SWITCH) || ((Boolean) this.B.a().B.dL()).booleanValue()) {
                    gav gavVar2 = this.B;
                    if (((Boolean) gavVar2.a().B.dL()).booleanValue() && gntVar.j()) {
                        gavVar2.a().B.a(false);
                    }
                }
                ske.W(syuVarB2, new iqw(this, gnmVar, pbpVarA, syuVarB2, 1), this.C);
                return;
            }
            ((sgt) a.c().M(442)).s("Capture session already started. Ignoring...");
        }
    }

    private final void t() {
        synchronized (this.q) {
            if (this.k == null) {
                this.k = this.B.a();
            }
            if (((gas) ((ovx) this.k.g).d).equals(gas.UNINITIALIZED)) {
                gep gepVarB = ((geq) this.D).a();
                this.I = gepVarB;
                synchronized (gepVarB.d) {
                    if (!gepVarB.e) {
                        if (gepVarB.f) {
                            gepVarB.a();
                        }
                        gepVarB.b();
                        gepVarB.a.registerAudioDeviceCallback(gepVarB.b, gepVarB.c);
                        gepVarB.f = true;
                    }
                }
                cxb cxbVar = this.L;
                gdo gdoVar = gdo.MODULE;
                cxbVar.w(gdoVar).d(this.I);
                our ourVarW = cxbVar.w(gdoVar);
                this.h.b(this.i);
                ourVarW.d(new fis(this, 12));
                cxbVar.w(gdoVar).d(this.d.e(this.g));
                gem gemVarB = ((gen) this.E).a();
                this.r = gemVarB;
                synchronized (gemVarB.e) {
                    our ourVar = gemVarB.d;
                    lti ltiVar = gemVarB.f;
                    owf owfVarH = owl.h(ltiVar.a, new fhy(13));
                    gej gejVar = new gej(gemVarB, 0);
                    sxo sxoVar = sxo.a;
                    ourVar.d(owfVarH.dK(gejVar, sxoVar));
                    ourVar.d(ltiVar.c.dK(new gej(gemVarB, 2), sxoVar));
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                    Activity activity = gemVarB.b;
                    hbj hbjVar = gemVarB.l;
                    gzi gziVar = gym.a;
                    activity.registerReceiver(gemVarB.i, intentFilter);
                }
                cxbVar.w(gdoVar).d(this.r);
            }
        }
    }

    private final boolean u() {
        boolean z;
        synchronized (this.q) {
            z = this.j != null;
        }
        return z;
    }

    @Override // defpackage.fwk
    public final fxm a() {
        fxm fxmVar;
        synchronized (this.q) {
            fxmVar = this.j;
        }
        return fxmVar;
    }

    @Override // defpackage.fwk
    public final void b(fyt fytVar) {
        synchronized (this.q) {
            this.p.add(fytVar);
        }
    }

    @Override // defpackage.fwk
    public final void c(gnm gnmVar) {
        synchronized (this.q) {
            r();
            s(gnmVar);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        m();
    }

    @Override // defpackage.fwk
    public final void d() {
        synchronized (this.q) {
            this.k = this.B.a();
        }
    }

    @Override // defpackage.fwk
    public final void e() {
        synchronized (this.q) {
            nkw nkwVarB = this.v.b();
            if (nkwVarB != nkw.SLOW_MOTION && nkwVarB != nkw.AMBER) {
                this.c.h(new foh(this, 14));
                return;
            }
            ((sgt) a.c().M(447)).v("Camera switch not supported for %s", nkwVarB);
        }
    }

    @Override // defpackage.fwk
    public final void f(int i) {
        synchronized (this.q) {
            if (u()) {
                fxm fxmVar = this.j;
                boolean z = false;
                if (fxmVar != null) {
                    synchronized (fxmVar.e) {
                        if (i == 0) {
                            fxmVar.v = false;
                        }
                    }
                }
                owq owqVar = this.k.f;
                if (i == 0 && ((Boolean) ((ovx) owqVar).d).booleanValue()) {
                    z = true;
                }
                owqVar.a(Boolean.valueOf(z));
            }
        }
    }

    @Override // defpackage.fwk
    public final void g(boolean z) {
        fxm fxmVar;
        synchronized (this.q) {
            if (u() && (fxmVar = this.j) != null) {
                fxmVar.k(z);
                if (this.m || this.l) {
                    this.d.G(false);
                    this.m = false;
                    this.l = false;
                }
            } else if (((ovx) this.k.g).d == gas.INITIATING) {
                this.m = true;
            } else {
                ((sgt) a.c().M(454)).v("onShutterButtonClicked ignored with state: %s", ((ovx) this.k.g).d);
            }
        }
    }

    @Override // defpackage.fwk
    public final void h() {
        fxm fxmVar;
        synchronized (this.q) {
            if (!u() || (fxmVar = this.j) == null) {
                ((sgt) a.c().M(457)).v("onSnapshotButtonClicked ignored with state: %s", ((ovx) this.k.g).d);
            } else {
                out.a();
                synchronized (fxmVar.e) {
                    fxy fxyVar = fxmVar.x;
                    if (fxyVar != null) {
                        out.a();
                        synchronized (fxyVar.e) {
                            fxx fxxVar = fxyVar.D;
                            if (fxxVar == fxx.RECORDING || fxxVar == fxx.RECORDING_PAUSED || fxxVar == fxx.STARTING_RECORDING) {
                                fyd fydVar = fxyVar.c;
                                fydVar.j(false);
                                ltd ltdVarA = ltd.a();
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                ltf ltfVar = ltf.VIDEO_SNAPSHOT;
                                lte lteVarB = lte.b(ltdVarA, jCurrentTimeMillis, hei.a(ltfVar, System.currentTimeMillis()), ltfVar, fxyVar.Q.q());
                                fxyVar.t.m(lteVarB, Optional.empty());
                                fxyVar.z.add(lteVarB);
                                syu syuVarA = fxyVar.m.a(lteVarB);
                                fydVar.u.o();
                                ske.W(syuVarA, new fpc(fxyVar, lteVarB, 5, (short[]) null), fxyVar.b);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.fwk
    public final void i() {
        fxm fxmVar;
        synchronized (this.q) {
            if (!u() || (fxmVar = this.j) == null) {
                ((sgt) a.c().M(459)).v("onThumbnailButtonClicked ignored with state: %s", ((ovx) this.k.g).d);
            } else {
                synchronized (fxmVar.e) {
                    fxmVar.v = true;
                }
            }
        }
    }

    @Override // defpackage.fwk
    public final void j(boolean z) {
        fxm fxmVar;
        synchronized (this.q) {
            if (!u() || (fxmVar = this.j) == null) {
                ((sgt) a.c().M(461)).v("onWindowFocusChanged ignored with state: %s", ((ovx) this.k.g).d);
            } else {
                synchronized (fxmVar.e) {
                    if (z) {
                        fxmVar.v = false;
                    }
                }
            }
        }
    }

    @Override // defpackage.fwk
    public final void k(fyt fytVar) {
        synchronized (this.q) {
            this.p.remove(fytVar);
        }
    }

    @Override // defpackage.fwk
    public final void l(boolean z) {
        synchronized (this.q) {
            if (z) {
                s(gnm.b);
            } else {
                t();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fwk
    public final void m() {
        synchronized (this.q) {
            r();
            gep gepVar = this.I;
            if (gepVar != null) {
                gepVar.a();
            }
            cxb cxbVar = this.L;
            Iterator it = new HashSet(cxbVar.a.keySet()).iterator();
            while (it.hasNext()) {
                cxbVar.x((gdo) it.next());
            }
            gau gauVar = this.k;
            if (gauVar != null) {
                gauVar.a(gas.UNINITIALIZED);
            }
        }
    }

    @Override // defpackage.fwk
    public final boolean n() {
        boolean zBo;
        synchronized (this.q) {
            muj mujVar = (muj) this.k.v.dL();
            zBo = qpt.bo(this.H, mujVar);
            if (zBo) {
                this.H = mujVar;
            }
        }
        return zBo;
    }

    @Override // defpackage.fwk
    public final boolean o() {
        synchronized (this.q) {
            if (((ovx) this.k.g).d != gas.RECORDING_SESSION_ACTIVE) {
                return false;
            }
            g(false);
            return true;
        }
    }

    @Override // defpackage.fwk
    public final boolean p() {
        fxm fxmVar;
        synchronized (this.q) {
            boolean z = false;
            if (!u() || (fxmVar = this.j) == null) {
                ((sgt) a.c().M(449)).v("onPauseButtonClicked ignored with state: %s", ((ovx) this.k.g).d);
                return false;
            }
            out.a();
            synchronized (fxmVar.e) {
                fxy fxyVar = fxmVar.x;
                if (fxyVar != null) {
                    synchronized (fxyVar.e) {
                        if (fxyVar.D != fxx.RECORDING) {
                            ((sgt) fxy.a.c().M(537)).v("Pause button ignored with state: %s", fxyVar.D);
                        } else {
                            fxyVar.k("Pause recording.");
                            fxyVar.v.f("onPauseButtonClicked");
                            Iterable$EL.forEach(fxyVar.w, new fkj(9));
                            gdv gdvVar = fxyVar.E;
                            gdvVar.getClass();
                            gdvVar.a.p();
                            gcz gczVar = fxyVar.n;
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                            synchronized (gczVar) {
                                gczVar.b.add(seo.c(Long.valueOf(jElapsedRealtimeNanos)));
                            }
                            fxyVar.f.e();
                            ((mbj) fxyVar.N.a).c(R.raw.video_pause);
                            fxyVar.M.b(1);
                            fxyVar.l(fxx.RECORDING_PAUSED);
                            if (fxyVar.j.F) {
                                fxyVar.s.c(false);
                            }
                            fxyVar.v.g();
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    @Override // defpackage.fwk
    public final boolean q() {
        fxm fxmVar;
        synchronized (this.q) {
            boolean z = false;
            z = false;
            if (!u() || (fxmVar = this.j) == null) {
                ((sgt) a.c().M(452)).v("onResumeButtonClicked ignored with state: %s", ((ovx) this.k.g).d);
                return false;
            }
            out.a();
            synchronized (fxmVar.e) {
                fxy fxyVar = fxmVar.x;
                if (fxyVar != null) {
                    synchronized (fxyVar.e) {
                        if (fxyVar.D != fxx.RECORDING_PAUSED) {
                            ((sgt) fxy.a.c().M(538)).v("Resume button ignored with state: %s", fxyVar.D);
                        } else {
                            fxyVar.k("Resume recording.");
                            pbn pbnVar = fxyVar.v;
                            pbnVar.f("onResumeButtonClicked");
                            Iterable$EL.forEach(fxyVar.w, new fkj(10));
                            ((mbj) fxyVar.N.a).c(R.raw.video_start);
                            fxyVar.M.b(2);
                            fxyVar.l(fxx.STARTING_RECORDING);
                            fxyVar.o.schedule(new fxs(fxyVar, z ? 1 : 0), 400L, TimeUnit.MILLISECONDS);
                            pbnVar.g();
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151 A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004b, B:14:0x0050, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0064, B:24:0x0068, B:26:0x0089, B:27:0x008c, B:29:0x00a1, B:30:0x00a4, B:32:0x00b9, B:33:0x00bc, B:37:0x00d2, B:39:0x00d8, B:40:0x00db, B:51:0x0104, B:53:0x010c, B:54:0x010f, B:55:0x0123, B:56:0x0126, B:86:0x01e3, B:87:0x01e6, B:70:0x0149, B:72:0x0151, B:73:0x0154, B:75:0x0170, B:76:0x0173, B:78:0x018a, B:79:0x018d, B:81:0x01b1, B:82:0x01b4, B:84:0x01c8, B:85:0x01cb, B:47:0x00fb, B:48:0x0100, B:88:0x01e7, B:89:0x01e8, B:90:0x01ed, B:91:0x01ee, B:93:0x020e, B:94:0x0213), top: B:99:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170 A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004b, B:14:0x0050, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0064, B:24:0x0068, B:26:0x0089, B:27:0x008c, B:29:0x00a1, B:30:0x00a4, B:32:0x00b9, B:33:0x00bc, B:37:0x00d2, B:39:0x00d8, B:40:0x00db, B:51:0x0104, B:53:0x010c, B:54:0x010f, B:55:0x0123, B:56:0x0126, B:86:0x01e3, B:87:0x01e6, B:70:0x0149, B:72:0x0151, B:73:0x0154, B:75:0x0170, B:76:0x0173, B:78:0x018a, B:79:0x018d, B:81:0x01b1, B:82:0x01b4, B:84:0x01c8, B:85:0x01cb, B:47:0x00fb, B:48:0x0100, B:88:0x01e7, B:89:0x01e8, B:90:0x01ed, B:91:0x01ee, B:93:0x020e, B:94:0x0213), top: B:99:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004b, B:14:0x0050, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0064, B:24:0x0068, B:26:0x0089, B:27:0x008c, B:29:0x00a1, B:30:0x00a4, B:32:0x00b9, B:33:0x00bc, B:37:0x00d2, B:39:0x00d8, B:40:0x00db, B:51:0x0104, B:53:0x010c, B:54:0x010f, B:55:0x0123, B:56:0x0126, B:86:0x01e3, B:87:0x01e6, B:70:0x0149, B:72:0x0151, B:73:0x0154, B:75:0x0170, B:76:0x0173, B:78:0x018a, B:79:0x018d, B:81:0x01b1, B:82:0x01b4, B:84:0x01c8, B:85:0x01cb, B:47:0x00fb, B:48:0x0100, B:88:0x01e7, B:89:0x01e8, B:90:0x01ed, B:91:0x01ee, B:93:0x020e, B:94:0x0213), top: B:99:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b1 A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004b, B:14:0x0050, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0064, B:24:0x0068, B:26:0x0089, B:27:0x008c, B:29:0x00a1, B:30:0x00a4, B:32:0x00b9, B:33:0x00bc, B:37:0x00d2, B:39:0x00d8, B:40:0x00db, B:51:0x0104, B:53:0x010c, B:54:0x010f, B:55:0x0123, B:56:0x0126, B:86:0x01e3, B:87:0x01e6, B:70:0x0149, B:72:0x0151, B:73:0x0154, B:75:0x0170, B:76:0x0173, B:78:0x018a, B:79:0x018d, B:81:0x01b1, B:82:0x01b4, B:84:0x01c8, B:85:0x01cb, B:47:0x00fb, B:48:0x0100, B:88:0x01e7, B:89:0x01e8, B:90:0x01ed, B:91:0x01ee, B:93:0x020e, B:94:0x0213), top: B:99:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c8 A[Catch: all -> 0x0215, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004b, B:14:0x0050, B:16:0x0058, B:18:0x005c, B:20:0x0060, B:22:0x0064, B:24:0x0068, B:26:0x0089, B:27:0x008c, B:29:0x00a1, B:30:0x00a4, B:32:0x00b9, B:33:0x00bc, B:37:0x00d2, B:39:0x00d8, B:40:0x00db, B:51:0x0104, B:53:0x010c, B:54:0x010f, B:55:0x0123, B:56:0x0126, B:86:0x01e3, B:87:0x01e6, B:70:0x0149, B:72:0x0151, B:73:0x0154, B:75:0x0170, B:76:0x0173, B:78:0x018a, B:79:0x018d, B:81:0x01b1, B:82:0x01b4, B:84:0x01c8, B:85:0x01cb, B:47:0x00fb, B:48:0x0100, B:88:0x01e7, B:89:0x01e8, B:90:0x01ed, B:91:0x01ee, B:93:0x020e, B:94:0x0213), top: B:99:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwn.r():void");
    }
}
