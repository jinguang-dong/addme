package defpackage;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.HardwareBuffer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Range;
import android.view.Surface;
import com.bumptech.glide.qd.MyBPCgKwEjJI;
import com.google.android.apps.camera.cameravisionkit.NewQrGleamingView;
import com.google.android.apps.camera.jni.microvideotonemap.MicrovideoToneMapNative;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawReadView;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.YuvWriteView;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gdq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ gdq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gdq(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, peo] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, pdk] */
    /* JADX WARN: Type inference failed for: r2v21, types: [imj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kbp] */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.Object, kbp] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, poe] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, poj] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        Object obj;
        int i = 3;
        int i2 = 8;
        char[] cArr = null;
        switch (this.d) {
            case 0:
                gds gdsVar = (gds) this.a;
                if (gdsVar.e() || ((gaw) this.b).c != oxh.FPS_60 || gdsVar.o.p(gym.as)) {
                    return;
                }
                ((gau) this.c).o.a(new Range(60, 60));
                gdsVar.h.a(nav.POOR_VIDEO_QUALITY);
                return;
            case 1:
                gds gdsVar2 = (gds) this.a;
                if ((!gdsVar2.o.p(gym.as) || gdsVar2.e()) && ((gaw) this.b).c == oxh.FPS_60) {
                    ((gau) this.c).o.a(new Range(30, 30));
                    gdsVar2.h.d(nav.POOR_VIDEO_QUALITY);
                    return;
                }
                return;
            case 2:
                ((gkq) this.c).b(this.b, this.a);
                return;
            case 3:
                Object obj2 = this.b;
                NewQrGleamingView newQrGleamingView = ((gqq) obj2).b;
                newQrGleamingView.getClass();
                oge ogeVar = new oge(obj2, this.a, (short[]) (0 == true ? 1 : 0));
                out.a();
                newQrGleamingView.setVisibility(0);
                newQrGleamingView.a((RectF) this.c);
                newQrGleamingView.b();
                gqv gqvVar = newQrGleamingView.c;
                gqvVar.getClass();
                gqy gqyVar = new gqy(newQrGleamingView, ogeVar);
                Point point = new Point(newQrGleamingView.e, newQrGleamingView.f);
                gqvVar.h = Integer.valueOf(point.x);
                gqvVar.i = Integer.valueOf(point.y);
                ValueAnimator valueAnimator = new ValueAnimator();
                valueAnimator.setDuration(100L);
                valueAnimator.setValues(PropertyValuesHolder.ofInt("alpha", 0, 255), PropertyValuesHolder.ofInt("fadeInGap", gqvVar.e, 0));
                valueAnimator.addUpdateListener(new rht(gqvVar, newQrGleamingView.a, gqyVar, point, newQrGleamingView.b, 1));
                valueAnimator.addListener(new gqu(gqyVar));
                valueAnimator.start();
                newQrGleamingView.d = valueAnimator;
                return;
            case 4:
                Object obj3 = this.a;
                paq paqVarDK = this.b.dK(new hdg(obj3, i2), sxo.a);
                our ourVar = (our) this.c;
                ourVar.d(paqVarDK);
                ourVar.d(new gge(obj3, 16));
                return;
            case 5:
                ((RawReadView) this.b).a();
                ((FrameMetadata) this.c).v();
                ((SpatialGainMap) this.a).a();
                return;
            case 6:
                ija ijaVar = (ija) ((iiz) this.b).b;
                pfu pfuVar = ijaVar.n;
                if (pfuVar == null || (obj = this.c) == null) {
                    return;
                }
                Object obj4 = this.a;
                ijaVar.h = new Surface((SurfaceTexture) obj);
                peo peoVarA = pfuVar.a.a((peq) obj4);
                ijaVar.i = peoVarA;
                peoVarA.e(ijaVar.h);
                ijaVar.j = pfuVar.c(pfuVar.d(peoVarA), 1);
                ijaVar.j.l(ijaVar.k);
                return;
            case 7:
                ?? r1 = this.a;
                ?? r2 = this.b;
                Object obj5 = this.c;
                synchronized (imi.a) {
                    if (((imi) obj5).d.contains(r2)) {
                        r2.h(r1);
                    } else {
                        r1.run();
                    }
                }
                return;
            case 8:
                ?? r12 = this.a;
                Stream streamFilter = Collection.EL.stream(r12.entrySet()).filter(new hzk(i));
                Object obj6 = this.c;
                Object obj7 = this.b;
                streamFilter.forEach(new fxu(obj7, obj6, 11, 0 == true ? 1 : 0));
                Collection.EL.stream(r12.entrySet()).filter(new hzk(5)).forEach(new fxu(obj7, obj6, 12, 0 == true ? 1 : 0));
                return;
            case 9:
                qpt.C(((ite) this.b).c);
                ((EGLImage) this.a).close();
                ((HardwareBuffer) this.c).close();
                return;
            case 10:
                ?? r13 = this.b;
                boolean zBooleanValue = ((Boolean) r13.dL()).booleanValue();
                ?? r3 = this.a;
                if (zBooleanValue) {
                    ((ivu) r3.a()).a();
                    return;
                } else {
                    ((our) this.c).d(r13.dK(new glc(new AtomicBoolean(false), r3, 15), sxo.a));
                    return;
                }
            case 11:
                Object obj8 = ((ivo) this.c).b;
                Object obj9 = this.b;
                Object obj10 = this.a;
                synchronized (obj8) {
                    ((ovx) obj10).a(false);
                    ((ivt) obj9).b();
                }
                return;
            case 12:
                ivo ivoVar = (ivo) this.c;
                pbn pbnVar = ivoVar.i;
                pbnVar.f("MotionBlurVf#wrapYuv");
                tgp tgpVar = ivoVar.m;
                ?? r5 = this.b;
                YuvWriteView yuvWriteViewC = tgpVar.c(r5);
                pbnVar.g();
                imf imfVar = new imf((Object) r5, pbnVar.a("MotionBlurVf#addVfFrameToRelease"), i2, cArr);
                ivt ivtVar = ivoVar.c;
                Object obj11 = this.a;
                synchronized (ivtVar.b) {
                    long j = ivtVar.d;
                    if (j != 0) {
                        ivtVar.c.addViewfinderFrame(j, YuvWriteView.c(yuvWriteViewC), FrameMetadata.c((FrameMetadata) obj11), imfVar);
                        return;
                    } else {
                        imfVar.run();
                        return;
                    }
                }
            case 13:
                if (((ivw) ((lso) this.c).c).f) {
                    this.a.run();
                    return;
                } else {
                    this.b.run();
                    return;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                Activity activity = (Activity) ((jcd) this.b).b.get();
                activity.getClass();
                Object obj12 = this.a;
                Object obj13 = this.c;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(rbu.b(activity, (Uri) obj13, "w").getParcelFileDescriptor());
                        try {
                            System.identityHashCode(obj12);
                            autoCloseOutputStream.write((byte[]) obj12);
                            autoCloseOutputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (FileNotFoundException e2) {
                    throw new IllegalArgumentException(rnt.z("Could not open output uri %s for writing. Called from %s ", obj13, activity.getReferrer()), e2);
                }
            case 15:
                Object obj14 = this.a;
                jcv jcvVar = (jcv) this.c;
                List list = jcvVar.M;
                synchronized (list) {
                    list.remove(obj14);
                }
                jcvVar.N = null;
                rwc rwcVar = jcvVar.y;
                if (rwcVar.h() && ((Boolean) jcvVar.v.b.dL()).booleanValue()) {
                    ((fty) rwcVar.c()).c();
                } else if (jcvVar.V.a((kow) ((jth) this.b).i().f)) {
                    jcvVar.W.c();
                }
                jth jthVar = jcvVar.U;
                if (jthVar != null) {
                    jcvVar.c(((Boolean) jthVar.b().dL()).booleanValue());
                }
                jcvVar.Y.j();
                jcvVar.n.c();
                if (rwcVar.h()) {
                    ((fty) rwcVar.c()).k();
                }
                jcvVar.s.m(true);
                iyu iyuVar = jcvVar.Q;
                iyuVar.K.f();
                rwc rwcVar2 = jcvVar.w;
                if (rwcVar2.h()) {
                    mgq mgqVar = (mgq) rwcVar2.c();
                    nkw nkwVar = iyuVar.p;
                    jcvVar.x.k();
                    mgqVar.a();
                }
                rwc rwcVar3 = jcvVar.C;
                if (rwcVar3.h() && ((hko) rwcVar3.c()).i()) {
                    ((hko) rwcVar3.c()).e();
                    return;
                }
                return;
            case 16:
                jnl jnlVar = (jnl) this.b;
                if (jnlVar.l.getAndSet(true)) {
                    return;
                }
                Object obj15 = this.c;
                Object obj16 = this.a;
                gzi gziVar = gzz.a;
                ((sgt) jnm.a.b().M(2891)).v("Microvideo with uri %s timed out; saving fallback.", jnlVar.a);
                ((jnm) obj16).s.a();
                jnlVar.o.c();
                jnk jnkVar = (jnk) obj15;
                jnm.k(jnlVar, jnkVar);
                ((mdo) jnkVar.c).p = jnm.j(jnlVar);
                return;
            case 17:
                poj pojVar = (poj) ske.V(this.b);
                Bitmap bitmap = (Bitmap) ske.V(this.a);
                if (bitmap == null || pojVar == null) {
                    ((sgt) jru.a.c().M(3036)).s("Skip tone mapping extraction, either shutter frame or postview bitmap is null.");
                    return;
                }
                tpc tpcVarM = ttd.a.m();
                System.currentTimeMillis();
                int iC = pojVar.c();
                int iB = pojVar.b();
                poi poiVar = (poi) pojVar.g().get(0);
                poi poiVar2 = (poi) pojVar.g().get(1);
                poi poiVar3 = (poi) pojVar.g().get(2);
                ByteBuffer byteBufferN = ezh.N(iC, iB, poiVar);
                int i3 = iC / 2;
                int i4 = iB / 2;
                ByteBuffer byteBufferN2 = ezh.N(i3, i4, poiVar2);
                ByteBuffer byteBufferN3 = ezh.N(i3, i4, poiVar3);
                System.currentTimeMillis();
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i5 = width * height;
                int i6 = i5 / 4;
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i5);
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i6);
                ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(i6);
                if (MicrovideoToneMapNative.argbToYuv(bitmap, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3) != 0) {
                    throw new IllegalStateException(MyBPCgKwEjJI.vBeIIvIiXVW);
                }
                System.currentTimeMillis();
                byte[] bArrExtractMeanVarianceMappingNative = MicrovideoToneMapNative.extractMeanVarianceMappingNative(iC, iB, byteBufferN, byteBufferN2, byteBufferN3, width, height, byteBufferAllocateDirect, byteBufferAllocateDirect2, byteBufferAllocateDirect3, 3, 4);
                tpc tpcVarM2 = tsy.a.m();
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tph tphVar = tpcVarM2.b;
                tsy tsyVar = (tsy) tphVar;
                tsyVar.b |= 1;
                tsyVar.c = 3;
                if (!tphVar.C()) {
                    tpcVarM2.o();
                }
                tsy tsyVar2 = (tsy) tpcVarM2.b;
                tsyVar2.b = 2 | tsyVar2.b;
                tsyVar2.d = 4;
                toj tojVarQ = toj.q(bArrExtractMeanVarianceMappingNative);
                if (!tpcVarM2.b.C()) {
                    tpcVarM2.o();
                }
                tsy tsyVar3 = (tsy) tpcVarM2.b;
                tsyVar3.b = 4 | tsyVar3.b;
                tsyVar3.e = tojVarQ;
                tsy tsyVar4 = (tsy) tpcVarM2.l();
                System.currentTimeMillis();
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                Object obj17 = this.c;
                ttd ttdVar = (ttd) tpcVarM.b;
                tsyVar4.getClass();
                ttdVar.c = tsyVar4;
                ttdVar.b |= 1;
                ((jru) obj17).b.e((ttd) tpcVarM.l());
                pojVar.close();
                bitmap.recycle();
                return;
            case 18:
                ((kai) this.c).t(this.b, (gga) this.a);
                return;
            case 19:
                ((kai) this.c).r(this.b, (gga) this.a);
                return;
            default:
                kpx kpxVar = (kpx) this.c;
                hzs hzsVar = kpxVar.a;
                ?? r32 = this.a;
                hzsVar.p((pjr) this.b, r32);
                kpxVar.b.a(kpxVar.d.g(null, r32));
                kpxVar.c.a(r32);
                return;
        }
    }

    public /* synthetic */ gdq(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ gdq(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ gdq(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }
}
