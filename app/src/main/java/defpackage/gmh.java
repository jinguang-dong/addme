package defpackage;

import androidx.wear.ambient.AmbientMode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gmh implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gmh(AmbientMode.AmbientController ambientController, rwc rwcVar, int i) {
        this.c = i;
        this.a = ambientController;
        this.b = rwcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lzh] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, lzh] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            lzi lziVarA = lzj.a();
            lziVarA.a = "VideoBoost5xZoom";
            lziVarA.c(new sfm(nkw.VIDEO));
            lziVarA.b(new sfm(pka.BACK));
            lzj lzjVarA = lziVarA.a();
            ((AmbientMode.AmbientController) this.b).b(this.a, lzjVarA);
            return;
        }
        if (i == 1) {
            lzi lziVarA2 = lzj.a();
            lziVarA2.a = "VideoBoostANS";
            lziVarA2.c(new sfm(nkw.VIDEO));
            lziVarA2.b(new sfm(pka.BACK));
            lzj lzjVarA2 = lziVarA2.a();
            ((AmbientMode.AmbientController) this.b).b(this.a, lzjVarA2);
            return;
        }
        if (i == 2) {
            ((mns) this.b).c((kgt) this.a);
            return;
        }
        if (i == 3) {
            rwc rwcVar = (rwc) this.b;
            lzh lzhVar = (lzh) rwcVar.c();
            lzi lziVarA3 = lzj.a();
            lziVarA3.c(scn.K(nkw.PHOTO, nkw.PORTRAIT, nkw.LANDSCAPE, nkw.ACTION_PAN, nkw.NIGHT_SIGHT));
            lziVarA3.b(scn.H(pka.BACK, pka.FRONT));
            lziVarA3.c = rwc.j((lze) rwcVar.c());
            ((AmbientMode.AmbientController) this.a).b(lzhVar, lziVarA3.a());
            return;
        }
        mgj mgjVar = (mgj) this.b.a();
        lzi lziVarA4 = lzj.a();
        lziVarA4.a = "StorageWarning";
        lziVarA4.c(scn.J(nkw.PHOTO, nkw.PORTRAIT, nkw.NIGHT_SIGHT, nkw.VIDEO));
        lziVarA4.b(scn.H(pka.BACK, pka.FRONT));
        lziVarA4.d(false);
        lziVarA4.e(false);
        ((AmbientMode.AmbientController) this.a).b(mgjVar, lziVarA4.a());
    }

    public /* synthetic */ gmh(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
