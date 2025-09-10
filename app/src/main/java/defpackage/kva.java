package defpackage;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kva implements fbl, paq {
    public final Executor a;
    public final kuj b;
    public final kgg c;
    public final lae d;
    final owf e;
    public final pfu f;
    public final qrh g;
    public final qqq h;
    public final mwq i;
    private final uem k;
    private final CaptureRequest.Key l;
    private final CaptureRequest.Key m;
    private final owf n;
    private final kvv o;
    private final owq p;
    private final owf q;
    private final kvl r;
    private final boolean s;
    private final kfw v;
    private final hbj w;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private volatile kux t = null;
    private volatile fda u = null;

    public kva(pfu pfuVar, qqq qqqVar, kuj kujVar, uem uemVar, jvb jvbVar, Executor executor, kgg kggVar, mwq mwqVar, qrh qrhVar, lae laeVar, owf owfVar, kvv kvvVar, kfw kfwVar, owq owqVar, owq owqVar2, kgw kgwVar, owf owfVar2, kvl kvlVar, hbj hbjVar, owf owfVar3) {
        this.f = pfuVar;
        this.h = qqqVar;
        this.a = executor;
        this.b = kujVar;
        this.k = uemVar;
        this.l = (CaptureRequest.Key) jvbVar.b.orElseThrow();
        this.m = (CaptureRequest.Key) jvbVar.a.orElseThrow();
        this.c = kggVar;
        this.i = mwqVar;
        this.g = qrhVar;
        this.d = laeVar;
        this.n = owfVar;
        this.o = kvvVar;
        this.v = kfwVar;
        this.p = kgwVar.l() != pka.FRONT ? owqVar : owqVar2;
        this.q = owfVar2;
        this.w = hbjVar;
        this.r = kvlVar;
        gzg gzgVar = gze.a;
        this.e = owfVar3;
        this.s = hbjVar.p(gze.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, owq] */
    public final void g(boolean z, boolean z2, boolean z3) {
        boolean z4 = false;
        if (z3) {
            this.g.d.a(false);
        }
        if (z2) {
            this.i.b.a(false);
        }
        lnn lnnVar = ((kfv) ((mwq) this.v.a.d).b).b;
        if ((lnnVar == lnn.FOCUSED_LOCKED || lnnVar == lnn.NOT_FOCUSED_LOCKED) && z2) {
            z4 = true;
        }
        boolean z5 = z4;
        if (z5) {
            this.i.a.a(false);
        }
        this.a.execute(new kvt(this, z5, z3, z, z2, 1));
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, owq] */
    @Override // defpackage.fbl
    public final synchronized fda a(ejt ejtVar) {
        fda fdaVar = this.u;
        if (fdaVar != null) {
            fdaVar.d();
        }
        float fFloatValue = ((Float) this.n.dL()).floatValue();
        boolean zBooleanValue = ((Boolean) this.e.dL()).booleanValue();
        if ((this.s && fFloatValue >= 15.0f) || zBooleanValue) {
            fda fdaVarA = this.o.a(ejtVar);
            this.u = fdaVarA;
            return fdaVarA;
        }
        ejtVar.a();
        ejtVar.b();
        if (this.j.get()) {
            return new fca();
        }
        uem uemVar = this.k;
        owf owfVar = this.q;
        kux kuxVarB = ((kuy) uemVar).a();
        if (((Boolean) owfVar.dL()).booleanValue() && !this.w.p(gzy.l)) {
            fda fdaVarA2 = this.r.a(ejtVar);
            this.u = fdaVarA2;
            return fdaVarA2;
        }
        if (!((Boolean) ((ovx) this.g.d).d).booleanValue()) {
            this.d.g();
        }
        owq owqVar = this.p;
        if (((Integer) owqVar.dL()).intValue() == ltq.ON_LOCKED.f) {
            owqVar.a(Integer.valueOf(ltq.ON.f));
        }
        g(false, true, !((Boolean) ((ovx) r1).d).booleanValue());
        this.i.b.a(true);
        kux kuxVar = this.t;
        if (kuxVar != null) {
            this.b.p(kuxVar);
        }
        this.t = kuxVarB;
        this.b.o(kuxVarB);
        this.a.execute(new kee(this, ejtVar, 8, null));
        kuz kuzVar = new kuz(this, kuxVarB);
        this.u = kuzVar;
        return kuzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        ?? r1;
        this.c.b(true);
        c(f(2));
        scn<CaptureRequest.Key> scnVarH = scn.H(this.l, this.m);
        pez pezVar = this.f.b;
        synchronized (pezVar) {
            r1 = 0;
            for (CaptureRequest.Key key : scnVarH) {
                ?? r3 = pezVar.a;
                if (r3.containsKey(key)) {
                    r1 = pezVar.d;
                    r3.remove(key);
                }
            }
        }
        if (r1 != 0) {
            r1.run();
        }
    }

    public final void c(scn scnVar) {
        try {
            pfz pfzVarU = this.f.u();
            try {
                pfzVarU.m(scnVar, pdr.a);
                pfzVarU.close();
            } catch (Throwable th) {
                try {
                    pfzVarU.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (InterruptedException | pco e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.j.set(true);
        kux kuxVar = this.t;
        if (kuxVar != null) {
            this.b.p(kuxVar);
        }
        fda fdaVar = this.u;
        if (fdaVar != null) {
            fdaVar.d();
        }
    }

    public final scn e(int i, PointF pointF) {
        MeteringRectangle[] meteringRectangleArrH = i == 1 ? this.h.H(pointF) : this.h.G(pointF);
        return scn.H(new pej(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArrH), new pej(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArrH));
    }

    public final scn f(int i) {
        CaptureRequest.Key key = this.l;
        Integer numValueOf = Integer.valueOf(i);
        return scn.H(new pej(key, numValueOf), new pej(this.m, numValueOf));
    }
}
