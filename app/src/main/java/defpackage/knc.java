package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class knc implements kgz {
    final /* synthetic */ knd a;
    private final kmy b;
    private final fcr c;
    private final pbn d;
    private final gga e;

    public knc(knd kndVar, kmy kmyVar, gga ggaVar, fcr fcrVar, pbn pbnVar) {
        this.a = kndVar;
        this.b = kmyVar;
        this.e = ggaVar;
        this.c = fcrVar;
        this.d = pbnVar;
    }

    public final String toString() {
        return "PictureTakerCommand";
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kml] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, lss] */
    @Override // defpackage.kgz
    public final void a() throws Throwable {
        Throwable runtimeException = new RuntimeException("Unknown exception in PictureTaker.");
        try {
            try {
                this.d.f(ezh.ai("PictureTakerCommand#run"));
                try {
                    kmz kmzVar = (kmz) this.a.b.get(1000L, TimeUnit.MILLISECONDS);
                    if (!((Boolean) kmzVar.a().dL()).booleanValue()) {
                        String strB = eld.b(kmzVar, "Take picture was invoked, but the picture taker is not available! Command ");
                        pbc pbcVar = this.a.c;
                        pbcVar.d(strB);
                        pco pcoVar = new pco(strB);
                        pbcVar.f("PictureTakerCommand.run: success=false");
                        this.b.close();
                        gga ggaVar = this.e;
                        ggaVar.b.F(nfo.a, pcoVar);
                        ggaVar.a.f();
                        ((kfl) ggaVar.d).e.close();
                        return;
                    }
                    knd kndVar = this.a;
                    kndVar.c.f(eld.b(kmzVar, wzgaYJqO.roaGmTRm));
                    pbn pbnVar = this.d;
                    pbnVar.f("collect3AStats");
                    this.c.b(4);
                    pbnVar.g();
                    pbnVar.g();
                    pbnVar.f("captureImage");
                    gga ggaVar2 = this.e;
                    ggaVar2.b.T(kndVar.i);
                    kmzVar.c(this.b, ggaVar2);
                    pbnVar.g();
                    if (!((Boolean) kndVar.j.b(luf.aN)).booleanValue()) {
                        cxb cxbVar = kndVar.k;
                        if (cxbVar.C()) {
                            pbnVar.f("FFListener#onImageCaptured");
                            ((hpu) cxbVar.B()).c();
                            pbnVar.g();
                        }
                    }
                    this.a.c.f("PictureTakerCommand.run: success=true");
                    this.b.close();
                } catch (InterruptedException | ExecutionException e) {
                    throw new RuntimeException(e);
                }
            } catch (TimeoutException e2) {
                this.a.c.e("ImageCaptureCommand retrieval timed out", e2);
                hgy hgyVar = new hgy(e2);
                this.a.c.f("PictureTakerCommand.run: success=false");
                this.b.close();
                gga ggaVar3 = this.e;
                ggaVar3.b.F(nfo.a, hgyVar);
                ggaVar3.a.f();
                ((kfl) ggaVar3.d).e.close();
            } catch (Exception e3) {
                knd kndVar2 = this.a;
                kndVar2.c.e("PictureTaker command failed: " + kndVar2.b.toString(), e3);
                try {
                    throw e3;
                } catch (Throwable th) {
                    th = th;
                    runtimeException = e3;
                    this.a.c.f("PictureTakerCommand.run: success=false");
                    this.b.close();
                    gga ggaVar4 = this.e;
                    ggaVar4.b.F(nfo.a, runtimeException);
                    ggaVar4.a.f();
                    ((kfl) ggaVar4.d).e.close();
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            this.a.c.f("PictureTakerCommand.run: success=false");
            this.b.close();
            gga ggaVar42 = this.e;
            ggaVar42.b.F(nfo.a, runtimeException);
            ggaVar42.a.f();
            ((kfl) ggaVar42.d).e.close();
            throw th;
        }
    }
}
