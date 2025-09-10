package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.apps.camera.ui.captureframe.CaptureFrameUi;
import com.google.googlex.gcam.GrayImageS16;
import com.google.googlex.gcam.ShotMetadata;
import j$.util.DesugarTimeZone;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldn implements Consumer {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ldn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [sgt, shi] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) throws IOException {
        ixq ixqVar;
        switch (this.c) {
            case 0:
                int i = sbp.d;
                ((ibl) obj).d((GrayImageS16) this.a, (ShotMetadata) this.b, sex.a);
                return;
            case 1:
                ixj ixjVar = (ixj) obj;
                int iOrdinal = ((ixp) this.a).ordinal();
                if (iOrdinal == 0) {
                    ixqVar = ixq.INACTIVE;
                } else if (iOrdinal == 1) {
                    ixqVar = ixq.NIGHT_SIGHT;
                } else {
                    if (iOrdinal != 2) {
                        throw new RuntimeException(null, null);
                    }
                    ixqVar = ixq.HDR_PLUS;
                }
                owf owfVar = ixjVar.c;
                if (!ixqVar.equals(((owq) owfVar.dL()).dL())) {
                    ((owq) owfVar.dL()).a(ixqVar);
                }
                ((AtomicBoolean) this.b).set(((ixq) ((owq) owfVar.dL()).dL()).equals(ixq.NIGHT_SIGHT));
                return;
            case 2:
                ((lst) obj).h((ltd) this.a, (par) this.b);
                return;
            case 3:
                int i2 = mah.f;
                if (((mbh) obj).b) {
                    ((AtomicInteger) this.a).getAndIncrement();
                    return;
                } else {
                    ((AtomicInteger) this.b).getAndIncrement();
                    return;
                }
            case 4:
                mnw mnwVar = (mnw) obj;
                if (mnwVar.c.getVisibility() != 0) {
                    return;
                }
                Object obj2 = this.b;
                Object obj3 = this.a;
                RectF rectF = ((CaptureFrameUi) obj2).a;
                float fMin = Math.min(rectF.width(), rectF.height()) * 0.09f;
                int i3 = mnwVar.d - 1;
                if (i3 == 0) {
                    float f = rectF.left;
                    float f2 = rectF.top;
                    float f3 = rectF.left;
                    float f4 = mnwVar.b;
                    float f5 = f4 + f4;
                    RectF rectF2 = new RectF(f, f2, f3 + f5, rectF.top + f5);
                    Paint paint = mnwVar.a;
                    Canvas canvas = (Canvas) obj3;
                    canvas.drawArc(rectF2, 180.0f, 90.0f, false, paint);
                    canvas.drawLine((rectF.left + f4) - 1.0f, rectF.top, rectF.left + fMin, rectF.top, paint);
                    canvas.drawLine(rectF.left, (rectF.top + f4) - 1.0f, rectF.left, rectF.top + fMin, paint);
                    return;
                }
                if (i3 == 1) {
                    float f6 = rectF.right;
                    float f7 = mnwVar.b;
                    float f8 = f7 + f7;
                    RectF rectF3 = new RectF(f6 - f8, rectF.top, rectF.right, rectF.top + f8);
                    Paint paint2 = mnwVar.a;
                    Canvas canvas2 = (Canvas) obj3;
                    canvas2.drawArc(rectF3, 270.0f, 90.0f, false, paint2);
                    canvas2.drawLine(rectF.right - fMin, rectF.top, (rectF.right - f7) + 1.0f, rectF.top, paint2);
                    canvas2.drawLine(rectF.right, (rectF.top + f7) - 1.0f, rectF.right, rectF.top + fMin, paint2);
                    return;
                }
                if (i3 != 2) {
                    float f9 = rectF.right;
                    float f10 = mnwVar.b;
                    float f11 = f10 + f10;
                    RectF rectF4 = new RectF(f9 - f11, rectF.bottom - f11, rectF.right, rectF.bottom);
                    Paint paint3 = mnwVar.a;
                    Canvas canvas3 = (Canvas) obj3;
                    canvas3.drawArc(rectF4, 0.0f, 90.0f, false, paint3);
                    canvas3.drawLine(rectF.right - fMin, rectF.bottom, (rectF.right - f10) + 1.0f, rectF.bottom, paint3);
                    canvas3.drawLine(rectF.right, rectF.bottom - fMin, rectF.right, (rectF.bottom - f10) + 1.0f, paint3);
                    return;
                }
                float f12 = rectF.left;
                float f13 = rectF.bottom;
                float f14 = mnwVar.b;
                float f15 = f14 + f14;
                RectF rectF5 = new RectF(f12, f13 - f15, rectF.left + f15, rectF.bottom);
                Paint paint4 = mnwVar.a;
                Canvas canvas4 = (Canvas) obj3;
                canvas4.drawArc(rectF5, 90.0f, 90.0f, false, paint4);
                canvas4.drawLine((rectF.left + f14) - 1.0f, rectF.bottom, rectF.left + fMin, rectF.bottom, paint4);
                canvas4.drawLine(rectF.left, rectF.bottom - fMin, rectF.left, (rectF.bottom - f14) + 1.0f, paint4);
                return;
            case 5:
                ((ndb) this.a).a.b.j.l((rwc) this.b);
                return;
            case 6:
                ((ndb) this.a).a.b.j.l((rwc) this.b);
                return;
            default:
                tdx tdxVar = (tdx) this.b;
                tpc tpcVar = tdxVar.h;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                String str = tdxVar.c;
                Object obj4 = this.a;
                szz szzVar = (szz) tpcVar.b;
                szz szzVar2 = szz.a;
                str.getClass();
                szzVar.b = 1 | szzVar.b;
                szzVar.c = str;
                szw szwVar = (szw) obj4;
                boolean z = szwVar.c;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                tph tphVar = tpcVar.b;
                szz szzVar3 = (szz) tphVar;
                szzVar3.b |= 32;
                szzVar3.e = z;
                if (!tphVar.C()) {
                    tpcVar.o();
                }
                szz szzVar4 = (szz) tpcVar.b;
                szzVar4.b |= 16;
                szzVar4.d = 20;
                tdxVar.f();
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                szz szzVar5 = (szz) tpcVar.b;
                obj4.getClass();
                szzVar5.f = szwVar;
                szzVar5.b |= 64;
                tcd tcdVar = tdxVar.d;
                if (tcdVar != null) {
                    int iN = ske.n(tcdVar);
                    if (!tpcVar.b.C()) {
                        tpcVar.o();
                    }
                    szz szzVar6 = (szz) tpcVar.b;
                    szzVar6.b |= 128;
                    szzVar6.g = iN;
                }
                szz szzVar7 = (szz) tpcVar.l();
                tei teiVar = tdxVar.b;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                tds tdsVar = (tds) teiVar;
                File file = new File(String.format("%s/gca_session_data_%s.pb", tdsVar.b.get(), simpleDateFormat.format(Long.valueOf(tdsVar.a.toEpochMilli()))));
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        szzVar7.g(fileOutputStream);
                        file.getAbsoluteFile();
                        fileOutputStream.close();
                        return;
                    } finally {
                    }
                } catch (IOException e) {
                    ((sgt) ((sgt) teg.a.c().i(e)).M((char) 5850)).s("Failed to write session data to disk.");
                    return;
                }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.c) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ ldn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
