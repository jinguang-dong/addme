package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import com.google.android.apps.camera.hdrplus.fusion.deblur.jni.NativeDeblurFusion;
import com.google.googlex.gcam.FaceInfoVector;
import com.google.googlex.gcam.HalAfMetadata;
import com.google.googlex.gcam.PixelRect;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ieo implements iey {
    private static final sgv a = sgv.g("ieo");
    private final String b;
    private final String c;
    private final pjo d;
    private final pjo e;
    private final jwd f;
    private final hbj g;
    private final gyn h;

    public ieo(nms nmsVar, Map map, jwd jwdVar, gyn gynVar, hbj hbjVar) {
        this.f = jwdVar;
        this.h = gynVar;
        this.g = hbjVar;
        peo peoVar = (peo) map.get(lcz.RAW_WIDE);
        peoVar.getClass();
        String str = peoVar.d().a;
        this.b = str;
        peo peoVar2 = (peo) map.get(lcz.RAW_ULTRAWIDE);
        peoVar2.getClass();
        String str2 = peoVar2.d().a;
        this.c = str2;
        this.d = nmsVar.b(str);
        this.e = nmsVar.b(str2);
    }

    private static final PixelRect b(Rect rect) {
        PixelRect pixelRect = new PixelRect();
        pixelRect.i(rect.left);
        pixelRect.j(rect.right);
        pixelRect.k(rect.top);
        pixelRect.l(rect.bottom);
        return pixelRect;
    }

    @Override // defpackage.iey
    public final rwc a(pdk pdkVar) {
        poe poeVarD = pdkVar.d();
        poeVarD.getClass();
        pnx pnxVar = (pnx) poeVarD.g().get(this.b);
        poe poeVarD2 = pdkVar.d();
        poeVarD2.getClass();
        pnx pnxVar2 = (pnx) poeVarD2.g().get(this.c);
        if (pnxVar2 == null) {
            ((sgt) a.c().M(1957)).s("Empty secondary metadata, skipping.");
            return rvk.a;
        }
        pnxVar.getClass();
        pjo pjoVar = this.d;
        pjo pjoVar2 = this.e;
        Rect rectI = pjoVar.i();
        Rect rectI2 = pjoVar2.i();
        PixelRect pixelRectB = b(rectI);
        PixelRect pixelRectB2 = b(rectI2);
        PixelRect pixelRect = new PixelRect();
        FaceInfoVector faceInfoVector = new FaceInfoVector();
        tgq.w(pjoVar, pnxVar, faceInfoVector);
        Float f = (Float) pnxVar.a(CaptureResult.LENS_FOCAL_LENGTH);
        f.getClass();
        float fFloatValue = f.floatValue();
        Float f2 = (Float) pnxVar2.a(CaptureResult.LENS_FOCAL_LENGTH);
        f2.getClass();
        float fFloatValue2 = f2.floatValue();
        float fAI = (float) qpt.aI(pjoVar);
        float fAI2 = (float) qpt.aI(pjoVar2);
        Integer num = (Integer) pnxVar.a(CaptureResult.JPEG_ORIENTATION);
        num.getClass();
        int iIntValue = num.intValue() / 90;
        pnxVar.b();
        pnxVar2.b();
        gyn gynVar = this.h;
        jwd jwdVar = this.f;
        Object obj = gynVar.get();
        jwdVar.i.map(new idh(pnxVar, 4)).ifPresent(new hyq(obj, 12));
        boolean zBooleanValue = ((Boolean) jwdVar.g.map(new idh(pnxVar, 5)).orElse(false)).booleanValue();
        hbj hbjVar = this.g;
        String str = gzc.a;
        NativeDeblurFusion.nativeRetrieveReferenceFlowRoi(PixelRect.g(pixelRectB), fFloatValue, fAI, PixelRect.g(pixelRectB2), fFloatValue2, fAI2, FaceInfoVector.a(faceInfoVector), ((HalAfMetadata) obj).a, zBooleanValue, Build.DEVICE, PixelRect.g(pixelRect), iIntValue, false, hbjVar.p(gzc.B));
        Rect rect = new Rect(pixelRect.a(), pixelRect.c(), pixelRect.b(), pixelRect.d());
        rect.setIntersect(rect, rectI2);
        return rwc.j(new RectF(rect.left / rectI2.width(), rect.top / rectI2.height(), rect.right / rectI2.width(), rect.bottom / rectI2.height()));
    }
}
