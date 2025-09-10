package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.apps.camera.focusindicator.FocusIndicatorAccessoryView;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import com.google.android.apps.camera.gesturecapture.ui.CatcherView;
import com.google.ar.core.R;
import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hdk implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public hdk(hfw hfwVar, Duration duration, int i) {
        this.c = i;
        this.a = duration;
        this.b = hfwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r11v91, types: [java.lang.Object, pau] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, pdk] */
    @Override // java.lang.Runnable
    public final void run() throws Resources.NotFoundException {
        szh szhVar;
        int i = 3;
        int i2 = 4;
        ImageView imageView = null;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (((hdm) obj2).a.remove(obj)) {
                        ((hdm) obj2).b.add(((pmh) obj).b());
                    }
                }
                return;
            case 1:
                tpc tpcVarM = sod.a.m();
                soc socVar = soc.FRAMING_HINT_SHOWN;
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                tph tphVar = tpcVarM.b;
                sod sodVar = (sod) tphVar;
                sodVar.f = socVar.aJ;
                sodVar.b |= 1;
                if (!tphVar.C()) {
                    tpcVarM.o();
                }
                Object obj3 = this.b;
                Object obj4 = this.a;
                sod sodVar2 = (sod) tpcVarM.b;
                obj4.getClass();
                sodVar2.ac = (sqo) obj4;
                sodVar2.d |= 4;
                ((gux) obj3).a.I(tpcVarM);
                return;
            case 2:
                Object obj5 = this.b;
                Object obj6 = this.a;
                synchronized (obj6) {
                    if (((hdm) obj6).a.remove(obj5)) {
                        ((hdm) obj6).b.add(((pmh) obj5).b());
                    }
                }
                return;
            case 3:
                ((heb) this.b).d.d("showing \"Possible shot loss\" warning");
                ltf ltfVar = (ltf) this.a;
                if (ltfVar.E) {
                    return;
                }
                ltfVar.equals(ltf.SERENGETI);
                return;
            case 4:
                Toast.makeText((Context) this.b, (CharSequence) this.a, 1).show();
                return;
            case 5:
                Object obj7 = this.b;
                hfw hfwVar = (hfw) obj7;
                Object obj8 = hfwVar.b;
                hfv hfvVarB = hfwVar.b((Duration) this.a);
                synchronized (obj8) {
                    szhVar = ((hfw) obj7).c;
                    ((hfw) obj7).c = null;
                }
                szhVar.getClass();
                szhVar.e(hfvVarB);
                return;
            case 6:
                ((hgi) this.b).a.k((jpp) this.a);
                return;
            case 7:
                ((hgi) this.b).a.j((jpp) this.a);
                return;
            case 8:
                hla hlaVar = (hla) this.b;
                Iterator it = hlaVar.b.iterator();
                while (true) {
                    ?? r2 = this.a;
                    if (!it.hasNext()) {
                        r2.close();
                        return;
                    } else {
                        hlw hlwVar = (hlw) it.next();
                        if (hlwVar.e()) {
                            hlwVar.a(r2, (peo) hlaVar.c.c());
                        }
                    }
                }
            case 9:
                boolean zBooleanValue = ((Boolean) ((ovx) ((FocusIndicatorView) this.b).j).d).booleanValue();
                Object obj9 = this.a;
                if (zBooleanValue) {
                    rwc rwcVar = (rwc) obj9;
                    ((ht) rwcVar.c()).setImageDrawable(((FocusIndicatorAccessoryView) rwcVar.c()).getResources().getDrawable(R.drawable.ic_focus_lock, null));
                }
                rwc rwcVar2 = (rwc) obj9;
                ((FocusIndicatorAccessoryView) rwcVar2.c()).e();
                ((FocusIndicatorAccessoryView) rwcVar2.c()).b();
                return;
            case 10:
                ((loa) this.a.getKey()).b(((hpr) this.b).a);
                return;
            case 11:
                hro hroVar = (hro) ((rwc) this.a).c();
                hroVar.j = (hsh) this.b;
                hsh hshVar = hroVar.j;
                hshVar.c = (CatcherView) ((ViewStub) ((ocq) ((mwq) hshVar.b.a()).b).c(R.id.catcher_ui_layout_stub)).inflate();
                CatcherView catcherView = hshVar.c;
                catcherView.s = hshVar.d;
                catcherView.s.c = catcherView;
                hroVar.j.b();
                hbj hbjVar = hroVar.p;
                int iIntValue = ((Integer) hbjVar.a(gyo.b).get()).intValue();
                int iIntValue2 = ((Integer) hbjVar.a(gyo.c).get()).intValue();
                CatcherView catcherView2 = hroVar.j.c;
                catcherView2.o = iIntValue;
                catcherView2.p = iIntValue2;
                fdq fdqVar = hroVar.m;
                rwc rwcVar3 = hroVar.a;
                our ourVarJ = fdqVar.j();
                hrm hrmVar = (hrm) rwcVar3.c();
                Set set = hrmVar.b;
                synchronized (set) {
                    set.add(hroVar);
                    set.size();
                }
                ourVarJ.d(new fid(hrmVar, hroVar, 15, 0 == true ? 1 : 0));
                our ourVarJ2 = fdqVar.j();
                gnt gntVar = hroVar.b;
                hdg hdgVar = new hdg(hroVar, i);
                out outVar = hroVar.d;
                ourVarJ2.d(gntVar.dK(hdgVar, outVar));
                fdqVar.j().d(hroVar.e.dK(new hdg(hroVar, i2), outVar));
                if (!hbjVar.p(gza.t) || hroVar.i.getDefaultSensor(36) == null) {
                    return;
                }
                fdqVar.j().d(hroVar.f.dK(new hdg(hroVar, 5), sxo.a));
                return;
            case 12:
                hrm hrmVar2 = (hrm) this.a.getKey();
                Object obj10 = this.b;
                synchronized (hrmVar2) {
                    int i3 = ((hrr) obj10).h;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == 6 || i3 == 3 || i3 == 1) {
                        for (final hro hroVar2 : hrmVar2.b) {
                            final pas pasVar = hrmVar2.a;
                            final hrr hrrVar = (hrr) obj10;
                            hroVar2.d.execute(new Runnable() { // from class: hrn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hro hroVar3 = hroVar2;
                                    if (!hroVar3.k.h() || Instant.now().toEpochMilli() > ((Long) hroVar3.k.c()).longValue()) {
                                        hroVar3.k = rvk.a;
                                        boolean zJ = hroVar3.b.j();
                                        int iC = hroVar3.j.c();
                                        if (iC == 0) {
                                            throw null;
                                        }
                                        hrr hrrVar2 = hrrVar;
                                        if (iC == 6) {
                                            int i4 = hrrVar2.h;
                                            if (i4 == 0) {
                                                throw null;
                                            }
                                            if (i4 == 1) {
                                                hroVar3.j.a();
                                                return;
                                            }
                                        }
                                        int iC2 = hroVar3.j.c();
                                        if (iC2 == 0) {
                                            throw null;
                                        }
                                        if (iC2 == 3) {
                                            if (!hroVar3.d()) {
                                                hroVar3.j.b();
                                                return;
                                            }
                                            for (hrp hrpVar : hroVar3.c) {
                                                ((hrm) hroVar3.a.c()).d();
                                                hroVar3.n.v(10);
                                                hrpVar.b((hgc.k(hroVar3.p, hroVar3.o) == 2 && ((ltw) hroVar3.h.dL()).equals(ltw.OFF)) ? 3 : ((ltw) hroVar3.h.dL()).h);
                                                hroVar3.j.b();
                                            }
                                            int iK = hgc.k(hroVar3.p, hroVar3.o);
                                            int i5 = 4;
                                            int i6 = iK == 2 ? 3 : iK == 1 ? 2 : iK == 3 ? 4 : 1;
                                            tpc tpcVarM2 = ssn.a.m();
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            ssn ssnVar = (ssn) tpcVarM2.b;
                                            ssnVar.c = 6;
                                            ssnVar.b |= 1;
                                            ssm ssmVarW = ezh.W(hrrVar2.b);
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            ssn ssnVar2 = (ssn) tpcVarM2.b;
                                            ssmVarW.getClass();
                                            ssnVar2.d = ssmVarW;
                                            ssnVar2.b |= 2;
                                            ssm ssmVarW2 = ezh.W(hrrVar2.a);
                                            if (!tpcVarM2.b.C()) {
                                                tpcVarM2.o();
                                            }
                                            tph tphVar2 = tpcVarM2.b;
                                            ssn ssnVar3 = (ssn) tphVar2;
                                            ssmVarW2.getClass();
                                            ssnVar3.e = ssmVarW2;
                                            ssnVar3.b |= 4;
                                            int i7 = hrrVar2.f;
                                            if (!tphVar2.C()) {
                                                tpcVarM2.o();
                                            }
                                            tph tphVar3 = tpcVarM2.b;
                                            ssn ssnVar4 = (ssn) tphVar3;
                                            ssnVar4.b |= 8;
                                            ssnVar4.f = i7;
                                            int i8 = hrrVar2.g;
                                            if (i8 == 0) {
                                                throw null;
                                            }
                                            if (i8 == 2) {
                                                i5 = 2;
                                            } else if (i8 != 4) {
                                                i5 = i8 == 3 ? 3 : 1;
                                            }
                                            if (!tphVar3.C()) {
                                                tpcVarM2.o();
                                            }
                                            tph tphVar4 = tpcVarM2.b;
                                            ssn ssnVar5 = (ssn) tphVar4;
                                            ssnVar5.g = i5 - 1;
                                            ssnVar5.b |= 16;
                                            if (!tphVar4.C()) {
                                                tpcVarM2.o();
                                            }
                                            ssn ssnVar6 = (ssn) tpcVarM2.b;
                                            ssnVar6.h = i6 - 1;
                                            ssnVar6.b |= 32;
                                            hroVar3.q.x(21, null, null, null, null, null, null, (ssn) tpcVarM2.l());
                                        }
                                        Rect rect = new Rect();
                                        gzi gziVar = gyo.a;
                                        int iC3 = hroVar3.j.c();
                                        int i9 = hrrVar2.h;
                                        if (i9 == 0) {
                                            throw null;
                                        }
                                        if (i9 == 3 || i9 == 1 || iC3 == 6 || iC3 == 2 || !hroVar3.d()) {
                                            return;
                                        }
                                        pas pasVar2 = pasVar;
                                        RectF rectF = hrrVar2.a;
                                        Rect rect2 = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                        Rect rect3 = hrrVar2.e;
                                        float fWidth = rect3.width() / hrrVar2.c;
                                        RectF rectF2 = new RectF(rect2.left * fWidth, rect2.top * fWidth, rect2.right * fWidth, rect2.bottom * fWidth);
                                        Rect rect4 = new Rect();
                                        float f = pasVar2.a;
                                        float f2 = pasVar2.b;
                                        rect4.left = rect3.left;
                                        rect4.top = rect3.top;
                                        rect4.right = rect3.right;
                                        rect4.bottom = rect3.top + ((int) ((rect3.right - rect3.left) / (f / f2)));
                                        rectF2.offset(rect4.left, rect4.top);
                                        rectF2.round(rect2);
                                        CatcherView catcherView3 = hroVar3.j.c;
                                        if (rect4.height() > 0 && rect4.width() > 0) {
                                            pbu pbuVar = catcherView3.e;
                                            pbuVar.g(rect4);
                                            if (pbuVar.f()) {
                                                RectF rectF3 = new RectF();
                                                rectF3.set(rect4);
                                                pbuVar.a().mapRect(rectF3, new RectF(rect4));
                                                rectF3.round(catcherView3.h);
                                            }
                                        }
                                        hsh hshVar2 = hroVar3.j;
                                        if (pasVar2 == null) {
                                            ((sgt) hsh.a.b().M(1497)).s("viewfinderSize is null");
                                        } else {
                                            hshVar2.c.e.b(pasVar2);
                                        }
                                        hroVar3.j.c.e.c(zJ || (((Boolean) hroVar3.f.dL()).booleanValue() && hroVar3.l > 140.0f));
                                        hroVar3.j.c.e.d(((Integer) hroVar3.g.dL()).intValue());
                                        hsh hshVar3 = hroVar3.j;
                                        out.a();
                                        CatcherView catcherView4 = hshVar3.c;
                                        if (catcherView4.r != 6) {
                                            Path path = catcherView4.d;
                                            path.reset();
                                            Path path2 = catcherView4.c;
                                            path2.reset();
                                            Rect rect5 = catcherView4.h;
                                            rect5.set(rect2);
                                            catcherView4.i.set(rect);
                                            RectF rectF4 = new RectF();
                                            rectF4.set(rect5);
                                            RectF rectF5 = new RectF(rectF4);
                                            catcherView4.a().mapRect(rectF5);
                                            RectF rectF6 = catcherView4.e.a;
                                            rectF6.getClass();
                                            rectF5.intersect(rectF6);
                                            rectF5.round(rect5);
                                            int i10 = catcherView4.o;
                                            int i11 = i10 == 0 ? 439 : (int) (i10 * 3.658f);
                                            int i12 = rect5.right - rect5.left;
                                            int i13 = rect5.bottom - rect5.top;
                                            if (i12 < i13) {
                                                int i14 = (i13 - i12) / 2;
                                                rect5.right += i14;
                                                rect5.left -= i14;
                                            } else {
                                                int i15 = (i12 - i13) / 2;
                                                rect5.bottom += i15;
                                                rect5.top -= i15;
                                            }
                                            int i16 = rect5.right - rect5.left;
                                            int i17 = rect5.bottom - rect5.top;
                                            if ((i16 <= i11 || i17 <= i11) && i11 > 0) {
                                                int i18 = i16 < i11 ? (i11 - i16) / 2 : 0;
                                                int i19 = i17 < i11 ? (i11 - i17) / 2 : 0;
                                                rect5.left -= i18;
                                                rect5.top -= i19;
                                                rect5.right += i18;
                                                rect5.bottom += i19;
                                            }
                                            rect5.set(rect5);
                                            catcherView4.j.set(rect5);
                                            int i20 = rect5.left;
                                            int i21 = rect5.top;
                                            int i22 = rect5.right - rect5.left;
                                            int i23 = rect5.bottom - i21;
                                            float f3 = (i22 / 2) + i20;
                                            path2.moveTo(f3, rect5.top);
                                            float f4 = i21;
                                            float f5 = i22 + i20;
                                            path2.lineTo((-15.0f) + f5, f4);
                                            float f6 = f4 + 30.0f;
                                            float f7 = f5 - 30.0f;
                                            path2.arcTo(new RectF(f7, f4, f5, f6), -90.0f, 90.0f);
                                            float f8 = i21 + i23;
                                            float f9 = f8 - 30.0f;
                                            path2.lineTo(f5, f9);
                                            path2.arcTo(new RectF(f7, f9, f5, f8), 0.0f, 90.0f);
                                            float f10 = i20;
                                            float f11 = f10 + 30.0f;
                                            path2.lineTo(f11, f8);
                                            path2.arcTo(new RectF(f10, f9, f11, f8), 90.0f, 90.0f);
                                            path2.lineTo(f10, f6);
                                            path2.arcTo(new RectF(f10, f4, f11, f6), 180.0f, 90.0f);
                                            path2.lineTo(f3, f4);
                                            PathMeasure pathMeasure = catcherView4.f;
                                            pathMeasure.setPath(path2, false);
                                            catcherView4.m = pathMeasure.getLength();
                                            path.set(path2);
                                            catcherView4.r = 6;
                                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                            valueAnimatorOfFloat.addUpdateListener(new cot(catcherView4, 7));
                                            valueAnimatorOfFloat.addListener(new hsd(catcherView4));
                                            valueAnimatorOfFloat.setDuration(1000L);
                                            valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                                            ValueAnimator valueAnimatorB = catcherView4.b(1.0f, 0.95f, 300L);
                                            ValueAnimator valueAnimatorB2 = catcherView4.b(0.95f, 1.0f, 50L);
                                            catcherView4.q = new AnimatorSet();
                                            catcherView4.q.playSequentially(valueAnimatorOfFloat, valueAnimatorB, valueAnimatorB2);
                                            catcherView4.q.start();
                                        }
                                    }
                                }
                            });
                        }
                    }
                }
                return;
            case 13:
                hti htiVar = (hti) this.b;
                htiVar.S.j();
                if (((Boolean) this.a).booleanValue() && htiVar.K.f()) {
                    htiVar.l.h();
                    return;
                }
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                moy moyVar = ((hti) this.b).h;
                jth jthVar = (jth) this.a;
                moyVar.d(jthVar.c, jthVar.a);
                return;
            case 15:
                htv.c((iby) this.a, (htv) this.b);
                return;
            case 16:
                huc hucVar = (huc) this.a;
                ImageView imageView2 = hucVar.m;
                if (imageView2 == null) {
                    ujp.c("livePreview");
                } else {
                    imageView = imageView2;
                }
                imageView.setImageBitmap((Bitmap) this.b);
                hucVar.f();
                return;
            case 17:
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                hvn hvnVar = (hvn) this.a;
                hvnVar.f = egl10;
                hvnVar.c = hvnVar.f.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                if (hvnVar.c == EGL10.EGL_NO_DISPLAY) {
                    throw new RuntimeException("eglGetDisplay failed");
                }
                if (!hvnVar.f.eglInitialize(hvnVar.c, new int[2])) {
                    throw new RuntimeException("eglInitialize failed");
                }
                int[] iArr = {12440, 2, 12344};
                EGL10 egl102 = hvnVar.f;
                EGLDisplay eGLDisplay = hvnVar.c;
                int[] iArr2 = new int[1];
                int[] iArr3 = hvn.a;
                if (!egl102.eglChooseConfig(eGLDisplay, iArr3, null, 0, iArr2)) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                int i4 = iArr2[0];
                if (i4 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i4];
                if (!egl102.eglChooseConfig(eGLDisplay, iArr3, eGLConfigArr, i4, iArr2)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                hvnVar.b = eGLConfigArr[0];
                hvnVar.d = hvnVar.f.eglCreateContext(hvnVar.c, hvnVar.b, EGL10.EGL_NO_CONTEXT, iArr);
                EGLContext eGLContext = hvnVar.d;
                if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                    throw new RuntimeException("failed to createContext");
                }
                hvnVar.e = hvnVar.f.eglCreateWindowSurface(hvnVar.c, hvnVar.b, this.b, null);
                EGLSurface eGLSurface = hvnVar.e;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    throw new RuntimeException("failed to createWindowSurface");
                }
                EGL10 egl103 = hvnVar.f;
                EGLDisplay eGLDisplay2 = hvnVar.c;
                EGLSurface eGLSurface2 = hvnVar.e;
                if (!egl103.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, hvnVar.d)) {
                    throw new RuntimeException("failed to eglMakeCurrent");
                }
                hvnVar.g = (GL10) hvnVar.d.getGL();
                return;
            case 18:
                hxd hxdVar = (hxd) this.b;
                if (hxdVar.d && hxdVar.e) {
                    ((BuildPayloadBurstSpecOptions) this.a).b(1000.0f);
                    return;
                }
                return;
            case 19:
                this.b.run();
                Object obj11 = this.a;
                synchronized (obj11) {
                    ((AtomicBoolean) obj11).set(true);
                    obj11.notify();
                }
                return;
            default:
                ija ijaVar = ((iiy) this.b).c;
                ijaVar.c.a();
                this.a.a(juk.b);
                ijaVar.f.a(true);
                return;
        }
    }

    public hdk(hvn hvnVar, SurfaceTexture surfaceTexture, int i) {
        this.c = i;
        this.b = surfaceTexture;
        this.a = hvnVar;
    }

    public /* synthetic */ hdk(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ hdk(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public hdk(Runnable runnable, AtomicBoolean atomicBoolean, int i) {
        this.c = i;
        this.b = runnable;
        this.a = atomicBoolean;
    }
}
