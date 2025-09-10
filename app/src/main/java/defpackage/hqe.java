package defpackage;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hqe implements lst {
    private static final sgv a = sgv.g("hqe");
    private final mfq b;
    private final Set c = Collections.newSetFromMap(new ConcurrentHashMap());
    private final hqw d;
    private final hqc e;
    private final hbj f;

    public hqe(mfq mfqVar, hqw hqwVar, hqc hqcVar, hbj hbjVar) {
        this.b = mfqVar;
        this.d = hqwVar;
        this.e = hqcVar;
        this.f = hbjVar;
    }

    private final void a(ltd ltdVar) {
        this.c.add(ltdVar);
        hqc hqcVar = this.e;
        if (hqcVar.b(ltdVar).h()) {
            hqcVar.d(ltdVar).close();
        } else {
            ((sgt) a.c().M(1448)).v("Refusing to remove %s from processingMediaManager because it is not present. It's likely the mediaStoreInsertion future was canceled", ltdVar);
        }
    }

    @Override // defpackage.lst
    public final void b(ltd ltdVar) {
        a(ltdVar);
    }

    @Override // defpackage.lst
    public final void c(ltd ltdVar) {
        if (this.c.contains(ltdVar)) {
            return;
        }
        hqa hqaVar = (hqa) this.e.b(ltdVar).f();
        if (hqaVar == null) {
            ((sgt) a.c().M(1441)).v("#onSessionCaptureIndicatorUpdate Update for neither completed nor queued shot %s", ltdVar);
            return;
        }
        mfq mfqVar = this.b;
        Bitmap bitmapA = mfqVar.a(ltdVar);
        if (bitmapA == null) {
            ((sgt) a.b().M(1440)).v("thumbnailBitmap not present for shot %s", ltdVar);
        } else {
            Integer numB = mfqVar.b(ltdVar);
            hqaVar.d(bitmapA, numB != null ? numB.intValue() : 0);
        }
    }

    @Override // defpackage.lst
    public final void d(ltd ltdVar) {
        a(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void g(ltd ltdVar, Bitmap bitmap, int i) {
        lpa.j(this, bitmap);
    }

    @Override // defpackage.lst
    public final void h(ltd ltdVar, par parVar) {
        if (this.c.contains(ltdVar)) {
            return;
        }
        hqa hqaVar = (hqa) this.e.b(ltdVar).f();
        if (hqaVar == null) {
            ((sgt) a.c().M(1444)).v("#onSessionProgress update for neither completed nor queued shot %s", ltdVar);
        } else {
            hqaVar.e(parVar);
        }
    }

    @Override // defpackage.lst
    public final void i(ltd ltdVar, lsy lsyVar, ltg ltgVar) {
        this.e.e(ltdVar, new hqa(lsyVar));
        if (ltgVar == ltg.MEDIA_STORE) {
            rwc rwcVarA = hqp.f(lsyVar.c, this.f).a(rwc.j(hqp.NONE));
            rwcVarA.c();
            this.d.b(lsyVar.a, (hqp) rwcVarA.c());
        }
    }

    @Override // defpackage.lst
    public final void n(ltd ltdVar) {
        a(ltdVar);
    }

    @Override // defpackage.lst
    public final /* synthetic */ void e(long j) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void eh(Bitmap bitmap) {
    }

    @Override // defpackage.lst
    public final /* synthetic */ void j(ltd ltdVar) {
    }
}
