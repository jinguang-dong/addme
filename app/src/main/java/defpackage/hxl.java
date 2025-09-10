package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hxl implements iad {
    final /* synthetic */ int a;
    final /* synthetic */ hxs b;
    final /* synthetic */ gga c;

    public hxl(hxs hxsVar, int i, gga ggaVar) {
        this.a = i;
        this.c = ggaVar;
        this.b = hxsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, lss] */
    @Override // defpackage.iad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void en(defpackage.iby r9, android.graphics.Bitmap r10, com.google.googlex.gcam.ShotMetadata r11) {
        /*
            r8 = this;
            hxs r9 = r8.b
            pbn r0 = r9.b
            java.lang.String r1 = "PostviewRgbCallback"
            r0.f(r1)
            cxb r1 = r9.k
            boolean r2 = r1.C()
            r3 = 0
            if (r2 == 0) goto L4e
            com.google.googlex.gcam.FrameMetadata r2 = r11.d()
            long r4 = r2.a
            long r4 = com.google.googlex.gcam.GcamModuleJNI.FrameMetadata_geometric_calibration_get(r4, r2)
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L24
            r2 = 0
            goto L29
        L24:
            com.google.googlex.gcam.GeometricCalibrationVector r2 = new com.google.googlex.gcam.GeometricCalibrationVector
            r2.<init>(r4, r3)
        L29:
            long r4 = r2.a
            boolean r2 = com.google.googlex.gcam.GcamModuleJNI.GeometricCalibrationVector_isEmpty(r4, r2)
            if (r2 == 0) goto L45
            com.google.googlex.gcam.FrameMetadata r2 = r11.d()
            com.google.googlex.gcam.MeshWarp r2 = r2.s()
            com.google.googlex.gcam.FloatVector r2 = r2.c()
            long r4 = r2.a
            boolean r2 = com.google.googlex.gcam.GcamModuleJNI.FloatVector_isEmpty(r4, r2)
            if (r2 != 0) goto L4e
        L45:
            java.lang.Object r1 = r1.B()
            loq r1 = (defpackage.loq) r1
            r1.d(r10, r11)
        L4e:
            ocq r9 = r9.m
            int r11 = r8.a
            gga r8 = r8.c
            java.lang.Object r8 = r8.b
            boolean r1 = r8.ah()
            android.graphics.Bitmap r9 = r9.ao(r10, r11, r1)
            r8.ae(r9, r3)
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxl.en(iby, android.graphics.Bitmap, com.google.googlex.gcam.ShotMetadata):void");
    }
}
