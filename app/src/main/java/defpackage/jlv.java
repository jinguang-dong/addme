package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import j$.util.Collection;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlv implements jlt {
    private static final Map a = new HashMap();

    public jlv(Map map, rwc rwcVar, lkk lkkVar) {
        if (lkkVar == lkk.AUTO || !rwcVar.h()) {
            b(lcz.RAW_ULTRAWIDE, lcz.RAW_ULTRAWIDE_RM, map);
            b(lcz.RAW_WIDE, lcz.RAW_WIDE_RM, map);
            b(lcz.RAW_TELE, lcz.RAW_TELE_RM, map);
        } else {
            Optional optionalFindFirst = Collection.EL.stream(map.values()).findFirst();
            if (!optionalFindFirst.isPresent()) {
                throw new IllegalStateException("Matching physical stream not found for ".concat(((peo) rwcVar.c()).d().a));
            }
            a.put(((peo) optionalFindFirst.get()).d().a, ((peo) rwcVar.c()).d().a);
        }
    }

    private static void b(lcz lczVar, lcz lczVar2, Map map) {
        peo peoVar = (peo) map.get(lczVar);
        peo peoVar2 = (peo) map.get(lczVar2);
        if (peoVar == null || peoVar2 == null) {
            return;
        }
        a.put(peoVar.d().a, peoVar2.d().a);
    }

    @Override // defpackage.jlt
    public final poe a(String str, poe poeVar) {
        jlu jluVar = new jlu(poeVar);
        String str2 = (String) a.get(str);
        if (str2 != null) {
            jluVar.a = str2;
            jluVar.c(CaptureResult.SENSOR_PIXEL_MODE, 1);
            poe poeVarK = tgq.k(poeVar, str);
            Rect rect = (Rect) poeVarK.a(CaptureResult.SCALER_CROP_REGION);
            if (rect != null) {
                int i = rect.left;
                int i2 = rect.top;
                int i3 = rect.right;
                int i4 = rect.bottom;
                rect.set(i + i, i2 + i2, i3 + i3, i4 + i4);
                jluVar.c(CaptureResult.SCALER_CROP_REGION, rect);
            }
            Face[] faceArr = (Face[]) poeVarK.a(CaptureResult.STATISTICS_FACES);
            if (faceArr != null) {
                for (Face face : faceArr) {
                    Rect bounds = face.getBounds();
                    Rect bounds2 = face.getBounds();
                    int i5 = bounds.left;
                    int i6 = bounds.top;
                    int i7 = bounds.right;
                    int i8 = bounds.bottom;
                    bounds2.set(i5 + i5, i6 + i6, i7 + i7, i8 + i8);
                }
                jluVar.c(CaptureResult.STATISTICS_FACES, faceArr);
            }
        }
        return jluVar;
    }
}
