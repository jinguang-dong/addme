package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kma extends ojl {
    private static final sgv a = sgv.g("kma");
    private final pau b;

    public kma(pau pauVar) {
        super((short[]) null);
        this.b = pauVar;
    }

    private static final PointF cm(PointF pointF) {
        return pointF != null ? pointF : new PointF(0.0f, 0.0f);
    }

    private static final List cn(poe poeVar) {
        CaptureResult.Key key;
        CaptureResult.Key key2;
        CaptureResult.Key key3;
        CaptureResult.Key key4;
        CaptureResult.Key key5;
        Rect rect;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        PointF pointF5;
        PointF pointF6;
        CaptureResult.Key key6 = nvq.r;
        if (key6 == null || (key = nvq.s) == null || (key2 = nvq.q) == null || (key3 = nvq.v) == null || (key4 = nvq.t) == null || (key5 = nvq.u) == null) {
            ((sgt) a.c().M(3317)).s("RESULT_EXTENDED_FACE key is null");
            return null;
        }
        Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
        Integer num = (Integer) poeVar.a(key6);
        int[] iArr = (int[]) poeVar.a(key);
        int[] iArr2 = (int[]) poeVar.a(key2);
        int[] iArr3 = (int[]) poeVar.a(key3);
        byte[] bArr = (byte[]) poeVar.a(key4);
        byte[] bArr2 = (byte[]) poeVar.a(key5);
        if (iArr2 == null || faceArr == null || num == null || iArr == null || iArr3 == null || bArr == null || bArr2 == null) {
            ((sgt) a.c().M(3318)).s("RESULT_EXTENDED_FACE is not supported");
            return null;
        }
        if (num.intValue() <= 0) {
            return new ArrayList();
        }
        List listN = poa.n(poeVar);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < num.intValue(); i++) {
            try {
                poa poaVar = (poa) listN.get(i);
                kly klyVar = new kly();
                klyVar.a = new Rect(0, 0, 0, 0);
                klyVar.a(-1);
                klyVar.d(-1);
                klyVar.b(false);
                klyVar.c(1);
                klyVar.h = new PointF(0.0f, 0.0f);
                klyVar.i = new PointF(0.0f, 0.0f);
                klyVar.f = new PointF(0.0f, 0.0f);
                klyVar.g = new PointF(0.0f, 0.0f);
                klyVar.j = new PointF(0.0f, 0.0f);
                klyVar.k = new PointF(0.0f, 0.0f);
                klyVar.a = poaVar.b;
                klyVar.a(poaVar.a);
                klyVar.d(bArr2[i]);
                klyVar.c(poaVar.e());
                klyVar.b(poaVar.c != 0);
                klyVar.f = cm(poaVar.m((byte) 1));
                klyVar.g = cm(poaVar.m((byte) 2));
                klyVar.h = cm(poaVar.m((byte) 5));
                klyVar.i = cm(poaVar.m((byte) 6));
                klyVar.j = cm(poaVar.m((byte) 4));
                klyVar.k = cm(poaVar.m((byte) 3));
                if (klyVar.l != 15 || (rect = klyVar.a) == null || (pointF = klyVar.f) == null || (pointF2 = klyVar.g) == null || (pointF3 = klyVar.h) == null || (pointF4 = klyVar.i) == null || (pointF5 = klyVar.j) == null || (pointF6 = klyVar.k) == null) {
                    throw new IllegalStateException();
                }
                arrayList.add(new klz(rect, klyVar.b, klyVar.c, klyVar.d, klyVar.e, pointF, pointF2, pointF3, pointF4, pointF5, pointF6));
            } catch (IndexOutOfBoundsException unused) {
                ((sgt) a.c().M(3319)).s("The index of extended face is out of range of array");
            }
        }
        return arrayList;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        Face[] faceArr = (Face[]) poeVar.a(CaptureResult.STATISTICS_FACES);
        Rect rect = (Rect) poeVar.a(CaptureResult.SCALER_CROP_REGION);
        Long l = (Long) poeVar.a(CaptureResult.SENSOR_FRAME_DURATION);
        List listCn = cn(poeVar);
        if ((listCn == null && faceArr == null) || rect == null || l == null) {
            return;
        }
        this.b.a(new qrx(faceArr, listCn, rect, l.longValue()));
    }
}
