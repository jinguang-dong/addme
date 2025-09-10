package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import com.google.android.apps.camera.facemetadata.jni.FaceMetadataNative;
import com.google.googlex.gcam.ShotMetadata;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkv {
    private final tzj a;
    private final hpa b;
    private rwc c;
    private final hbj d;

    public hkv(our ourVar, tzj tzjVar, hpa hpaVar, pbn pbnVar, Executor executor, hbj hbjVar) {
        if (!FaceMetadataNative.a.getAndSet(true)) {
            paw.a(FaceMetadataNative.class, "gcastartup");
        }
        this.c = rwc.j(Long.valueOf(FaceMetadataNative.createHandle()));
        this.a = tzjVar;
        ourVar.d(new hku(this, executor, pbnVar, 0));
        this.d = hbjVar;
        this.b = hpaVar;
    }

    public final synchronized void a() {
        if (this.c.h()) {
            FaceMetadataNative.releaseHandle(((Long) this.c.c()).longValue());
        }
        this.c = rvk.a;
    }

    public final synchronized rwc b(ShotMetadata shotMetadata, poj pojVar) {
        lnl lnlVarA;
        lno[] lnoVarArr;
        rwc rwcVarA;
        long[] jArrGenerateFaceInfos;
        if (this.c.h() && (lnlVarA = this.b.a(shotMetadata.d().d())) != null && (lnoVarArr = lnlVarA.r) != null && lnoVarArr.length != 0) {
            tzj tzjVar = this.a;
            rvk rvkVar = rvk.a;
            if (((rwc) tzjVar.a()).h() && this.d.p(gyx.f)) {
                SystemClock.uptimeMillis();
                rwcVarA = ((lol) ((rwc) tzjVar.a()).c()).a(pojVar, lnlVarA, false);
                SystemClock.uptimeMillis();
            } else {
                rwcVarA = rvkVar;
            }
            float fC = pojVar.c();
            Rect rect = lnlVarA.v;
            float fWidth = rect.width();
            float fB = pojVar.b();
            float fHeight = rect.height();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < lnoVarArr.length) {
                lno lnoVar = lnoVarArr[i];
                rwc rwcVar = rwcVarA.h() ? ((loi) rwcVarA.c()).a[i].l : rvkVar;
                float f = fB / fHeight;
                float f2 = fC / fWidth;
                Rect rect2 = lnoVar.a;
                float f3 = fHeight;
                lno[] lnoVarArr2 = lnoVarArr;
                rwc rwcVar2 = rwcVarA;
                Rect rect3 = new Rect((int) (rect2.left * f2), (int) (rect2.top * f), (int) (rect2.right * f2), (int) (rect2.bottom * f));
                Point pointAf = ezh.af(lnoVar.c, f2, f);
                Point pointAf2 = ezh.af(lnoVar.d, f2, f);
                Point pointAf3 = ezh.af(lnoVar.f, f2, f);
                Point pointAf4 = ezh.af(lnoVar.e, f2, f);
                Point pointAf5 = ezh.af(lnoVar.g, f2, f);
                rvk rvkVar2 = rvkVar;
                Point pointAf6 = ezh.af(lnoVar.h, f2, f);
                if (pointAf == null || pointAf2 == null || pointAf3 == null || pointAf4 == null || pointAf5 == null || pointAf6 == null) {
                    throw new IllegalArgumentException("Required face feature missing");
                }
                float f4 = lnoVar.b;
                hky hkyVarA = FaceToBeautify.a(rect3);
                hkyVarA.e = pointAf;
                hkyVarA.f = pointAf2;
                hkyVarA.g = pointAf3;
                hkyVarA.h = pointAf4;
                hkyVarA.i = pointAf5;
                hkyVarA.j = pointAf6;
                hkyVarA.c = Float.valueOf((f4 - 1.0f) / 99.0f);
                hkyVarA.d = Float.valueOf(lnoVar.k);
                hkyVarA.b = Integer.valueOf(lnoVar.i);
                if (rwcVar.h()) {
                    int size = ((sbp) rwcVar.c()).size();
                    float[] fArr = new float[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        Float f5 = (Float) ((sbp) rwcVar.c()).get(i2);
                        fArr[i2] = f5 == null ? -1.0f : f5.floatValue();
                    }
                    hkyVarA.k = fArr;
                }
                arrayList.add(hkyVarA.a());
                i++;
                fHeight = f3;
                rwcVarA = rwcVar2;
                lnoVarArr = lnoVarArr2;
                rvkVar = rvkVar2;
            }
            rvk rvkVar3 = rvkVar;
            int size2 = arrayList.size();
            FaceToBeautify[] faceToBeautifyArr = new FaceToBeautify[size2];
            arrayList.toArray(faceToBeautifyArr);
            if (size2 != 0 && (jArrGenerateFaceInfos = FaceMetadataNative.generateFaceInfos(faceToBeautifyArr)) != null) {
                return rwc.j(new hkw(((pll) pojVar).a, shotMetadata.d().a(), FaceMetadataNative.generateFaceThumbnails(pojVar.c(), pojVar.b(), jArrGenerateFaceInfos, ((Long) this.c.c()).longValue()), jArrGenerateFaceInfos));
            }
            return rvkVar3;
        }
        return rvk.a;
    }
}
