package defpackage;

import android.graphics.Bitmap;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrk implements syf {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public lrk(iyu iyuVar, nkw nkwVar, int i, int i2) {
        this.d = i2;
        this.c = nkwVar;
        this.a = i;
        this.b = iyuVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v5, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        if (this.d != 0) {
            ((sgt) ((sgt) iyu.a.c().i(th)).M((char) 2524)).s("Failure disconnecting camera device");
        } else {
            ((sgt) ((sgt) lrl.a.b().i(th)).M((char) 4334)).s("Failed to update thumbnail");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r1v1, types: [lsa] */
    /* JADX WARN: Type inference failed for: r1v10, types: [syu] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        szh szhVarI;
        if (this.d == 0) {
            ?? r15 = this.c;
            lrl lrlVar = (lrl) r15;
            lrlVar.g.e();
            ?? r1 = lrlVar.t;
            hbj hbjVar = r1.c;
            gzg gzgVar = gzo.bc;
            if (!hbjVar.p(gzgVar)) {
                Bitmap bitmapI = jsv.I((Bitmap) this.b, this.a);
                lrz lrzVar = (lrz) r1.a(r15);
                lsa lsaVar = lrzVar.c;
                if (!lsaVar.c.p(gzgVar)) {
                    lsaVar.b.execute(new lqd((Object) bitmapI, (Object) lrzVar.a, (Object) lrzVar.b, 3, (char[]) null));
                }
            }
            lrlVar.ad("Thumbnail rendered");
            return;
        }
        out.a();
        Object obj2 = this.c;
        Object obj3 = this.b;
        String strI = mn.i(obj2, "doSelectMode ", " second half");
        iyu iyuVar = (iyu) obj3;
        pbn pbnVar = iyuVar.h;
        pbnVar.f(strI);
        iyuVar.s((nkw) obj2);
        if (!iyuVar.l.B()) {
            iyuVar.f.h();
        }
        fqf fqfVar = iyuVar.l;
        int i = this.a;
        if (!iyuVar.t) {
            fqfVar.y();
            fqfVar.D(i);
            paq paqVar = iyuVar.A;
            if (paqVar != null) {
                paqVar.close();
                iyuVar.A = null;
            }
            iuo iuoVar = (iuo) iyuVar.k.a();
            nkw nkwVar = nkw.PHOTO;
            nkwVar.getClass();
            szh szhVar = new szh();
            syu syuVarB = iuoVar.b(szhVar);
            if (syuVarB != null) {
                syuVarB.cancel(false);
            }
            if (nkwVar.e()) {
                Duration duration = iuo.a;
                szhVarI = swf.i(ske.T(szhVar, rup.v(duration), TimeUnit.NANOSECONDS, iuoVar.c), Throwable.class, new fym(new gvx(nkwVar, 5), 13), sxo.a);
            } else {
                nkwVar.name();
                szhVar.e(ezh.H());
                szhVarI = szhVar;
            }
            syu syuVarI = swf.i(szhVarI, Throwable.class, new hia(11), sxo.a);
            ssc sscVarF = iyuVar.f();
            if (sscVarF == ssc.PHOTO_CAPTURE || sscVarF == ssc.VIDEO_CAPTURE) {
                AtomicReference atomicReference = new AtomicReference();
                atomicReference.set(owl.k(iyuVar.K.g.c, new iyl(iyuVar, sscVarF, syuVarI, atomicReference, 0)));
                iyuVar.A = (paq) atomicReference.get();
                our ourVarK = iyuVar.I.k();
                paq paqVar2 = iyuVar.A;
                paqVar2.getClass();
                ourVarK.d(paqVar2);
            } else {
                iyuVar.O.v(iyuVar.f(), 2, rwc.j(syuVarI), 0L, 0L);
            }
            iyuVar.u();
        }
        pbnVar.g();
    }

    public lrk(lrl lrlVar, Bitmap bitmap, int i, int i2) {
        this.d = i2;
        this.b = bitmap;
        this.a = i;
        this.c = lrlVar;
    }
}
