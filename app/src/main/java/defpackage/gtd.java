package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gtd implements mcw {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ gtd(AmbientMode.AmbientController ambientController, tzj tzjVar, Set set, hbj hbjVar, owf owfVar, int i) {
        this.f = i;
        this.c = ambientController;
        this.b = tzjVar;
        this.a = set;
        this.e = hbjVar;
        this.d = owfVar;
    }

    public /* synthetic */ gtd(fuf fufVar, hbj hbjVar, owf owfVar, AmbientMode.AmbientController ambientController, kdz kdzVar, int i) {
        this.f = i;
        this.e = fufVar;
        this.c = hbjVar;
        this.a = owfVar;
        this.b = ambientController;
        this.d = kdzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, tzj] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, lzh] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, mhq] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, owf] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f;
        if (i == 0) {
            mhs mhsVar = new mhs();
            mhsVar.c(this.a);
            mhsVar.d("Lens suggestion");
            Object obj = this.b;
            mhsVar.e(new gpk(obj, 18));
            mhsVar.f(new gpk(obj, 19));
            mhsVar.g((mhp) this.c);
            mht mhtVarA = mhsVar.a();
            ((fdq) this.e).j().d(this.d.d(mhtVarA));
            return;
        }
        if (i == 1) {
            hbj hbjVar = (hbj) this.e;
            if (hbjVar.o(gyi.h) && hbjVar.o(gyi.o) && ((ocq) this.c).ai(PJGqOKsIpSdZ.BySNu) < 3) {
                ?? r0 = this.a;
                Object obj2 = this.d;
                ?? r6 = this.b;
                lzi lziVarA = lzj.a();
                lziVarA.a = "AllIn";
                lziVarA.d(true);
                lziVarA.c(new sfm(nkw.PHOTO));
                lziVarA.b(new sfm(pka.BACK));
                lziVarA.b = r6;
                ((AmbientMode.AmbientController) obj2).b((lzh) r0.a(), lziVarA.a());
                return;
            }
            return;
        }
        if (i == 2) {
            ?? r02 = this.b;
            lzh lzhVar = (lzh) r02.a();
            lzi lziVarA2 = lzj.a();
            lziVarA2.a = "PitchRollIndicatorHUD";
            lziVarA2.c(scn.F(this.a));
            gzi gziVar = gyp.a;
            lziVarA2.b(new sfm(pka.BACK));
            lziVarA2.d(true ^ ((hbj) this.e).p(gyp.i));
            lziVarA2.b = this.d;
            lziVarA2.c = rwc.j((lze) r02.a());
            ((AmbientMode.AmbientController) this.c).b(lzhVar, lziVarA2.a());
            return;
        }
        if (i == 3) {
            ?? r03 = this.b;
            lzh lzhVar2 = (lzh) r03.a();
            lzi lziVarA3 = lzj.a();
            lziVarA3.a = "UpDownIndicatorHUD";
            lziVarA3.c(scn.F(this.a));
            lziVarA3.b(new sfm(pka.BACK));
            lziVarA3.d(true ^ ((hbj) this.e).p(gyp.i));
            lziVarA3.b = this.d;
            lziVarA3.c = rwc.j((lze) r03.a());
            ((AmbientMode.AmbientController) this.c).b(lzhVar2, lziVarA3.a());
            return;
        }
        if (((fuf) this.e).a) {
            if (((hbj) this.c).p(hac.K)) {
                ?? r04 = this.d;
                Object obj3 = this.b;
                ?? r62 = this.a;
                lzi lziVarA4 = lzj.a();
                lziVarA4.a = "Astro";
                lziVarA4.d(true);
                lziVarA4.c(new sfm(nkw.PHOTO));
                lziVarA4.b(new sfm(pka.BACK));
                lziVarA4.b = r62;
                ((AmbientMode.AmbientController) obj3).b(r04, lziVarA4.a());
            }
        }
    }

    public /* synthetic */ gtd(hbj hbjVar, ocq ocqVar, owf owfVar, AmbientMode.AmbientController ambientController, tzj tzjVar, int i) {
        this.f = i;
        this.e = hbjVar;
        this.c = ocqVar;
        this.b = owfVar;
        this.d = ambientController;
        this.a = tzjVar;
    }

    public /* synthetic */ gtd(Executor executor, owq owqVar, mhp mhpVar, fdq fdqVar, mhq mhqVar, int i) {
        this.f = i;
        this.a = executor;
        this.b = owqVar;
        this.c = mhpVar;
        this.e = fdqVar;
        this.d = mhqVar;
    }
}
