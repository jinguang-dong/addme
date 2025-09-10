package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.processing.ProcessingService;
import com.google.android.apps.camera.ui.views.FrontLensIndicatorOverlay;
import com.google.ar.core.R;
import j$.lang.Iterable$EL;
import j$.nio.channels.DesugarChannels;
import j$.time.Duration;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kee implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kee(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, pbn] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, poj] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, nan] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r10v56, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r10v77, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.Object, llq] */
    /* JADX WARN: Type inference failed for: r10v97, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, pbn] */
    @Override // java.lang.Runnable
    public final void run() {
        long jWrite;
        FileOutputStream fileOutputStreamE;
        boolean z;
        pfz pfzVarU;
        llo lloVar;
        pjr pjrVar = null;
        boolean z2 = true;
        switch (this.c) {
            case 0:
                Duration duration = (Duration) this.b;
                long seconds = duration.toSeconds();
                String str = String.format(Locale.US, "%01d:%02d", Long.valueOf(seconds / 60), Long.valueOf(seconds % 60));
                kef kefVar = (kef) this.a;
                kefVar.b.setText(str);
                if (duration.toSeconds() != 0 && duration.toSeconds() % 30 == 0) {
                    kefVar.c.d(R.raw.astro_processing);
                }
                if (duration.toSeconds() == 0 || duration.toSeconds() % 60 != 0) {
                    return;
                }
                kefVar.d.h(AmbientMode.AmbientCallback.q(kefVar.a, R.string.astro_minutes_remaining_desc, "count", Long.valueOf(duration.toMinutes())));
                return;
            case 1:
                ((kda) this.a).c.i(this.b);
                return;
            case 2:
                ((kgt) this.a).e((String) this.b);
                return;
            case 3:
                Object obj = this.a;
                Object obj2 = this.b;
                try {
                    fileOutputStreamE = ((kjp) obj).b.e();
                } catch (IOException unused) {
                    jWrite = -1;
                } catch (Throwable th) {
                    kjp kjpVar = (kjp) obj;
                    kjpVar.b.f();
                    kjpVar.a.h();
                    throw th;
                }
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStreamE.getChannel());
                    try {
                        jWrite = fileChannelConvertMaybeLegacyFileChannelFromLibrary.write((ByteBuffer) obj2);
                        fileOutputStreamE.flush();
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                            fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                        }
                        fileOutputStreamE.close();
                        if (jWrite > 0) {
                            ((kjp) obj).b.g();
                        } else {
                            ((kjp) obj).b.f();
                        }
                        ((kjp) obj).a.h();
                        return;
                    } finally {
                    }
                } finally {
                }
            case 4:
                klu kluVar = (klu) this.a;
                Set setC = kluVar.c.C();
                if (setC == null || setC.isEmpty()) {
                    ((sgt) klu.a.c().M(3314)).s("physical cameraID list is empty");
                    return;
                }
                Iterator it = setC.iterator();
                while (true) {
                    Object obj3 = this.b;
                    if (!it.hasNext()) {
                        if (pjrVar == null) {
                            ((sgt) klu.a.c().M(3315)).v("active id(%s) is not in list", obj3);
                            return;
                        } else {
                            kluVar.j(kluVar.b.a(pjrVar).g());
                            return;
                        }
                    }
                    pjr pjrVar2 = (pjr) it.next();
                    if (true == ((String) obj3).equals(pjrVar2.a)) {
                        pjrVar = pjrVar2;
                    }
                }
                break;
            case 5:
                Object obj4 = ((kmu) this.a).a;
                Object obj5 = this.b;
                synchronized (obj4) {
                    Object obj6 = ((owd) obj4).b;
                    boolean zRemove = ((HashSet) obj6).remove(obj5);
                    z = zRemove && ((HashSet) obj6).isEmpty();
                    if (!zRemove || !((owd) obj4).f()) {
                        z2 = false;
                    }
                }
                if (z) {
                    owd owdVar = (owd) obj4;
                    ?? r1 = owdVar.d;
                    r1.f("#notifyPipelinePaused");
                    Iterator it2 = owdVar.c().iterator();
                    while (it2.hasNext()) {
                        ((lsz) it2.next()).b();
                    }
                    r1.g();
                }
                if (z2) {
                    ((owd) obj4).e();
                    return;
                }
                return;
            case 6:
                ((krj) this.a).v(this.b != null ? 5 : 6);
                return;
            case 7:
                this.b.a(this.a);
                return;
            case 8:
                kva kvaVar = (kva) this.b;
                kvaVar.c.b(false);
                scl sclVar = new scl();
                sclVar.j(kvaVar.f(3));
                PointF pointF = (PointF) ((ejt) this.a).a;
                sclVar.j(kvaVar.e(3, pointF));
                kvaVar.f.n(sclVar.g());
                scl sclVar2 = new scl();
                sclVar2.j(kvaVar.f(1));
                sclVar2.j(kvaVar.e(1, pointF));
                kvaVar.c(sclVar2.g());
                return;
            case 9:
                this.b.dK(new kso(this.a, i), sxo.a);
                return;
            case 10:
                ((kuj) ((ggg) this.b).a).p((ojl) this.a);
                return;
            case 11:
                Object obj7 = this.a;
                kwr kwrVar = (kwr) obj7;
                kwrVar.b.f("Camera3ADebugFetch#request");
                ?? r10 = this.b;
                try {
                    try {
                        pfzVarU = ((kwr) obj7).c.u();
                    } catch (InterruptedException | pco e) {
                        ((sgt) ((sgt) kwr.a.b().i(e)).M(3553)).s("Error submitting 3A debug metadata request.");
                    }
                    try {
                        kwr.c(pfzVarU, r10);
                        pfzVarU.close();
                        return;
                    } catch (Throwable th2) {
                        try {
                            pfzVarU.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } finally {
                    kwrVar.b.g();
                }
            case 12:
                ?? r0 = this.b;
                r0.f("ringBuffer#getFilteredFrames");
                Object obj8 = this.a;
                try {
                    try {
                        ((kyd) obj8).c.size();
                        sbp sbpVarH = ((kyd) obj8).b.h(((kyd) obj8).c);
                        int i = ((sex) sbpVarH).c;
                        szh szhVar = ((kyd) obj8).a;
                        synchronized (szhVar) {
                            if (szhVar.isCancelled()) {
                                ((sgt) kye.a.c().M(3659)).s("Cancelled shot, closing filtered frames.");
                                sgk it3 = sbpVarH.iterator();
                                while (it3.hasNext()) {
                                    ((pdk) it3.next()).close();
                                }
                            } else {
                                szhVar.e(sbpVarH);
                            }
                        }
                    } catch (InterruptedException e2) {
                        ((sgt) ((sgt) kye.a.b().i(e2)).M(3660)).s("Error filtering ZSL frames.");
                        szh szhVar2 = ((kyd) obj8).a;
                        synchronized (szhVar2) {
                            szhVar2.e(new ArrayList());
                        }
                    }
                    return;
                } finally {
                    r0.g();
                }
            case 13:
                Object obj9 = this.b;
                Object obj10 = this.a;
                synchronized (obj10) {
                    Iterable$EL.forEach(scn.F(((kzi) obj10).a), new ird(obj9, 20));
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((iby) this.a).x.b.aa(((ldl) this.b).f);
                return;
            case 15:
                Object obj11 = this.a;
                ?? r102 = this.b;
                while (true) {
                    try {
                        llm llmVar = ((ProcessingService) r102).k;
                        synchronized (llmVar.a) {
                            LinkedList linkedList = llmVar.b;
                            if (linkedList.isEmpty() || llmVar.d) {
                                boolean z3 = llmVar.d;
                                llmVar.f = 2;
                                lloVar = null;
                            } else {
                                lloVar = (llo) linkedList.remove();
                                linkedList.size();
                            }
                        }
                    } finally {
                    }
                    try {
                        if (lloVar == null) {
                            synchronized (((ProcessingService) r102).b) {
                                ((ProcessingService) r102).d = null;
                            }
                            synchronized (((ProcessingService) r102).f) {
                                ((ProcessingService) r102).g = false;
                                ((ProcessingService) r102).h = false;
                                ((ProcessingService) r102).i = true;
                            }
                            return;
                        }
                        synchronized (((ProcessingService) r102).b) {
                            ((ProcessingService) r102).d = lloVar;
                            if (((ProcessingService) r102).e) {
                                ((ProcessingService) r102).d.g();
                            }
                        }
                        ((jiu) obj11).d(lloVar.b());
                        synchronized (((ProcessingService) r102).f) {
                            ((ProcessingService) r102).a.setContentText("…").setProgress(100, 0, false);
                        }
                        ((ProcessingService) r102).c();
                        lln llnVarA = lloVar.a();
                        if (llnVarA != 0) {
                            llnVarA.d(r102);
                        }
                        ((ProcessingService) r102).c.a(lloVar.b());
                        lloVar.b();
                        lloVar.d((Context) r102);
                        lloVar.b();
                        if (llnVarA != 0) {
                            llnVarA.d(null);
                        }
                        ((jiu) obj11).b();
                        return;
                    } finally {
                    }
                }
                break;
            case 16:
                lmd lmdVar = ((lly) this.a).k;
                List list = lmdVar.a;
                Object obj12 = this.b;
                synchronized (list) {
                    if (list.contains(obj12)) {
                        list.remove(obj12);
                        lmdVar.b.remove(obj12);
                        list.size();
                    } else {
                        list.size();
                    }
                }
                return;
            case 17:
                this.b.close();
                ((lly) this.a).j++;
                return;
            case 18:
                FrontLensIndicatorOverlay frontLensIndicatorOverlay = ((lqg) this.a).h;
                boolean zEquals = ((nkw) this.b).equals(nkw.NIGHT_SIGHT);
                gyr gyrVar = frontLensIndicatorOverlay.c;
                if (gyrVar == null) {
                    ((sgt) FrontLensIndicatorOverlay.a.b().M(5381)).s("Not showing due to cutout info is null.");
                    return;
                }
                float f = gyrVar.b;
                if (f == Float.MAX_VALUE) {
                    frontLensIndicatorOverlay.l = frontLensIndicatorOverlay.k - frontLensIndicatorOverlay.i;
                } else {
                    if (!zEquals) {
                        f = gyrVar.a;
                    }
                    frontLensIndicatorOverlay.l = f;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, frontLensIndicatorOverlay.i);
                valueAnimatorOfFloat.setDuration(167L);
                valueAnimatorOfFloat.setInterpolator(frontLensIndicatorOverlay.g);
                valueAnimatorOfFloat.addListener(new nhn(frontLensIndicatorOverlay));
                valueAnimatorOfFloat.addUpdateListener(new nhi(frontLensIndicatorOverlay, 7));
                valueAnimatorOfFloat.start();
                frontLensIndicatorOverlay.invalidate();
                return;
            case 19:
                lat latVar = (lat) this.b;
                Object obj13 = latVar.b;
                obj13.getClass();
                ((SensorManager) latVar.a).unregisterListener((SensorEventListener) this.a, (Sensor) obj13);
                return;
            default:
                ((lsp) this.a).d(new lji(this.b, 14));
                return;
        }
    }

    public /* synthetic */ kee(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public kee(lly llyVar, Object obj, int i) {
        this.c = i;
        this.b = obj;
        this.a = llyVar;
    }
}
