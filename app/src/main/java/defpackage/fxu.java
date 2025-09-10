package defpackage;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import androidx.wear.ambient.AmbientLifecycleObserverKt;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import com.google.googlex.gcam.ArkInfo;
import com.google.googlex.gcam.GcamModuleJNI;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fxu implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ fxu(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, pnx] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oyn] */
    /* JADX WARN: Type inference failed for: r0v42, types: [irj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v47, types: [edw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Object, owf] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) throws edv, NumberFormatException {
        int iMax;
        byte[] bArr = null;
        int i = 0;
        switch (this.c) {
            case 0:
                gcv gcvVar = (gcv) obj;
                sgv sgvVar = fxy.a;
                gcvVar.getClass().getSimpleName();
                gcvVar.a = this.a;
                this.b.add(gcvVar);
                return;
            case 1:
                cxb cxbVar = ((fig) this.a).a;
                fjk fjkVar = (fjk) this.b;
                Bitmap bitmapD = cxbVar.D(fjkVar.a);
                ?? r1 = fjkVar.k.b;
                int iIntValue = ((Float) obj).intValue();
                int width = bitmapD.getWidth();
                int height = bitmapD.getHeight();
                if (width > iIntValue || height > iIntValue) {
                    if (width > height) {
                        iMax = Math.max(1, (height * iIntValue) / width);
                    } else {
                        iMax = iIntValue;
                        iIntValue = Math.max(1, (width * iIntValue) / height);
                    }
                    bitmapD = Bitmap.createScaledBitmap(bitmapD, iIntValue, iMax, false);
                }
                tcd tcdVarE = fjkVar.b.e();
                if (tcdVarE.equals(tcd.g)) {
                    i = 90;
                } else if (tcdVarE.equals(tcd.i)) {
                    i = -90;
                } else if (tcdVarE.equals(tcd.d)) {
                    i = 180;
                }
                r1.ae(bitmapD, i);
                return;
            case 2:
                float fIntValue = ((Integer) obj).intValue();
                hie hieVar = (hie) this.a;
                owq owqVar = hieVar.h;
                hieVar.k.f((fIntValue - ((laj) owqVar.dL()).b) / (((laj) owqVar.dL()).c - ((laj) owqVar.dL()).b));
                ((AtomicBoolean) this.b).set(true);
                return;
            case 3:
                ((hie) this.a).k.f(((Float) obj).floatValue());
                ((AtomicBoolean) this.b).set(true);
                return;
            case 4:
                ((hie) this.a).k.h(((Float) obj).floatValue());
                ((AtomicBoolean) this.b).set(true);
                return;
            case 5:
                ArkInfo arkInfo = (ArkInfo) this.b;
                arkInfo.g(tbv.c);
                GcamModuleJNI.ArkInfo_exposure_time_ms_set(arkInfo.a, arkInfo, ((Long) ((jjq) this.a).g.get()).longValue() / 1000000.0f);
                return;
            case 6:
                ((icw) this.a).c = (byte[]) this.b.a((CaptureResult.Key) obj);
                return;
            case 7:
                ((icw) this.a).d = (byte[]) this.b.a((CaptureResult.Key) obj);
                return;
            case 8:
                ((icw) this.a).e = (byte[]) this.b.a((CaptureResult.Key) obj);
                return;
            case 9:
                ((icw) this.a).f = (byte[]) this.b.a((CaptureResult.Key) obj);
                return;
            case 10:
                ((isb) obj).d((mxj) this.a, (mxm) this.b);
                return;
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                isj isjVar = (isj) entry.getKey();
                iqy iqyVar = (iqy) entry.getValue();
                ira iraVar = (ira) this.b;
                iraVar.f(isjVar, iqyVar);
                iraVar.c((iqz) this.a, (isj) entry.getKey(), (iqy) entry.getValue());
                return;
            case 12:
                Map.Entry entry2 = (Map.Entry) obj;
                isj isjVar2 = (isj) entry2.getKey();
                iqy iqyVar2 = (iqy) entry2.getValue();
                ira iraVar2 = (ira) this.b;
                iraVar2.f(isjVar2, iqyVar2);
                iraVar2.c((iqz) this.a, (isj) entry2.getKey(), (iqy) entry2.getValue());
                return;
            case 13:
                efs efsVar = (efs) ((irk) this.b).g.get((iri) obj);
                if (efsVar == null || efsVar.a == null) {
                    return;
                }
                efsVar.draw((Canvas) this.a);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((irj) obj).a((Animator) this.a, (iqq) this.b);
                return;
            case 15:
                ((ggg) this.b).f((iri) obj, this.a);
                return;
            case 16:
                UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) obj;
                int i2 = uranusCharacterItem.j;
                if (i2 == 0) {
                    throw null;
                }
                if (i2 == 1) {
                    Object obj2 = this.b;
                    irs irsVar = (irs) this.a;
                    irsVar.A = uranusCharacterItem;
                    irsVar.k((isg) obj2);
                    return;
                }
                return;
            case 17:
                peo peoVar = (peo) this.b.get((lcz) obj);
                peoVar.getClass();
                ((scl) this.a).d(peoVar);
                return;
            case 18:
                hqp hqpVar = (hqp) obj;
                ?? r0 = this.a;
                if (hqpVar == hqp.COTTAGE || hqpVar == hqp.PANORAMA) {
                    String strE = hqpVar.e();
                    int i3 = pqw.a;
                    try {
                        if (pqw.f(r0) == null) {
                            pqw.p(r0, strE);
                        } else {
                            eex eexVar = new eex();
                            AmbientLifecycleObserverKt.B("http://ns.google.com/photos/1.0/camera/");
                            AmbientLifecycleObserverKt.y("SpecialTypeID");
                            een eenVarP = AmbientLifecycleObserverKt.p(((eek) r0).a, AmbientMode.AmbientCallback.v("http://ns.google.com/photos/1.0/camera/", "SpecialTypeID"), false, null);
                            if (eenVarP == null) {
                                throw new edv("Specified array does not exist", 102);
                            }
                            eek.o(eenVarP, 1, strE, eexVar, false);
                        }
                    } catch (edv e) {
                        Log.e("XmpUtil", "Failed to append or overwrite special type id ".concat(String.valueOf(e.getMessage())));
                    }
                    ((AtomicBoolean) this.b).set(true);
                    return;
                }
                return;
            case 19:
                krz krzVar = (krz) obj;
                if (this.a.add(krzVar.h())) {
                    return;
                }
                this.b.add(krzVar.h());
                return;
            default:
                krj krjVar = (krj) obj;
                our ourVar = krjVar.L;
                Object obj3 = this.b;
                sgv sgvVar2 = ktb.a;
                ourVar.d(this.a.dK(new fun(obj3, krjVar, 17, bArr), sxo.a));
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ fxu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
