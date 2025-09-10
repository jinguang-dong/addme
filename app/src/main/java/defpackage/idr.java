package defpackage;

import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitRequest;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.ShotParams;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class idr implements ibl {
    public final kmm a;
    public final lss b;
    public final idy c;
    public final String d;
    public final iea e;
    public final /* synthetic */ ids h;
    public final hxu i;
    public final gga k;
    public final tpc j = sqa.a.m();
    public final ggg l = new ggg((short[]) null);
    private volatile boolean m = false;
    private idx n = null;
    private idx o = null;
    public long f = -1;
    public boolean g = false;
    private boolean p = false;

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kmm] */
    public idr(ids idsVar, gga ggaVar, hxu hxuVar, idy idyVar, iea ieaVar) {
        this.h = idsVar;
        this.k = ggaVar;
        this.i = hxuVar;
        ?? r3 = ggaVar.b;
        this.b = r3;
        ?? r4 = ggaVar.c;
        this.a = r4;
        this.c = idyVar;
        this.d = r3.l().toString();
        this.e = ieaVar;
        r4.a(ibo.b, 0.0f);
    }

    @Override // defpackage.ibl
    public final synchronized void b(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams) {
        if (this.n != null) {
            ((sgt) ids.a.c().M(1909)).v("[%s] Primary image already set, skipping.", this.d);
            if (tcuVar != null) {
                tcuVar.a();
            }
        } else {
            if (tcuVar == null) {
                tcuVar = null;
            } else if (shotMetadata != null) {
                this.b.w();
                iea ieaVar = this.e;
                idw idwVarA = idx.a();
                idwVarA.b(ieaVar);
                idwVarA.d(tcuVar);
                idwVarA.c = shotMetadata;
                idwVarA.c(sbp.j(list));
                if (shotParams == null) {
                    shotParams = new ShotParams();
                }
                idwVarA.f(shotParams);
                this.n = idwVarA.a();
                return;
            }
            this.b.w();
            iea ieaVar2 = this.e;
            idw idwVarA2 = idx.a();
            idwVarA2.b(ieaVar2);
            idwVarA2.d(new tcu());
            idwVarA2.c = new ShotMetadata();
            idwVarA2.f(new ShotParams());
            this.n = idwVarA2.a();
            if (tcuVar != null) {
                tcuVar.a();
            }
        }
    }

    @Override // defpackage.ibl
    public final synchronized void c(InterleavedImageU8 interleavedImageU8, PortraitRequest portraitRequest, ShotMetadata shotMetadata, syu syuVar, our ourVar) {
        if (this.n != null) {
            ((sgt) ids.a.c().M(1912)).v("[%s] Primary image already set, skipping.", this.d);
            interleavedImageU8.h();
            return;
        }
        if (interleavedImageU8 != null && shotMetadata != null) {
            this.b.w();
            iea ieaVar = this.e;
            idw idwVarA = idx.a();
            idwVarA.b(ieaVar);
            idwVarA.e(interleavedImageU8);
            idwVarA.b = Optional.ofNullable(a.ap(syuVar));
            idwVarA.c = shotMetadata;
            this.n = idwVarA.a();
            return;
        }
        this.b.w();
        iea ieaVar2 = this.e;
        idw idwVarA2 = idx.a();
        idwVarA2.b(ieaVar2);
        idwVarA2.e(new InterleavedImageU8());
        idwVarA2.c = new ShotMetadata();
        this.n = idwVarA2.a();
        if (interleavedImageU8 != null) {
            interleavedImageU8.h();
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.m) {
            return;
        }
        synchronized (this) {
            idx idxVar = this.n;
            if (idxVar == null) {
                return;
            }
            idx idxVar2 = this.o;
            if (idxVar2 == null) {
                return;
            }
            this.m = true;
            this.a.a(hzs.a, 1.0f);
            ids idsVar = this.h;
            long andIncrement = idsVar.f.getAndIncrement();
            this.f = System.currentTimeMillis();
            ske.W(this.c.b(andIncrement, idsVar.i, idxVar, idxVar2, new idp(this), idsVar.e), new idm(this, andIncrement), sxo.a);
        }
    }

    @Override // defpackage.ibl
    public final synchronized void d(GrayImageS16 grayImageS16, ShotMetadata shotMetadata, List list) {
        if (this.o != null) {
            ((sgt) ids.a.c().M(1914)).v("[%s] Secondary image already set, skipping.", this.d);
            grayImageS16.b();
            return;
        }
        this.b.w();
        iea ieaVar = this.e;
        idw idwVarA = idx.a();
        idwVarA.b(ieaVar);
        idwVarA.a = Optional.ofNullable(grayImageS16);
        if (shotMetadata == null) {
            shotMetadata = new ShotMetadata();
        }
        idwVarA.c = shotMetadata;
        idwVarA.c(sbp.j(list));
        this.o = idwVarA.a();
    }

    @Override // defpackage.ibl
    public final synchronized void e(tcu tcuVar, ShotMetadata shotMetadata, List list, ShotParams shotParams) {
        if (this.o != null) {
            ((sgt) ids.a.c().M(1917)).v("[%s] Secondary image already set, skipping.", this.d);
            if (tcuVar != null) {
                tcuVar.a();
            }
        } else {
            if (tcuVar == null) {
                tcuVar = null;
            } else if (shotMetadata != null) {
                this.b.w();
                iea ieaVar = this.e;
                idw idwVarA = idx.a();
                idwVarA.b(ieaVar);
                idwVarA.d(tcuVar);
                idwVarA.c = shotMetadata;
                idwVarA.c(sbp.j(list));
                if (shotParams == null) {
                    shotParams = new ShotParams();
                }
                idwVarA.f(shotParams);
                this.o = idwVarA.a();
                return;
            }
            this.b.w();
            iea ieaVar2 = this.e;
            idw idwVarA2 = idx.a();
            idwVarA2.b(ieaVar2);
            idwVarA2.d(new tcu());
            idwVarA2.c = new ShotMetadata();
            idwVarA2.f(new ShotParams());
            this.o = idwVarA2.a();
            if (tcuVar != null) {
                tcuVar.a();
            }
        }
    }

    @Override // defpackage.ibl
    public final synchronized void f(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list, CyclopsParameters cyclopsParameters) {
        if (this.o != null) {
            ((sgt) ids.a.c().M(1920)).v("[%s] Secondary image already set, skipping.", this.d);
            if (interleavedImageU8 != null) {
                interleavedImageU8.h();
            }
        } else {
            if (interleavedImageU8 == null) {
                interleavedImageU8 = null;
            } else if (shotMetadata != null) {
                this.b.w();
                iea ieaVar = this.e;
                idw idwVarA = idx.a();
                idwVarA.b(ieaVar);
                idwVarA.e(interleavedImageU8);
                idwVarA.c = shotMetadata;
                idwVarA.d = Optional.ofNullable(cyclopsParameters);
                idwVarA.c(sbp.j(list));
                this.o = idwVarA.a();
                return;
            }
            this.b.w();
            iea ieaVar2 = this.e;
            idw idwVarA2 = idx.a();
            idwVarA2.b(ieaVar2);
            idwVarA2.e(new InterleavedImageU8());
            idwVarA2.c = new ShotMetadata();
            this.o = idwVarA2.a();
            if (interleavedImageU8 != null) {
                interleavedImageU8.h();
            }
        }
    }

    public final void g(long j) {
        if (this.p && this.l.h() == 0) {
            this.a.a(ibo.b, 1.0f);
            if (this.g) {
                lss lssVar = this.b;
                lssVar.w();
                ((mdo) lssVar.o()).t = (sqa) this.j.l();
                this.c.d();
                return;
            }
            String str = this.d;
            hht hhtVar = new hht("PostProcessingFusionImageSaverImpl did not save any output images for session ".concat(str));
            sgt sgtVar = (sgt) ((sgt) ids.a.b().i(hhtVar)).M(1925);
            lss lssVar2 = this.b;
            sgtVar.G("[%s] Error processing the image, cancelling the session %s for %d", str, lssVar2.w(), Long.valueOf(j));
            lssVar2.b(hhtVar);
        }
    }

    public final void h(Runnable runnable) {
        this.h.h.a(new hkm(this, runnable, 2));
    }

    @Override // defpackage.kle
    public final void a(poj pojVar, syu syuVar) {
    }
}
