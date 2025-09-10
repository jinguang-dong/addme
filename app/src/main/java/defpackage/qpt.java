package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.media.MediaFormat;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLObjectHandle;
import android.opengl.EGLSurface;
import android.opengl.GLES30;
import android.opengl.GLES31;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.provider.Settings;
import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import com.google.android.apps.camera.facemetadata.conversions.jni.HM.oUZhwRhE;
import com.google.android.apps.camera.jni.surface.SurfaceNative;
import com.google.android.apps.camera.portrait.preview.NativePortraitPreviewProcessor;
import com.google.android.apps.camera.uiutils.ViewSmoothRotationUtil$Rotatee;
import com.google.android.apps.camera.viewfindereffects.bufferflinger.SurfaceControlBufferFlinger;
import com.google.ar.core.ImageMetadata;
import com.google.ar.core.R;
import com.google.googlex.gcam.AssetData;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.vr.audio.Cf.qcjAcSmlN;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.stream.Stream;
import java.io.File;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qpt {
    private static String a;
    private static Boolean b;
    public static String c;
    public static Boolean d;

    public qpt() {
    }

    public static qpo A(rwc rwcVar, uem uemVar) {
        return (qpo) ((uem) rwcVar.e(uemVar)).a();
    }

    public static void B(Runnable runnable, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        char c2;
        char c3;
        char c4;
        int i6;
        char c5 = 2;
        int[] iArr = new int[2];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        int[] iArr5 = new int[2];
        int[] iArr6 = new int[1];
        int[] iArr7 = new int[1];
        int[] iArr8 = new int[4];
        String name = Thread.currentThread().getName();
        Thread threadCurrentThread = Thread.currentThread();
        ThreadGroup threadGroup = threadCurrentThread.getThreadGroup();
        if (threadGroup != null) {
            int iActiveCount = threadGroup.activeCount();
            int i7 = iActiveCount + iActiveCount;
            Thread[] threadArr = new Thread[i7];
            threadGroup.enumerate(threadArr, true);
            i5 = 1;
            int i8 = 0;
            i4 = 0;
            while (true) {
                c2 = c5;
                if (i8 >= i7) {
                    break;
                }
                Thread thread = threadArr[i8];
                if (thread != null && thread.getName().equals(name)) {
                    i4++;
                }
                if (thread == threadCurrentThread) {
                    i5 = i4;
                }
                i8++;
                c5 = c2;
            }
        } else {
            i4 = 0;
            i5 = 1;
            c2 = 2;
        }
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        EGLSurface eGLSurfaceEglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        GLES30.glGetIntegerv(33307, iArr, 0);
        GLES30.glGetIntegerv(33308, iArr, 1);
        GLES30.glGetIntegerv(35725, iArr2, 0);
        GLES30.glGetIntegerv(34016, iArr3, 0);
        GLES30.glGetIntegerv(36010, iArr6, 0);
        GLES30.glGetIntegerv(36007, iArr7, 0);
        GLES30.glGetIntegerv(32873, iArr4, 0);
        GLES30.glGetIntegerv(2978, iArr8, 0);
        if (iArr4[0] != 0) {
            if (iArr[0] == 3) {
                c4 = 1;
                c3 = 3;
                if (iArr[1] > 0) {
                    i6 = -1;
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4096, iArr5, 0);
                    GLES31.glGetTexLevelParameteriv(3553, 0, 4097, iArr5, 1);
                }
            } else {
                c4 = 1;
                c3 = 3;
            }
            i6 = -1;
            iArr5[0] = -1;
            iArr5[c4] = -1;
        } else {
            c3 = 3;
            c4 = 1;
            i6 = -1;
        }
        Locale locale = Locale.US;
        Integer numValueOf = Integer.valueOf(iArr[0]);
        Integer numValueOf2 = Integer.valueOf(iArr[c4]);
        String name2 = Thread.currentThread().getName();
        Integer numValueOf3 = Integer.valueOf(i5);
        Integer numValueOf4 = Integer.valueOf(i4);
        Integer numValueOf5 = Integer.valueOf(i);
        String string = runnable.toString();
        String strG = eGLContextEglGetCurrentContext.equals(EGL14.EGL_NO_CONTEXT) ? oUZhwRhE.FHIXxOMAvrhz : g(eGLContextEglGetCurrentContext);
        String strG2 = eGLDisplayEglGetCurrentDisplay.equals(EGL14.EGL_NO_DISPLAY) ? "EGL_NO_DISPLAY" : g(eGLDisplayEglGetCurrentDisplay);
        String strG3 = eGLSurfaceEglGetCurrentSurface.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : g(eGLSurfaceEglGetCurrentSurface);
        String strG4 = eGLSurfaceEglGetCurrentSurface2.equals(EGL14.EGL_NO_SURFACE) ? "EGL_NO_SURFACE" : g(eGLSurfaceEglGetCurrentSurface2);
        String strValueOf = i2 == 12288 ? "EGL_SUCCESS" : String.valueOf(i2);
        String strValueOf2 = i3 == 0 ? "GL_NO_ERROR" : String.valueOf(i3);
        Boolean boolValueOf = Boolean.valueOf(z);
        Integer numValueOf6 = Integer.valueOf(iArr2[0]);
        Integer numValueOf7 = Integer.valueOf(iArr3[0] - 33984);
        Integer numValueOf8 = Integer.valueOf(iArr4[0]);
        int i9 = iArr5[0];
        int i10 = i6;
        String strValueOf3 = i9 != i10 ? String.valueOf(i9) : "?";
        int i11 = iArr5[1];
        String str = String.format(locale, "\n- General EGL Status ------------------\nVersion: %d.%d\nThread: %s (%d of %d)\nCommands Executed: %d\nCommand Run: %s\nCurrent Context: %s\nCurrent Display: %s\nCurrent Read Surface: %s\nCurrent Draw Surface: %s\nEGL Error: %s\nGL Error: %s\nClosing: %b\n- GL Status ---------------------------\nBound Program: %d\nActive Texture Slot: %d\nTexture2D Binding: %d\nTexture Size: %sx%s\nFBO Binding: %d\nRenderbuffer Binding: %d\nViewport: %d,%d,%dx%d\n", numValueOf, numValueOf2, name2, numValueOf3, numValueOf4, numValueOf5, string, strG, strG2, strG3, strG4, strValueOf, strValueOf2, boolValueOf, numValueOf6, numValueOf7, numValueOf8, strValueOf3, i11 != i10 ? String.valueOf(i11) : "?", Integer.valueOf(iArr6[0]), Integer.valueOf(iArr7[0]), Integer.valueOf(iArr8[0]), Integer.valueOf(iArr8[1]), Integer.valueOf(iArr8[c2]), Integer.valueOf(iArr8[c3]));
        StringBuilder sb = new StringBuilder();
        if (iArr2[0] != 0) {
            sb.append("- Program Details ---------------------\n");
            int i12 = iArr2[0];
            StringBuilder sb2 = new StringBuilder();
            int i13 = 1;
            int[] iArr9 = new int[1];
            GLES30.glGetProgramiv(i12, 35718, iArr9, 0);
            sb2.append(String.format(Locale.US, "Uni Count: %d\n", Integer.valueOf(iArr9[0])));
            int[] iArr10 = new int[1];
            GLES30.glGetProgramiv(i12, 35719, iArr10, 0);
            int i14 = 0;
            while (i14 < iArr9[0]) {
                int[] iArr11 = new int[i13];
                byte[] bArr = new byte[255];
                int i15 = i12;
                int i16 = i14;
                GLES30.glGetActiveUniform(i15, i16, iArr10[0], new int[i13], 0, new int[i13], 0, iArr11, 0, bArr, 0);
                sb2.append(String.format("Uni 0x%X %s\n", Integer.valueOf(iArr11[0]), new String(bArr, 0, f(bArr))));
                i14 = i16 + 1;
                i12 = i15;
                i13 = 1;
            }
            sb.append(sb2.toString());
            int i17 = iArr2[0];
            StringBuilder sb3 = new StringBuilder();
            int[] iArr12 = new int[1];
            GLES30.glGetProgramiv(i17, 35721, iArr12, 0);
            sb3.append(String.format(Locale.US, "Attrib Count: %d\n", Integer.valueOf(iArr12[0])));
            int[] iArr13 = new int[1];
            GLES30.glGetProgramiv(i17, 35722, iArr13, 0);
            int i18 = 0;
            while (i18 < iArr12[0]) {
                int[] iArr14 = new int[1];
                byte[] bArr2 = new byte[255];
                int i19 = i17;
                int i20 = i18;
                GLES30.glGetActiveAttrib(i19, i20, iArr13[0], new int[1], 0, new int[1], 0, iArr14, 0, bArr2, 0);
                sb3.append(String.format("Attrib 0x%X %s\n", Integer.valueOf(iArr14[0]), new String(bArr2, 0, f(bArr2))));
                i18 = i20 + 1;
                i17 = i19;
            }
            sb.append(sb3.toString());
        }
        Log.e("GLContext", String.valueOf(str).concat(sb.toString()));
    }

    public static void C(qin qinVar) {
        qinVar.g(new itd(6), new ndk(18));
        D(qinVar);
    }

    public static void D(qin qinVar) {
        qjq qjqVarE = qinVar.e();
        try {
            qjqVarE.a();
            qjqVarE.close();
        } catch (Throwable th) {
            try {
                qjqVarE.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static qhh E(qhh qhhVar, qfr qfrVar) {
        try {
            return qhhVar.b(qfrVar);
        } catch (ClassCastException e) {
            throw new AssertionError("Resizable layout returns wrong type!", e);
        }
    }

    public static rnu F() {
        return new rnu(new qhx(new qfq(1, 1)));
    }

    public static TimeInterpolator G(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!j(strValueOf, "cubic-bezier") && !j(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!j(strValueOf, "cubic-bezier")) {
            if (j(strValueOf, "path")) {
                return new PathInterpolator(chx.j(i(strValueOf, "path")));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(strValueOf)));
        }
        String[] strArrSplit = i(strValueOf, "cubic-bezier").split(",");
        int length = strArrSplit.length;
        if (length == 4) {
            return new PathInterpolator(h(strArrSplit, 0), h(strArrSplit, 1), h(strArrSplit, 2), h(strArrSplit, 3));
        }
        throw new IllegalArgumentException(a.bv(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
    }

    public static float H(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean I(View view) {
        return view.getLayoutDirection() == 1;
    }

    public static ColorStateList J(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }

    public static Drawable K(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i != -1 && i2 == -1) {
            i2 = -1;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static void L(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static int[] M(int[] iArr) {
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                iArrCopyOf[length] = 16842912;
                return iArrCopyOf;
            }
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
            i++;
        }
    }

    public static Drawable N(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static int O(int i, int i2) {
        return cmg.e(i, (Color.alpha(i) * i2) / 255);
    }

    public static int P(View view, int i) {
        return S(view.getContext(), rnt.h(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int Q(Context context, int i, int i2) {
        Integer numT = T(context, i);
        return numT != null ? numT.intValue() : i2;
    }

    public static int R(int i, int i2, float f) {
        return cmg.d(cmg.e(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static int S(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }

    public static Integer T(Context context, int i) {
        TypedValue typedValueG = rnt.g(context, i);
        if (typedValueG != null) {
            return Integer.valueOf(S(context, typedValueG));
        }
        return null;
    }

    public static boolean U(int i) {
        return i != 0 && cmg.a(i) > 0.5d;
    }

    public static /* synthetic */ SparseArray V() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(4, "SYSTEM_UI_FLAG_FULLSCREEN");
        sparseArray.put(2, "SYSTEM_UI_FLAG_HIDE_NAVIGATION");
        sparseArray.put(2048, "SYSTEM_UI_FLAG_IMMERSIVE");
        sparseArray.put(4096, "SYSTEM_UI_FLAG_IMMERSIVE_STICKY");
        sparseArray.put(1024, "SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN");
        sparseArray.put(512, "SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION");
        sparseArray.put(256, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        sparseArray.put(16, "SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR");
        sparseArray.put(8192, "SYSTEM_UI_FLAG_LIGHT_STATUS_BAR");
        sparseArray.put(1, "SYSTEM_UI_FLAG_LOW_PROFILE");
        return sparseArray;
    }

    public static void W(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static File X(Uri uri) throws rcu {
        if (!uri.getScheme().equals("file")) {
            throw new rcu("Scheme must be 'file'");
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new rcu("Did not expect uri to have query");
        }
        if (TextUtils.isEmpty(uri.getAuthority())) {
            return new File(uri.getPath());
        }
        throw new rcu("Did not expect uri to have authority");
    }

    public static Uri Y(Uri.Builder builder, sbk sbkVar) {
        return builder.encodedFragment(rdc.a(sbkVar.g())).build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.File Z(android.net.Uri r11, android.content.Context r12) throws defpackage.rcu {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpt.Z(android.net.Uri, android.content.Context):java.io.File");
    }

    public static float aA(byte[] bArr, int i) {
        return Float.intBitsToFloat(aB(bArr, i));
    }

    public static int aB(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long aC(byte[] bArr, int i) {
        return aB(bArr, i + 12) & 4294967295L;
    }

    public static long aD(byte[] bArr, int i) {
        return (bArr[i + 16] & 255) + ((bArr[i + 17] & 255) << 8) + ((bArr[i + 18] & 255) << 16) + ((bArr[i + 19] & 255) << 24) + ((bArr[i + 20] & 255) << 32) + ((bArr[i + 21] & 255) << 40) + ((bArr[i + 22] & 255) << 48) + ((bArr[i + 23] & 255) << 56);
    }

    public static String aE(poo pooVar) {
        return aF(pooVar.b(), pooVar.d(), pooVar.a());
    }

    public static String aF(int i, int i2, int i3) {
        return ay(i) + "w" + i2 + "h" + i3;
    }

    public static double aG(float f, double d2) {
        rnt.F(f > 0.0f, "Focal length cannot be zero (%s)", Float.valueOf(f));
        rnt.F(d2 > 0.0d, "Diagonal size cannot be zero (%s)", Double.valueOf(d2));
        double dAtan = Math.atan(d2 / (f + f));
        return dAtan + dAtan;
    }

    public static double aH(double d2, float f) {
        return (f + f) * Math.tan(d2 / 2.0d);
    }

    public static double aI(pjo pjoVar) {
        SizeF sizeF = (SizeF) pjoVar.o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getHeight(), sizeF.getWidth());
    }

    public static double aJ(pjo pjoVar, pae paeVar) {
        SizeF sizeF = (SizeF) pjoVar.o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        return Math.hypot(sizeF.getWidth(), paeVar.l(pae.b) ? paeVar.b(sizeF.getWidth()) : sizeF.getHeight());
    }

    public static float aL(float f, float f2) {
        return Math.abs(cx(f) - cx(f2));
    }

    public static float aM(mxm mxmVar) {
        return cx(aN(mxmVar));
    }

    public static int aN(mxm mxmVar) {
        if (mxmVar.d()) {
            return 0;
        }
        return mxmVar.c().e;
    }

    public static rwc aO(ViewSmoothRotationUtil$Rotatee viewSmoothRotationUtil$Rotatee, mxm mxmVar, boolean z) {
        viewSmoothRotationUtil$Rotatee.getClass();
        float fAN = aN(mxmVar);
        float fAL = aL(viewSmoothRotationUtil$Rotatee.a(), fAN);
        if (fAL == 0.0f) {
            return rvk.a;
        }
        boolean z2 = fAL <= 90.0f && !z;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewSmoothRotationUtil$Rotatee.b(), viewSmoothRotationUtil$Rotatee.c(), viewSmoothRotationUtil$Rotatee.a(), cx(fAN));
        objectAnimatorOfFloat.setInterpolator(new cvn());
        objectAnimatorOfFloat.setDuration(true != z2 ? 0L : 250L);
        return rwc.j(objectAnimatorOfFloat);
    }

    public static void aP(View view, mxm mxmVar) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        if (mxmVar.d()) {
            view.setRotation(0.0f);
        } else {
            view.setRotation(mxmVar.e);
        }
    }

    public static void aQ(View view, mxm mxmVar) {
        aR(view, mxmVar, false);
    }

    public static void aR(View view, mxm mxmVar, boolean z) {
        rwc rwcVarAO = aO(new nlk(view), mxmVar, z);
        if (rwcVarAO.h()) {
            ((ValueAnimator) rwcVarAO.c()).start();
        }
    }

    public static ngn aS(Surface surface, int i, Size size, boolean z, Consumer consumer) {
        surface.getClass();
        rnt.u(SurfaceNative.setSurfaceGeometry(surface, size.getWidth(), size.getHeight(), i) == 0, "setSurfaceGeometry shouldn't fail", new Object[0]);
        return new ngn(surface, z, new SurfaceControlBufferFlinger(surface), size, consumer);
    }

    public static void aT(final mxm mxmVar, final adt adtVar, final int i, final long j, final int i2, final long j2, final long j3, ayc aycVar, final int i3) {
        int i4;
        ayc aycVar2;
        float fAM;
        int i5 = i3 & 6;
        ayc aycVarC = aycVar.c(-1992204816);
        if (i5 == 0) {
            i4 = (true != aycVarC.z(mxmVar == null ? -1 : mxmVar.ordinal()) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != aycVarC.B(adtVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != aycVarC.z(i) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != aycVarC.A(j) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != aycVarC.z(i2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != aycVarC.A(j2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != aycVarC.A(j3) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        int i6 = i4;
        if ((599187 & i6) == 599186 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            aycVarC.u(1046594319);
            if (adtVar != null) {
                aycVar2 = aycVarC;
                fAM = ((Number) abu.a(aM(mxmVar), adtVar, null, aycVarC, i6 & ScriptIntrinsicBLAS.TRANSPOSE, 28).a()).floatValue();
            } else {
                aycVar2 = aycVarC;
                fAM = aM(mxmVar);
            }
            ((ayg) aycVar2).Y();
            bd(aycVar2).a(fAM, i, j, i2, j2, j3, aycVar2, (i6 >> 3) & 524272);
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nep
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mxm mxmVar2 = mxmVar;
                    adt adtVar2 = adtVar;
                    int i7 = i;
                    long j4 = j;
                    int i8 = i2;
                    long j5 = j2;
                    qpt.aT(mxmVar2, adtVar2, i7, j4, i8, j5, j3, (ayc) obj, bay.j(i3 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void aU(final nfc nfcVar, ayc aycVar, final int i) {
        int i2;
        nfcVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-135866367);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(nfcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && aycVarC.G()) {
            aycVarC.r();
        } else {
            nfb nfbVar = (nfb) nfcVar;
            boolean zBooleanValue = ((Boolean) nfbVar.e.a()).booleanValue();
            adt adtVarBg = byi.bg(217, 217, null, 4);
            bbo bboVarAb = byi.ab(nfbVar.a, ufw.a, aycVarC);
            bbo bboVarAb2 = byi.ab(nfbVar.f, mxm.PORTRAIT, aycVarC);
            cwp cwpVar = nfbVar.h;
            aycVarC.u(-1718534929);
            bbo bboVarAb3 = byi.ab(cwpVar, ojl.bm(), aycVarC);
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            aycVarC.u(5004770);
            boolean zD = aycVarC.D(nfcVar);
            Object objR = aygVar.R();
            if (zD || objR == ayb.a) {
                objR = new bxr(nfcVar, 2, (char[]) null);
                aygVar.ac(objR);
            }
            ukz ukzVar = (ukz) objR;
            aygVar.Y();
            byi.bm(nfcVar.j(), null, zBooleanValue ? aav.e(adtVarBg, 2) : aaz.a, zBooleanValue ? aav.f(adtVarBg, 2) : aba.a, null, bdq.k(485444825, new nfa(nfcVar, bd(aycVarC).k(aycVarC), ukzVar, bboVarAb3, bboVarAb, bboVarAb2), aycVarC), aycVarC, ImageMetadata.EDGE_MODE, 18);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nes
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    qpt.aU(nfcVar, (ayc) obj, bay.j(i4 | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void aV(final List list, final aus ausVar, final nee neeVar, neb nebVar, final float f, final boolean z, ayc aycVar, final int i) {
        List list2;
        int i2;
        boolean z2;
        int i3;
        bik bikVar;
        long j;
        long j2;
        Object obj;
        bik bikVarAj;
        bih bihVar;
        int i4 = i & 6;
        ayc aycVarC = aycVar.c(-1146945018);
        if (i4 == 0) {
            list2 = list;
            i2 = (true != aycVarC.D(list2) ? 2 : 4) | i;
        } else {
            list2 = list;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(ausVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(neeVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.D(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.y(f) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= true != aycVarC.C(z2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        } else {
            z2 = z;
        }
        if ((74899 & i2) == 74898 && aycVarC.G()) {
            aycVarC.r();
        } else {
            float f2 = neeVar.a;
            float fDk = ((chq) aycVarC.e(bze.c)).dk(f);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(Float.valueOf(fDk), (nkx) it.next());
                fDk += f2;
            }
            aycVarC.u(1849434622);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            Object obj2 = ayb.a;
            if (objR == obj2) {
                objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar.ac(objR);
            }
            ocq ocqVar = (ocq) objR;
            aygVar.Y();
            Object objR2 = aygVar.R();
            if (objR2 == obj2) {
                azz azzVar = new azz(false, bap.c);
                aygVar.ac(azzVar);
                objR2 = azzVar;
            }
            azr azrVar = (azr) objR2;
            Object objR3 = aygVar.R();
            if (objR3 == obj2) {
                objR3 = new ve(ocqVar, azrVar, (uhb) null, 2);
                aygVar.ac(objR3);
            }
            azb.f(ocqVar, (uiu) objR3, aycVarC);
            View view = (View) aycVarC.e(AndroidCompositionLocals_androidKt.f);
            Object objD = ausVar.d();
            aycVarC.u(-1633490746);
            boolean zB = aycVarC.B(azrVar) | aycVarC.D(view);
            Object objR4 = aygVar.R();
            if (zB || objR4 == obj2) {
                i3 = i2;
                objR4 = new nez(view, azrVar, null);
                aygVar.ac(objR4);
            } else {
                i3 = i2;
            }
            aygVar.Y();
            azb.f(objD, (uiu) objR4, aycVarC);
            long j3 = neeVar.c;
            long j4 = neeVar.d;
            int iE = bd(aycVarC).e(aycVarC);
            bih bihVar2 = bik.c;
            aycVarC.u(-1633490746);
            boolean zD = aycVarC.D(null) | ((i3 & ScriptIntrinsicBLAS.TRANSPOSE) == 32);
            Object objR5 = aygVar.R();
            if (zD || objR5 == obj2) {
                objR5 = new dql((neb) null, ausVar, 19);
                aygVar.ac(objR5);
            }
            aygVar.Y();
            bik bikVarAN = byi.aN(bihVar2, (uiq) objR5);
            if (bd(aycVarC).l(aycVarC)) {
                aycVarC.u(2122293376);
                aii aiiVar = neeVar.e;
                aycVarC.u(1849434622);
                Object objR6 = aygVar.R();
                if (objR6 == obj2) {
                    bihVar = bihVar2;
                    objR6 = new ane(8);
                    aygVar.ac(objR6);
                } else {
                    bihVar = bihVar2;
                }
                aygVar.Y();
                bikVar = bikVarAN;
                j = j4;
                j2 = j3;
                obj = obj2;
                bikVarAj = bay.aj(bihVar, ausVar, linkedHashMap, aiiVar, z2, ocqVar, (uiu) objR6, 400);
                aygVar.Y();
            } else {
                bikVar = bikVarAN;
                j = j4;
                j2 = j3;
                obj = obj2;
                aycVarC.u(2122645567);
                aii aiiVar2 = neeVar.e;
                aycVarC.u(1849434622);
                Object objR7 = aygVar.R();
                if (objR7 == obj) {
                    objR7 = new aud(6);
                    aygVar.ac(objR7);
                }
                aygVar.Y();
                bikVarAj = bay.aj(bihVar2, ausVar, linkedHashMap, aiiVar2, z, ocqVar, (uiu) objR7, 272);
                aygVar.Y();
            }
            bik bikVarD = amd.d(byi.aM(bikVar.cM(bikVarAj), f + byx.c(iE, aycVarC), f + byx.c(iE, aycVarC), 0.0f, 0.0f, 12), neeVar.b);
            aycVarC.u(-1746271574);
            final long j5 = j;
            boolean zD2 = aycVarC.D(null) | aycVarC.A(j2) | aycVarC.A(j5);
            Object objR8 = aygVar.R();
            if (zD2 || objR8 == obj) {
                final neb nebVar2 = null;
                final long j6 = j2;
                objR8 = new uiq(nebVar2, j6, j5) { // from class: neq
                    public final /* synthetic */ neb a = null;
                    public final /* synthetic */ long b;
                    public final /* synthetic */ long c;

                    {
                        this.b = j6;
                        this.c = j5;
                    }

                    @Override // defpackage.uiq
                    public final Object a(Object obj3) {
                        bvo bvoVar = (bvo) obj3;
                        bvoVar.getClass();
                        bvoVar.p();
                        qpt.aW(bvoVar, this.b, 11, 0.0f, 0.0f, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), null, 3);
                        qpt.aW(bvoVar, this.c, 4, 0.0f, 0.0f, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), null, 3);
                        return ufg.a;
                    }
                };
                aygVar.ac(objR8);
            }
            aygVar.Y();
            aku.b(bdq.B(bikVarD, (uiq) objR8), aycVarC, 0);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            final neb nebVar3 = null;
            baiVarI.d = new uiu(list, ausVar, neeVar, nebVar3, f, z, i) { // from class: ner
                public final /* synthetic */ List a;
                public final /* synthetic */ aus b;
                public final /* synthetic */ nee c;
                public final /* synthetic */ neb d = null;
                public final /* synthetic */ float e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ int g;

                {
                    this.e = f;
                    this.f = z;
                    this.g = i;
                }

                @Override // defpackage.uiu
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    List list3 = this.a;
                    aus ausVar2 = this.b;
                    nee neeVar2 = this.c;
                    float f3 = this.e;
                    qpt.aV(list3, ausVar2, neeVar2, null, f3, this.f, (ayc) obj3, bay.j(this.g | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void aW(bvo bvoVar, long j, int i, float f, float f2, long j2, neb nebVar, int i2) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 != 1) {
                byi.am(bvoVar, j, 0.0f, 0L, null, i, 62);
                return;
            } else {
                if (nebVar != null) {
                    throw null;
                }
                return;
            }
        }
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f2);
        float fDk = bvoVar.dk(f);
        float fDk2 = bvoVar.dk(f);
        byi.I(bvoVar, j, (Float.floatToRawIntBits(fDk2) & 4294967295L) | (Float.floatToRawIntBits(fDk + fDk) << 32), j2, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), i, ScriptIntrinsicBLAS.TRANSPOSE);
    }

    public static void aY(final nkx nkxVar, final boolean z, final boolean z2, final uiu uiuVar, final mxm mxmVar, final adt adtVar, final aus ausVar, final long j, final long j2, final long j3, long j4, bie bieVar, ayc aycVar, final int i, final int i2, int i3) {
        int i4;
        long jG;
        bie bieVar2;
        final long j5;
        final bie bieVar3;
        ayc aycVarC = aycVar.c(-2032460708);
        if ((i & 6) == 0) {
            i4 = (true != aycVarC.z(nkxVar.ordinal()) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != aycVarC.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != aycVarC.C(z2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != aycVarC.D(uiuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != aycVarC.z(mxmVar == null ? -1 : mxmVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i4 |= true != aycVarC.B(adtVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i4 |= true != aycVarC.B(ausVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i4 |= true != aycVarC.A(j) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != aycVarC.A(j2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != aycVarC.A(j3) ? 268435456 : 536870912;
        }
        int i5 = ((i2 & 6) == 0 ? i2 | 2 : i2) | 48;
        if ((i4 & 306783379) == 306783378 && (i5 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
            j5 = j4;
            bieVar3 = bieVar;
        } else {
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                jG = bd(aycVarC).g(aycVarC);
                bieVar2 = bib.j;
            } else {
                aycVarC.r();
                jG = j4;
                bieVar2 = bieVar;
            }
            aycVarC.l();
            nku nkuVar = (nku) nku.a.get(nkxVar);
            nkuVar.getClass();
            aby abyVarK = bd(aycVarC).k(aycVarC);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = azb.a(uhg.a, aycVarC);
                aygVar.ac(objR);
            }
            int i6 = nkuVar.b;
            bay.K(atc.d.b(null), bdq.k(-2137538276, new ney(z, z2, (und) objR, ausVar, nkxVar, abyVarK, uiuVar, (View) aycVarC.e(AndroidCompositionLocals_androidKt.f), mxmVar, adtVar, nkuVar, j, j3, nkuVar.c, j2, i6, jG, bieVar2), aycVarC), aycVarC, 56);
            j5 = jG;
            bieVar3 = bieVar2;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            final int i7 = 3072;
            baiVarI.d = new uiu(z, z2, uiuVar, mxmVar, adtVar, ausVar, j, j2, j3, j5, bieVar3, i, i2, i7) { // from class: nek
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ uiu d;
                public final /* synthetic */ mxm e;
                public final /* synthetic */ adt f;
                public final /* synthetic */ aus g;
                public final /* synthetic */ long h;
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;
                public final /* synthetic */ int n = 3072;
                public final /* synthetic */ bie o;

                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    nkx nkxVar2 = this.a;
                    boolean z3 = this.b;
                    boolean z4 = this.c;
                    uiu uiuVar2 = this.d;
                    mxm mxmVar2 = this.e;
                    adt adtVar2 = this.f;
                    aus ausVar2 = this.g;
                    long j6 = this.h;
                    long j7 = this.i;
                    long j8 = this.j;
                    int i8 = this.l;
                    long j9 = this.k;
                    int i9 = this.m;
                    int iJ = bay.j(i8 | 1);
                    int iJ2 = bay.j(i9);
                    qpt.aY(nkxVar2, z3, z4, uiuVar2, mxmVar2, adtVar2, ausVar2, j6, j7, j8, j9, this.o, (ayc) obj, iJ, iJ2, 3072);
                    return ufg.a;
                }
            };
        }
    }

    public static void aZ(final boolean z, final boolean z2, final uif uifVar, final mxm mxmVar, final adt adtVar, final String str, final long j, final long j2, final int i, final long j3, final int i2, final long j4, final bie bieVar, ayc aycVar, final int i3, final int i4) {
        int i5;
        uif uifVar2;
        int i6;
        float fR;
        uifVar.getClass();
        int i7 = i3 & 6;
        ayc aycVarC = aycVar.c(1911773023);
        if (i7 == 0) {
            i5 = (true != aycVarC.C(z) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != aycVarC.C(z2) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            uifVar2 = uifVar;
            i5 |= true != aycVarC.D(uifVar2) ? 128 : 256;
        } else {
            uifVar2 = uifVar;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != aycVarC.z(mxmVar == null ? -1 : mxmVar.ordinal()) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i5 |= true != aycVarC.B(adtVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i5 |= true != aycVarC.B(str) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i3) == 0) {
            i5 |= true != aycVarC.A(j) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i3) == 0) {
            i5 |= true != aycVarC.A(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i3) == 0) {
            i5 |= true != aycVarC.z(i) ? 33554432 : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i5 |= true != aycVarC.A(j3) ? 268435456 : 536870912;
        }
        if ((i4 & 6) == 0) {
            i6 = (true != aycVarC.z(i2) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        int i8 = i5;
        if ((i4 & 48) == 0) {
            i6 |= true != aycVarC.A(j4) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != aycVarC.B(bieVar) ? 128 : 256;
        }
        if ((i8 & 306783379) == 306783378 && (i6 & 147) == 146 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.s();
            if ((i3 & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            bik bikVarAg = clc.ag(bik.c, str);
            aycVarC.u(5004770);
            int i9 = i8 & ScriptIntrinsicBLAS.TRANSPOSE;
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (i9 == 32 || objR == ayb.a) {
                objR = new net(z2, 0);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarBK = byi.bK(asw.a(amd.d(cbp.b(bikVarAg, false, (uiq) objR), a.t(fIntBitsToFloat, fIntBitsToFloat2))), null, atc.a(24.0f, 4), z, new cbk(0), uifVar2, 8);
            bsr bsrVarC = aku.c(bieVar, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarBK);
            uif uifVar3 = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar3);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            if (z) {
                aycVarC.u(-1110267540);
                fR = ((Number) aycVarC.e(arz.a)).floatValue();
            } else {
                aycVarC.u(-1110266707);
                fR = e.r(aycVarC);
            }
            aygVar.Y();
            bay.K(arz.a.b(Float.valueOf(fR)), bdq.k(-268899291, new nev(mxmVar, adtVar, i, j3, i2, j2, j4), aycVarC), aycVarC, 56);
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: neu
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    boolean z4 = z2;
                    uif uifVar4 = uifVar;
                    mxm mxmVar2 = mxmVar;
                    adt adtVar2 = adtVar;
                    String str2 = str;
                    long j5 = j;
                    long j6 = j2;
                    int i10 = i;
                    long j7 = j3;
                    int i11 = i2;
                    long j8 = j4;
                    int i12 = i3;
                    qpt.aZ(z3, z4, uifVar4, mxmVar2, adtVar2, str2, j5, j6, i10, j7, i11, j8, bieVar, (ayc) obj, bay.j(i12 | 1), bay.j(i4));
                    return ufg.a;
                }
            };
        }
    }

    public static File aa(Context context) {
        return ab(context.createDeviceProtectedStorageContext()).getParentFile();
    }

    public static File ab(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        throw new IllegalStateException("getFilesDir returned null twice.");
    }

    public static void ac(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            rsf rsfVarK = rnt.k((String) entry.getKey());
            try {
                ((rbm) ((uem) entry.getValue()).a()).a();
                rsfVarK.close();
            } catch (Throwable th) {
                try {
                    rsfVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static boolean ad() {
        if (b == null) {
            b = Boolean.valueOf(Process.isApplicationUid(Process.myUid()));
        }
        return b.booleanValue();
    }

    public static String ae() {
        String str = a;
        if (str != null) {
            return str;
        }
        String processName = Application.getProcessName();
        a = processName;
        return processName;
    }

    public static /* synthetic */ rba af(tpc tpcVar) {
        tph tphVarI = tpcVar.l();
        tphVarI.getClass();
        return (rba) tphVarI;
    }

    public static int ag(int i) {
        return i - 1;
    }

    public static void ah(syu syuVar) {
        syuVar.c(new pgr(syuVar, 14), sxo.a);
    }

    public static qgf ai(Executor executor, Callable callable) {
        qhd qhdVar = new qhd();
        try {
            executor.execute(new qgk(qhdVar, callable));
            return qhdVar;
        } catch (Exception e) {
            qhdVar.j(qgg.a(e));
            return qhdVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static qgf aj(Iterable iterable) {
        return iterable.isEmpty() ? new qge(Collections.EMPTY_LIST, 0) : new qgp(iterable).a;
    }

    public static Object ak(qgf qgfVar) {
        Object objAl = al(qgfVar);
        if (objAl != null) {
            return objAl;
        }
        throw new IllegalStateException(a.bx(qgfVar, "Attempting to get value of ", " which is not yet available!"));
    }

    public static Object al(qgf qgfVar) {
        if (qgfVar.f()) {
            return am(qgfVar);
        }
        return null;
    }

    public static Object am(qgf qgfVar) {
        try {
            return an(qgfVar);
        } catch (qgg e) {
            throw new szp(e);
        }
    }

    public static Object an(qgf qgfVar) {
        Object objE;
        boolean z = false;
        while (true) {
            try {
                objE = qgfVar.e();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objE;
    }

    public static /* synthetic */ void ao(Object obj, qfh qfhVar, qhd qhdVar) {
        try {
            qhdVar.i(qfhVar.a(obj));
        } catch (qgg e) {
            qhdVar.j(e);
        } catch (Throwable th) {
            qhdVar.j(qgg.a(th));
        }
    }

    public static qfz ap() {
        rnt.B(true, "maxPendingEventCount must be > 0");
        return new qfz();
    }

    public static /* synthetic */ awu aq(cdo cdoVar, cdo cdoVar2, cdo cdoVar3, cdo cdoVar4, cdo cdoVar5, cdo cdoVar6, cdo cdoVar7, cdo cdoVar8, cdo cdoVar9, cdo cdoVar10, cdo cdoVar11, cdo cdoVar12, cdo cdoVar13, cdo cdoVar14, cdo cdoVar15, cdo cdoVar16, cdo cdoVar17, cdo cdoVar18, cdo cdoVar19, cdo cdoVar20, cdo cdoVar21, cdo cdoVar22, cdo cdoVar23, cdo cdoVar24, cdo cdoVar25, cdo cdoVar26, cdo cdoVar27, cdo cdoVar28, cdo cdoVar29, cdo cdoVar30) {
        cdoVar.getClass();
        cdoVar2.getClass();
        cdoVar3.getClass();
        cdoVar4.getClass();
        cdoVar5.getClass();
        cdoVar6.getClass();
        cdoVar7.getClass();
        cdoVar8.getClass();
        cdoVar9.getClass();
        cdoVar10.getClass();
        cdoVar11.getClass();
        cdoVar12.getClass();
        cdoVar13.getClass();
        cdoVar14.getClass();
        cdoVar15.getClass();
        cdoVar16.getClass();
        cdoVar17.getClass();
        cdoVar18.getClass();
        cdoVar19.getClass();
        cdoVar20.getClass();
        cdoVar21.getClass();
        cdoVar22.getClass();
        cdoVar23.getClass();
        cdoVar24.getClass();
        cdoVar25.getClass();
        cdoVar26.getClass();
        cdoVar27.getClass();
        cdoVar28.getClass();
        cdoVar29.getClass();
        cdoVar30.getClass();
        return new awu(cdoVar, cdoVar2, cdoVar3, cdoVar4, cdoVar5, cdoVar6, cdoVar7, cdoVar8, cdoVar9, cdoVar10, cdoVar11, cdoVar12, cdoVar13, cdoVar14, cdoVar15, cdoVar16, cdoVar17, cdoVar18, cdoVar19, cdoVar20, cdoVar21, cdoVar22, cdoVar23, cdoVar24, cdoVar25, cdoVar26, cdoVar27, cdoVar28, cdoVar29, cdoVar30);
    }

    public static void ar(avp avpVar, awh awhVar, awo awoVar, awu awuVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(2124579738);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(avpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(awhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(awoVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(awuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 8192 : 16384;
        }
        if ((i2 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.s();
            if ((i & 1) != 0 && !aycVarC.E()) {
                aycVarC.r();
            }
            aycVarC.l();
            awd.b(avpVar, awhVar, awoVar, awuVar, bdq.k(1798917965, new apf((Object) as(avpVar, aycVarC), uiuVar, 3), aycVarC), aycVarC, (i2 & 7168) | (i2 & 14) | 24576 | (i2 & ScriptIntrinsicBLAS.TRANSPOSE) | (i2 & 896));
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new awb(avpVar, awhVar, awoVar, awuVar, uiuVar, i, 6);
        }
    }

    public static arp as(avp avpVar, ayc aycVar) {
        aycVar.u(-816036754);
        aycVar.u(5004770);
        long j = avpVar.a;
        boolean zA = aycVar.A(j);
        ayg aygVar = (ayg) aycVar;
        Object objR = aygVar.R();
        if (zA || objR == ayb.a) {
            objR = new arp(j, bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.4f, bkv.f(j)));
            aygVar.ac(objR);
        }
        arp arpVar = (arp) objR;
        aygVar.Y();
        aygVar.Y();
        return arpVar;
    }

    public static void at(avp avpVar, awo awoVar, awu awuVar, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        awo awoVar2;
        awu awuVarAq;
        awo awoVar3;
        awu awuVar2;
        uiuVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(648134875);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(avpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 1024 : 2048;
        }
        if ((i2 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            awoVar3 = awoVar;
            awuVar2 = awuVar;
        } else {
            int i4 = i2 & (-1009);
            aycVarC.s();
            if ((i & 1) == 0 || aycVarC.E()) {
                awo awoVar4 = psq.a;
                cdo cdoVar = psz.a;
                cdo cdoVar2 = psz.d;
                cdo cdoVar3 = psz.e;
                cdo cdoVar4 = psz.f;
                cdo cdoVar5 = psz.g;
                cdo cdoVar6 = psz.h;
                cdo cdoVar7 = psz.i;
                cdo cdoVar8 = psz.m;
                cdo cdoVar9 = psz.n;
                cdo cdoVar10 = psz.o;
                cdo cdoVar11 = psz.a;
                cdo cdoVar12 = psz.b;
                cdo cdoVar13 = psz.c;
                cdo cdoVar14 = psz.j;
                cdo cdoVar15 = psz.k;
                cdo cdoVar16 = psz.l;
                cdo cdoVar17 = psy.a;
                awoVar2 = awoVar4;
                awuVarAq = aq(cdoVar2, cdoVar3, cdoVar4, cdoVar5, cdoVar6, cdoVar7, cdoVar8, cdoVar9, cdoVar10, cdoVar11, cdoVar12, cdoVar13, cdoVar14, cdoVar15, cdoVar16, psy.d, psy.e, psy.f, psy.g, psy.h, psy.i, psy.m, psy.n, psy.o, psy.a, psy.b, psy.c, psy.j, psy.k, psy.l);
            } else {
                aycVarC.r();
                awoVar2 = awoVar;
                awuVarAq = awuVar;
            }
            aycVarC.l();
            ar(avpVar, new pso(), awoVar2, awuVarAq, uiuVar, aycVarC, (i2 & 14) | ((i4 << 3) & 57344));
            awoVar3 = awoVar2;
            awuVar2 = awuVarAq;
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dms(avpVar, awoVar3, awuVar2, uiuVar, i, 4);
        }
    }

    public static int au(int i, Context context) throws Resources.NotFoundException {
        return new rkg(context).a(Q(context, R.attr.colorSurface, 0), context.getResources().getDimension(i));
    }

    public static syu av(oor oorVar) {
        final prw prwVar = new prw(oorVar);
        oorVar.i(sxo.a, new oom() { // from class: prv
            @Override // defpackage.oom
            public final void a(oor oorVar2) {
                boolean z = ((oow) oorVar2).c;
                prw prwVar2 = prwVar;
                if (z) {
                    prwVar2.cancel(false);
                    return;
                }
                if (oorVar2.f()) {
                    prwVar2.e(oorVar2.d());
                    return;
                }
                Exception excC = oorVar2.c();
                if (excC == null) {
                    throw new IllegalStateException();
                }
                prwVar2.a(excC);
            }
        });
        return prwVar;
    }

    public static long aw() {
        return pqy.a ? SystemClock.elapsedRealtimeNanos() : SystemClock.elapsedRealtime() * 1000000;
    }

    public static long ax(int i, pas pasVar) {
        int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
        if (bitsPerPixel <= 0 && i == 257) {
            bitsPerPixel = 16;
            i = 257;
        }
        long j = pasVar.b;
        int i2 = pasVar.a;
        if (bitsPerPixel <= 0 && (i == 4101 || i == 1212500294 || i == 1768253795 || i == 33 || i == 256)) {
            return (((i2 * 24) * j) / 8) / 4;
        }
        if (bitsPerPixel <= 0 && i == 34) {
            bitsPerPixel = ImageFormat.getBitsPerPixel(35);
        }
        return ((i2 * Math.max(bitsPerPixel, 0)) * j) / 8;
    }

    public static void az(String str, pmq[] pmqVarArr, pmq[] pmqVarArr2) {
        if (Arrays.equals(pmqVarArr, pmqVarArr2)) {
            return;
        }
        throw new IllegalArgumentException(str + " has: " + Arrays.toString(pmqVarArr) + " which is different from: " + Arrays.toString(pmqVarArr2));
    }

    public static boolean bA(pas pasVar, Set set) {
        return set.contains(pasVar.a + "x" + pasVar.b);
    }

    public static int bB(int i) {
        return i - 1;
    }

    public static int bC(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new rxd(a.bv(i, "Unknown video aspect ratio "));
    }

    public static int bD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new IllegalArgumentException("unknown squad mode");
    }

    public static int bE(int i) {
        if (i != 0) {
            return i != 2 ? 2 : 3;
        }
        return 1;
    }

    public static int bF(int i) {
        return i - 2;
    }

    public static int bG(int i) {
        return i - 1;
    }

    public static int bH(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        throw new RuntimeException(a.bv(i, "Unknown aspect ratio "));
    }

    public static pae bI(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? pae.c : pae.a : pae.b;
    }

    public static float bJ(lnx lnxVar, Collection collection) {
        Iterator it = collection.iterator();
        long j = Long.MAX_VALUE;
        while (it.hasNext()) {
            lnx lnxVar2 = (lnx) it.next();
            if (lnxVar != lnxVar2) {
                long jAbs = Math.abs(TimeUnit.MILLISECONDS.convert(lnxVar.a - lnxVar2.a, TimeUnit.NANOSECONDS));
                if (jAbs < j) {
                    j = jAbs;
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            return 0.0f;
        }
        return j;
    }

    public static HashMap bK(loh[] lohVarArr) {
        HashMap map = new HashMap();
        for (loh lohVar : lohVarArr) {
            rwc rwcVar = lohVar.k;
            if (rwcVar.h()) {
                map.put(Integer.valueOf((int) lohVar.a), rwcVar.c());
            }
        }
        return map;
    }

    public static lno bL(poc pocVar, Rect rect, Rect rect2) {
        Rect rectL = pocVar.l();
        PointF pointFG = pocVar.g();
        PointF pointFK = pocVar.k();
        PointF pointFH = pocVar.h();
        PointF pointFI = pocVar.i();
        PointF pointFF = pocVar.f();
        PointF pointFJ = pocVar.j();
        return new lno(pocVar.d(), rectL != null ? bN(rectL, rect, rect2) : null, pocVar.e(), pointFG != null ? bM(pocVar.g(), rect, rect2) : null, pointFK != null ? bM(pocVar.k(), rect, rect2) : null, pointFH != null ? bM(pocVar.h(), rect, rect2) : null, pointFI != null ? bM(pocVar.i(), rect, rect2) : null, pointFF != null ? bM(pocVar.f(), rect, rect2) : null, pointFJ != null ? bM(pocVar.j(), rect, rect2) : null, pocVar.c(), pocVar.a(), pocVar.b());
    }

    public static PointF bM(PointF pointF, Rect rect, Rect rect2) {
        return new PointF(cA(pointF.x, rect, rect2), cB(pointF.y, rect, rect2));
    }

    public static Rect bN(Rect rect, Rect rect2, Rect rect3) {
        return new Rect(Math.round(cA(rect.left, rect2, rect3)), Math.round(cB(rect.top, rect2, rect3)), Math.round(cA(rect.right, rect2, rect3)), Math.round(cB(rect.bottom, rect2, rect3)));
    }

    public static String bO(long j, String str, String str2) {
        if (j <= 0) {
            return "∞";
        }
        float f = j;
        int iMax = Math.max(1, Math.round(1.0E9f / f));
        if (iMax > 1) {
            return String.format(Locale.US, str, Integer.valueOf(iMax));
        }
        return String.format(Locale.US, str2, Integer.valueOf(Math.max(1, Math.round(f / 1.0E9f))));
    }

    public static String bP(long j) {
        return bO(j, "1/%d", "%d");
    }

    public static String bQ(long j) {
        return bP(j).concat("s");
    }

    public static pjo bR(lkk lkkVar, nms nmsVar, boolean z) {
        int iOrdinal = lkkVar.ordinal();
        if (iOrdinal == 1) {
            return z ? nmsVar.j() : nmsVar.i();
        }
        if (iOrdinal == 2) {
            return z ? nmsVar.h() : nmsVar.g();
        }
        if (iOrdinal != 3) {
            return null;
        }
        return z ? nmsVar.f() : nmsVar.e();
    }

    public static npo bS(ljd ljdVar) {
        return new npo(ljdVar, ljdVar.c, npm.ARK_PEAK);
    }

    public static boolean bT(Integer num) {
        return num.equals(Integer.valueOf(ltq.OFF_FAR.f)) || num.equals(Integer.valueOf(ltq.OFF_NEAR.f)) || num.equals(Integer.valueOf(ltq.OFF_INFINITY.f));
    }

    public static lgz bU(lgi lgiVar) {
        AssetData assetData = lgiVar.b;
        if (assetData == null) {
            return lgz.a;
        }
        tpc tpcVarM = lgz.a.m();
        int iAssetData_fd_get = GcamModuleJNI.AssetData_fd_get(assetData.a, assetData);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        lgz lgzVar = (lgz) tpcVarM.b;
        lgzVar.b |= 1;
        lgzVar.c = iAssetData_fd_get;
        int iAssetData_offset_get = GcamModuleJNI.AssetData_offset_get(assetData.a, assetData);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        lgz lgzVar2 = (lgz) tpcVarM.b;
        lgzVar2.b |= 2;
        lgzVar2.d = iAssetData_offset_get;
        int iAssetData_length_get = GcamModuleJNI.AssetData_length_get(assetData.a, assetData);
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        lgz lgzVar3 = (lgz) tpcVarM.b;
        lgzVar3.b |= 4;
        lgzVar3.e = iAssetData_length_get;
        return (lgz) tpcVarM.l();
    }

    public static syu bV(final lgk lgkVar, final rwc rwcVar, final String str, final boolean z, Executor executor) {
        return ske.Q(new Callable() { // from class: lgr
            public final /* synthetic */ String c = "";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                NativePortraitPreviewProcessor nativePortraitPreviewProcessor = new NativePortraitPreviewProcessor();
                lgk lgkVar2 = lgkVar;
                String str2 = this.c;
                rwc rwcVar2 = rwcVar;
                boolean z2 = z;
                lgi lgiVarA = lgkVar2.a(str);
                try {
                    lgi lgiVarA2 = lgkVar2.a(str2);
                    try {
                        tpc tpcVarM = lha.a.m();
                        String str3 = Build.MANUFACTURER;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        lha lhaVar = (lha) tpcVarM.b;
                        str3.getClass();
                        lhaVar.b |= 2;
                        lhaVar.d = str3;
                        String str4 = Build.DEVICE;
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        lha lhaVar2 = (lha) tpcVarM.b;
                        str4.getClass();
                        lhaVar2.b |= 4;
                        lhaVar2.e = str4;
                        lgz lgzVarBU = qpt.bU(lgiVarA);
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar = tpcVarM.b;
                        lha lhaVar3 = (lha) tphVar;
                        lgzVarBU.getClass();
                        lhaVar3.c = lgzVarBU;
                        lhaVar3.b |= 1;
                        if (!tphVar.C()) {
                            tpcVarM.o();
                        }
                        lha lhaVar4 = (lha) tpcVarM.b;
                        lhaVar4.b |= 8;
                        lhaVar4.f = false;
                        String str5 = (String) rwcVar2.b(new idb(16)).e("");
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        tph tphVar2 = tpcVarM.b;
                        lha lhaVar5 = (lha) tphVar2;
                        lhaVar5.b = 16 | lhaVar5.b;
                        lhaVar5.g = str5;
                        if (!tphVar2.C()) {
                            tpcVarM.o();
                        }
                        lha lhaVar6 = (lha) tpcVarM.b;
                        lhaVar6.b |= 32;
                        lhaVar6.h = z2;
                        lgz lgzVarBU2 = qpt.bU(lgiVarA2);
                        if (!tpcVarM.b.C()) {
                            tpcVarM.o();
                        }
                        lha lhaVar7 = (lha) tpcVarM.b;
                        lgzVarBU2.getClass();
                        lhaVar7.i = lgzVarBU2;
                        lhaVar7.b |= 64;
                        nativePortraitPreviewProcessor.a = NativePortraitPreviewProcessor.create(((lha) tpcVarM.l()).h());
                        if (lgiVarA2 != null) {
                            lgiVarA2.close();
                        }
                        if (lgiVarA != null) {
                            lgiVarA.close();
                        }
                        return nativePortraitPreviewProcessor;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (lgiVarA != null) {
                        try {
                            lgiVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }, executor);
    }

    public static boolean bW(hbj hbjVar) {
        return hbjVar.p(hak.g);
    }

    public static rwc bX(ldd lddVar, lcz lczVar) {
        lczVar.getClass();
        return rwc.i(lddVar.a(lczVar));
    }

    public static String bY(lcz lczVar, pdv pdvVar) {
        pjr pjrVarD;
        if (lczVar.equals(lcz.RAW_WIDE_UPPER)) {
            return gzc.a;
        }
        if (lczVar.equals(lcz.RAW_WIDE_RM_UPPER)) {
            return gzc.b;
        }
        if (lczVar.equals(lcz.RAW_TELE_PLUS)) {
            return hbb.a;
        }
        Iterator it = pdvVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                pjrVarD = null;
                break;
            }
            peo peoVar = (peo) it.next();
            if (ske.ag(lbb.a).contains(Integer.valueOf(peoVar.a()))) {
                pjrVarD = peoVar.d();
                break;
            }
        }
        if (pjrVarD != null) {
            return pjrVarD.a;
        }
        return null;
    }

    public static /* synthetic */ Map.Entry bZ(Object obj, Object obj2) {
        obj.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public static void bb(final List list, final nkx nkxVar, final mxm mxmVar, final adt adtVar, final boolean z, final boolean z2, final uiu uiuVar, final long j, final long j2, final float f, final float f2, final aus ausVar, final boolean z3, ayc aycVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z4;
        bik bikVarAe;
        ayc aycVar2;
        ayg aygVar;
        int i5 = i & 6;
        ayc aycVarC = aycVar.c(1163098486);
        if (i5 == 0) {
            i3 = (true != aycVarC.D(list) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.z(nkxVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.z(mxmVar.ordinal()) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != aycVarC.B(adtVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != aycVarC.C(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != aycVarC.C(z2) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != aycVarC.A(j) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != aycVarC.A(j2) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != aycVarC.y(f) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != aycVarC.y(f2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            z4 = true;
            i4 |= true != aycVarC.z(0) ? 16 : 32;
        } else {
            z4 = true;
        }
        if ((i2 & 384) == 0) {
            i4 |= z4 != aycVarC.B(ausVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= z4 != aycVarC.C(z3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= z4 == aycVarC.y(0.0f) ? 16384 : 8192;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 9363) == 9362 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            int i6 = 234881024 & i3;
            int i7 = 29360128 & i3;
            int i8 = i3 & 3670016;
            int i9 = i3 & 57344;
            int i10 = i3 & ScriptIntrinsicBLAS.TRANSPOSE;
            aycVarC.u(-1928366500);
            final int iE = bd(aycVarC).e(aycVarC);
            aycVarC.u(1046175980);
            if (z2) {
                aycVarC.u(1849434622);
                ayg aygVar2 = (ayg) aycVarC;
                Object objR = aygVar2.R();
                if (objR == ayb.a) {
                    objR = new dvj(14);
                    aygVar2.ac(objR);
                }
                aygVar2.Y();
                int i11 = cbp.a;
                bikVarAe = new ClearAndSetSemanticsElement((uiq) objR);
            } else {
                bikVarAe = bay.ae(bik.c);
            }
            bik bikVar = bikVarAe;
            ayg aygVar3 = (ayg) aycVarC;
            aygVar3.Y();
            akl aklVarC = akq.c(f2);
            aycVarC.u(-1224400529);
            boolean zD = (i10 == 32) | aycVarC.D(list);
            boolean z5 = i9 == 16384;
            boolean z6 = i8 == 1048576;
            boolean z7 = (i3 & 896) == 256;
            boolean z8 = z6;
            boolean z9 = (i3 & 7168) == 2048;
            boolean z10 = (i4 & 896) == 256;
            boolean z11 = i7 == 8388608;
            boolean z12 = z9 | z5 | zD | z8 | z7 | z10 | z11 | (i6 == 67108864) | ((i3 & 1879048192) == 536870912) | aycVarC.z(iE);
            Object objR2 = aygVar3.R();
            if (z12 || objR2 == ayb.a) {
                aycVar2 = aycVarC;
                aygVar = aygVar3;
                uiq uiqVar = new uiq() { // from class: nel
                    @Override // defpackage.uiq
                    public final Object a(Object obj) {
                        ocq ocqVar = (ocq) obj;
                        ocqVar.getClass();
                        List list2 = list;
                        ocqVar.az(list2.size(), new gvz(list2, 2), new bfh(802480018, true, new Cnew(list2, nkxVar, z, uiuVar, mxmVar, adtVar, ausVar, j, j2, f, iE)));
                        return ufg.a;
                    }
                };
                aygVar.ac(uiqVar);
                objR2 = uiqVar;
            } else {
                aycVar2 = aycVarC;
                aygVar = aygVar3;
            }
            aygVar.Y();
            byi.ay(bikVar, null, null, aklVarC, null, null, false, null, (uiq) objR2, aycVar2, 0, 494);
            aygVar.Y();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: nem
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    nkx nkxVar2 = nkxVar;
                    mxm mxmVar2 = mxmVar;
                    adt adtVar2 = adtVar;
                    boolean z13 = z;
                    boolean z14 = z2;
                    uiu uiuVar2 = uiuVar;
                    long j3 = j;
                    long j4 = j2;
                    float f3 = f;
                    float f4 = f2;
                    aus ausVar2 = ausVar;
                    int i12 = i;
                    qpt.bb(list2, nkxVar2, mxmVar2, adtVar2, z13, z14, uiuVar2, j3, j4, f3, f4, ausVar2, z3, (ayc) obj, bay.j(i12 | 1), bay.j(i2));
                    return ufg.a;
                }
            };
        }
    }

    public static void bc(final List list, final nkx nkxVar, final adt adtVar, final boolean z, final mxm mxmVar, final uiu uiuVar, final aus ausVar, final boolean z2, final long j, final long j2, final long j3, final boolean z3, ayc aycVar, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        aus ausVar2;
        int i4;
        boolean z4;
        long j4;
        int i5;
        ayc aycVar2;
        int i6 = i & 6;
        ayc aycVarC = aycVar.c(-1543734387);
        if (i6 == 0) {
            i3 = (true != aycVarC.D(list) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != aycVarC.z(nkxVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != aycVarC.B(adtVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != aycVarC.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != aycVarC.z(mxmVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != aycVarC.D(uiuVar) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            ausVar2 = ausVar;
            i4 = 32;
            i3 |= true != aycVarC.B(ausVar2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            ausVar2 = ausVar;
            i4 = 32;
        }
        if ((12582912 & i) == 0) {
            z4 = z2;
            i3 |= true != aycVarC.C(z4) ? 4194304 : 8388608;
        } else {
            z4 = z2;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != aycVarC.z(0) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != aycVarC.A(j) ? 268435456 : 536870912;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            j4 = j2;
            i5 = (true != aycVarC.A(j4) ? 2 : 4) | i2;
        } else {
            j4 = j2;
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != aycVarC.A(j3) ? 16 : i4;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != aycVarC.C(z3) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i5 |= true != aycVarC.y(0.0f) ? 1024 : 2048;
        }
        if ((i7 & 306783379) == 306783378 && (i5 & 1171) == 1170 && aycVarC.G()) {
            aycVarC.r();
            aycVar2 = aycVarC;
        } else {
            float fC = byx.c(bd(aycVarC).f(aycVarC), aycVarC);
            Resources resources = (Resources) aycVarC.e(AndroidCompositionLocals_androidKt.c);
            final ujx ujxVar = new ujx();
            ujxVar.a = 0.0f;
            final ujx ujxVar2 = new ujx();
            final uka ukaVar = new uka();
            final ujz ujzVar = new ujz();
            ujzVar.a = (Float.floatToRawIntBits(0.0f) << i4) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
            aycVarC.u(1119932590);
            ujxVar.a = (byx.c(R.dimen.icon_button_width, aycVarC) - byx.c(R.dimen.icon_inner_size, aycVarC)) / 2.0f;
            long jT = a.t(byx.c(R.dimen.icon_button_width, aycVarC), byx.c(R.dimen.icon_button_height, aycVarC));
            long jT2 = a.t(byx.c(R.dimen.icon_size, aycVarC), byx.c(R.dimen.icon_size, aycVarC));
            ujxVar2.a = resources.getDimensionPixelSize(bd(aycVarC).d(aycVarC));
            float dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.background_width);
            float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.icon_inner_size);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(bd(aycVarC).e(aycVarC));
            ujzVar.a = (Float.floatToRawIntBits(dimensionPixelSize2 + dimensionPixelSize3 + dimensionPixelSize3) & 4294967295L) | (Float.floatToRawIntBits(dimensionPixelSize) << i4);
            aycVarC.u(-1764953845);
            float fDk = ((chq) aycVarC.e(bze.c)).dk(byx.c(R.dimen.icon_inner_size, aycVarC) + byx.c(bd(aycVarC).f(aycVarC), aycVarC));
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            nee neeVar = new nee(fDk, a.t(byx.c(R.dimen.icon_inner_size, aycVarC), byx.c(R.dimen.icon_inner_size, aycVarC)), j4, j3, aii.b);
            aygVar.Y();
            bih bihVar = bik.c;
            aycVarC.u(1849434622);
            Object objR = aygVar.R();
            if (objR == ayb.a) {
                objR = new aks(19);
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarB = bdq.B(amd.i(cbp.b(bihVar, false, (uiq) objR), bib.j, 2), new uiq() { // from class: nen
                @Override // defpackage.uiq
                public final Object a(Object obj) {
                    bvo bvoVar = (bvo) obj;
                    bvoVar.getClass();
                    long j5 = bkv.a;
                    uka ukaVar2 = ukaVar;
                    ujz ujzVar2 = ujzVar;
                    ujx ujxVar3 = ujxVar2;
                    ujx ujxVar4 = ujxVar;
                    qpt.aW(bvoVar, j5, 0, ujxVar4.a, ujxVar3.a, ujzVar2.a, (neb) ukaVar2.a, 1);
                    bvoVar.p();
                    qpt.aW(bvoVar, j, 4, ujxVar4.a, ujxVar3.a, ujzVar2.a, (neb) ukaVar2.a, 1);
                    return ufg.a;
                }
            });
            bsr bsrVarC = aku.c(bib.f, false);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar.ag();
            bik bikVarV = bay.v(aycVarC, bikVarB);
            uif uifVar = bum.a;
            aycVarC.v();
            if (aygVar.v) {
                aycVarC.j(uifVar);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarC, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar2 = bum.e;
            if (aygVar.v || !a.ao(aygVar.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar2);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            int i8 = i7 >> 6;
            int i9 = i7 << 3;
            int i10 = i5 << 3;
            aycVar2 = aycVarC;
            bb(list, nkxVar, mxmVar, adtVar, z, z4, uiuVar, jT, jT2, ujxVar.a, fC, ausVar2, z3, aycVar2, (i8 & ImageMetadata.JPEG_GPS_COORDINATES) | (i7 & 126) | (i8 & 896) | (i9 & 7168) | (57344 & i9) | (i9 & 3670016), ((i7 >> 21) & ScriptIntrinsicBLAS.TRANSPOSE) | ((i7 >> 12) & 896) | (i10 & 7168) | (57344 & i10));
            aV(list, ausVar, neeVar, null, ujxVar.a, z, aycVar2, (i7 & 14) | ((i7 >> 15) & ScriptIntrinsicBLAS.TRANSPOSE) | (458752 & (i7 << 6)));
            aycVar2.m();
        }
        bai baiVarI = aycVar2.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: neo
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    nkx nkxVar2 = nkxVar;
                    adt adtVar2 = adtVar;
                    boolean z5 = z;
                    mxm mxmVar2 = mxmVar;
                    uiu uiuVar3 = uiuVar;
                    aus ausVar3 = ausVar;
                    boolean z6 = z2;
                    long j5 = j;
                    long j6 = j2;
                    long j7 = j3;
                    int i11 = i;
                    qpt.bc(list2, nkxVar2, adtVar2, z5, mxmVar2, uiuVar3, ausVar3, z6, j5, j6, j7, z3, (ayc) obj, bay.j(i11 | 1), bay.j(i2));
                    return ufg.a;
                }
            };
        }
    }

    public static neg bd(ayc aycVar) {
        return (neg) aycVar.e(nej.a);
    }

    public static void be(ayc aycVar) {
        aycVar.u(1624919226);
        aycVar.n();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public static Map bf(List list) {
        EnumMap enumMap = new EnumMap(ncn.class);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mwq mwqVar = (mwq) it.next();
            Iterator it2 = mwqVar.b.iterator();
            while (it2.hasNext()) {
                Object objComputeIfAbsent = Map.EL.computeIfAbsent(enumMap, (ncn) it2.next(), new gwl(new aks(18), 5));
                objComputeIfAbsent.getClass();
                EnumMap enumMap2 = (EnumMap) objComputeIfAbsent;
                for (Map.Entry entry : mwqVar.a.entrySet()) {
                    enumMap2.put((EnumMap) entry.getKey(), (ncn) entry.getValue());
                }
            }
        }
        return ujp.av(enumMap);
    }

    public static mwq bg(ncn ncnVar, List list) {
        ncnVar.getClass();
        mwq mwqVar = new mwq(ncnVar);
        list.add(mwqVar);
        return mwqVar;
    }

    public static Size bh(Context context, Display display) {
        Display.Mode mode = display.getMode();
        return new Size(cy(context, mode.getPhysicalWidth()), cy(context, mode.getPhysicalHeight()));
    }

    public static mxj bi(Context context, Display display, pnq pnqVar) {
        return bk(context, display, null, null, null, pnqVar, null);
    }

    public static boolean bj(Context context, Display display) {
        return bi(context, display, null).equals(mxj.SIMPLIFIED_LAYOUT);
    }

    public static mxj bk(Context context, Display display, hbj hbjVar, nkw nkwVar, muj mujVar, pnq pnqVar, Boolean bool) {
        if (((Activity) context).isInMultiWindowMode()) {
            return (pnqVar == null || !pnqVar.k()) ? bh(context, display).getWidth() > 580 ? mxj.PHONE_LAYOUT : mxj.SIMPLIFIED_LAYOUT : mxj.TABLET_LAYOUT;
        }
        if (nkwVar != null && ((nkwVar == nkw.PHOTO || nkwVar == nkw.VIDEO || nkwVar == nkw.SLOW_MOTION || nkwVar == nkw.PORTRAIT || nkwVar == nkw.IMAGE_INTENT || nkwVar == nkw.VIDEO_INTENT || nkwVar == nkw.LANDSCAPE || nkwVar == nkw.ACTION_PAN || nkwVar == nkw.NIGHT_SIGHT || nkwVar == nkw.TIME_LAPSE || nkwVar == nkw.SETTINGS || nkwVar == nkw.AMBER || nkwVar == nkw.ROOSTER || nkwVar == nkw.VIDEO_NIGHT_SIGHT) && hbjVar != null && hbjVar.p(gza.f) && mujVar != null && mujVar.b == 5)) {
            return mxj.JARVIS_LAYOUT;
        }
        Size sizeBh = bh(context, display);
        return sizeBh.getHeight() < 600 ? mxj.SIMPLIFIED_LAYOUT : sizeBh.getWidth() > 580 ? (bool == null || !bool.booleanValue()) ? mxj.TABLET_LAYOUT : mxj.PHONE_LAYOUT : mxj.PHONE_LAYOUT;
    }

    public static muj bl() {
        return new muj(2, rvk.a);
    }

    public static muj bm() {
        return new muj(4, rvk.a);
    }

    public static muj bn() {
        return new muj(1, rvk.a);
    }

    public static boolean bo(muj mujVar, muj mujVar2) {
        return (mujVar == null || mujVar2 == null || cz(mujVar) == cz(mujVar2)) ? false : true;
    }

    public static int bp(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 5;
        }
        return 3;
    }

    public static spo bq(boolean z, int i, int i2) {
        tpc tpcVarM = spo.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        spo spoVar = (spo) tphVar;
        spoVar.b |= 2;
        spoVar.d = z;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        tph tphVar2 = tpcVarM.b;
        spo spoVar2 = (spo) tphVar2;
        spoVar2.b |= 4;
        spoVar2.e = i;
        int iBp = bp(i2);
        if (!tphVar2.C()) {
            tpcVarM.o();
        }
        spo spoVar3 = (spo) tpcVarM.b;
        spoVar3.c = iBp - 1;
        spoVar3.b |= 1;
        return (spo) tpcVarM.l();
    }

    public static void br(final mte mteVar, final boolean z, ayc aycVar, final int i) {
        int i2;
        mteVar.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-2088612489);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(mteVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.C(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && aycVarC.G()) {
            aycVarC.r();
        } else {
            adt adtVarBg = byi.bg(217, 217, null, 4);
            byi.bm(((Boolean) mteVar.h.a()).booleanValue(), null, aav.e(adtVarBg, 2), aav.f(adtVarBg, 2), null, bdq.k(-1467301297, new msu(z, mteVar), aycVarC), aycVarC, 200064, 18);
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: msq
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    mte mteVar2 = mteVar;
                    int i4 = i;
                    qpt.br(mteVar2, z, (ayc) obj, bay.j(i4 | 1));
                    return ufg.a;
                }
            };
        }
    }

    @ueo
    public static void bs(final String str, final String str2, final String str3, final Integer num, final uif uifVar, final boolean z, final boolean z2, final mxm mxmVar, final mxm mxmVar2, final boolean z3, ayc aycVar, final int i) {
        int i2;
        long j;
        long jE;
        bih bihVar;
        ayg aygVar;
        Object obj;
        long j2;
        int i3;
        int i4;
        ayg aygVar2;
        ayg aygVar3;
        str2.getClass();
        uifVar.getClass();
        mxmVar.getClass();
        mxmVar2.getClass();
        int i5 = i & 6;
        ayc aycVarC = aycVar.c(-583381260);
        if (i5 == 0) {
            i2 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.B(str2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.B(str3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(num) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uifVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.C(z) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != aycVarC.C(z2) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != aycVarC.z(mxmVar.ordinal()) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != aycVarC.z(mxmVar2.ordinal()) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != aycVarC.C(z3) ? 268435456 : 536870912;
        }
        if ((306783379 & i2) == 306783378 && aycVarC.G()) {
            aycVarC.r();
        } else {
            if (z) {
                aycVarC.u(-2073043404);
                j = bay.O(aycVarC).d;
                ((ayg) aycVarC).Y();
            } else {
                aycVarC.u(-2072980195);
                j = bay.O(aycVarC).q;
                ((ayg) aycVarC).Y();
            }
            long j3 = j;
            ujx ujxVar = new ujx();
            bih bihVar2 = bik.c;
            bik bikVarA = awa.a(bihVar2);
            aycVarC.u(1849434622);
            ayg aygVar4 = (ayg) aycVarC;
            Object objR = aygVar4.R();
            Object obj2 = ayb.a;
            if (objR == obj2) {
                objR = new ocq((char[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                aygVar4.ac(objR);
            }
            ocq ocqVar = (ocq) objR;
            aygVar4.Y();
            cbk cbkVar = new cbk(0);
            aycVarC.u(5004770);
            int i6 = i2 & 57344;
            Object objR2 = aygVar4.R();
            if (i6 == 16384 || objR2 == obj2) {
                objR2 = new dus(uifVar, 10);
                aygVar4.ac(objR2);
            }
            aygVar4.Y();
            bik bikVarAG = byi.aG(byi.bK(bikVarA, ocqVar, null, z2, cbkVar, (uif) objR2, 8), byx.c(R.dimen.creative_button_touch_target_padding, aycVarC));
            aycVarC.u(5004770);
            int i7 = 1879048192 & i2;
            Object objR3 = aygVar4.R();
            if (i7 == 536870912 || objR3 == obj2) {
                objR3 = new net(z3, 1);
                aygVar4.ac(objR3);
            }
            aygVar4.Y();
            bik bikVarC = bdq.C(amd.i(cbp.b(bikVarAG, false, (uiq) objR3), bib.j, 2), aqa.a(byx.c(R.dimen.creative_button_corner_radius, aycVarC)));
            if (z) {
                aycVarC.u(-2072225686);
                jE = bay.O(aycVarC).c;
                aygVar4.Y();
            } else {
                aycVarC.u(-2072151782);
                jE = byx.e(R.color.camera_protection_background_opaque, aycVarC);
                aygVar4.Y();
            }
            bik bikVarA2 = bqh.a(byi.aG(byi.aR(bikVarC, jE, bll.a), byx.c(R.dimen.creative_button_padding, aycVarC)), ufg.a, new msz(ujxVar, uifVar));
            bsr bsrVarA = ama.a(akq.c(byx.c(R.dimen.creative_button_spacing, aycVarC)), bib.b, aycVarC, 48);
            int iR = a.r(bay.N(aycVarC));
            bfk bfkVarAg = aygVar4.ag();
            bik bikVarV = bay.v(aycVarC, bikVarA2);
            uif uifVar2 = bum.a;
            aycVarC.v();
            if (aygVar4.v) {
                aycVarC.j(uifVar2);
            } else {
                aycVarC.x();
            }
            bbr.a(aycVarC, bsrVarA, bum.d);
            bbr.a(aycVarC, bfkVarAg, bum.c);
            uiu uiuVar = bum.e;
            if (aygVar4.v || !a.ao(aygVar4.R(), Integer.valueOf(iR))) {
                Integer numValueOf = Integer.valueOf(iR);
                aygVar4.ac(numValueOf);
                aycVarC.h(numValueOf, uiuVar);
            }
            bbr.a(aycVarC, bikVarV, bum.b);
            aycVarC.u(-1220115449);
            if (num != null) {
                num.intValue();
                bihVar = bihVar2;
                aygVar = aygVar4;
                obj = obj2;
                i3 = 5004770;
                i4 = 14;
                avx.a(byx.d(num.intValue(), aycVarC, (i2 >> 9) & 14), str2, amd.c(bdq.z(bihVar, ((Number) abu.a(aM(mxmVar2), ojl.bn(mxmVar, mxmVar2, false), null, aycVarC, 0, 28).a()).floatValue()), byx.c(R.dimen.creative_button_icon_size, aycVarC)), j3, aycVarC, i2 & ScriptIntrinsicBLAS.TRANSPOSE, 0);
                j2 = j3;
                aycVarC = aycVarC;
            } else {
                bihVar = bihVar2;
                aygVar = aygVar4;
                obj = obj2;
                j2 = j3;
                i3 = 5004770;
                i4 = 14;
            }
            aygVar.Y();
            aycVarC.u(-1220092264);
            if (str == null) {
                aygVar3 = aygVar;
            } else {
                long jC = chp.C(i4);
                aycVarC.u(i3);
                int i8 = i2 & 896;
                Object objR4 = aygVar.R();
                if (i8 == 256 || objR4 == obj) {
                    objR4 = new gvx(str3, 20);
                    aygVar2 = aygVar;
                    aygVar2.ac(objR4);
                } else {
                    aygVar2 = aygVar;
                }
                aygVar2.Y();
                ayc aycVar2 = aycVarC;
                aygVar3 = aygVar2;
                awt.b(str, cbp.b(bihVar, false, (uiq) objR4), j2, jC, null, 0L, 0L, 0, false, 0, 0, null, aycVar2, (i2 & 14) | 3072, 0, 131056);
                aycVarC = aycVar2;
            }
            aygVar3.Y();
            aycVarC.m();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: msr
                @Override // defpackage.uiu
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    Integer num2 = num;
                    uif uifVar3 = uifVar;
                    boolean z4 = z;
                    boolean z5 = z2;
                    mxm mxmVar3 = mxmVar;
                    mxm mxmVar4 = mxmVar2;
                    qpt.bs(str4, str5, str6, num2, uifVar3, z4, z5, mxmVar3, mxmVar4, z3, (ayc) obj3, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static void bt(final String str, final String str2, final String str3, final Integer num, final uif uifVar, final boolean z, final boolean z2, final mxm mxmVar, final mxm mxmVar2, final boolean z3, ayc aycVar, final int i) {
        int i2;
        String str4;
        String str5;
        boolean z4;
        long jE;
        str2.getClass();
        uifVar.getClass();
        mxmVar.getClass();
        mxmVar2.getClass();
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-930299304);
        if (i3 == 0) {
            i2 = (true != aycVarC.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= true != aycVarC.B(str4) ? 16 : 32;
        } else {
            str4 = str2;
        }
        if ((i & 384) == 0) {
            str5 = str3;
            i2 |= true != aycVarC.B(str5) ? 128 : 256;
        } else {
            str5 = str3;
        }
        if ((i & 3072) == 0) {
            i2 |= true != aycVarC.B(num) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != aycVarC.D(uifVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != aycVarC.C(z) ? ImageMetadata.CONTROL_AE_ANTIBANDING_MODE : 131072;
        }
        if ((1572864 & i) == 0) {
            z4 = z2;
            i2 |= true != aycVarC.C(z4) ? ImageMetadata.LENS_APERTURE : ImageMetadata.SHADING_MODE;
        } else {
            z4 = z2;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != aycVarC.z(mxmVar.ordinal()) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != aycVarC.z(mxmVar2.ordinal()) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i2 |= true != aycVarC.C(z3) ? 268435456 : 536870912;
        }
        if ((306783379 & i2) == 306783378 && aycVarC.G()) {
            aycVarC.r();
        } else {
            aycVarC.u(-664421151);
            long j = z ? bay.O(aycVarC).d : bkv.b;
            ayg aygVar = (ayg) aycVarC;
            aygVar.Y();
            if (z) {
                aycVarC.u(877927090);
                jE = bay.O(aycVarC).c;
                aygVar.Y();
            } else {
                aycVarC.u(877989090);
                jE = byx.e(R.color.camera_protection_background_opaque, aycVarC);
                aygVar.Y();
            }
            long j2 = jE;
            float f = avj.a;
            awo awoVarQ = bay.Q(aycVarC);
            avo avoVar = awoVarQ.i;
            if (avoVar == null) {
                avoVar = new avo(awp.a(awoVarQ, 7), awp.a(awoVarQ, 15));
                awoVarQ.i = avoVar;
            }
            alv alvVarAJ = byi.aJ(byx.c(R.dimen.creative_button_horizontal_padding, aycVarC), 2);
            avi aviVar = new avi(j2, j, j2, j);
            bik bikVarA = awa.a(bik.c.cM(new SizeElement(Float.intBitsToFloat((int) (a.t((a.p(1, 0) ? 8.0f : a.p(1, 1) ? 16.0f : a.p(1, 2) ? 28.0f : 0.0f) + 24.0f, 40.0f) >> 32)), 0.0f, Float.NaN, 0.0f, true, 10)));
            aycVarC.u(5004770);
            int i4 = i2 & 1879048192;
            Object objR = aygVar.R();
            if (i4 == 536870912 || objR == ayb.a) {
                objR = new uiq() { // from class: mss
                    @Override // defpackage.uiq
                    public final Object a(Object obj) {
                        cbn cbnVar = (cbn) obj;
                        cbnVar.getClass();
                        if (z3) {
                            cbw.b(cbnVar);
                        }
                        return ufg.a;
                    }
                };
                aygVar.ac(objR);
            }
            aygVar.Y();
            bik bikVarB = cbp.b(bikVarA, false, (uiq) objR);
            ufg ufgVar = ufg.a;
            aycVarC.u(5004770);
            int i5 = 57344 & i2;
            Object objR2 = aygVar.R();
            int i6 = i2;
            if (i5 == 16384 || objR2 == ayb.a) {
                objR2 = new ahi(uifVar, 2);
                aygVar.ac(objR2);
            }
            aygVar.Y();
            avo avoVar2 = avoVar;
            akg.k(uifVar, avoVar2, bqh.a(bikVarB, ufgVar, (PointerInputEventHandler) objR2), z4, aviVar, null, alvVarAJ, bdq.k(-1269632920, new mtb(num, mxmVar2, mxmVar, str4, str, str5), aycVarC), aycVarC, ((i6 >> 12) & 14) | 805306368 | ((i6 >> 9) & 7168));
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new uiu() { // from class: mst
                @Override // defpackage.uiu
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str6 = str;
                    String str7 = str2;
                    String str8 = str3;
                    Integer num2 = num;
                    uif uifVar2 = uifVar;
                    boolean z5 = z;
                    boolean z6 = z2;
                    mxm mxmVar3 = mxmVar;
                    mxm mxmVar4 = mxmVar2;
                    qpt.bt(str6, str7, str8, num2, uifVar2, z5, z6, mxmVar3, mxmVar4, z3, (ayc) obj, bay.j(i | 1));
                    return ufg.a;
                }
            };
        }
    }

    public static /* synthetic */ rwc bu(uem uemVar, Boolean bool) {
        return !bool.booleanValue() ? rvk.a : ((jaf) uemVar).b();
    }

    public static Integer bv(hbj hbjVar) {
        return (Integer) hbjVar.a(hav.h).get();
    }

    public static uem bw(uem uemVar) {
        rww rwwVarY = rnt.y(new fvq(uemVar, 8));
        rwwVarY.getClass();
        return new iyd(rwwVarY, 4);
    }

    public static fzy bx(mci mciVar, int i, int i2) {
        int i3 = mbu.d;
        return new mbu(mciVar, i, i2, new gaf(i * i2 * oxf.ENCODING_PCM_16BIT.f * 8, Integer.MAX_VALUE), new Timer());
    }

    public static /* synthetic */ String by(int i) {
        return i != 1 ? i != 2 ? "null" : "LENS_SUGGESTION" : "DEFAULT";
    }

    public static List bz(List list, String str) {
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length == 0) {
            return list;
        }
        HashSet hashSet = new HashSet(ujp.aD(strArrSplit));
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pas pasVar = (pas) it.next();
            if (!bA(pasVar, hashSet)) {
                arrayList.add(pasVar);
            }
        }
        return arrayList;
    }

    private static float cA(float f, Rect rect, Rect rect2) {
        return ((f - rect.left) * rect2.width()) / rect.width();
    }

    private static float cB(float f, Rect rect, Rect rect2) {
        return ((f - rect.top) * rect2.height()) / rect.height();
    }

    private static boolean cC(hbj hbjVar) {
        return hbjVar.p(haa.H) && hbjVar.p(haa.ac);
    }

    public static void ca(pfu pfuVar, Set set, jjq jjqVar, owf owfVar) {
        scl sclVar = new scl();
        pdi pdiVarV = pfu.v();
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            pej pejVar = (pej) it.next();
            CaptureRequest.Key key = pejVar.a;
            if (!key.equals(CaptureRequest.CONTROL_AF_REGIONS) && !key.equals(CaptureRequest.CONTROL_AE_REGIONS) && !key.equals(CaptureRequest.CONTROL_AWB_REGIONS) && !key.equals(CaptureRequest.CONTROL_AF_TRIGGER) && !key.equals(CaptureRequest.CONTROL_AE_LOCK) && !key.equals(CaptureRequest.CONTROL_AWB_LOCK)) {
                Object obj = pejVar.b;
                if (key.equals(CaptureRequest.CONTROL_AE_MODE)) {
                    if (jjqVar.f.isPresent() && jjqVar.g.isPresent()) {
                        ((pey) pdiVarV).e = 0;
                    } else {
                        ((pey) pdiVarV).e = (Integer) obj;
                    }
                } else if (key.equals(CaptureRequest.CONTROL_AF_MODE)) {
                    if (jjqVar.a.isPresent()) {
                        ((pey) pdiVarV).d = 0;
                    } else {
                        ((pey) pdiVarV).d = (Integer) obj;
                    }
                } else if (key.equals(CaptureRequest.CONTROL_AWB_MODE)) {
                    ((pey) pdiVarV).f = (Integer) obj;
                } else if (key.equals(CaptureRequest.CONTROL_MODE)) {
                    ((pey) pdiVarV).c = (Integer) obj;
                } else if (key.equals(CaptureRequest.FLASH_MODE)) {
                    ((pey) pdiVarV).g = (Integer) obj;
                } else if (key.equals(CaptureRequest.SCALER_CROP_REGION) || key.equals(CaptureRequest.CONTROL_ZOOM_RATIO)) {
                    arrayList.add(pejVar);
                } else {
                    sclVar.d(pejVar);
                }
                z = true;
            }
        }
        if (z) {
            pfuVar.s(new pex((pey) pdiVarV));
        }
        if (!arrayList.isEmpty()) {
            ((Float) owfVar.dL()).floatValue();
            pfuVar.getClass();
            Iterable$EL.forEach(arrayList, new ktp(pfuVar, 3));
        }
        scn scnVarG = sclVar.g();
        if (scnVarG.isEmpty()) {
            return;
        }
        pfuVar.n(scnVarG);
    }

    public static rwc cb(pfu pfuVar, Set set, rwc rwcVar, rwc rwcVar2, rwc rwcVar3, rwc rwcVar4, rwc rwcVar5, Set set2) {
        if (set.isEmpty()) {
            return rvk.a;
        }
        scl sclVar = new scl();
        sclVar.j(set);
        if (rwcVar.h()) {
            sclVar.d((peo) rwcVar.c());
        }
        if (rwcVar4.h()) {
            sclVar.d((peo) rwcVar4.c());
        }
        if (rwcVar5.h()) {
            sclVar.d((peo) rwcVar5.c());
        }
        if (rwcVar3.h()) {
            sclVar.d((peo) rwcVar3.c());
        }
        scl sclVar2 = new scl();
        sclVar2.j(set2);
        if (rwcVar2.h()) {
            sclVar.d((peo) rwcVar2.c());
            CaptureRequest.Key key = nvi.b;
            if (key != null) {
                sclVar2.d(new pej(key, (byte) 1));
            }
        }
        return rwc.j(pfuVar.g(sclVar.g(), sclVar2.g()));
    }

    public static void cc(nkw nkwVar) {
        if (nkwVar == nkw.PHOTO) {
            gzi gziVar = hau.a;
        }
    }

    public static java.util.Map cd(java.util.Map map, java.util.Map map2) {
        HashMap map3 = new HashMap();
        for (lcz lczVar : map.keySet()) {
            pdv pdvVar = (pdv) map.get(lczVar);
            pjr pjrVar = (pjr) map2.get(lczVar);
            pjrVar.getClass();
            String str = pjrVar.a;
            if (str != null) {
                pdvVar.d();
                map3.put(str, pdvVar);
            }
        }
        return map3;
    }

    public static void ce(String str, Context context) {
        Trace.beginSection(str);
        qxf.c(context);
        Trace.endSection();
    }

    public static int cf(WindowManager windowManager) {
        int rotation = windowManager.getDefaultDisplay().getRotation();
        return (rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? pao.CLOCKWISE_0 : pao.d(270) : pao.d(180) : pao.d(90) : pao.d(0)).a();
    }

    public static krq cg(krz krzVar, Resources resources) {
        Stream map = Collection.EL.stream(krzVar.l()).map(new kzq(krzVar, resources, 1));
        int i = sbp.d;
        return new krq(krzVar.h(), krzVar.e(), krzVar.a(), (sbp) map.collect(ryv.a));
    }

    public static kit ch(pej pejVar) {
        return new kit(new sfm(pejVar));
    }

    public static kit ci(CaptureRequest.Key key, Object obj) {
        return ch(new pej(key, obj));
    }

    public static kit cj(List list) {
        return new kit(scn.F(list));
    }

    public static kit ck(pej... pejVarArr) {
        return cj(Arrays.asList(pejVarArr));
    }

    public static kit cl() {
        return new kit(sfd.a);
    }

    public static owf cm(CaptureRequest.Key key, owf owfVar) {
        return owl.h(owl.h(owfVar, new kou(key, 1)), new jku(5));
    }

    public static scn cn(boolean z) {
        return z ? scn.J(new pej(CaptureRequest.FLASH_MODE, 0), new pej(CaptureRequest.CONTROL_AE_MODE, 1), new pej(nvh.a, 1), new pej(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1)) : scn.H(new pej(CaptureRequest.FLASH_MODE, 0), new pej(CaptureRequest.CONTROL_AE_MODE, 1));
    }

    public static ksh co(owf owfVar, pjp pjpVar, owq owqVar, Predicate predicate, krs krsVar) {
        ksh kshVarM = ksi.m();
        kshVarM.n(krsVar);
        kshVarM.h(R.string.af_option_desc);
        kshVarM.c(R.string.af_desc);
        kshVarM.c = new jks(owfVar, pjpVar, 2);
        kshVarM.e = new kof(owfVar, predicate, krsVar, 1);
        kshVarM.b = predicate;
        kshVarM.a = owqVar;
        return kshVarM;
    }

    public static String cp(hbj hbjVar) {
        if (!cC(hbjVar)) {
            return "-v1";
        }
        gzi gziVar = haa.a;
        return "-fi";
    }

    public static Handler cq(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return new Handler(handlerThread.getLooper());
    }

    public static Intent cr(Context context, rbb rbbVar, rbb rbbVar2) {
        rbbVar.getClass();
        String string = Settings.Secure.getString(context.getContentResolver(), "available_hub_tips");
        List listA = string != null ? ujp.A(string, new String[]{","}) : ufw.a;
        String str = rbbVar2 != null ? rbbVar2.A : null;
        String str2 = rbbVar.A;
        boolean zContains = listA.contains(str2);
        Boolean boolValueOf = str != null ? Boolean.valueOf(listA.contains(str)) : null;
        if (zContains || a.ao(boolValueOf, true)) {
            Intent intent = new Intent("com.google.android.apps.tips.action.LAUNCH_HUB");
            if (true == zContains) {
                str = str2;
            }
            intent.putExtra("p", str);
            intent.putExtra("callingPackage", context.getPackageName());
            intent.putExtra("directArticle", zContains ? rbbVar.B : rbbVar2 != null ? rbbVar2.B : false);
            intent.setFlags(67108864);
            intent.setPackage("com.google.android.apps.tips");
            ActivityInfo activityInfoResolveActivityInfo = intent.resolveActivityInfo(context.getPackageManager(), 0);
            if (activityInfoResolveActivityInfo != null && activityInfoResolveActivityInfo.enabled) {
                return intent;
            }
        }
        return null;
    }

    public static synchronized void cs(hbj hbjVar) {
        gzi gziVar = gzo.k;
        rnt.F(((Integer) hbjVar.a(gziVar).get()).intValue() >= 0, "Key %s must be set to a value >=0", gziVar);
    }

    public static void ct(boolean z, owq owqVar, krj krjVar, imi imiVar, rwc rwcVar) {
        if (z || !((ksa) owqVar.dL()).equals(ksa.CAPTURE_RESOLUTION_HI_RES)) {
            return;
        }
        cu(owqVar, krjVar);
        imiVar.a((imj) ((rwg) rwcVar).a);
    }

    public static void cu(owq owqVar, krj krjVar) {
        owqVar.a(ksa.CAPTURE_RESOLUTION_DEFAULT);
        krjVar.m(false, krs.CAPTURE_RESOLUTION);
    }

    public static /* synthetic */ kao cv(MediaFormat mediaFormat, Handler handler, qin qinVar, our ourVar, tgp tgpVar, hbj hbjVar, pbc pbcVar, ocq ocqVar) {
        kao kauVar;
        if (cC(hbjVar)) {
            gzi gziVar = haa.a;
            kauVar = new kau(mediaFormat, qinVar);
        } else {
            qkp qkpVar = new qkp(qinVar);
            kat katVar = new kat(mediaFormat, handler, new lls(tgpVar, qkpVar), qinVar, hbjVar, pbcVar);
            ourVar.d(new iew(qkpVar, 14));
            kauVar = katVar;
        }
        kbe kbeVar = new kbe(kauVar);
        ourVar.d(kbeVar);
        return kbeVar;
    }

    public static lbg cw(java.util.Map map, owf owfVar, pfl pflVar, our ourVar, boolean z) {
        boolean z2 = true;
        if (!map.containsKey(lcz.RAW_WIDE) && !map.containsKey(lcz.RAW_WIDE_RM)) {
            z2 = false;
        }
        rnt.M(z2, "Wide stream not present");
        lbg lbgVar = new lbg(map, owfVar, pflVar, z);
        ourVar.d(new khc(lbgVar, 6));
        return lbgVar;
    }

    private static float cx(float f) {
        return f >= 180.0f ? 180.0f - f : f;
    }

    private static int cy(Context context, int i) {
        return (int) ((i / context.getResources().getDisplayMetrics().density) + 0.5d);
    }

    private static boolean cz(muj mujVar) {
        return mujVar.b == 2;
    }

    private static int f(byte[] bArr) {
        for (int i = 0; i < 255; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return 255;
    }

    private static String g(EGLObjectHandle eGLObjectHandle) {
        return String.format("0x%X", Long.valueOf(eGLObjectHandle.getNativeHandle()));
    }

    private static float h(String[] strArr, int i) throws NumberFormatException {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    private static String i(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean j(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static long k(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasMeasurement(i)) {
            return 0L;
        }
        return healthStats.getMeasurement(i);
    }

    public static List l(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasTimers(i)) ? Collections.EMPTY_LIST : qqc.a.d(healthStats.getTimers(i));
    }

    public static java.util.Map m(HealthStats healthStats, int i) {
        return (healthStats == null || !healthStats.hasStats(i)) ? Collections.EMPTY_MAP : healthStats.getStats(i);
    }

    public static uxr n(String str) {
        tpc tpcVarM = uxr.a.m();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxr uxrVar = (uxr) tpcVarM.b;
        uxrVar.b |= 2;
        uxrVar.d = str;
        return (uxr) tpcVarM.l();
    }

    public static uxw o(HealthStats healthStats, int i) {
        if (healthStats == null || !healthStats.hasTimer(i)) {
            return null;
        }
        return q(null, healthStats.getTimer(i));
    }

    public static uxw p(uxw uxwVar, uxw uxwVar2) {
        if (uxwVar == null || uxwVar2 == null) {
            return uxwVar;
        }
        int i = uxwVar.c - uxwVar2.c;
        long j = uxwVar.d - uxwVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        tpc tpcVarM = uxw.a.m();
        if ((uxwVar.b & 4) != 0) {
            uxr uxrVar = uxwVar.e;
            if (uxrVar == null) {
                uxrVar = uxr.a;
            }
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxw uxwVar3 = (uxw) tpcVarM.b;
            uxrVar.getClass();
            uxwVar3.e = uxrVar;
            uxwVar3.b |= 4;
        }
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        uxw uxwVar4 = (uxw) tphVar;
        uxwVar4.b |= 1;
        uxwVar4.c = i;
        if (!tphVar.C()) {
            tpcVarM.o();
        }
        uxw uxwVar5 = (uxw) tpcVarM.b;
        uxwVar5.b |= 2;
        uxwVar5.d = j;
        return (uxw) tpcVarM.l();
    }

    public static uxw q(String str, TimerStat timerStat) {
        tpc tpcVarM = uxw.a.m();
        int count = timerStat.getCount();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        uxw uxwVar = (uxw) tpcVarM.b;
        uxwVar.b |= 1;
        uxwVar.c = count;
        long time = timerStat.getTime();
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        tph tphVar = tpcVarM.b;
        uxw uxwVar2 = (uxw) tphVar;
        uxwVar2.b |= 2;
        uxwVar2.d = time;
        if (uxwVar2.c < 0) {
            if (!tphVar.C()) {
                tpcVarM.o();
            }
            uxw uxwVar3 = (uxw) tpcVarM.b;
            uxwVar3.b |= 1;
            uxwVar3.c = 0;
        }
        if (str != null) {
            uxr uxrVarN = n(str);
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxw uxwVar4 = (uxw) tpcVarM.b;
            uxrVarN.getClass();
            uxwVar4.e = uxrVarN;
            uxwVar4.b |= 4;
        }
        uxw uxwVar5 = (uxw) tpcVarM.b;
        if (uxwVar5.c == 0 && uxwVar5.d == 0) {
            return null;
        }
        return (uxw) tpcVarM.l();
    }

    public static uxx r(uxx uxxVar, uxx uxxVar2) {
        uxw uxwVar;
        uxw uxwVar2;
        uxw uxwVar3;
        uxw uxwVar4;
        uxw uxwVar5;
        uxw uxwVar6;
        uxw uxwVar7;
        uxw uxwVar8;
        uxw uxwVar9;
        uxw uxwVar10;
        uxw uxwVar11;
        uxw uxwVar12;
        uxw uxwVar13;
        uxw uxwVar14;
        uxw uxwVar15;
        uxw uxwVar16;
        uxw uxwVar17;
        uxw uxwVar18;
        uxw uxwVar19;
        uxw uxwVar20;
        uxw uxwVar21;
        uxw uxwVar22;
        uxw uxwVar23;
        uxw uxwVar24;
        uxw uxwVar25;
        uxw uxwVar26;
        uxw uxwVar27;
        uxw uxwVar28;
        uxw uxwVar29;
        uxw uxwVar30;
        uxw uxwVar31;
        uxw uxwVar32;
        if (uxxVar != null && uxxVar2 != null) {
            tpc tpcVarM = uxx.a.m();
            if ((uxxVar.b & 1) != 0) {
                long j = uxxVar.d - uxxVar2.d;
                if (j != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar3 = (uxx) tpcVarM.b;
                    uxxVar3.b |= 1;
                    uxxVar3.d = j;
                }
            }
            if ((uxxVar.b & 2) != 0) {
                long j2 = uxxVar.e - uxxVar2.e;
                if (j2 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar4 = (uxx) tpcVarM.b;
                    uxxVar4.b |= 2;
                    uxxVar4.e = j2;
                }
            }
            if ((uxxVar.b & 4) != 0) {
                long j3 = uxxVar.f - uxxVar2.f;
                if (j3 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar5 = (uxx) tpcVarM.b;
                    uxxVar5.b |= 4;
                    uxxVar5.f = j3;
                }
            }
            if ((uxxVar.b & 8) != 0) {
                long j4 = uxxVar.g - uxxVar2.g;
                if (j4 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar6 = (uxx) tpcVarM.b;
                    uxxVar6.b |= 8;
                    uxxVar6.g = j4;
                }
            }
            qqc qqcVar = qqc.a;
            tpcVarM.ao(qqcVar.e(uxxVar.h, uxxVar2.h));
            tpcVarM.ap(qqcVar.e(uxxVar.i, uxxVar2.i));
            tpcVarM.aq(qqcVar.e(uxxVar.j, uxxVar2.j));
            tpcVarM.an(qqcVar.e(uxxVar.k, uxxVar2.k));
            tpcVarM.am(qqcVar.e(uxxVar.l, uxxVar2.l));
            tpcVarM.ai(qqcVar.e(uxxVar.m, uxxVar2.m));
            if ((uxxVar.b & 16) != 0) {
                uxwVar = uxxVar.n;
                if (uxwVar == null) {
                    uxwVar = uxw.a;
                }
            } else {
                uxwVar = null;
            }
            if ((uxxVar2.b & 16) != 0) {
                uxwVar2 = uxxVar2.n;
                if (uxwVar2 == null) {
                    uxwVar2 = uxw.a;
                }
            } else {
                uxwVar2 = null;
            }
            uxw uxwVarP = p(uxwVar, uxwVar2);
            if (uxwVarP != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar7 = (uxx) tpcVarM.b;
                uxxVar7.n = uxwVarP;
                uxxVar7.b |= 16;
            }
            tpcVarM.aj(qqcVar.e(uxxVar.o, uxxVar2.o));
            tpcVarM.al(qpz.a.e(uxxVar.q, uxxVar2.q));
            tpcVarM.ak(qpy.a.e(uxxVar.r, uxxVar2.r));
            if ((uxxVar.b & 32) != 0) {
                long j5 = uxxVar.s - uxxVar2.s;
                if (j5 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar8 = (uxx) tpcVarM.b;
                    uxxVar8.b |= 32;
                    uxxVar8.s = j5;
                }
            }
            if ((uxxVar.b & 64) != 0) {
                long j6 = uxxVar.t - uxxVar2.t;
                if (j6 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar9 = (uxx) tpcVarM.b;
                    uxxVar9.b |= 64;
                    uxxVar9.t = j6;
                }
            }
            if ((uxxVar.b & 128) != 0) {
                long j7 = uxxVar.u - uxxVar2.u;
                if (j7 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar10 = (uxx) tpcVarM.b;
                    uxxVar10.b |= 128;
                    uxxVar10.u = j7;
                }
            }
            if ((uxxVar.b & 256) != 0) {
                long j8 = uxxVar.v - uxxVar2.v;
                if (j8 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar11 = (uxx) tpcVarM.b;
                    uxxVar11.b |= 256;
                    uxxVar11.v = j8;
                }
            }
            if ((uxxVar.b & 512) != 0) {
                long j9 = uxxVar.w - uxxVar2.w;
                if (j9 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar12 = (uxx) tpcVarM.b;
                    uxxVar12.b |= 512;
                    uxxVar12.w = j9;
                }
            }
            if ((uxxVar.b & 1024) != 0) {
                long j10 = uxxVar.x - uxxVar2.x;
                if (j10 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar13 = (uxx) tpcVarM.b;
                    uxxVar13.b |= 1024;
                    uxxVar13.x = j10;
                }
            }
            if ((uxxVar.b & 2048) != 0) {
                long j11 = uxxVar.y - uxxVar2.y;
                if (j11 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar14 = (uxx) tpcVarM.b;
                    uxxVar14.b |= 2048;
                    uxxVar14.y = j11;
                }
            }
            if ((uxxVar.b & 4096) != 0) {
                long j12 = uxxVar.z - uxxVar2.z;
                if (j12 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar15 = (uxx) tpcVarM.b;
                    uxxVar15.b |= 4096;
                    uxxVar15.z = j12;
                }
            }
            if ((uxxVar.b & 8192) != 0) {
                long j13 = uxxVar.A - uxxVar2.A;
                if (j13 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar16 = (uxx) tpcVarM.b;
                    uxxVar16.b |= 8192;
                    uxxVar16.A = j13;
                }
            }
            if ((uxxVar.b & 16384) != 0) {
                long j14 = uxxVar.B - uxxVar2.B;
                if (j14 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar17 = (uxx) tpcVarM.b;
                    uxxVar17.b |= 16384;
                    uxxVar17.B = j14;
                }
            }
            if ((uxxVar.b & 32768) != 0) {
                long j15 = uxxVar.C - uxxVar2.C;
                if (j15 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar18 = (uxx) tpcVarM.b;
                    uxxVar18.b |= 32768;
                    uxxVar18.C = j15;
                }
            }
            if ((uxxVar.b & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j16 = uxxVar.D - uxxVar2.D;
                if (j16 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar19 = (uxx) tpcVarM.b;
                    uxxVar19.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    uxxVar19.D = j16;
                }
            }
            if ((uxxVar.b & 131072) != 0) {
                long j17 = uxxVar.E - uxxVar2.E;
                if (j17 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar20 = (uxx) tpcVarM.b;
                    uxxVar20.b |= 131072;
                    uxxVar20.E = j17;
                }
            }
            if ((uxxVar.b & 262144) != 0) {
                long j18 = uxxVar.F - uxxVar2.F;
                if (j18 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar21 = (uxx) tpcVarM.b;
                    uxxVar21.b |= 262144;
                    uxxVar21.F = j18;
                }
            }
            if ((uxxVar.b & ImageMetadata.LENS_APERTURE) != 0) {
                uxwVar3 = uxxVar.G;
                if (uxwVar3 == null) {
                    uxwVar3 = uxw.a;
                }
            } else {
                uxwVar3 = null;
            }
            if ((uxxVar2.b & ImageMetadata.LENS_APERTURE) != 0) {
                uxwVar4 = uxxVar2.G;
                if (uxwVar4 == null) {
                    uxwVar4 = uxw.a;
                }
            } else {
                uxwVar4 = null;
            }
            uxw uxwVarP2 = p(uxwVar3, uxwVar4);
            if (uxwVarP2 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar22 = (uxx) tpcVarM.b;
                uxxVar22.G = uxwVarP2;
                uxxVar22.b |= ImageMetadata.LENS_APERTURE;
            }
            if ((uxxVar.b & ImageMetadata.SHADING_MODE) != 0) {
                long j19 = uxxVar.H - uxxVar2.H;
                if (j19 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar23 = (uxx) tpcVarM.b;
                    uxxVar23.b |= ImageMetadata.SHADING_MODE;
                    uxxVar23.H = j19;
                }
            }
            if ((uxxVar.b & 2097152) != 0) {
                uxwVar5 = uxxVar.I;
                if (uxwVar5 == null) {
                    uxwVar5 = uxw.a;
                }
            } else {
                uxwVar5 = null;
            }
            if ((uxxVar2.b & 2097152) != 0) {
                uxwVar6 = uxxVar2.I;
                if (uxwVar6 == null) {
                    uxwVar6 = uxw.a;
                }
            } else {
                uxwVar6 = null;
            }
            uxw uxwVarP3 = p(uxwVar5, uxwVar6);
            if (uxwVarP3 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar24 = (uxx) tpcVarM.b;
                uxxVar24.I = uxwVarP3;
                uxxVar24.b |= 2097152;
            }
            if ((uxxVar.b & 4194304) != 0) {
                uxwVar7 = uxxVar.J;
                if (uxwVar7 == null) {
                    uxwVar7 = uxw.a;
                }
            } else {
                uxwVar7 = null;
            }
            if ((uxxVar2.b & 4194304) != 0) {
                uxwVar8 = uxxVar2.J;
                if (uxwVar8 == null) {
                    uxwVar8 = uxw.a;
                }
            } else {
                uxwVar8 = null;
            }
            uxw uxwVarP4 = p(uxwVar7, uxwVar8);
            if (uxwVarP4 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar25 = (uxx) tpcVarM.b;
                uxxVar25.J = uxwVarP4;
                uxxVar25.b |= 4194304;
            }
            if ((uxxVar.b & 8388608) != 0) {
                uxwVar9 = uxxVar.K;
                if (uxwVar9 == null) {
                    uxwVar9 = uxw.a;
                }
            } else {
                uxwVar9 = null;
            }
            if ((uxxVar2.b & 8388608) != 0) {
                uxwVar10 = uxxVar2.K;
                if (uxwVar10 == null) {
                    uxwVar10 = uxw.a;
                }
            } else {
                uxwVar10 = null;
            }
            uxw uxwVarP5 = p(uxwVar9, uxwVar10);
            if (uxwVarP5 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar26 = (uxx) tpcVarM.b;
                uxxVar26.K = uxwVarP5;
                uxxVar26.b |= 8388608;
            }
            if ((uxxVar.b & 16777216) != 0) {
                uxwVar11 = uxxVar.L;
                if (uxwVar11 == null) {
                    uxwVar11 = uxw.a;
                }
            } else {
                uxwVar11 = null;
            }
            if ((uxxVar2.b & 16777216) != 0) {
                uxwVar12 = uxxVar2.L;
                if (uxwVar12 == null) {
                    uxwVar12 = uxw.a;
                }
            } else {
                uxwVar12 = null;
            }
            uxw uxwVarP6 = p(uxwVar11, uxwVar12);
            if (uxwVarP6 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar27 = (uxx) tpcVarM.b;
                uxxVar27.L = uxwVarP6;
                uxxVar27.b |= 16777216;
            }
            if ((uxxVar.b & 33554432) != 0) {
                uxwVar13 = uxxVar.M;
                if (uxwVar13 == null) {
                    uxwVar13 = uxw.a;
                }
            } else {
                uxwVar13 = null;
            }
            if ((uxxVar2.b & 33554432) != 0) {
                uxwVar14 = uxxVar2.M;
                if (uxwVar14 == null) {
                    uxwVar14 = uxw.a;
                }
            } else {
                uxwVar14 = null;
            }
            uxw uxwVarP7 = p(uxwVar13, uxwVar14);
            if (uxwVarP7 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar28 = (uxx) tpcVarM.b;
                uxxVar28.M = uxwVarP7;
                uxxVar28.b |= 33554432;
            }
            if ((uxxVar.b & 67108864) != 0) {
                uxwVar15 = uxxVar.N;
                if (uxwVar15 == null) {
                    uxwVar15 = uxw.a;
                }
            } else {
                uxwVar15 = null;
            }
            if ((uxxVar2.b & 67108864) != 0) {
                uxwVar16 = uxxVar2.N;
                if (uxwVar16 == null) {
                    uxwVar16 = uxw.a;
                }
            } else {
                uxwVar16 = null;
            }
            uxw uxwVarP8 = p(uxwVar15, uxwVar16);
            if (uxwVarP8 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar29 = (uxx) tpcVarM.b;
                uxxVar29.N = uxwVarP8;
                uxxVar29.b |= 67108864;
            }
            if ((uxxVar.b & 134217728) != 0) {
                uxwVar17 = uxxVar.O;
                if (uxwVar17 == null) {
                    uxwVar17 = uxw.a;
                }
            } else {
                uxwVar17 = null;
            }
            if ((uxxVar2.b & 134217728) != 0) {
                uxwVar18 = uxxVar2.O;
                if (uxwVar18 == null) {
                    uxwVar18 = uxw.a;
                }
            } else {
                uxwVar18 = null;
            }
            uxw uxwVarP9 = p(uxwVar17, uxwVar18);
            if (uxwVarP9 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar30 = (uxx) tpcVarM.b;
                uxxVar30.O = uxwVarP9;
                uxxVar30.b |= 134217728;
            }
            if ((uxxVar.b & 268435456) != 0) {
                uxwVar19 = uxxVar.P;
                if (uxwVar19 == null) {
                    uxwVar19 = uxw.a;
                }
            } else {
                uxwVar19 = null;
            }
            if ((uxxVar2.b & 268435456) != 0) {
                uxwVar20 = uxxVar2.P;
                if (uxwVar20 == null) {
                    uxwVar20 = uxw.a;
                }
            } else {
                uxwVar20 = null;
            }
            uxw uxwVarP10 = p(uxwVar19, uxwVar20);
            if (uxwVarP10 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar31 = (uxx) tpcVarM.b;
                uxxVar31.P = uxwVarP10;
                uxxVar31.b |= 268435456;
            }
            if ((uxxVar.b & 536870912) != 0) {
                uxwVar21 = uxxVar.Q;
                if (uxwVar21 == null) {
                    uxwVar21 = uxw.a;
                }
            } else {
                uxwVar21 = null;
            }
            if ((uxxVar2.b & 536870912) != 0) {
                uxwVar22 = uxxVar2.Q;
                if (uxwVar22 == null) {
                    uxwVar22 = uxw.a;
                }
            } else {
                uxwVar22 = null;
            }
            uxw uxwVarP11 = p(uxwVar21, uxwVar22);
            if (uxwVarP11 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar32 = (uxx) tpcVarM.b;
                uxxVar32.Q = uxwVarP11;
                uxxVar32.b |= 536870912;
            }
            if ((uxxVar.b & 1073741824) != 0) {
                uxwVar23 = uxxVar.R;
                if (uxwVar23 == null) {
                    uxwVar23 = uxw.a;
                }
            } else {
                uxwVar23 = null;
            }
            if ((uxxVar2.b & 1073741824) != 0) {
                uxwVar24 = uxxVar2.R;
                if (uxwVar24 == null) {
                    uxwVar24 = uxw.a;
                }
            } else {
                uxwVar24 = null;
            }
            uxw uxwVarP12 = p(uxwVar23, uxwVar24);
            if (uxwVarP12 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar33 = (uxx) tpcVarM.b;
                uxxVar33.R = uxwVarP12;
                uxxVar33.b |= 1073741824;
            }
            if ((uxxVar.b & Integer.MIN_VALUE) != 0) {
                uxwVar25 = uxxVar.S;
                if (uxwVar25 == null) {
                    uxwVar25 = uxw.a;
                }
            } else {
                uxwVar25 = null;
            }
            if ((uxxVar2.b & Integer.MIN_VALUE) != 0) {
                uxwVar26 = uxxVar2.S;
                if (uxwVar26 == null) {
                    uxwVar26 = uxw.a;
                }
            } else {
                uxwVar26 = null;
            }
            uxw uxwVarP13 = p(uxwVar25, uxwVar26);
            if (uxwVarP13 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar34 = (uxx) tpcVarM.b;
                uxxVar34.S = uxwVarP13;
                uxxVar34.b |= Integer.MIN_VALUE;
            }
            if ((uxxVar.c & 1) != 0) {
                uxwVar27 = uxxVar.T;
                if (uxwVar27 == null) {
                    uxwVar27 = uxw.a;
                }
            } else {
                uxwVar27 = null;
            }
            if ((uxxVar2.c & 1) != 0) {
                uxwVar28 = uxxVar2.T;
                if (uxwVar28 == null) {
                    uxwVar28 = uxw.a;
                }
            } else {
                uxwVar28 = null;
            }
            uxw uxwVarP14 = p(uxwVar27, uxwVar28);
            if (uxwVarP14 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar35 = (uxx) tpcVarM.b;
                uxxVar35.T = uxwVarP14;
                uxxVar35.c |= 1;
            }
            if ((uxxVar.c & 2) != 0) {
                uxwVar29 = uxxVar.U;
                if (uxwVar29 == null) {
                    uxwVar29 = uxw.a;
                }
            } else {
                uxwVar29 = null;
            }
            if ((uxxVar2.c & 2) != 0) {
                uxwVar30 = uxxVar2.U;
                if (uxwVar30 == null) {
                    uxwVar30 = uxw.a;
                }
            } else {
                uxwVar30 = null;
            }
            uxw uxwVarP15 = p(uxwVar29, uxwVar30);
            if (uxwVarP15 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar36 = (uxx) tpcVarM.b;
                uxxVar36.U = uxwVarP15;
                uxxVar36.c |= 2;
            }
            if ((uxxVar.c & 4) != 0) {
                long j20 = uxxVar.V - uxxVar2.V;
                if (j20 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar37 = (uxx) tpcVarM.b;
                    uxxVar37.c |= 4;
                    uxxVar37.V = j20;
                }
            }
            if ((uxxVar.c & 8) != 0) {
                long j21 = uxxVar.W - uxxVar2.W;
                if (j21 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar38 = (uxx) tpcVarM.b;
                    uxxVar38.c |= 8;
                    uxxVar38.W = j21;
                }
            }
            if ((uxxVar.c & 16) != 0) {
                long j22 = uxxVar.X - uxxVar2.X;
                if (j22 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar39 = (uxx) tpcVarM.b;
                    uxxVar39.c |= 16;
                    uxxVar39.X = j22;
                }
            }
            if ((uxxVar.c & 32) != 0) {
                long j23 = uxxVar.Y - uxxVar2.Y;
                if (j23 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar40 = (uxx) tpcVarM.b;
                    uxxVar40.c |= 32;
                    uxxVar40.Y = j23;
                }
            }
            if ((uxxVar.c & 64) != 0) {
                long j24 = uxxVar.Z - uxxVar2.Z;
                if (j24 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar41 = (uxx) tpcVarM.b;
                    uxxVar41.c |= 64;
                    uxxVar41.Z = j24;
                }
            }
            if ((uxxVar.c & 128) != 0) {
                long j25 = uxxVar.aa - uxxVar2.aa;
                if (j25 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar42 = (uxx) tpcVarM.b;
                    uxxVar42.c |= 128;
                    uxxVar42.aa = j25;
                }
            }
            if ((uxxVar.c & 256) != 0) {
                long j26 = uxxVar.ab - uxxVar2.ab;
                if (j26 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar43 = (uxx) tpcVarM.b;
                    uxxVar43.c |= 256;
                    uxxVar43.ab = j26;
                }
            }
            if ((uxxVar.c & 512) != 0) {
                long j27 = uxxVar.ac - uxxVar2.ac;
                if (j27 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar44 = (uxx) tpcVarM.b;
                    uxxVar44.c |= 512;
                    uxxVar44.ac = j27;
                }
            }
            if ((uxxVar.c & 1024) != 0) {
                long j28 = uxxVar.ad - uxxVar2.ad;
                if (j28 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar45 = (uxx) tpcVarM.b;
                    uxxVar45.c |= 1024;
                    uxxVar45.ad = j28;
                }
            }
            if ((uxxVar.c & 2048) != 0) {
                long j29 = uxxVar.ae - uxxVar2.ae;
                if (j29 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar46 = (uxx) tpcVarM.b;
                    uxxVar46.c |= 2048;
                    uxxVar46.ae = j29;
                }
            }
            if ((uxxVar.c & 4096) != 0) {
                long j30 = uxxVar.af - uxxVar2.af;
                if (j30 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar47 = (uxx) tpcVarM.b;
                    uxxVar47.c |= 4096;
                    uxxVar47.af = j30;
                }
            }
            if ((uxxVar.c & 8192) != 0) {
                long j31 = uxxVar.ag - uxxVar2.ag;
                if (j31 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar48 = (uxx) tpcVarM.b;
                    uxxVar48.c |= 8192;
                    uxxVar48.ag = j31;
                }
            }
            if ((uxxVar.c & 16384) != 0) {
                long j32 = uxxVar.ah - uxxVar2.ah;
                if (j32 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar49 = (uxx) tpcVarM.b;
                    uxxVar49.c |= 16384;
                    uxxVar49.ah = j32;
                }
            }
            if ((uxxVar.c & 32768) != 0) {
                long j33 = uxxVar.ai - uxxVar2.ai;
                if (j33 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar50 = (uxx) tpcVarM.b;
                    uxxVar50.c = 32768 | uxxVar50.c;
                    uxxVar50.ai = j33;
                }
            }
            if ((uxxVar.c & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0) {
                long j34 = uxxVar.aj - uxxVar2.aj;
                if (j34 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar51 = (uxx) tpcVarM.b;
                    uxxVar51.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                    uxxVar51.aj = j34;
                }
            }
            if ((uxxVar.c & 131072) != 0) {
                uxwVar31 = uxxVar.ak;
                if (uxwVar31 == null) {
                    uxwVar31 = uxw.a;
                }
            } else {
                uxwVar31 = null;
            }
            if ((uxxVar2.c & 131072) != 0) {
                uxwVar32 = uxxVar2.ak;
                if (uxwVar32 == null) {
                    uxwVar32 = uxw.a;
                }
            } else {
                uxwVar32 = null;
            }
            uxw uxwVarP16 = p(uxwVar31, uxwVar32);
            if (uxwVarP16 != null) {
                if (!tpcVarM.b.C()) {
                    tpcVarM.o();
                }
                uxx uxxVar52 = (uxx) tpcVarM.b;
                uxxVar52.ak = uxwVarP16;
                uxxVar52.c |= 131072;
            }
            if ((uxxVar.c & 262144) != 0) {
                long j35 = uxxVar.al - uxxVar2.al;
                if (j35 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar53 = (uxx) tpcVarM.b;
                    uxxVar53.c |= 262144;
                    uxxVar53.al = j35;
                }
            }
            if ((uxxVar.c & ImageMetadata.LENS_APERTURE) != 0) {
                long j36 = uxxVar.am - uxxVar2.am;
                if (j36 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar54 = (uxx) tpcVarM.b;
                    uxxVar54.c |= ImageMetadata.LENS_APERTURE;
                    uxxVar54.am = j36;
                }
            }
            if ((uxxVar.c & ImageMetadata.SHADING_MODE) != 0) {
                long j37 = uxxVar.an - uxxVar2.an;
                if (j37 != 0) {
                    if (!tpcVarM.b.C()) {
                        tpcVarM.o();
                    }
                    uxx uxxVar55 = (uxx) tpcVarM.b;
                    uxxVar55.c |= ImageMetadata.SHADING_MODE;
                    uxxVar55.an = j37;
                }
            }
            uxxVar = (uxx) tpcVarM.l();
            if (v(uxxVar)) {
                return null;
            }
        }
        return uxxVar;
    }

    public static boolean s(uxs uxsVar) {
        if (uxsVar != null) {
            return uxsVar.c.size() == 0 && uxsVar.d.size() == 0;
        }
        return true;
    }

    public static boolean t(uxu uxuVar) {
        if (uxuVar != null) {
            return uxuVar.c <= 0 && uxuVar.d <= 0 && uxuVar.e <= 0 && uxuVar.f <= 0 && uxuVar.g <= 0 && uxuVar.h <= 0;
        }
        return true;
    }

    public static boolean u(uxv uxvVar) {
        if (uxvVar != null) {
            return ((long) uxvVar.c) <= 0 && ((long) uxvVar.d) <= 0;
        }
        return true;
    }

    static boolean v(uxx uxxVar) {
        if (uxxVar != null) {
            return uxxVar.d <= 0 && uxxVar.e <= 0 && uxxVar.f <= 0 && uxxVar.g <= 0 && uxxVar.h.size() == 0 && uxxVar.i.size() == 0 && uxxVar.j.size() == 0 && uxxVar.k.size() == 0 && uxxVar.l.size() == 0 && uxxVar.m.size() == 0 && uxxVar.o.size() == 0 && uxxVar.p.size() == 0 && uxxVar.q.size() == 0 && uxxVar.r.size() == 0 && uxxVar.s <= 0 && uxxVar.t <= 0 && uxxVar.u <= 0 && uxxVar.v <= 0 && uxxVar.w <= 0 && uxxVar.x <= 0 && uxxVar.y <= 0 && uxxVar.z <= 0 && uxxVar.A <= 0 && uxxVar.B <= 0 && uxxVar.C <= 0 && uxxVar.D <= 0 && uxxVar.E <= 0 && uxxVar.F <= 0 && uxxVar.H <= 0 && uxxVar.V <= 0 && uxxVar.W <= 0 && uxxVar.X <= 0 && uxxVar.Y <= 0 && uxxVar.Z <= 0 && uxxVar.aa <= 0 && uxxVar.ab <= 0 && uxxVar.ac <= 0 && uxxVar.ad <= 0 && uxxVar.ae <= 0 && uxxVar.af <= 0 && uxxVar.ag <= 0 && uxxVar.ah <= 0 && uxxVar.ai <= 0 && uxxVar.aj <= 0 && uxxVar.al <= 0 && uxxVar.am <= 0 && uxxVar.an <= 0;
        }
        return true;
    }

    public static void w(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(rsx.e(new iff(level, th, str, objArr, 9)));
    }

    public static void x(Level level, Executor executor, String str, Object... objArr) {
        w(level, executor, null, str, objArr);
    }

    public static Object y(qww qwwVar) {
        try {
            return qwwVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return qwwVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    static qqd z(Long l, Long l2, HealthStats healthStats, uxn uxnVar, qpq qpqVar) {
        Object obj;
        tpc tpcVarM = uxx.a.m();
        long jK = k(healthStats, 10001);
        if (jK != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar = (uxx) tpcVarM.b;
            uxxVar.b |= 1;
            uxxVar.d = jK;
        }
        long jK2 = k(healthStats, 10002);
        if (jK2 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar2 = (uxx) tpcVarM.b;
            uxxVar2.b |= 2;
            uxxVar2.e = jK2;
        }
        long jK3 = k(healthStats, 10003);
        if (jK3 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar3 = (uxx) tpcVarM.b;
            uxxVar3.b |= 4;
            uxxVar3.f = jK3;
        }
        long jK4 = k(healthStats, 10004);
        if (jK4 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar4 = (uxx) tpcVarM.b;
            uxxVar4.b |= 8;
            uxxVar4.g = jK4;
        }
        tpcVarM.ao(l(healthStats, 10005));
        tpcVarM.ap(l(healthStats, 10006));
        tpcVarM.aq(l(healthStats, 10007));
        tpcVarM.an(l(healthStats, 10008));
        tpcVarM.am(l(healthStats, 10009));
        tpcVarM.ai(l(healthStats, 10010));
        uxw uxwVarO = o(healthStats, 10011);
        if (uxwVarO != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar5 = (uxx) tpcVarM.b;
            uxxVar5.n = uxwVarO;
            uxxVar5.b |= 16;
        }
        tpcVarM.aj(l(healthStats, 10012));
        tpcVarM.al(qpz.a.d(m(healthStats, 10014)));
        tpcVarM.ak(qpy.a.d(m(healthStats, 10015)));
        long jK5 = k(healthStats, 10016);
        if (jK5 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar6 = (uxx) tpcVarM.b;
            uxxVar6.b |= 32;
            uxxVar6.s = jK5;
        }
        long jK6 = k(healthStats, 10017);
        if (jK6 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar7 = (uxx) tpcVarM.b;
            uxxVar7.b |= 64;
            uxxVar7.t = jK6;
        }
        long jK7 = k(healthStats, 10018);
        if (jK7 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar8 = (uxx) tpcVarM.b;
            uxxVar8.b |= 128;
            uxxVar8.u = jK7;
        }
        long jK8 = k(healthStats, 10019);
        if (jK8 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar9 = (uxx) tpcVarM.b;
            uxxVar9.b |= 256;
            uxxVar9.v = jK8;
        }
        long jK9 = k(healthStats, 10020);
        if (jK9 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar10 = (uxx) tpcVarM.b;
            uxxVar10.b |= 512;
            uxxVar10.w = jK9;
        }
        long jK10 = k(healthStats, 10021);
        if (jK10 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar11 = (uxx) tpcVarM.b;
            uxxVar11.b |= 1024;
            uxxVar11.x = jK10;
        }
        long jK11 = k(healthStats, 10022);
        if (jK11 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar12 = (uxx) tpcVarM.b;
            uxxVar12.b |= 2048;
            uxxVar12.y = jK11;
        }
        long jK12 = k(healthStats, 10023);
        if (jK12 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar13 = (uxx) tpcVarM.b;
            uxxVar13.b |= 4096;
            uxxVar13.z = jK12;
        }
        long jK13 = k(healthStats, 10024);
        if (jK13 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar14 = (uxx) tpcVarM.b;
            uxxVar14.b |= 8192;
            uxxVar14.A = jK13;
        }
        long jK14 = k(healthStats, 10025);
        if (jK14 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar15 = (uxx) tpcVarM.b;
            uxxVar15.b |= 16384;
            uxxVar15.B = jK14;
        }
        long jK15 = k(healthStats, 10026);
        if (jK15 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar16 = (uxx) tpcVarM.b;
            uxxVar16.b |= 32768;
            uxxVar16.C = jK15;
        }
        long jK16 = k(healthStats, 10027);
        if (jK16 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar17 = (uxx) tpcVarM.b;
            uxxVar17.b |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            uxxVar17.D = jK16;
        }
        long jK17 = k(healthStats, 10028);
        if (jK17 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar18 = (uxx) tpcVarM.b;
            uxxVar18.b |= 131072;
            uxxVar18.E = jK17;
        }
        long jK18 = k(healthStats, 10029);
        if (jK18 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar19 = (uxx) tpcVarM.b;
            uxxVar19.b |= 262144;
            uxxVar19.F = jK18;
        }
        uxw uxwVarO2 = o(healthStats, 10030);
        if (uxwVarO2 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar20 = (uxx) tpcVarM.b;
            uxxVar20.G = uxwVarO2;
            uxxVar20.b |= ImageMetadata.LENS_APERTURE;
        }
        long jK19 = k(healthStats, 10031);
        if (jK19 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar21 = (uxx) tpcVarM.b;
            uxxVar21.b |= ImageMetadata.SHADING_MODE;
            uxxVar21.H = jK19;
        }
        uxw uxwVarO3 = o(healthStats, 10032);
        if (uxwVarO3 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar22 = (uxx) tpcVarM.b;
            uxxVar22.I = uxwVarO3;
            uxxVar22.b |= 2097152;
        }
        uxw uxwVarO4 = o(healthStats, 10033);
        if (uxwVarO4 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar23 = (uxx) tpcVarM.b;
            uxxVar23.J = uxwVarO4;
            uxxVar23.b |= 4194304;
        }
        uxw uxwVarO5 = o(healthStats, 10034);
        if (uxwVarO5 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar24 = (uxx) tpcVarM.b;
            uxxVar24.K = uxwVarO5;
            uxxVar24.b |= 8388608;
        }
        uxw uxwVarO6 = o(healthStats, 10035);
        if (uxwVarO6 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar25 = (uxx) tpcVarM.b;
            uxxVar25.L = uxwVarO6;
            uxxVar25.b |= 16777216;
        }
        uxw uxwVarO7 = o(healthStats, 10036);
        if (uxwVarO7 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar26 = (uxx) tpcVarM.b;
            uxxVar26.M = uxwVarO7;
            uxxVar26.b |= 33554432;
        }
        uxw uxwVarO8 = o(healthStats, 10037);
        if (uxwVarO8 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar27 = (uxx) tpcVarM.b;
            uxxVar27.N = uxwVarO8;
            uxxVar27.b |= 67108864;
        }
        uxw uxwVarO9 = o(healthStats, 10038);
        if (uxwVarO9 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar28 = (uxx) tpcVarM.b;
            uxxVar28.O = uxwVarO9;
            uxxVar28.b |= 134217728;
        }
        uxw uxwVarO10 = o(healthStats, 10039);
        if (uxwVarO10 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar29 = (uxx) tpcVarM.b;
            uxxVar29.P = uxwVarO10;
            uxxVar29.b |= 268435456;
        }
        uxw uxwVarO11 = o(healthStats, 10040);
        if (uxwVarO11 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar30 = (uxx) tpcVarM.b;
            uxxVar30.Q = uxwVarO11;
            uxxVar30.b |= 536870912;
        }
        uxw uxwVarO12 = o(healthStats, 10041);
        if (uxwVarO12 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar31 = (uxx) tpcVarM.b;
            uxxVar31.R = uxwVarO12;
            uxxVar31.b |= 1073741824;
        }
        uxw uxwVarO13 = o(healthStats, 10042);
        if (uxwVarO13 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar32 = (uxx) tpcVarM.b;
            uxxVar32.S = uxwVarO13;
            uxxVar32.b |= Integer.MIN_VALUE;
        }
        uxw uxwVarO14 = o(healthStats, 10043);
        if (uxwVarO14 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar33 = (uxx) tpcVarM.b;
            uxxVar33.T = uxwVarO14;
            uxxVar33.c |= 1;
        }
        uxw uxwVarO15 = o(healthStats, 10044);
        if (uxwVarO15 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar34 = (uxx) tpcVarM.b;
            uxxVar34.U = uxwVarO15;
            uxxVar34.c |= 2;
        }
        long jK20 = k(healthStats, 10045);
        if (jK20 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar35 = (uxx) tpcVarM.b;
            uxxVar35.c |= 4;
            uxxVar35.V = jK20;
        }
        long jK21 = k(healthStats, 10046);
        if (jK21 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar36 = (uxx) tpcVarM.b;
            uxxVar36.c |= 8;
            uxxVar36.W = jK21;
        }
        long jK22 = k(healthStats, 10047);
        if (jK22 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar37 = (uxx) tpcVarM.b;
            uxxVar37.c |= 16;
            uxxVar37.X = jK22;
        }
        long jK23 = k(healthStats, 10048);
        if (jK23 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar38 = (uxx) tpcVarM.b;
            uxxVar38.c |= 32;
            uxxVar38.Y = jK23;
        }
        long jK24 = k(healthStats, 10049);
        if (jK24 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar39 = (uxx) tpcVarM.b;
            uxxVar39.c |= 64;
            uxxVar39.Z = jK24;
        }
        long jK25 = k(healthStats, 10050);
        if (jK25 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar40 = (uxx) tpcVarM.b;
            uxxVar40.c |= 128;
            uxxVar40.aa = jK25;
        }
        long jK26 = k(healthStats, 10051);
        if (jK26 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar41 = (uxx) tpcVarM.b;
            uxxVar41.c |= 256;
            uxxVar41.ab = jK26;
        }
        long jK27 = k(healthStats, 10052);
        if (jK27 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar42 = (uxx) tpcVarM.b;
            uxxVar42.c |= 512;
            uxxVar42.ac = jK27;
        }
        long jK28 = k(healthStats, 10053);
        if (jK28 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar43 = (uxx) tpcVarM.b;
            uxxVar43.c |= 1024;
            uxxVar43.ad = jK28;
        }
        long jK29 = k(healthStats, 10054);
        if (jK29 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar44 = (uxx) tpcVarM.b;
            uxxVar44.c |= 2048;
            uxxVar44.ae = jK29;
        }
        long jK30 = k(healthStats, 10055);
        if (jK30 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar45 = (uxx) tpcVarM.b;
            uxxVar45.c |= 4096;
            uxxVar45.af = jK30;
        }
        long jK31 = k(healthStats, 10056);
        if (jK31 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar46 = (uxx) tpcVarM.b;
            uxxVar46.c |= 8192;
            uxxVar46.ag = jK31;
        }
        long jK32 = k(healthStats, 10057);
        if (jK32 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar47 = (uxx) tpcVarM.b;
            uxxVar47.c |= 16384;
            uxxVar47.ah = jK32;
        }
        long jK33 = k(healthStats, 10058);
        if (jK33 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar48 = (uxx) tpcVarM.b;
            uxxVar48.c |= 32768;
            uxxVar48.ai = jK33;
        }
        long jK34 = k(healthStats, 10059);
        if (jK34 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar49 = (uxx) tpcVarM.b;
            uxxVar49.c |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            uxxVar49.aj = jK34;
        }
        uxw uxwVarO16 = o(healthStats, 10061);
        if (uxwVarO16 != null) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar50 = (uxx) tpcVarM.b;
            uxxVar50.ak = uxwVarO16;
            uxxVar50.c |= 131072;
        }
        long jK35 = k(healthStats, 10062);
        if (jK35 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar51 = (uxx) tpcVarM.b;
            uxxVar51.c |= 262144;
            uxxVar51.al = jK35;
        }
        long jK36 = k(healthStats, 10063);
        if (jK36 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar52 = (uxx) tpcVarM.b;
            uxxVar52.c = 524288 | uxxVar52.c;
            uxxVar52.am = jK36;
        }
        long jK37 = k(healthStats, 10064);
        if (jK37 != 0) {
            if (!tpcVarM.b.C()) {
                tpcVarM.o();
            }
            uxx uxxVar53 = (uxx) tpcVarM.b;
            uxxVar53.c |= ImageMetadata.SHADING_MODE;
            uxxVar53.an = jK37;
        }
        uxx uxxVar54 = (uxx) tpcVarM.l();
        tpc tpcVar = (tpc) uxxVar54.a(5, null);
        tpcVar.r(uxxVar54);
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).h);
        int i = 0;
        while (true) {
            sjp sjpVar = qpqVar.c;
            int size = ((uxx) tpcVar.b).h.size();
            obj = sjpVar.a;
            if (i >= size) {
                break;
            }
            tpcVar.av(i, ((qpw) obj).c(1, tpcVar.af(i)));
            i++;
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).i);
        for (int i2 = 0; i2 < ((uxx) tpcVar.b).i.size(); i2++) {
            tpcVar.aw(i2, ((qpw) obj).c(1, tpcVar.ag(i2)));
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).j);
        for (int i3 = 0; i3 < ((uxx) tpcVar.b).j.size(); i3++) {
            tpcVar.ax(i3, ((qpw) obj).c(1, tpcVar.ah(i3)));
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).k);
        for (int i4 = 0; i4 < ((uxx) tpcVar.b).k.size(); i4++) {
            tpcVar.au(i4, ((qpw) obj).c(1, tpcVar.ae(i4)));
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).l);
        for (int i5 = 0; i5 < ((uxx) tpcVar.b).l.size(); i5++) {
            tpcVar.at(i5, ((qpw) obj).c(2, tpcVar.ad(i5)));
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).m);
        for (int i6 = 0; i6 < ((uxx) tpcVar.b).m.size(); i6++) {
            tpcVar.ar(i6, ((qpw) obj).c(3, tpcVar.ab(i6)));
        }
        DesugarCollections.unmodifiableList(((uxx) tpcVar.b).o);
        for (int i7 = 0; i7 < ((uxx) tpcVar.b).o.size(); i7++) {
            tpcVar.as(i7, ((qpw) obj).c(5, tpcVar.ac(i7)));
        }
        return new qqd((uxx) tpcVar.l(), l, l2, 756389480L, Long.valueOf(qpqVar.a == null ? 0L : r1.hashCode()), uxnVar, null, null, null);
    }

    public final synchronized void aK() {
    }

    public boolean fm(obu obuVar) {
        throw null;
    }

    public void fn(obu obuVar) {
        throw null;
    }

    public void fo(byte[] bArr) {
        throw null;
    }

    public void fp() {
        throw null;
    }

    public void fq(int i) {
        throw null;
    }

    public /* synthetic */ qpt(byte[] bArr) {
    }

    public static String ay(int i) {
        if (i == 4101) {
            return "JPEG_R";
        }
        if (i == 54) {
            return "YCBCR_P010";
        }
        switch (i) {
            case com.google.ar.core.ImageFormat.Y8 /* 538982489 */:
                return "Y8";
            case 540422489:
                return "Y16";
            case 1212500294:
                return "HEIC";
            case 1768253795:
                return "DEPTH_JPEG";
            default:
                if (i == 36) {
                    return "RAW_PRIVATE";
                }
                if (i == 34) {
                    return "PRIVATE";
                }
                if (i == 257) {
                    return "POINT_CLOUD";
                }
                if (i == 1144402265) {
                    return "DEPTH16";
                }
                if (i == 4098) {
                    return "RAW_DEPTH";
                }
                if (i == 4099) {
                    return "RAW_DEPTH10";
                }
                switch (i) {
                    case 38:
                        return qcjAcSmlN.NztjJUrz;
                    case 39:
                        return "YUV_422_888";
                    case 40:
                        return "YUV_444_888";
                    case 41:
                        return "FLEX_RGB_888";
                    case 42:
                        return "FLEX_RGBA_8888";
                    default:
                        if (i == 0) {
                            return "UNKNOWN";
                        }
                        if (i == 4) {
                            return "RGB_565";
                        }
                        if (i == 20) {
                            return "YUY2";
                        }
                        if (i == 37) {
                            return "RAW10";
                        }
                        if (i == 256) {
                            return "JPEG";
                        }
                        if (i == 842094169) {
                            return "YV12";
                        }
                        if (i == 16) {
                            return "NV16";
                        }
                        if (i == 17) {
                            return "NV21";
                        }
                        switch (i) {
                            case 32:
                                return "RAW_SENSOR";
                            case 33:
                                return "BLOB";
                            case 34:
                                return "PRIVATE";
                            case com.google.ar.core.ImageFormat.YUV_420_888 /* 35 */:
                                return "YUV_420_888";
                            default:
                                return String.format("0x%s", Integer.toHexString(i));
                        }
                }
        }
    }

    public qpt(char[] cArr) {
    }

    public qpt(short[] sArr, byte[] bArr, byte[] bArr2) {
        gzi gziVar = gzo.a;
    }

    public qpt(hbj hbjVar) {
        gzi gziVar = gzo.a;
        hbjVar.p(gzo.aW);
    }

    public qpt(qpt qptVar) {
        qptVar.getClass();
    }

    public qpt(pfi pfiVar) {
        pfiVar.c().i();
    }
}
