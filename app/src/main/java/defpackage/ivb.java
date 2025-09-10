package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import com.google.googlex.gcam.hdrplus.NativeMetadataConverter;
import j$.util.Collection;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivb implements pdm, paq {
    public static final sgv a = sgv.g("ivb");
    public final iwp b;
    public final lat c;
    public final NativeMetadataConverter d;
    public final pbn e;
    public final HashMap f = new HashMap();
    public iwe g = null;
    public boolean h = false;
    private final ejt i;

    public ivb(lat latVar, NativeMetadataConverter nativeMetadataConverter, rwc rwcVar, our ourVar, ejt ejtVar, pdn pdnVar, pbn pbnVar) {
        this.c = latVar;
        this.d = nativeMetadataConverter;
        a.I(rwcVar.h());
        iwp iwpVar = (iwp) rwcVar.c();
        this.b = iwpVar;
        this.i = ejtVar;
        iwpVar.h(this);
        gzi gziVar = hab.a;
        gzi gziVar2 = gzs.a;
        this.e = pbnVar;
        ourVar.d(new hye(this, 6));
        pdnVar.l(new iva(this, 0));
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, uem] */
    public final synchronized syu b(int i) {
        if (this.h) {
            ((sgt) a.c().M(2342)).t(nWEkBGOQPWQp.oWNVPcdMTQRvmXY, i);
            return ske.L(new pco("Already closed."));
        }
        iwe iweVar = new iwe((hkk) this.i.a.a(), i);
        this.g = iweVar;
        this.f.put(Integer.valueOf(i), iweVar);
        syu syuVarA = iweVar.a();
        syuVarA.c(new ivi(this, 1), sxo.a);
        return syuVarA;
    }

    public final synchronized void c(int i) {
        iwe iweVar = (iwe) this.f.remove(Integer.valueOf(i));
        if (iweVar != null) {
            iweVar.b();
        } else {
            ((sgt) a.c().M(2331)).t("[shot-%s] does not exist for Aborting PSL capture.", i);
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            ((sgt) a.c().M(2334)).s("Already closed!");
            return;
        }
        HashMap map = this.f;
        map.size();
        this.h = true;
        Collection.EL.removeIf(map.entrySet(), new hzk(9));
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        if (this.h) {
            ((sgt) a.c().M(2340)).s("Already closed, cannot process frame.");
            return;
        }
        synchronized (this) {
            if (this.g != null) {
                g(phcVar, true);
            }
        }
    }

    public final synchronized void e(int i, float f, float f2, long j) {
        iwe iweVar = (iwe) this.f.get(Integer.valueOf(i));
        if (iweVar != null) {
            iweVar.c(f, f2, j);
        } else {
            ((sgt) a.c().M(2335)).t("[shot-%s] does not exist for collecting PSL frames", i);
        }
    }

    public final synchronized void f(int i, iwo iwoVar) {
        iwe iweVar = (iwe) this.f.get(Integer.valueOf(i));
        if (iweVar != null) {
            iweVar.d(new iuz(this, iwoVar, i));
        } else {
            iwoVar.e(false);
        }
    }

    public final void g(phc phcVar, final boolean z) {
        ojl.bB(phcVar, new pec() { // from class: iuy
            /* JADX WARN: Removed duplicated region for block: B:9:0x000f A[Catch: all -> 0x005b, Merged into TryCatch #1 {all -> 0x005e, blocks: (B:3:0x0002, B:21:0x005d, B:6:0x0007, B:8:0x000b, B:16:0x0056, B:9:0x000f, B:11:0x0015, B:13:0x002f, B:15:0x0035), top: B:27:0x0002 }] */
            @Override // defpackage.pec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(defpackage.pdk r7) {
                /*
                    r6 = this;
                    ivb r0 = r6.a
                    monitor-enter(r0)     // Catch: java.lang.Throwable -> L5e
                    boolean r6 = r2
                    if (r6 == 0) goto Lf
                    iwe r6 = r0.g     // Catch: java.lang.Throwable -> L5b
                    if (r6 == 0) goto Lf
                    r6.e(r7)     // Catch: java.lang.Throwable -> L5b
                    goto L56
                Lf:
                    poe r6 = r7.d()     // Catch: java.lang.Throwable -> L5b
                    if (r6 == 0) goto L56
                    pbn r1 = r0.e     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r2 = "MotionBlurVf#wrapFrame"
                    r1.f(r2)     // Catch: java.lang.Throwable -> L5b
                    lat r2 = r0.c     // Catch: java.lang.Throwable -> L5b
                    lau r2 = r2.a(r7)     // Catch: java.lang.Throwable -> L5b
                    r1.g()     // Catch: java.lang.Throwable -> L5b
                    android.hardware.camera2.CaptureResult$Key r3 = android.hardware.camera2.CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID     // Catch: java.lang.Throwable -> L5b
                    java.lang.Object r3 = r6.a(r3)     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L5b
                    if (r3 != 0) goto L33
                    java.lang.String r3 = r6.b()     // Catch: java.lang.Throwable -> L5b
                L33:
                    if (r3 == 0) goto L56
                    pjr r3 = defpackage.pjr.b(r3)     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r4 = "MotionBlurVf#getGyroSampleVector"
                    r1.f(r4)     // Catch: java.lang.Throwable -> L5b
                    java.lang.String r4 = "MotionBlurVf#convertToGcamFrameMetadata"
                    r1.h(r4)     // Catch: java.lang.Throwable -> L5b
                    com.google.googlex.gcam.hdrplus.NativeMetadataConverter r4 = r0.d     // Catch: java.lang.Throwable -> L5b
                    r5 = 0
                    com.google.googlex.gcam.FrameMetadata r6 = r4.o(r6, r5, r5, r3)     // Catch: java.lang.Throwable -> L5b
                    r1.g()     // Catch: java.lang.Throwable -> L5b
                    iwp r1 = r0.b     // Catch: java.lang.Throwable -> L5b
                    poj r2 = r2.r()     // Catch: java.lang.Throwable -> L5b
                    r1.c(r2, r6)     // Catch: java.lang.Throwable -> L5b
                L56:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                    r7.close()
                    return
                L5b:
                    r6 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                    throw r6     // Catch: java.lang.Throwable -> L5e
                L5e:
                    r6 = move-exception
                    r7.close()
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.iuy.a(pdk):void");
            }
        });
    }
}
