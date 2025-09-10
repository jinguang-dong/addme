package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import com.google.googlex.gcam.creativecamera.allin.jni.AllInNativeImpl;
import com.google.googlex.gcam.creativecamera.allin.jni.ImageConversionJniImpl;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class teg {
    public static final sgv a = sgv.g("teg");
    public final tfq b;
    public final tes c;
    public final tdy d;
    public final tfk e;
    public final syw f;
    public final owf g;
    public volatile Optional h = Optional.empty();
    public final Map i = new HashMap();
    public final ImageConversionJniImpl j;
    private final qat k;

    public teg(tfq tfqVar, ImageConversionJniImpl imageConversionJniImpl, qat qatVar, tes tesVar, tdy tdyVar, tfk tfkVar, syw sywVar, owf owfVar) {
        this.b = tfqVar;
        this.j = imageConversionJniImpl;
        this.k = qatVar;
        this.c = tesVar;
        this.d = tdyVar;
        this.e = tfkVar;
        this.f = sywVar;
        this.g = owfVar;
    }

    public static szr c(szr szrVar, foi foiVar) {
        tpc tpcVar = (tpc) szrVar.a(5, null);
        tpcVar.r(szrVar);
        fnt fntVarDO = foiVar.dO();
        fnt fntVar = fnt.TRACKING;
        if (!tpcVar.b.C()) {
            tpcVar.o();
        }
        boolean z = fntVarDO == fntVar;
        szr szrVar2 = (szr) tpcVar.b;
        szrVar2.b = 1 | szrVar2.b;
        szrVar2.c = z;
        tpcVar.W(rup.p(rup.l(foiVar.dN())));
        return (szr) tpcVar.l();
    }

    public final tdx a(int i) {
        tdx tdxVar;
        synchronized (this) {
            tdxVar = (tdx) this.i.get(Integer.valueOf(i));
        }
        if (tdxVar != null) {
            return tdxVar;
        }
        throw new IllegalArgumentException(a.bv(i, "Capture session does not exist: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0125  */
    /* JADX WARN: Type inference failed for: r12v0, types: [fnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, uem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.tdx r16, int r17, defpackage.fon r18, defpackage.tdv r19, com.google.googlex.gcam.YuvWriteView r20, android.util.Size r21) throws defpackage.tez {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.teg.d(tdx, int, fon, tdv, com.google.googlex.gcam.YuvWriteView, android.util.Size):void");
    }

    public final void b() {
        AllInNativeImpl allInNativeImpl = (AllInNativeImpl) this.b;
        long j = allInNativeImpl.b;
        String str = cdVQ.TyjAbhzVcC;
        if (j == 0) {
            ((sgt) ((sgt) AllInNativeImpl.a.c().h(shx.a, str)).M(5870)).s("Calling close() on an already closed processor.");
            tga tgaVar = tga.a;
            return;
        }
        shl shlVar = shx.a;
        int iAA = a.aA(AllInNativeImpl.a(allInNativeImpl.delete(allInNativeImpl.b)).d);
        if (iAA == 0 || iAA != 2) {
            ((sgt) ((sgt) AllInNativeImpl.a.b().h(shx.a, str)).M(5872)).s("Error deleting processor.");
        }
        allInNativeImpl.b = 0L;
    }
}
