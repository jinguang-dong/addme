package defpackage;

import android.os.SystemClock;
import com.google.android.apps.camera.facedeblur.deeprestore.jni.DeepRestoreNative;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.ShotMetadata;
import com.pairip.VMRunner;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class hkn implements hkl {
    private static final sgv e = sgv.g("hkn");
    public final Executor a;
    public final pbn b;
    public volatile boolean c = false;
    public rwc d;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private ByteBuffer j;
    private final kjc k;
    private final int l;
    private final int m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[Catch: all -> 0x018b, SYNTHETIC, TRY_LEAVE, TryCatch #3 {all -> 0x018b, blocks: (B:70:0x018a, B:69:0x0187, B:66:0x0182), top: B:96:0x0182, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[Catch: IOException -> 0x019c, Exception -> 0x01a9, SYNTHETIC, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a9, blocks: (B:81:0x019b, B:80:0x0198, B:86:0x01a1, B:87:0x01a8), top: B:94:0x00b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r2v0, types: [our] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [sgt, shi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public hkn(defpackage.kjc r23, java.util.concurrent.Executor r24, defpackage.our r25, defpackage.hbj r26, defpackage.pbn r27, android.content.Context r28, defpackage.mhq r29, defpackage.mhp r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkn.<init>(kjc, java.util.concurrent.Executor, our, hbj, pbn, android.content.Context, mhq, mhp):void");
    }

    @Override // defpackage.hkl
    public synchronized syu a(hkk hkkVar) {
        return (syu) VMRunner.invoke("Fxd3PU798iut7L8d", new Object[]{this, hkkVar});
    }

    public final synchronized Boolean b(hkk hkkVar) {
        if (!this.d.h()) {
            ((sgt) e.c().M(1348)).v("%s DeepRestoreFaceDeblur is not ready, return the image.", "[FaceDB-DR]");
            return false;
        }
        Object obj = hkkVar.b;
        Object obj2 = hkkVar.a;
        Object obj3 = hkkVar.c;
        if (obj3 == null) {
            ((sgt) e.c().M(1345)).v("%s [RGB path] Input mask is null.", "[FaceDB-DR]");
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Object obj4 = hkkVar.e;
        long jLongValue = ((Long) this.d.c()).longValue();
        long jA = InterleavedWriteViewU8.a(((InterleavedImageU8) obj2).g());
        long jA2 = InterleavedWriteViewU8.a(((InterleavedImageU8) obj3).g());
        float f = ((hkw) obj).a;
        long[] jArr = ((hkw) obj).b;
        int iDeepRestoreFaceDeblurRgb = DeepRestoreNative.deepRestoreFaceDeblurRgb(jLongValue, jA, jA2, f, jArr, ((hkw) obj).c, this.f, this.g, obj4 != null ? ShotMetadata.a((ShotMetadata) obj4) : 0L, this.i);
        boolean z = iDeepRestoreFaceDeblurRgb > 0;
        if (obj4 != null && z) {
            GcamModuleJNI.ShotMetadata_should_apply_deblur_badge_set(((ShotMetadata) obj4).a, (ShotMetadata) obj4, true);
        }
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        tpc tpcVarM = spn.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spn spnVar = (spn) tpcVarM.b;
        spnVar.b |= 4;
        spnVar.e = jElapsedRealtime2;
        int i = 0;
        for (long j : jArr) {
            int thumbnailSize = FaceMetadataNative.getThumbnailSize(j);
            if (i < thumbnailSize) {
                i = thumbnailSize;
            }
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        spn spnVar2 = (spn) tphVar;
        spnVar2.b |= 2;
        spnVar2.d = i;
        int i2 = this.l;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        spn spnVar3 = (spn) tphVar2;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        spnVar3.h = i3;
        spnVar3.b |= 32;
        int i4 = true != z ? 3 : 4;
        if (iDeepRestoreFaceDeblurRgb < 0) {
            i4 = 5;
        }
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        tph tphVar3 = tpcVarM.b;
        spn spnVar4 = (spn) tphVar3;
        spnVar4.c = i4 - 1;
        spnVar4.b |= 1;
        if (iDeepRestoreFaceDeblurRgb == 1) {
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            spn spnVar5 = (spn) tpcVarM.b;
            spnVar5.f = 1;
            spnVar5.b |= 8;
        } else if (iDeepRestoreFaceDeblurRgb == 2) {
            if (!tphVar3.C()) {
                tpcVarM.o();
            }
            spn spnVar6 = (spn) tpcVarM.b;
            spnVar6.f = 2;
            spnVar6.b |= 8;
        }
        int i5 = this.m;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        spn spnVar7 = (spn) tpcVarM.b;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        spnVar7.g = i6;
        spnVar7.b |= 16;
        Object obj5 = hkkVar.d;
        if (obj5 != null) {
            ((mdo) obj5).w = (spn) tpcVarM.l();
        }
        Locale locale = Locale.getDefault();
        Boolean boolValueOf = Boolean.valueOf(z);
        String.format(locale, "\n === Deeprestore Summary === \nEnabled: true\nImage format: %s\nApplied: %b\nProcessing Time: %d ms \n", "RGB", boolValueOf, Long.valueOf(jElapsedRealtime2));
        return boolValueOf;
    }
}
