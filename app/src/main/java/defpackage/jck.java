package defpackage;

import android.graphics.Bitmap;
import android.view.SurfaceView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jck implements syf {
    final /* synthetic */ jcm a;

    public jck(jcm jcmVar) {
        this.a = jcmVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        ((sgt) ((sgt) jcm.a.b().i(th)).M((char) 2653)).s("Error capturing image");
        jcm jcmVar = this.a;
        synchronized (jcmVar) {
            jcmVar.j.a(th);
        }
    }

    @Override // defpackage.syf
    public final void b(Object obj) {
        jcm jcmVar = this.a;
        jcmVar.e.c();
        final int iA = jcmVar.o.a().a();
        final boolean zJ = jcmVar.g.j();
        final jcc jccVar = jcmVar.k;
        ske.W(ske.R(new sxh() { // from class: jca
            @Override // defpackage.sxh
            public final syu a() {
                Bitmap bitmapA;
                boolean z = zJ;
                fqy fqyVar = jccVar.g;
                ngk ngkVar = fqyVar.r;
                if (ngkVar == null) {
                    bitmapA = null;
                } else {
                    boolean z2 = qpt.cf(fqyVar.w) == 0;
                    synchronized (ngkVar.b) {
                        pbn pbnVar = ngkVar.d;
                        pbnVar.f("getScreenshot");
                        ngd ngdVar = ngkVar.f;
                        ngdVar.getClass();
                        SurfaceView surfaceView = ngdVar.b;
                        int i = iA;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((z2 || i % 180 == 0) ? surfaceView.getWidth() : surfaceView.getHeight()) / 4, ((z2 || i % 180 == 0) ? surfaceView.getHeight() : surfaceView.getWidth()) / 4, Bitmap.Config.ARGB_8888);
                        ngkVar.e.a(surfaceView, bitmapCreateBitmap);
                        pbnVar.h("getScreenshot#flipAndRotate");
                        bitmapA = ngk.a(bitmapCreateBitmap, i, z);
                        pbnVar.g();
                    }
                }
                bitmapA.getClass();
                return ske.M(bitmapA);
            }
        }, jccVar.c), new jcb(jccVar, 0), ojl.ce());
        jcmVar.q.j();
    }
}
