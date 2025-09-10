package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class lsf extends lrw {
    private static final sgv i = sgv.g("lsf");
    public final ida c;
    public final jlz d;
    public final rwc e;
    public rwc f;
    public jma g;
    public rwc h;
    private final owf j;
    private final rwc k;
    private final kpb l;
    private final pbn m;
    private final lpd n;
    private final kfl o;
    private final owf p;
    private final owf q;
    private final owq r;
    private final rwc s;
    private rwc t;
    private boolean u;
    private final hqw v;

    public lsf(lrm lrmVar, ida idaVar, owf owfVar, kpb kpbVar, owf owfVar2, owf owfVar3, pbn pbnVar, llm llmVar, owq owqVar, jlz jlzVar, hqw hqwVar, rwc rwcVar, rwc rwcVar2, String str, fse fseVar, lsw lswVar, rwc rwcVar3, kfl kflVar, rwc rwcVar4, rwc rwcVar5, ltf ltfVar, lpd lpdVar, long j) {
        super(lrmVar.a(ltfVar, str, fseVar, lswVar, llmVar, rwcVar4, kflVar, j));
        rvk rvkVar = rvk.a;
        this.f = rvkVar;
        this.g = jma.a;
        this.u = false;
        this.h = rvkVar;
        this.c = idaVar;
        this.t = rwcVar3;
        this.o = kflVar;
        this.j = owfVar;
        this.k = rwcVar5;
        this.l = kpbVar;
        gzi gziVar = gzo.a;
        this.m = pbnVar;
        this.n = lpdVar;
        this.p = owfVar2;
        this.q = owfVar3;
        this.r = owqVar;
        this.d = jlzVar;
        this.v = hqwVar;
        this.s = rwcVar;
        this.e = rwcVar2;
        this.b.z(new lmw(this, 7));
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void I() {
        J("interruptSession");
        this.u = true;
        i().b();
    }

    public final poe O() {
        return h().b;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, loz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] P(byte[] r5) {
        /*
            r4 = this;
            rwc r0 = r4.k
            ltd r1 = r4.l()
            rwg r0 = (defpackage.rwg) r0
            java.lang.Object r0 = r0.a
            iso r0 = (defpackage.iso) r0
            rwc r0 = r0.h(r1)
            boolean r1 = r0.h()
            if (r1 == 0) goto L92
            java.lang.String r1 = "Writing depth data into the jpeg image"
            r4.J(r1)
            java.lang.Object r0 = r0.c()
            pbn r1 = r4.m     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r2 = "ddepth"
            r1.f(r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1 = r0
            jod r1 = (defpackage.jod) r1     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.Object r1 = r1.a     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r2 = r0
            jod r2 = (defpackage.jod) r2     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            com.google.android.apps.camera.dynamicdepth.DynamicDepthResult r1 = (com.google.android.apps.camera.dynamicdepth.DynamicDepthResult) r1     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            byte[] r1 = com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils.d(r5, r1, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            mdm r2 = r4.o()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L42
            mdo r2 = (defpackage.mdo) r2     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L42
            r3 = 1
            r2.e = r3     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L42
            goto L60
        L40:
            r2 = move-exception
            goto L47
        L42:
            r5 = move-exception
            goto L87
        L44:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L47:
            sgv r3 = defpackage.lsf.i     // Catch: java.lang.Throwable -> L42
            shi r3 = r3.b()     // Catch: java.lang.Throwable -> L42
            shi r2 = r3.i(r2)     // Catch: java.lang.Throwable -> L42
            sgt r2 = (defpackage.sgt) r2     // Catch: java.lang.Throwable -> L42
            r3 = 4378(0x111a, float:6.135E-42)
            shi r2 = r2.M(r3)     // Catch: java.lang.Throwable -> L42
            sgt r2 = (defpackage.sgt) r2     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "Error writing depth data into jpeg."
            r2.s(r3)     // Catch: java.lang.Throwable -> L42
        L60:
            jod r0 = (defpackage.jod) r0
            r0.c()
            pbn r0 = r4.m
            r0.g()
            if (r1 != 0) goto L86
            sgv r0 = defpackage.lrw.a
            shi r0 = r0.b()
            r1 = 4352(0x1100, float:6.098E-42)
            shi r0 = r0.M(r1)
            sgt r0 = (defpackage.sgt) r0
            ltd r4 = r4.l()
            java.lang.String r1 = "[%s] %s"
            java.lang.String r2 = "Couldn't write depth data, using original stream"
            r0.E(r1, r4, r2)
            return r5
        L86:
            return r1
        L87:
            jod r0 = (defpackage.jod) r0
            r0.c()
            pbn r4 = r4.m
            r4.g()
            throw r5
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lsf.P(byte[]):byte[]");
    }

    @Override // defpackage.lrw, defpackage.lss
    public final void S() {
        pbn pbnVar = this.m;
        pbnVar.f("CaptureSessionBase#onCaptureStarted");
        super.S();
        pbnVar.h("enqueueProcessingTask");
        L();
        srw srwVar = null;
        if (this.t.h()) {
            pbnVar.h("MicrovideoController#collectCaptureStartStats");
            jmw jmwVar = (jmw) this.t.c();
            gga ggaVarE = jmwVar.e();
            if (ggaVarE != null) {
                tpc tpcVarM = srw.a.m();
                int iBE = qpt.bE(((Integer) jmwVar.e.b(luf.aO)).intValue()) - 1;
                int i2 = iBE != 0 ? iBE != 1 ? 4 : 3 : 2;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srw srwVar2 = (srw) tpcVarM.b;
                srwVar2.i = i2 - 1;
                srwVar2.b |= 64;
                int i3 = true == ((jsf) ggaVarE.a).b() ? 5 : 3;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                srw srwVar3 = (srw) tpcVarM.b;
                srwVar3.m = i3 - 1;
                srwVar3.b |= 512;
                srwVar = (srw) tpcVarM.l();
            }
            this.t = rvk.a;
        }
        pbnVar.h("CaptureSessionNotifier#onCaptureStarted");
        lru lruVarI = i();
        jja jjaVarA = jjb.a();
        jjaVarA.a = m();
        jjaVarA.b = srwVar;
        jjaVarA.c = (Float) this.j.dL();
        kfl kflVar = this.o;
        jjaVarA.b(kflVar.k);
        jjaVarA.c(kflVar.l);
        jjaVarA.f((jjq) this.p.dL());
        jjaVarA.e((lkk) this.q.dL());
        jjaVarA.d(((Boolean) this.r.dL()).booleanValue());
        lruVarI.c(jjaVarA.a());
        pbnVar.g();
        s().c(new iwh(9), sxo.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [sgt, shi] */
    @Override // defpackage.lrw, defpackage.lss
    public final void U(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        rnt.L(!lsuVar.d);
        J("saveSecondaryMedia");
        if (N().m()) {
            M("Ignoring saveSecondaryMedia. CaptureSession has been deleted or canceled.");
            return;
        }
        N().p(2, 3);
        N().q(3);
        mfoVar.c = g().b();
        mfoVar.d = ((Boolean) this.o.f.dL()).booleanValue();
        mfoVar.e = (kpa) this.l.dL();
        try {
            if (mfoVar.f.isPresent()) {
                this.v.c(lsuVar.b, (hqp) mfoVar.f.get());
            }
            long jF = f();
            jlq jlqVarA = jly.a();
            jlqVarA.e(mfoVar.f);
            jlqVarA.a = lsuVar.a.f;
            jlqVarA.d(false);
            jlqVarA.c(mfoVar.g);
            prh.F(jlz.a(bArr, jF, jlqVarA.a()), (ExifInterface) x(mfoVar).f(), lsuVar.b);
            lsuVar.b();
        } catch (IOException e) {
            ((sgt) ((sgt) i.b().i(e)).M((char) 4385)).s("Error writing secondary image to disk");
            lsuVar.a();
        }
    }

    @Override // defpackage.lrw, defpackage.lss
    public final boolean ai() {
        return this.u;
    }

    @Override // defpackage.lrw, defpackage.lss
    public final syu u(byte[] bArr, mfo mfoVar) {
        return v(bArr, mfoVar, j());
    }

    @Override // defpackage.lrw, defpackage.lss
    public final syu v(byte[] bArr, mfo mfoVar, lsu lsuVar) {
        rnt.L(lsuVar.d);
        J("saveAndFinish");
        if (N().m()) {
            M("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return s();
        }
        N().p(2, 3);
        mfoVar.c = g().b();
        mfoVar.d = ((Boolean) this.o.f.dL()).booleanValue();
        mfoVar.e = (kpa) this.l.dL();
        N().q(3);
        rwc rwcVarR = this.b.r(mfoVar, this.n);
        ske.W(z(), new jcb(this, 11), sxo.a);
        B().execute(new lse(this, mfoVar, lsuVar, rwcVarR, bArr, 0));
        return s();
    }
}
