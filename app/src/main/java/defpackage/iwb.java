package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.ui.gridlines.gBW.mNLbzhCxd;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.ShotMetadata;
import com.pairip.VMRunner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class iwb implements iad, iac, iam, hzi, iai {
    public static final sgv a = sgv.g("iwb");
    public final iwp b;
    public final icp c;
    public final pbn d;
    public final Executor e;
    public final rwc g;
    public final ihc h;
    public final cxb j;
    private final hxv k;
    private final tzj l;
    private final Gcam m;
    private final owf n;
    private final lat o;
    private final iso p;
    private final ocq q;
    private final ejt r;
    public final Map f = new HashMap();
    public paq i = null;

    public iwb(tzj tzjVar, hxv hxvVar, iso isoVar, rwc rwcVar, Gcam gcam, icp icpVar, pbn pbnVar, Executor executor, cxb cxbVar, owf owfVar, rwc rwcVar2, ocq ocqVar, lat latVar, ejt ejtVar, ihc ihcVar) {
        this.l = tzjVar;
        this.k = hxvVar;
        this.p = isoVar;
        this.m = gcam;
        this.c = icpVar;
        this.d = pbnVar;
        this.e = executor;
        a.I(rwcVar.h());
        this.b = (iwp) rwcVar.c();
        this.j = cxbVar;
        this.n = owfVar;
        this.g = rwcVar2;
        this.q = ocqVar;
        this.o = latVar;
        this.r = ejtVar;
        this.h = ihcVar;
    }

    public static final void k(ivq ivqVar, String str, Throwable th) {
        ((sgt) ((sgt) a.b().i(th)).M(2472)).C("%s %d", str, ivqVar.h);
        ivqVar.d();
        ivqVar.e();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        sgv sgvVar = a;
        ((sgt) sgvVar.c().M(2447)).v("Abort shot %s", ltdVar);
        pbn pbnVar = this.d;
        pbnVar.f("MotionBlur#abortShot");
        paq paqVar = this.i;
        iby ibyVar = null;
        if (paqVar != null) {
            paqVar.close();
            this.i = null;
        }
        Map map = this.f;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            iby ibyVar2 = (iby) it.next();
            if (ibyVar2.x.b.l().equals(ltdVar)) {
                ibyVar = ibyVar2;
                break;
            }
        }
        Runnable iwhVar = new iwh(1);
        if (ibyVar == null) {
            ((sgt) sgvVar.c().M(2449)).s("Inflight shot not found, aborting the moblur session only.");
        } else {
            ibyVar.a();
            ivq ivqVar = (ivq) map.remove(ibyVar);
            if (ivqVar != null) {
                iwhVar = new ivi(ivqVar, 8);
                ivqVar.b();
            }
        }
        this.b.b(ltdVar.a, iwhVar);
        pbnVar.g();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uem] */
    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        ibyVar.a();
        Map map = this.f;
        rnt.L(!map.containsKey(ibyVar));
        gga ggaVar = ibyVar.x;
        int iE = ggaVar.b.e();
        hxu hxuVarA = this.k.a();
        paq paqVar = this.i;
        paqVar.getClass();
        iwt iwtVar = (iwt) this.n.dL();
        Object objA = this.r.a.a();
        iwtVar.getClass();
        map.put(ibyVar, new ivq((hkk) objA, ggaVar, hxuVarA, burstSpec, poeVar, ibyVar, paqVar, iwtVar, iE));
        this.i = null;
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        ibyVar.a();
        if (!this.f.containsKey(ibyVar)) {
            throw new IllegalStateException("Shot hasn't been started yet or was aborted");
        }
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iad
    public final void en(iby ibyVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        pbn pbnVar = this.d;
        pbnVar.f("onBitmapAvailable");
        try {
            ivq ivqVar = (ivq) this.f.get(ibyVar);
            if (ivqVar == null) {
                ((sgt) a.c().M(2467)).t("Ignoring thumbnail for shot %s.", ibyVar.a());
                bitmap.recycle();
                pbnVar.g();
                return;
            }
            ibyVar.a();
            pbnVar.f("crop");
            int width = (int) (bitmap.getWidth() * 0.98f);
            int height = (int) (bitmap.getHeight() * 0.98f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - width) / 2, (bitmap.getHeight() - height) / 2, width, height);
            pbnVar.h("update");
            j(ivqVar, bitmapCreateBitmap, ivqVar.d == iwt.LANDSCAPE);
            pbnVar.g();
        } finally {
            this.d.g();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lss] */
    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        ibyVar.a();
        ivq ivqVar = (ivq) this.f.get(ibyVar);
        if (ivqVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        ivqVar.h(i);
        this.b.e(ibyVar.x.b.l().a, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x010f A[Catch: all -> 0x00ec, TryCatch #5 {all -> 0x00ec, blocks: (B:15:0x00da, B:36:0x010b, B:38:0x010f, B:39:0x0116), top: B:48:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    @Override // defpackage.iai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.iby r23, long r24, com.google.googlex.gcam.ShotMetadata r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwb.g(iby, long, com.google.googlex.gcam.ShotMetadata):void");
    }

    public void h(iby ibyVar, rwc rwcVar) {
        VMRunner.invoke("UbnmCyfxVcSEHkkf", new Object[]{this, ibyVar, rwcVar});
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ibz ibzVarF = this.p.f(ltdVar);
        if (ibzVarF.z == null) {
            ibzVarF.z = new scl();
        }
        ibzVarF.z.d(this);
        ibzVarF.f(this);
        ibzVarF.a(this);
        ibzVarF.c(this);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, lss] */
    public final void j(ivq ivqVar, Bitmap bitmap, boolean z) {
        if (z) {
            ivqVar.i = bitmap;
            return;
        }
        iby ibyVar = ivqVar.b;
        pbn pbnVar = this.d;
        pbnVar.f("rotate");
        if (bitmap != null) {
            bitmap = this.q.ao(bitmap, ivqVar.e, ivqVar.t.b.ah());
        }
        pbnVar.h("updateIndicator");
        ibyVar.x.b.ae(bitmap, 0);
        pbnVar.g();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kml] */
    public final void l(boolean z, gga ggaVar) {
        Bitmap bitmap;
        if (z) {
            ggaVar.a.d().a(null);
        } else {
            ggaVar.a.f();
        }
        ?? r4 = ggaVar.b;
        Map map = this.f;
        ltd ltdVarL = r4.l();
        for (ivq ivqVar : map.values()) {
            if (ltdVarL.equals(ivqVar.b.x.b.l()) && (bitmap = ivqVar.i) != null) {
                j(ivqVar, bitmap, false);
                ivqVar.i = null;
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        ((sgt) a.c().M(2481)).t("onShotAborted %d", ibyVar.a());
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        ((sgt) a.c().M(2482)).t("onShotError %d", ibyVar.a());
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        ibyVar.a();
        pbn pbnVar = this.d;
        pbnVar.f(mNLbzhCxd.uKbEdQKYkJQtv);
        ivq ivqVar = (ivq) this.f.get(ibyVar);
        if (ivqVar != null) {
            ivqVar.c(lauVar);
        } else {
            ((sgt) a.b().M(2451)).t("addPayloadFrame: Shot not found! %d", ibyVar.a());
            lauVar.close();
        }
        pbnVar.g();
    }
}
