package defpackage;

import android.content.Context;
import com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
class iha implements idy {
    public static final sgv a = sgv.g("iha");
    public final pbn c;
    public final lge g;
    public final hbj h;
    private final ovx i;
    private final rwc j;
    private final Executor k;
    private final Context l;
    public final Object d = new Object();
    public final tdi b = new tdi();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public boolean f = false;

    public iha(lge lgeVar, Executor executor, ovx ovxVar, pbn pbnVar, rwc rwcVar, hbj hbjVar, Context context) {
        this.g = lgeVar;
        this.k = executor;
        this.i = ovxVar;
        this.c = pbnVar;
        this.j = rwcVar;
        this.h = hbjVar;
        this.l = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x01df  */
    /* JADX WARN: Type inference failed for: r5v1, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r5v3, types: [sgt, shi] */
    @Override // defpackage.idy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iha.a():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (com.google.googlex.gcam.GcamModuleJNI.GrayImageS16_empty(r12.a, r12) != false) goto L18;
     */
    @Override // defpackage.idy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.syu b(long r10, defpackage.kgw r12, defpackage.idx r13, defpackage.idx r14, com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback r15, defpackage.pas r16) {
        /*
            r9 = this;
            idv r12 = new idv
            r0 = 5
            r12.<init>(r0)
            j$.util.Optional r0 = r13.b
            j$.util.Optional r12 = r0.map(r12)
            rvk r0 = defpackage.rvk.a
            java.lang.Object r12 = r12.orElse(r0)
            r5 = r12
            rwc r5 = (defpackage.rwc) r5
            boolean r12 = r5.h()
            if (r12 == 0) goto L98
            java.lang.Object r12 = r5.c()
            com.google.googlex.gcam.InterleavedImageU8 r12 = (com.google.googlex.gcam.InterleavedImageU8) r12
            boolean r12 = r12.i()
            if (r12 == 0) goto L29
            goto L98
        L29:
            j$.util.Optional r12 = r14.b
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L3d
            java.lang.Object r12 = r12.get()
            com.google.googlex.gcam.InterleavedImageU8 r12 = (com.google.googlex.gcam.InterleavedImageU8) r12
            boolean r12 = r12.i()
            if (r12 == 0) goto L54
        L3d:
            j$.util.Optional r12 = r14.c
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L69
            java.lang.Object r12 = r12.get()
            com.google.googlex.gcam.GrayImageS16 r12 = (com.google.googlex.gcam.GrayImageS16) r12
            long r0 = r12.a
            boolean r12 = com.google.googlex.gcam.GcamModuleJNI.GrayImageS16_empty(r0, r12)
            if (r12 == 0) goto L54
            goto L69
        L54:
            szh r7 = new szh
            r7.<init>()
            java.util.concurrent.Executor r12 = r9.k
            igz r0 = new igz
            r1 = r9
            r3 = r10
            r6 = r13
            r8 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r12.execute(r0)
            return r7
        L69:
            sgv r9 = defpackage.iha.a
            shi r9 = r9.c()
            r12 = 2002(0x7d2, float:2.805E-42)
            shi r9 = r9.M(r12)
            sgt r9 = (defpackage.sgt) r9
            java.lang.String r12 = "Missing secondary image, effect not applied."
            r9.s(r12)
            java.lang.Object r9 = r5.c()
            com.google.googlex.gcam.InterleavedImageU8 r9 = (com.google.googlex.gcam.InterleavedImageU8) r9
            obu r4 = defpackage.obu.i(r9)
            com.google.googlex.gcam.ShotMetadata r5 = r13.e
            r6 = 2
            r2 = r10
            r1 = r15
            r1.e(r2, r4, r5, r6)
            r9 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            syu r9 = defpackage.ske.M(r9)
            return r9
        L98:
            sgv r9 = defpackage.iha.a
            shi r9 = r9.b()
            r10 = 2001(0x7d1, float:2.804E-42)
            shi r9 = r9.M(r10)
            sgt r9 = (defpackage.sgt) r9
            java.lang.String r10 = "Missing primary image, releasing secondary images."
            r9.s(r10)
            j$.util.Optional r9 = r14.b
            gqw r10 = new gqw
            r11 = 12
            r10.<init>(r11)
            r9.ifPresent(r10)
            j$.util.Optional r9 = r14.a
            gqw r10 = new gqw
            r11 = 13
            r10.<init>(r11)
            r9.ifPresent(r10)
            j$.util.Optional r9 = r14.c
            gqw r10 = new gqw
            r11 = 14
            r10.<init>(r11)
            r9.ifPresent(r10)
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.String r10 = "Primary image unavailable."
            r9.<init>(r10)
            syu r9 = defpackage.ske.L(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iha.b(long, kgw, idx, idx, com.google.android.apps.camera.hdrplus.fusion.api.FusionProgressCallback, pas):syu");
    }

    @Override // defpackage.idy
    public final int e(int i) {
        if (i == 0) {
            return 3;
        }
        ((sgt) a.c().M(1988)).t("Unexpected fusion type for Fusion Zoom : %d", i);
        return 3;
    }

    @Override // defpackage.idy
    public final int f(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 201;
            case 2:
                return 202;
            case 3:
                return 203;
            case 4:
                return 204;
            case 5:
                return 205;
            case 6:
                return 206;
            case 7:
                return 207;
            case 8:
                return 208;
            case 9:
                return 209;
            case 10:
                return 210;
            case 11:
                return 211;
            default:
                return 4;
        }
    }

    public final String g() {
        rwc rwcVar = this.j;
        return rwcVar.h() ? ((File) rwcVar.c()).getAbsolutePath() : "";
    }

    public final void h(long j, long j2, FusionProgressCallback fusionProgressCallback, ShotMetadata shotMetadata, String str) {
        pbn pbnVar = this.c;
        pbnVar.f("retrieveImage");
        if (j2 == -1) {
            pbnVar.g();
            ((sgt) a.c().M(1999)).D("Does not save debug image due to fallback %s for shot %s", str, j);
            return;
        }
        rwc rwcVarA = this.b.a(j2);
        if (rwcVarA.h()) {
            fusionProgressCallback.a(j, (InterleavedImageU8) rwcVarA.c(), new ShotMetadata(shotMetadata), str);
            pbnVar.g();
        } else {
            pbnVar.g();
            ((sgt) a.c().M(1998)).D("Error retrieving debug image %s for shot %s", str, j);
        }
    }

    @Override // defpackage.idy
    public final void c() {
    }

    @Override // defpackage.idy
    public final /* synthetic */ void d() {
    }
}
