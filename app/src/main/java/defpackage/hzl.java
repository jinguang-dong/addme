package defpackage;

import com.google.android.apps.camera.hdrplus.postprocessing.flareremoval.jni.NativeFlareRemoval;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.FrameMetadata;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hzl {
    private static final sgv a = sgv.g("hzl");
    private final iat b;
    private final iao c;
    private final ibo d;
    private final ihc e;
    private final idt f;
    private final sbv g;
    private final pbn h;
    private final nkw i;
    private final kqp j;
    private final kgw k;
    private final NativeFlareRemoval l;
    private final hbj m;
    private final iso n;
    private final iso o;
    private final cxb p;
    private final cxb q;
    private final cxb r;

    public hzl(iat iatVar, iao iaoVar, kgw kgwVar, tzj tzjVar, tzj tzjVar2, tzj tzjVar3, NativeFlareRemoval nativeFlareRemoval, hbj hbjVar, iso isoVar, iso isoVar2, ibo iboVar, ihc ihcVar, idt idtVar, sbv sbvVar, pbn pbnVar, nkw nkwVar, kqp kqpVar) {
        this.b = iatVar;
        this.c = iaoVar;
        this.p = new cxb(tzjVar);
        this.k = kgwVar;
        this.q = new cxb(tzjVar2);
        this.r = new cxb(tzjVar3);
        this.l = nativeFlareRemoval;
        this.m = hbjVar;
        this.o = isoVar;
        this.n = isoVar2;
        this.d = iboVar;
        this.e = ihcVar;
        this.f = idtVar;
        this.g = sbvVar;
        this.h = pbnVar;
        this.i = nkwVar;
        this.j = kqpVar;
    }

    private static hyc e(icj icjVar) {
        if (icjVar.b != null) {
            return hyc.YUV;
        }
        if (icjVar.a != null) {
            return hyc.RGB;
        }
        if (icjVar.c != null) {
            return hyc.RGB_HW;
        }
        throw new IllegalArgumentException("Unknown image format in PostprocessingImage.");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, lss] */
    private final void f(icj icjVar) {
        if (this.i.equals(nkw.COTTAGE)) {
            Optional optional = icjVar.n;
            if (optional.isPresent()) {
                this.d.g(icjVar, (hqp) optional.get());
                return;
            }
        }
        if (icjVar.q.b()) {
            this.d.g(icjVar, hqp.HIGH_RESOLUTION);
        } else if ((this.f.b() || this.m.p(gzc.A)) && icjVar.d.l()) {
            this.d.g(icjVar, hqp.DEBLUR_FUSION);
            ((mdo) icjVar.r.b.o()).B = true;
        }
    }

    private static boolean g(icj icjVar) {
        FaceInfoVector faceInfoVectorO;
        FrameMetadata frameMetadataD = icjVar.d.d();
        return (frameMetadataD == null || (faceInfoVectorO = frameMetadataD.o()) == null || faceInfoVectorO.b() <= 0) ? false : true;
    }

    private final boolean h(icj icjVar) {
        boolean z = false;
        if (this.i.equals(nkw.COTTAGE)) {
            kqp kqpVar = this.j;
            pas pasVarB = icjVar.b();
            pas pasVar = kqpVar.b;
            if (!pasVar.equals(pasVarB) && !pasVar.equals(icjVar.b().h())) {
                z = true;
            }
        }
        if (z) {
            icjVar.b();
        }
        return z;
    }

    public final boolean a(String str) {
        return Objects.equals(this.g.get(str), lcy.WIDE);
    }

    public final rwc b(hxu hxuVar, rwc rwcVar, iea ieaVar) throws Throwable {
        hzl hzlVar;
        try {
            this.h.f("processPrimary");
            hzlVar = this;
        } catch (Throwable th) {
            th = th;
            hzlVar = this;
        }
        try {
            rwc rwcVarC = hzlVar.c(hxuVar, rwcVar, ieaVar, true, "primary");
            hzlVar.h.g();
            return rwcVarC;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            hzlVar.h.g();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x066f A[PHI: r1
      0x066f: PHI (r1v14 rwc) = (r1v13 rwc), (r1v13 rwc), (r1v13 rwc), (r1v13 rwc), (r1v90 rwc) binds: [B:197:0x04fc, B:202:0x0518, B:204:0x0524, B:206:0x0530, B:256:0x066a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x079c A[PHI: r1
      0x079c: PHI (r1v15 rwc) = (r1v14 rwc), (r1v14 rwc), (r1v14 rwc), (r1v42 rwc) binds: [B:258:0x068a, B:260:0x0694, B:261:0x0696, B:282:0x0793] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0813 A[PHI: r1
      0x0813: PHI (r1v17 rwc) = (r1v16 rwc), (r1v33 rwc) binds: [B:288:0x07c7, B:299:0x07fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0823  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0873  */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v105, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r4v29, types: [ihc] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v50, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r6v52, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r8v10, types: [android.hardware.HardwareBuffer] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.hardware.HardwareBuffer] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.rwc c(defpackage.hxu r30, defpackage.rwc r31, defpackage.iea r32, boolean r33, java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 2490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzl.c(hxu, rwc, iea, boolean, java.lang.String):rwc");
    }

    public final void d(hxu hxuVar, icj icjVar, String str) {
        this.h.e("processSecondary", new dwq(this, hxuVar, icjVar, str, 8));
    }
}
