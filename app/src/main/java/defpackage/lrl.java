package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lrl implements lss {
    public static final sgv a = sgv.g("lrl");
    public final ocq A;
    public final iso B;
    public final ggg C;
    public ggg D;
    public final ggg E;
    private final Executor G;
    private final lsp H;
    private llq I;
    private final List J;
    private boolean K;
    private final llm L;
    private final AtomicBoolean M;
    private final fee N;
    private final Supplier O;
    private int P;
    private final gox Q;
    private final mwq R;
    public final hem b;
    public final ltf c;
    public final Executor e;
    public final lte f;
    public final lru g;
    public final fse h;
    public final mdm i;
    public final szh j;
    public final szh k;
    public final Phaser l;
    public boolean m;
    public icv n;
    public final llg o;
    public final rwc p;
    public final lsw q;
    public lsu r;
    public final szh s;
    public final lsa t;
    public final long u;
    public volatile rwc v;
    public boolean w;
    public int x;
    public int y;
    public final hbj z;
    private nfm F = nfo.a;
    public par d = par.c;

    public lrl(Executor executor, Executor executor2, ggg gggVar, lru lruVar, mdm mdmVar, hem hemVar, lsp lspVar, ocq ocqVar, hbj hbjVar, mwq mwqVar, gox goxVar, iso isoVar, lsa lsaVar, fee feeVar, Supplier supplier, ltf ltfVar, String str, fse fseVar, lsw lswVar, llm llmVar, rwc rwcVar, kfl kflVar, long j) {
        szh szhVar = new szh();
        this.j = szhVar;
        this.k = new szh();
        this.J = new ArrayList();
        this.l = new Phaser(1);
        this.K = false;
        this.m = false;
        this.n = icv.b().i();
        this.x = 1;
        this.y = 1;
        this.s = new szh();
        this.M = new AtomicBoolean(false);
        this.P = -1;
        this.w = false;
        this.e = executor;
        this.G = executor2;
        this.H = lspVar;
        this.q = lswVar;
        this.g = lruVar;
        this.C = gggVar;
        this.h = fseVar;
        this.A = ocqVar;
        this.z = hbjVar;
        this.R = mwqVar;
        this.i = mdmVar;
        this.b = hemVar;
        this.L = llmVar;
        this.p = rwcVar;
        this.c = ltfVar;
        this.O = supplier;
        this.E = new ggg((char[]) null, (char[]) null);
        this.Q = goxVar;
        this.B = isoVar;
        this.t = lsaVar;
        this.u = j;
        this.N = feeVar;
        lte lteVarA = lte.a(ltd.a(), j, str, ltfVar, kflVar.k);
        this.f = lteVarA;
        this.o = new lme(this);
        lspVar.h(lteVarA.a, szhVar, lswVar.c);
        this.v = rvk.a;
    }

    private final void ao(Bitmap bitmap, int i) {
        syu syuVarI;
        ad("writeMarsThumbnail");
        lsw lswVar = this.q;
        int i2 = 1;
        rnt.M(lswVar.c == ltg.MARS_STORE, "Thumbnail can be written to store only when using private store API");
        Optional optionalC = lswVar.c();
        if (optionalC.isEmpty()) {
            ((sgt) lsw.a.c().M(4420)).v("Skipping thumbnail for not having primary media file in GcaMediaGroup %s", lswVar);
            syuVarI = ske.M(false);
        } else {
            syuVarI = swz.i(((lsu) optionalC.get()).b.c(), new ozj(lswVar, bitmap, i, i2), this.G);
        }
        ske.W(syuVarI, new jcb(this, 9), sxo.a);
    }

    @Override // defpackage.lss
    public final void A(Throwable th) {
        if (this.M.get()) {
            F(nfo.a, new hht(th));
        } else {
            ((sgt) a.c().M(4335)).s("Session not canceled because capture wasn't completed yet.");
        }
    }

    final void B() {
        szh szhVar = this.j;
        synchronized (szhVar) {
            if (!szhVar.cancel(false)) {
                K("Could not cancel MediaStore insertion");
            }
        }
    }

    @Override // defpackage.lss
    public final void C() {
        this.g.j(this.x, this.y);
    }

    @Override // defpackage.lss
    public final void D() {
        ad("finalizeSession");
        this.C.t(this.D);
        this.g.a();
        this.o.h();
    }

    @Override // defpackage.lss
    public final /* synthetic */ void E() {
        lpa.l();
    }

    @Override // defpackage.lss
    public final void F(nfm nfmVar, Throwable th) {
        K("finishWithFailure, throwable message = ".concat(String.valueOf(th.getMessage())));
        ggg gggVar = this.E;
        if (gggVar.m()) {
            K("Ignoring finishWithFailure. CaptureSession already saved/canceled or failed.");
            return;
        }
        gggVar.q(4);
        this.F = nfmVar;
        x();
        P(nfmVar);
        ggg gggVar2 = this.C;
        ggg gggVar3 = this.D;
        gggVar3.getClass();
        gggVar2.t(gggVar3);
        this.g.h(this.x, this.y, th);
        this.b.k(this.f.b);
    }

    @Override // defpackage.lss
    public final void G(boolean z, boolean z2) {
        this.b.g(this.f.b, "onFramesRequested, isZsl=" + z + ", isFlashShot=" + z2);
        if (z) {
            rwc rwcVar = this.p;
            if (!rwcVar.h()) {
                return;
            }
            Object objC = rwcVar.c();
            ((mex) objC).j(met.FRAMES_TAKEN);
            meu meuVar = (meu) objC;
            pbp pbpVar = meuVar.a;
            if (pbpVar != null) {
                pbpVar.a();
                meuVar.a = null;
            }
        }
        this.g.d(z, z2);
    }

    @Override // defpackage.lss
    public final void H() {
        this.b.g(this.f.b, "onFramesSubmitted");
        this.Q.z(this.i);
    }

    @Override // defpackage.lss
    public final void I() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lss
    public final void J(String str) {
        ad(str);
    }

    final synchronized void L() {
        lsp lspVar = this.H;
        ltd ltdVarL = l();
        lspVar.e(ltdVarL, new kee(lspVar, ltdVarL, 20), "#onSessionCaptureIndicatorUpdate ".concat(String.valueOf(String.valueOf(ltdVarL))));
    }

    final synchronized void M(ltd ltdVar) {
        ad("notifySessionUpdated");
        lsp lspVar = this.H;
        lspVar.e(ltdVar, new lsn(lspVar, ltdVar, 4), "#onSessionUpdated ".concat(String.valueOf(String.valueOf(ltdVar))));
    }

    final synchronized void N() {
        this.j.cancel(false);
        lsp lspVar = this.H;
        Map map = lspVar.c;
        ltd ltdVarL = l();
        syu syuVar = (syu) map.get(ltdVarL);
        if (syuVar == null) {
            ((sgt) lsp.a.b().M(4402)).v("%s: No queued future found, maybe shot already finalized?: notifyTaskCanceled", ltdVarL);
        } else {
            syuVar.c(new lsn(lspVar, ltdVarL, 2), sxo.a);
        }
    }

    public final synchronized void O() {
        this.H.g(l());
    }

    final synchronized void P(nfm nfmVar) {
        lsp lspVar = this.H;
        Map map = lspVar.c;
        ltd ltdVarL = l();
        syu syuVar = (syu) map.get(ltdVarL);
        if (syuVar == null) {
            ((sgt) lsp.a.b().M(4408)).v("%s: No queued future found, maybe shot already finalized?: notifyTaskFailed", ltdVarL);
        } else {
            syuVar.c(new lsn(lspVar, ltdVarL, 0), sxo.a);
        }
    }

    final synchronized void Q(par parVar) {
        ac(Integer.valueOf(parVar.e));
        ltd ltdVarL = l();
        lsp lspVar = this.H;
        lspVar.e(ltdVarL, new lqd((Object) lspVar, (Object) ltdVarL, (Object) parVar, 4, (short[]) null), "#onSessionProgress ".concat(String.valueOf(String.valueOf(ltdVarL))));
    }

    @Override // defpackage.lss
    public final void R() {
        this.M.set(true);
    }

    @Override // defpackage.lss
    public final void S() {
        throw null;
    }

    @Override // defpackage.lss
    public final void T(pjo pjoVar) {
        this.P = this.N.c(pjoVar);
        this.w = ((Boolean) this.O.get()).booleanValue();
    }

    @Override // defpackage.lss
    public final /* synthetic */ void U(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        lpa.o();
    }

    @Override // defpackage.lss
    public final void V(icv icvVar) {
        this.n = icvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void W(defpackage.par r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 1
            if (r7 != 0) goto Ld
            par r7 = defpackage.par.a     // Catch: java.lang.Throwable -> Lb
            if (r6 == r7) goto L9
            goto Ld
        L9:
            r0 = 0
            goto Ld
        Lb:
            r6 = move-exception
            goto L76
        Ld:
            java.lang.String r7 = "Cannot set progress to 100% before persisting images."
            defpackage.rnt.B(r0, r7)     // Catch: java.lang.Throwable -> Lb
            r5.d = r6     // Catch: java.lang.Throwable -> Lb
            lsw r7 = r5.q     // Catch: java.lang.Throwable -> Lb
            ltg r0 = r7.c     // Catch: java.lang.Throwable -> Lb
            ltg r1 = defpackage.ltg.MARS_STORE     // Catch: java.lang.Throwable -> Lb
            if (r0 != r1) goto L68
            boolean r2 = r5.m     // Catch: java.lang.Throwable -> Lb
            if (r2 != 0) goto L28
            par r2 = defpackage.par.d     // Catch: java.lang.Throwable -> Lb
            int r3 = r6.compareTo(r2)     // Catch: java.lang.Throwable -> Lb
            if (r3 >= 0) goto L29
        L28:
            r2 = r6
        L29:
            java.util.concurrent.Executor r3 = r5.G     // Catch: java.lang.Throwable -> Lb
            if (r0 == r1) goto L2e
            goto L68
        L2e:
            boolean r0 = r2.d()     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L68
            j$.util.Optional r0 = r7.c()     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto L52
            sgv r0 = defpackage.lsw.a     // Catch: java.lang.Throwable -> Lb
            shi r0 = r0.c()     // Catch: java.lang.Throwable -> Lb
            r1 = 4414(0x113e, float:6.185E-42)
            shi r0 = r0.M(r1)     // Catch: java.lang.Throwable -> Lb
            sgt r0 = (defpackage.sgt) r0     // Catch: java.lang.Throwable -> Lb
            java.lang.String r1 = "Skipping progress update for not having primary media file in GcaMediaGroup %s"
            r0.v(r1, r7)     // Catch: java.lang.Throwable -> Lb
            goto L68
        L52:
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb
            lsu r0 = (defpackage.lsu) r0     // Catch: java.lang.Throwable -> Lb
            pos r0 = r0.b     // Catch: java.lang.Throwable -> Lb
            syu r0 = r0.c()     // Catch: java.lang.Throwable -> Lb
            iiz r1 = new iiz     // Catch: java.lang.Throwable -> Lb
            r4 = 10
            r1.<init>(r7, r2, r4)     // Catch: java.lang.Throwable -> Lb
            defpackage.ske.W(r0, r1, r3)     // Catch: java.lang.Throwable -> Lb
        L68:
            r5.Q(r6)     // Catch: java.lang.Throwable -> Lb
            llq r7 = r5.I     // Catch: java.lang.Throwable -> Lb
            if (r7 == 0) goto L74
            r7.a(r6)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r5)
            return
        L74:
            monitor-exit(r5)
            return
        L76:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrl.W(par, boolean):void");
    }

    @Override // defpackage.lss
    public final synchronized void X(nfm nfmVar) {
        ggg gggVar = this.E;
        if (!gggVar.o() && !gggVar.n()) {
            K("Ignoring setProgressMessage - state is !started && !finishing: ".concat(ojl.bH()));
            return;
        }
        ad("setProgressMessage");
        this.F = nfmVar;
        if (!jea.n(nfmVar) && this.d == par.c) {
            this.d = par.b;
        }
        llq llqVar = this.I;
        if (llqVar != null) {
            llqVar.b(nfmVar);
        }
    }

    public final synchronized void Y() {
        if (this.r != null) {
            return;
        }
        ltf ltfVar = this.c;
        if (ltfVar == ltf.COTTAGE) {
            this.r = this.q.b("jpg");
        } else if (ltfVar.equals(ltf.LONG_SHOT) || ltfVar.equals(ltf.AUTO_LONG_SHOT)) {
            this.r = this.q.a("mp4");
        } else {
            this.r = this.q.a("jpg");
        }
        this.q.e(new lrj(this));
        this.j.f(ske.Q(new dyo(this, 16), this.G));
    }

    @Override // defpackage.lss
    public final void Z(pas pasVar) {
        throw null;
    }

    @Override // defpackage.lln
    public final par a() {
        return this.d;
    }

    @Override // defpackage.lss
    public final void aa(long j) {
        this.H.d(new geb(j, 6));
    }

    @Override // defpackage.lss
    public final /* synthetic */ void ab() {
        lpa.k(this);
    }

    @Override // defpackage.lss
    public final void ac(Integer num) {
        if (this.E.m()) {
            ((sgt) a.c().M(4344)).s("stillAlive called on finished/canceled shot.");
            return;
        }
        this.b.l(this.f.b, num);
        llm llmVar = this.L;
        if (llmVar != null) {
            TimeUnit.SECONDS.getClass();
            llmVar.b();
        }
    }

    public final void ad(String str) {
        this.b.g(this.f.b, str);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.lss
    public final void ae(Bitmap bitmap, int i) {
        if (this.E.m()) {
            ((sgt) a.c().M(4345)).s("Skip updateCaptureIndicatorThumbnail, session was canceled.");
            return;
        }
        ad("updateCaptureIndicatorThumbnail");
        ggg gggVar = this.C;
        ggg gggVar2 = this.D;
        gggVar2.getClass();
        gggVar.u(gggVar2, bitmap, i);
        if (this.q.c == ltg.MARS_STORE) {
            ao(bitmap, i);
        }
        if (this.K) {
            return;
        }
        this.K = true;
        this.g.f(this.p);
        if (this.c.equals(ltf.COTTAGE)) {
            this.H.f(l(), bitmap, i);
        }
        mwq mwqVar = this.R;
        ske.W(!mwqVar.a.isEmpty() ? ske.P(new ng(mwqVar, bitmap, i, 12), mwqVar.b) : ske.L(new IllegalStateException("Update delegate is not set!")), new lrk(this, bitmap, i, 0), sxo.a);
        L();
    }

    @Override // defpackage.lss
    public final void af(Bitmap bitmap) {
        if (this.E.m()) {
            ((sgt) a.c().M(4346)).s("Skip updateIntermediateThumbnail, session was canceled.");
            return;
        }
        ad("updateIntermediateThumbnail");
        ggg gggVar = this.C;
        ggg gggVar2 = this.D;
        gggVar2.getClass();
        gggVar.u(gggVar2, bitmap, 0);
        M(l());
        if (this.q.c == ltg.MARS_STORE) {
            ao(bitmap, 0);
        }
    }

    @Override // defpackage.lss
    public final void ag(Bitmap bitmap, int i) {
        this.H.f(l(), bitmap, i);
    }

    @Override // defpackage.lss
    public final boolean ah() {
        return this.w;
    }

    @Override // defpackage.lss
    public final boolean ai() {
        return false;
    }

    @Override // defpackage.lss
    public final void aj() {
        ad("Arrived expected file: DNG");
        this.l.arrive();
    }

    @Override // defpackage.lss
    public final void ak() {
        ad("Registering expected file: DNG");
        this.l.register();
    }

    @Override // defpackage.lss
    public final void am(int i) {
        if (this.x == 1) {
            this.x = i;
        }
        this.y = i;
    }

    @Override // defpackage.lss
    public final void an(ggg gggVar) {
        this.v = rwc.j(gggVar);
    }

    @Override // defpackage.lln
    public final void b(Throwable th) {
        if (this.K && !(th instanceof hhr)) {
            ad("cancel() invoked, but userNotifiedCaptureOccurred. Invoking finishWithFailure.");
            F(nfo.a, new hht("cancel invoked, but user already notified.", th));
            return;
        }
        ggg gggVar = this.E;
        if (gggVar.m()) {
            K("Ignoring cancel. CaptureSession already saved/canceled or failed. Cause:".concat(String.valueOf(String.valueOf(th))));
            return;
        }
        ad("cancel");
        gggVar.q(4);
        x();
        N();
        ggg gggVar2 = this.D;
        if (gggVar2 != null) {
            this.C.t(gggVar2);
            this.D = null;
        }
        if (!(th instanceof hhj) && !(th instanceof hhe)) {
            th = new hhr(th);
        }
        this.g.g(this.x, this.y, th);
        this.b.i(this.f.b);
    }

    @Override // defpackage.lln
    public final synchronized void c(par parVar) {
        W(parVar, false);
    }

    @Override // defpackage.lln
    public final void d(llq llqVar) {
        if (llqVar != null) {
            nfm nfmVar = this.F;
            if (!jea.n(nfmVar)) {
                llqVar.b(nfmVar);
            }
            llqVar.a(this.d);
        }
        this.I = llqVar;
    }

    @Override // defpackage.lss
    public final int e() {
        int i = this.P;
        if (i >= 0) {
            return i;
        }
        ((sgt) a.b().M(4337)).s("Invalid image rotation! onTakePictureStarted not called.");
        return 90;
    }

    @Override // defpackage.lss
    public final long f() {
        return this.u;
    }

    @Override // defpackage.lss
    public final fse g() {
        return this.h;
    }

    @Override // defpackage.lss
    public final icv h() {
        return this.n;
    }

    public final llm i() {
        llm llmVar = this.L;
        llmVar.getClass();
        return llmVar;
    }

    @Override // defpackage.lss
    public final lsu j() {
        Y();
        lsu lsuVar = this.r;
        lsuVar.getClass();
        return lsuVar;
    }

    @Override // defpackage.lss
    public final lsw k() {
        return this.q;
    }

    @Override // defpackage.lss
    public final ltd l() {
        return this.f.a;
    }

    @Override // defpackage.lss
    public final ltf m() {
        return this.c;
    }

    @Override // defpackage.lss
    public final ltg n() {
        return this.q.c;
    }

    @Override // defpackage.lss
    public final mdm o() {
        return this.i;
    }

    @Override // defpackage.lss
    public final rwc p() {
        return this.v;
    }

    @Override // defpackage.lss
    public final rwc q() {
        return this.p;
    }

    final rwc r(mfo mfoVar, lpd lpdVar) {
        return mfoVar.b.b(new irm(this, mfoVar, lpdVar, 3, null));
    }

    @Override // defpackage.lss
    public final syu s() {
        return this.s;
    }

    @Override // defpackage.lss
    public final syu t() {
        return ske.N(this.j);
    }

    public final String toString() {
        return this.f.toString();
    }

    @Override // defpackage.lss
    public final /* synthetic */ syu u(byte[] bArr, mfo mfoVar) {
        return lpa.m();
    }

    @Override // defpackage.lss
    public final /* synthetic */ syu v(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        return lpa.n();
    }

    @Override // defpackage.lss
    public final String w() {
        return this.f.c;
    }

    public final synchronized void x() {
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        Y();
        B();
        this.q.d();
    }

    @Override // defpackage.lss
    public final void y(ltb ltbVar) {
        this.g.k(ltbVar);
    }

    final synchronized void z(Runnable runnable) {
        this.J.add(runnable);
    }

    final void K(String str) {
        ((sgt) a.c().M(4341)).E(ibINv.TfSebIzwgEP, l(), str);
    }

    public final void al() {
        ((sgt) a.b().M(4339)).E("[%s] %s", l(), qcjAcSmlN.LfyV);
    }
}
