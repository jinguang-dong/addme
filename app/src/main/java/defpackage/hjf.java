package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import com.google.android.apps.camera.facemetadata.conversions.jni.MeshWarpInverseNative;
import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.ShotMetadata;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hjf implements Callable {
    private final long a;
    private final int b;
    private final boolean c;
    private final hkk d;

    public hjf(long j, hkk hkkVar, int i, boolean z) {
        this.a = j;
        this.d = hkkVar;
        this.b = i;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, pnx, poe] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, poj] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int length;
        Object obj;
        rwc rwcVar;
        poi poiVar;
        FaceToBeautify[] faceToBeautifyArr;
        hkk hkkVar = this.d;
        Object obj2 = hkkVar.d;
        ltr ltrVar = (ltr) obj2;
        rnt.L(ltrVar.b());
        ?? r4 = hkkVar.a;
        poi poiVar2 = (poi) r4.g().get(0);
        poi poiVar3 = (poi) r4.g().get(1);
        poi poiVar4 = (poi) r4.g().get(2);
        qfq qfqVar = new qfq(r4.c(), r4.b());
        ?? r11 = hkkVar.b;
        Face[] faceArr = (Face[]) r11.a(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) r11.a(CaptureResult.SCALER_CROP_REGION);
        MeshWarp meshWarpR = rect != null ? tgq.r(rect, r11) : null;
        if (faceArr == null || (length = faceArr.length) == 0 || rect == null) {
            return new hjt(r4);
        }
        FaceToBeautify[] faceToBeautifyArr2 = new FaceToBeautify[length];
        int i = 0;
        poj pojVar = r4;
        while (i < faceArr.length) {
            pnu pnuVarA = pnu.a(faceArr[i]);
            rwc rwcVar2 = (rwc) hkkVar.c;
            if (rwcVar2.h()) {
                rwc rwcVar3 = ((lnx) rwcVar2.c()).p;
                if (rwcVar3.h()) {
                    obj = obj2;
                    if (i < ((loi) rwcVar3.c()).a.length) {
                        rwcVar = ((loi) rwcVar3.c()).a[i].l;
                    }
                } else {
                    obj = obj2;
                }
                rwcVar = rvk.a;
            } else {
                rwcVar = rvk.a;
                obj = obj2;
            }
            if (meshWarpR.g()) {
                poiVar = poiVar2;
                faceToBeautifyArr = faceToBeautifyArr2;
            } else {
                poiVar = poiVar2;
                faceToBeautifyArr = faceToBeautifyArr2;
                MeshWarpInverseNative.invertMeshWarp(meshWarpR.a);
            }
            Rect rect2 = pnuVarA.c;
            poi poiVar5 = poiVar;
            poi poiVar6 = poiVar3;
            Point point = new Point(rect2.left, rect2.top);
            rwc rwcVar4 = rwcVar;
            Point point2 = new Point(rect2.right, rect2.bottom);
            poi poiVar7 = poiVar4;
            Point point3 = new Point(rect2.right, rect2.top);
            Point point4 = new Point(rect2.left, rect2.bottom);
            Point pointAe = ezh.ae(point, meshWarpR);
            Point pointAe2 = ezh.ae(point2, meshWarpR);
            Point pointAe3 = ezh.ae(point3, meshWarpR);
            Point pointAe4 = ezh.ae(point4, meshWarpR);
            Face[] faceArr2 = faceArr;
            int i2 = i;
            poj pojVar2 = pojVar;
            hkk hkkVar2 = hkkVar;
            Rect rect3 = new Rect(ske.ae(pointAe.x, pointAe2.x, pointAe3.x, pointAe4.x), ske.ae(pointAe.y, pointAe2.y, pointAe3.y, pointAe4.y), ske.ad(pointAe.x, pointAe2.x, pointAe3.x, pointAe4.x), ske.ad(pointAe.y, pointAe2.y, pointAe3.y, pointAe4.y));
            Point point5 = new Point(rect3.left, rect3.top);
            Point point6 = new Point(rect3.right, rect3.bottom);
            Point pointAd = ezh.ad(point5, qfqVar, rect);
            Point pointAd2 = ezh.ad(point6, qfqVar, rect);
            Rect rect4 = new Rect(pointAd.x, pointAd.y, pointAd2.x, pointAd2.y);
            Point point7 = pnuVarA.d;
            Point point8 = pnuVarA.e;
            Point pointAd3 = point8 != null ? ezh.ad(ezh.ae(point8, meshWarpR), qfqVar, rect) : null;
            Point pointAd4 = point7 != null ? ezh.ad(ezh.ae(point7, meshWarpR), qfqVar, rect) : null;
            hky hkyVarA = FaceToBeautify.a(rect4);
            hkyVarA.e = pointAd4;
            hkyVarA.f = pointAd3;
            if (rwcVar4.h()) {
                int size = ((sbp) rwcVar4.c()).size();
                float[] fArr = new float[size];
                for (int i3 = 0; i3 < size; i3++) {
                    Float f = (Float) ((sbp) rwcVar4.c()).get(i3);
                    fArr[i3] = f == null ? -1.0f : f.floatValue();
                }
                hkyVarA.k = fArr;
            }
            faceToBeautifyArr[i2] = hkyVarA.a();
            i = i2 + 1;
            poiVar2 = poiVar5;
            obj2 = obj;
            poiVar3 = poiVar6;
            poiVar4 = poiVar7;
            faceArr = faceArr2;
            hkkVar = hkkVar2;
            faceToBeautifyArr2 = faceToBeautifyArr;
            pojVar = pojVar2;
        }
        hkk hkkVar3 = hkkVar;
        Object obj3 = obj2;
        poj pojVar3 = pojVar;
        poi poiVar8 = poiVar2;
        FaceToBeautify[] faceToBeautifyArr3 = faceToBeautifyArr2;
        poi poiVar9 = poiVar3;
        poi poiVar10 = poiVar4;
        Object obj4 = (this.c && ltrVar.equals(ltr.ON_LIGHT)) ? ltr.ON_ADAPTIVE : obj3;
        obj3.getClass();
        long j = this.a;
        int iA = pojVar3.a();
        int iC = pojVar3.c();
        int iB = pojVar3.b();
        ByteBuffer buffer = poiVar8.getBuffer();
        int pixelStride = poiVar8.getPixelStride();
        int rowStride = poiVar8.getRowStride();
        ByteBuffer buffer2 = poiVar9.getBuffer();
        int pixelStride2 = poiVar9.getPixelStride();
        int rowStride2 = poiVar9.getRowStride();
        ByteBuffer buffer3 = poiVar10.getBuffer();
        int pixelStride3 = poiVar10.getPixelStride();
        int rowStride3 = poiVar10.getRowStride();
        int i4 = this.b;
        int iOrdinal = ltrVar.ordinal();
        int i5 = i4 & ((iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) ? 7 : 0);
        rwc rwcVar5 = (rwc) hkkVar3.e;
        ltr ltrVar2 = (ltr) obj4;
        return new hjs(pojVar3, FaceBeautificationNative.doFaceBeautification(j, iA, iC, iB, buffer, pixelStride, rowStride, buffer2, pixelStride2, rowStride2, buffer3, pixelStride3, rowStride3, faceToBeautifyArr3, ltrVar2.f, i5, rwcVar5.h() ? ShotMetadata.a((ShotMetadata) rwcVar5.c()) : 0L), ltrVar2);
    }
}
