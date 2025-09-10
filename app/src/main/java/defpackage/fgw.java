package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fgw implements fhe {
    private static final sgv b = sgv.g("fgw");
    private static final Object c = new Object();
    private static fhd d = fhd.HIDDEN;
    public final owq a;
    private final Executor e;
    private final owf f;
    private final nqm g;
    private final rwc h;
    private final owf i;
    private final Handler j;
    private final Runnable k;
    private final kuf l;
    private final owf m;
    private final owf n;
    private final owf o;
    private final owf p;
    private pae q;
    private final fgn r;
    private final mye s;
    private final gox t;
    private final hrj u;

    public fgw(Context context, owf owfVar, gox goxVar, nqm nqmVar, fgo fgoVar, fgn fgnVar, owq owqVar, hrj hrjVar, owf owfVar2, mye myeVar, kuf kufVar, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, Handler handler) {
        this.e = context.getMainExecutor();
        this.f = owfVar;
        this.t = goxVar;
        this.g = nqmVar;
        this.a = owqVar;
        this.u = hrjVar;
        this.i = owfVar2;
        this.s = myeVar;
        this.l = kufVar;
        this.m = owfVar3;
        this.n = owfVar4;
        this.o = owfVar5;
        this.p = owfVar6;
        this.r = fgnVar;
        if (fgnVar.g()) {
            this.h = rwc.j(fgoVar);
        } else {
            this.h = rvk.a;
        }
        this.j = new Handler(handler.getLooper());
        this.k = new cmc(this, fgnVar, 3);
        new Handler(handler.getLooper());
        hrjVar.getClass();
    }

    private final synchronized void r() {
        rwc rwcVar = this.h;
        if (rwcVar.h()) {
            ((fgo) rwcVar.c()).d();
        }
        if (this.r.b()) {
            this.g.c(true);
        }
    }

    @Override // defpackage.fhe
    public final synchronized paq a(pae paeVar) {
        shl shlVar = shx.a;
        this.q = paeVar;
        synchronized (c) {
            if (d != fhd.HIDDEN) {
                rwc rwcVar = this.h;
                if (rwcVar.h()) {
                    ((fgo) rwcVar.c()).k(d);
                }
            }
        }
        return new ffy(this, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4 A[Catch: all -> 0x00eb, TryCatch #0 {, blocks: (B:5:0x0004, B:7:0x000a, B:9:0x000e, B:11:0x0024, B:13:0x002c, B:14:0x0032, B:16:0x004c, B:33:0x00e8, B:18:0x0059, B:20:0x006f, B:22:0x0077, B:23:0x007d, B:25:0x0097, B:26:0x00a0, B:27:0x00a4, B:31:0x00c5, B:32:0x00cb), top: B:42:0x0004, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(boolean r5) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgw.b(boolean):void");
    }

    @Override // defpackage.fhe
    public final synchronized void c() {
        if (p()) {
            g();
        }
        b(true);
    }

    @Override // defpackage.fhe
    public final synchronized void d() {
        synchronized (c) {
            if (d != fhd.HIDDEN) {
                shl shlVar = shx.a;
                d = ((fhb) this.a.dL()).b;
            }
        }
        shl shlVar2 = shx.a;
        r();
    }

    @Override // defpackage.fhe
    public final void e() {
        b(false);
    }

    @Override // defpackage.fhe
    public final synchronized void f() {
        synchronized (c) {
            fhd fhdVar = d;
            fhd fhdVar2 = fhd.HIDDEN;
            if (fhdVar == fhdVar2) {
                shl shlVar = shx.a;
                return;
            }
            d = fhdVar2;
            shl shlVar2 = shx.a;
            r();
        }
    }

    @Override // defpackage.fhe
    public final void g() {
        hrj hrjVar = this.u;
        if (hrjVar.b != null) {
            shl shlVar = shx.a;
            ((out) hrjVar.e).execute(new fem(hrjVar, 7));
        }
    }

    public final synchronized void h() {
        Handler handler = this.j;
        Runnable runnable = this.k;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 5000L);
    }

    @Override // defpackage.fhe
    public final void i() {
        rwc rwcVar = this.h;
        if (rwcVar.h()) {
            ((fgo) rwcVar.c()).f();
        } else {
            ((sgt) ((sgt) b.c().h(shx.a, "BobaPreviewMgr")).M(126)).s("View effect not present, cannot play entry animation.");
        }
    }

    @Override // defpackage.fhe
    public final void j(poj pojVar, RectF rectF, boolean z) {
        if (rectF != null) {
            int iIntValue = this.h.h() ? this.q.equals(pae.c) ? 0 : ((Integer) this.f.dL()).intValue() : ((Integer) this.f.dL()).intValue() + ((mxm) this.m.dL()).e;
            Matrix matrix = new Matrix();
            matrix.setRotate(iIntValue % 360, 0.5f, 0.5f);
            matrix.mapRect(rectF);
        }
        rwc rwcVar = this.h;
        if (rwcVar.h()) {
            synchronized (c) {
                ((fgo) rwcVar.c()).i(((Integer) this.o.dL()).intValue());
                ((fgo) rwcVar.c()).l(this.s);
                ((fgo) rwcVar.c()).j((mxm) this.m.dL());
                ((fgo) rwcVar.c()).g((mxj) this.n.dL());
                ((fgo) rwcVar.c()).h(this.l);
                ((fgo) rwcVar.c()).k(d);
                ((fgo) rwcVar.c()).e(pojVar, rectF, z);
            }
        }
    }

    @Override // defpackage.fhe
    public final synchronized void k() {
        boolean zC = this.r.c();
        synchronized (c) {
            if (d != fhd.HIDDEN) {
                shl shlVar = shx.a;
                return;
            }
            d = zC ? ((fhb) this.a.dL()).b : ((fhb) this.a.dL()).c;
            shl shlVar2 = shx.a;
            rwc rwcVar = this.h;
            if (rwcVar.h()) {
                fhd fhdVar = (zC || ((Boolean) ((ovx) this.t.b).d).booleanValue()) ? ((fhb) this.a.dL()).b : ((fhb) this.a.dL()).c;
                ((fgo) rwcVar.c()).k(fhdVar);
            }
        }
    }

    @Override // defpackage.fhe
    public final void l() {
        hrj hrjVar = this.u;
        if (hrjVar.b != null) {
            shl shlVar = shx.a;
            ((out) hrjVar.e).execute(new fem(hrjVar, 8));
        }
    }

    public final synchronized void m() {
        shl shlVar = shx.a;
        rwc rwcVar = this.h;
        if (rwcVar.h()) {
            ((fgo) rwcVar.c()).d();
        }
    }

    @Override // defpackage.fhe
    public final boolean n() {
        boolean z;
        synchronized (c) {
            z = d.ordinal() <= ((fhb) this.a.dL()).b.ordinal();
        }
        return z;
    }

    @Override // defpackage.fhe
    public final boolean o() {
        boolean z;
        synchronized (c) {
            z = d.ordinal() >= ((fhb) this.a.dL()).c.ordinal();
        }
        return z;
    }

    @Override // defpackage.fhe
    public final boolean p() {
        return ((fhi) this.p.dL()).b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, owf] */
    @Override // defpackage.fhe
    public final synchronized paq q() {
        our ourVar;
        ourVar = new our();
        owf owfVarA = owb.a(this.t.b);
        fbo fboVar = new fbo(this, 15);
        Executor executor = this.e;
        ourVar.d(owfVarA.dK(fboVar, executor));
        ourVar.d(this.i.dK(new fbo(this, 16), executor));
        ourVar.d(this.p.dK(new fbo(this, 17), executor));
        return ourVar;
    }
}
