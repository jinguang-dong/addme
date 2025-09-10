package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ldh implements hzi, iac, iad, iam {
    private static final sgv e = sgv.g("ldh");
    protected final DynamicDepthUtils a;
    protected final hxv b;
    protected final pbn c;
    protected final pmv d;
    private final lat f;
    private final pas g;
    private final Executor h;
    private final HashMap i = new HashMap();
    private final iso j;
    private final iso k;

    public ldh(iso isoVar, DynamicDepthUtils dynamicDepthUtils, lat latVar, hxv hxvVar, kqp kqpVar, pmv pmvVar, Executor executor, pbn pbnVar, iso isoVar2) {
        this.k = isoVar;
        this.a = dynamicDepthUtils;
        this.f = latVar;
        this.b = hxvVar;
        this.g = kqpVar.b;
        this.d = pmvVar;
        this.h = executor;
        this.c = pbnVar;
        this.j = isoVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, lss] */
    private final void j(ldi ldiVar, DynamicDepthResult dynamicDepthResult) {
        if (ldiVar.q && dynamicDepthResult != null) {
            dynamicDepthResult.close();
            dynamicDepthResult = null;
        }
        try {
            try {
                this.k.j(ldiVar.t.b.l(), rwc.i(dynamicDepthResult));
            } catch (NoSuchElementException e2) {
                ((sgt) ((sgt) e.c().i(e2)).M(3992)).s("Trying to set a result for an already aborted shot.");
            }
        } finally {
            ldiVar.g();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void a(ltd ltdVar) {
        iby ibyVar;
        ldi ldiVar;
        ((sgt) e.c().M(3981)).v("Shot has been aborted %s", ltdVar);
        HashMap map = this.i;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ibyVar = null;
                break;
            } else {
                ibyVar = (iby) it.next();
                if (ibyVar.x.b.l().equals(ltdVar)) {
                    break;
                }
            }
        }
        if (ibyVar == null || (ldiVar = (ldi) map.remove(ibyVar)) == null) {
            return;
        }
        this.k.j(ldiVar.t.b.l(), rvk.a);
        ldiVar.b();
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void b(iby ibyVar, lau lauVar) {
        poj pojVarO;
        ldi ldiVar = (ldi) this.i.get(ibyVar);
        if (ldiVar == null) {
            lauVar.close();
            return;
        }
        ldiVar.c(lauVar);
        int i = ldiVar.r - 1;
        rwc rwcVarP = ldiVar.t.b.p();
        if (rwcVarP.h()) {
            rwc rwcVarB = rwcVarP.b(new idb(15));
            if (!rwcVarB.h() || ((String) rwcVarB.c()).isEmpty() || (pojVarO = this.f.a(lauVar).o()) == null) {
                return;
            }
            File file = new File((String) rwcVarB.c(), String.format(Locale.ROOT, "%s_%02d.pd", "payload_depth", Integer.valueOf(i)));
            shl shlVar = shx.a;
            file.getName();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    for (poi poiVar : pojVarO.g()) {
                        ByteBuffer buffer = poiVar.getBuffer();
                        int iLimit = buffer.limit();
                        byte[] bArr = new byte[iLimit];
                        buffer.get(bArr);
                        int rowStride = pojVarO.a() == 4099 ? poiVar.getRowStride() : pojVarO.c() * poiVar.getPixelStride();
                        for (int rowStride2 = 0; rowStride2 < iLimit; rowStride2 += poiVar.getRowStride()) {
                            fileOutputStream.write(bArr, rowStride2, rowStride);
                        }
                        buffer.clear();
                    }
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                ((sgt) ((sgt) ((sgt) DynamicDepthUtils.a.b().h(shx.a, "CAM_DynDepthUtils")).i(e2)).M(1257)).v("IOException while saving Depth debug image %s", file.getName());
            } finally {
                pojVarO.close();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lss] */
    @Override // defpackage.hzi
    public final void c(iby ibyVar, BurstSpec burstSpec, poe poeVar) {
        HashMap map = this.i;
        rnt.L(!map.containsKey(ibyVar));
        hxv hxvVar = this.b;
        gga ggaVar = ibyVar.x;
        map.put(ibyVar, new ldi(ggaVar, hxvVar.a(), burstSpec, poeVar));
        this.k.i(ggaVar.b.l());
    }

    @Override // defpackage.hzi
    public final void d(iby ibyVar, BurstSpec burstSpec) {
        ldi ldiVar = (ldi) this.i.get(ibyVar);
        if (ldiVar == null) {
            ((sgt) e.b().M(3982)).t("Shot hasn't been started yet! shotId = %s", ibyVar.a());
        } else {
            this.h.execute(new lbk(this, ldiVar, ibyVar, 3));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iad
    public final void en(iby ibyVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        ltd ltdVarL = ibyVar.x.b.l();
        ldi ldiVar = (ldi) this.i.get(ibyVar);
        if (ldiVar != null) {
            ldiVar.m.e(shotMetadata);
        } else {
            ((sgt) e.c().M(3987)).v("Couldn't find inflight shot, already processed? %s", ltdVarL);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        ibyVar.x.b.l();
        ldi ldiVar = (ldi) this.i.get(ibyVar);
        if (ldiVar == null) {
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
        ldiVar.l.e(Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, lss] */
    protected DynamicDepthResult g(lau lauVar, ldi ldiVar) {
        ShotMetadata shotMetadata;
        pbn pbnVar;
        DynamicDepthResult dynamicDepthResult;
        poj pojVarR = lauVar.r();
        poj pojVarO = lauVar.o();
        ldiVar.g();
        ?? r0 = ldiVar.t.b;
        r0.l();
        if (pojVarR == null || pojVarO == null) {
            if (pojVarR != null) {
                pojVarR.close();
            }
            if (pojVarO == null) {
                return null;
            }
            pojVarO.close();
            return null;
        }
        pmv.r();
        try {
            shotMetadata = (ShotMetadata) ldiVar.m.s();
            pbnVar = this.c;
            pbnVar.f("ddepth#process");
            dynamicDepthResult = new DynamicDepthResult(this.g, pao.b(r0.e()).ordinal(), false, ldiVar.s.j, lauVar.a.d());
        } catch (Exception unused) {
            this.c.g();
        } catch (Throwable th) {
            this.c.g();
            pojVarO.close();
            pojVarR.close();
            throw th;
        }
        if (this.a.b(pojVarO, pojVarR, dynamicDepthResult, shotMetadata)) {
            pbnVar.g();
            pojVarO.close();
            pojVarR.close();
            return dynamicDepthResult;
        }
        dynamicDepthResult.close();
        pbnVar.g();
        pojVarO.close();
        pojVarR.close();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ldh] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ldh] */
    /* JADX WARN: Type inference failed for: r5v3, types: [pbn] */
    /* JADX WARN: Type inference failed for: r6v0, types: [ldi] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ldi] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap] */
    public final /* synthetic */ void h(ldi ldiVar, iby ibyVar) {
        List listF = ldiVar.f();
        if (listF.isEmpty()) {
            ldiVar.b();
            return;
        }
        DynamicDepthResult dynamicDepthResultG = null;
        try {
            try {
                this.c.f("depth");
                pdk pdkVar = (pdk) listF.get(((Integer) ldiVar.l.s()).intValue());
                if (pdkVar != null) {
                    dynamicDepthResultG = g(this.f.a(pdkVar), ldiVar);
                }
            } catch (IndexOutOfBoundsException | CancellationException | ExecutionException e2) {
                ldiVar.b();
                ((sgt) ((sgt) e.b().i(e2)).M(3984)).s("Error retrieving the base frame index.");
            } catch (InterruptedException e3) {
                Thread.currentThread().interrupt();
                ((sgt) ((sgt) e.b().i(e3)).M(3983)).s("Error retrieving the base frame index.");
            }
        } finally {
            this.j(ldiVar, dynamicDepthResultG);
            this.i.remove(ibyVar);
            this.c.g();
        }
    }

    @Override // defpackage.hzi
    public final void i(ltd ltdVar) {
        ibz ibzVarF = this.j.f(ltdVar);
        ibzVarF.c(this);
        ibzVarF.a(new ldv(this, 1));
        ibzVarF.f(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void m(iby ibyVar) {
        a(ibyVar.x.b.l());
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iam
    public final void p(iby ibyVar, iag iagVar) {
        a(ibyVar.x.b.l());
    }

    @Override // defpackage.hzi
    public final /* synthetic */ void e(iby ibyVar) {
    }

    @Override // defpackage.iam
    public final /* synthetic */ void o(iby ibyVar, mdr mdrVar) {
    }
}
