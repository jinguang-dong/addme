package defpackage;

import androidx.wear.ambient.AmbientMode;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gtr implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ gtr(AmbientMode.AmbientController ambientController, tzj tzjVar, hbj hbjVar, owf owfVar, int i) {
        this.e = i;
        this.c = ambientController;
        this.a = tzjVar;
        this.d = hbjVar;
        this.b = owfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, ndj] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            ?? r0 = this.a;
            lzh lzhVar = (lzh) r0.a();
            lzi lziVarA = lzj.a();
            lziVarA.a = "CameraLockIndicator";
            lziVarA.c(scn.I(nkw.PHOTO, nkw.NIGHT_SIGHT, nkw.LANDSCAPE));
            scn scnVarH = ((hbj) this.d).p(gyp.o) ? scn.H(pka.FRONT, pka.BACK) : new sfm(pka.BACK);
            ?? r5 = this.b;
            Object obj = this.c;
            lziVarA.b(scnVarH);
            lziVarA.d(false);
            lziVarA.b = r5;
            lziVarA.c = rwc.j((lze) r0.a());
            ((AmbientMode.AmbientController) obj).b(lzhVar, lziVarA.a());
            return;
        }
        if (i == 1) {
            oge ogeVar = new oge(this.a, this.b, (short[]) null);
            Object obj2 = this.c;
            ?? r2 = ((pfl) obj2).a;
            synchronized (r2) {
                r2.add(ogeVar);
            }
            ((fdq) this.d).j().d(new fid(obj2, ogeVar, 6, null));
            return;
        }
        if (i != 2) {
            lzh lzhVar2 = (lzh) this.a.a();
            lzi lziVarA2 = lzj.a();
            lziVarA2.a = "Portrait";
            lziVarA2.c((scn) this.b);
            lziVarA2.b(scn.H(pka.BACK, pka.FRONT));
            lziVarA2.b = this.c;
            ((AmbientMode.AmbientController) this.d).b(lzhVar2, lziVarA2.a());
            return;
        }
        Executor executor = hdi.a;
        fdq fdqVar = (fdq) this.d;
        our ourVarJ = fdqVar.j();
        Object obj3 = this.c;
        obj3.getClass();
        ourVarJ.d(this.a.dK(new hdg(obj3, 0), hdi.a));
        fdqVar.j().d(this.b.e(new hdh((hdm) obj3)));
    }

    public /* synthetic */ gtr(AmbientMode.AmbientController ambientController, tzj tzjVar, scn scnVar, owf owfVar, int i) {
        this.e = i;
        this.d = ambientController;
        this.a = tzjVar;
        this.b = scnVar;
        this.c = owfVar;
    }

    public /* synthetic */ gtr(fdq fdqVar, owq owqVar, hdm hdmVar, ndj ndjVar, int i) {
        this.e = i;
        this.d = fdqVar;
        this.a = owqVar;
        this.c = hdmVar;
        this.b = ndjVar;
    }

    public /* synthetic */ gtr(pfl pflVar, fut futVar, iso isoVar, fdq fdqVar, int i) {
        this.e = i;
        this.c = pflVar;
        this.a = futVar;
        this.b = isoVar;
        this.d = fdqVar;
    }
}
