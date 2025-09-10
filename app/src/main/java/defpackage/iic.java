package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.HdrGainMapInfo;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PixelRectVector;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iic implements ibl {
    public final lss a;
    public long c;
    public final /* synthetic */ iid f;
    private final kmm i;
    private final rwc j;
    private final UUID k;
    private InterleavedImageU8 l;
    private tcu m;
    private ShotMetadata n;
    private tcu o;
    private ShotMetadata p;
    private PortraitRequest q;
    private ShotMetadata r;
    private syu s;
    private our t;
    private final iia w;
    public final ggg h = new ggg((short[]) null);
    public final tpc g = ssy.a.m();
    public final Map b = new HashMap();
    public boolean d = false;
    private boolean u = false;
    public int e = 1;
    private boolean v = false;

    public iic(iid iidVar, lss lssVar, kmm kmmVar, rwc rwcVar, UUID uuid, rwc rwcVar2) {
        this.f = iidVar;
        this.i = kmmVar;
        this.a = lssVar;
        this.j = rwcVar;
        this.k = uuid;
        kmmVar.a(ibk.a, 0.0f);
        this.w = new iia(this, kmmVar, lssVar, rwcVar2);
    }

    @Override // defpackage.ibl
    public final void b(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams) {
        this.a.w();
        if (tcuVar != null && shotMetadata != null) {
            this.m = tcuVar;
            this.n = shotMetadata;
        } else {
            this.m = new tcu();
            this.n = new ShotMetadata();
            int i = sbp.d;
            sbp sbpVar = sex.a;
        }
    }

    @Override // defpackage.ibl
    public final void c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, syu syuVar, our ourVar) {
        this.l = interleavedImageU8;
        this.q = portraitRequest;
        this.r = shotMetadata;
        this.s = syuVar;
        this.t = ourVar;
        lss lssVar = this.a;
        long jF = lssVar.f();
        ihy ihyVar = this.f.c;
        rwc rwcVarB = ((ixr) ihyVar.b).b();
        if (ihyVar.c.p(hak.j) && rwcVarB.h()) {
            File file = new File((File) rwcVarB.c(), "portrait");
            if (!file.exists() && !file.mkdirs()) {
                ((sgt) ihy.a.b().M(2023)).s("Could not create portrait mode debug data folder.");
            }
            GcamModuleJNI.PortraitRequest_portrait_raw_path_set(portraitRequest.a, portraitRequest, file.getAbsolutePath());
            GcamModuleJNI.PortraitRequest_shot_prefix_set(portraitRequest.a, portraitRequest, hxy.c(jF));
        }
        lssVar.w();
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [sgt, shi] */
    @Override // defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        syu syuVarL;
        PortraitRequest portraitRequest;
        int iPixelRectVector_size;
        iid iidVar = this.f;
        if (iidVar.l.p(hak.B) && this.m == null) {
            ((sgt) iid.b.c().M(2042)).s("Attempting to close the session but no primary RAW image has been received.");
            return;
        }
        if (this.l == null) {
            ((sgt) iid.b.c().M(2041)).s("Attempting to close the session but no RGB image has been received.");
            return;
        }
        if (iidVar.e && this.o == null) {
            ((sgt) iid.b.c().M(2040)).s("Attempting to close the session but no secondary RAW image has been received.");
            return;
        }
        if (this.v) {
            ((sgt) iid.b.c().M(2039)).s("Postprocessing has already been started from another request.");
            return;
        }
        lss lssVar = this.a;
        lssVar.w();
        this.v = true;
        iidVar.f.remove(lssVar.w());
        long andIncrement = iidVar.d.getAndIncrement();
        InterleavedImageU16 interleavedImageU16Ap = a.ap(this.s);
        rwc rwcVar = this.j;
        if (!rwcVar.h() || (portraitRequest = this.q) == null) {
            pco pcoVar = new pco("Portrait controller not available or null PortraitRequest, no effect applied.");
            ((sgt) ((sgt) iid.b.b().i(pcoVar)).M((char) 2037)).s("No effect applied.");
            syuVarL = ske.L(pcoVar);
        } else {
            if (portraitRequest.a() == null) {
                iPixelRectVector_size = 0;
            } else {
                PixelRectVector pixelRectVectorA = this.q.a();
                iPixelRectVector_size = (int) GcamModuleJNI.PixelRectVector_size(pixelRectVectorA.a, pixelRectVectorA);
            }
            tpc tpcVar = this.g;
            if (!tpcVar.b.C()) {
                tpcVar.o();
            }
            ssy ssyVar = (ssy) tpcVar.b;
            ssy ssyVar2 = ssy.a;
            ssyVar.b |= 4;
            ssyVar.e = iPixelRectVector_size;
            gzi gziVar = hae.a;
            lssVar.w();
            syuVarL = ((lgm) rwcVar.c()).d(andIncrement, this.l, interleavedImageU16Ap, iidVar.i, this.q, this.m, this.n, this.o, this.p, lssVar.ah(), this.w);
        }
        ske.W(syuVarL, new lwe(this, andIncrement, 1), sxo.a);
    }

    @Override // defpackage.ibl
    public final void e(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams) {
        this.a.w();
        if (tcuVar == null || shotMetadata == null) {
            this.o = new tcu();
            this.p = new ShotMetadata();
        } else {
            this.o = tcuVar;
            this.p = shotMetadata;
        }
    }

    @Override // defpackage.ibl
    public final void f(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list, CyclopsParameters cyclopsParameters) {
        throw new UnsupportedOperationException("Invalid operation: addSecondaryRgbImage");
    }

    public final void g(long j, Throwable th) {
        if (this.u && this.h.h() == 0) {
            this.i.a(ibk.a, 1.0f);
            this.t.close();
            if (!this.d) {
                hht hhtVar = new hht("PostProcessingPortraitImageSaverImpl did not save any output images.", th);
                sgt sgtVar = (sgt) ((sgt) iid.b.b().i(hhtVar)).M(2044);
                lss lssVar = this.a;
                sgtVar.D("Error processing the image, cancelling the session %s for %d", lssVar.w(), j);
                lssVar.b(hhtVar);
                return;
            }
            lss lssVar2 = this.a;
            lssVar2.w();
            tpc tpcVar = this.g;
            mdm mdmVarO = lssVar2.o();
            ssy ssyVar = (ssy) tpcVar.l();
            tpc tpcVar2 = (tpc) ssyVar.a(5, null);
            tpcVar2.r(ssyVar);
            ((mdo) mdmVarO).K = tpcVar2;
            ExifInterface exifInterface = (ExifInterface) this.b.get(Long.valueOf(j));
            if (exifInterface != null) {
                ((mdo) lssVar2.o()).l = exifInterface;
            }
            lssVar2.E();
        }
    }

    public final void i(long j, obu obuVar, lgn lgnVar, int i, ico icoVar, mpc mpcVar, rwc rwcVar) {
        lgn lgnVar2;
        iid iidVar = this.f;
        if (!((Boolean) iidVar.j.b(luf.aU)).booleanValue() || icoVar == ico.DEBUG) {
            lgnVar2 = lgnVar;
            this.r.h(new HdrGainMapInfo());
        } else {
            lgnVar2 = lgnVar;
            if (icoVar == ico.PRIMARY) {
                rwc rwcVar2 = lgnVar2.d;
                if (rwcVar2.h()) {
                    this.r.h((HdrGainMapInfo) rwcVar2.c());
                }
            }
        }
        ske.W(iidVar.g.a(j, obuVar, lgnVar2, i, this.q.f(), icoVar, this.a, this.k, this.r, rwcVar), new iib(this, mpcVar, icoVar, j, obuVar), sxo.a);
    }

    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
    }

    @Override // defpackage.ibl
    public final /* synthetic */ void d(GrayImageS16 grayImageS16, ShotMetadata shotMetadata, List list) {
    }
}
