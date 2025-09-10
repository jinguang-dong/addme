package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import com.google.googlex.gcam.FloatArray2;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.Tuning;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ins {
    public static Object a(uem uemVar) {
        b();
        return uemVar.a();
    }

    public static synchronized void b() {
        paw.a(ins.class, "gcastartup");
    }

    public static int c(int i) {
        return i - 1;
    }

    public static float d(pjr pjrVar, hzs hzsVar, Gcam gcam) {
        Tuning tuningC = gcam.c(hzsVar.a(pjrVar));
        return GcamModuleJNI.Tuning_sensitivity_get(tuningC.a, tuningC);
    }

    public static Float e(pjo pjoVar) {
        FloatArray2 floatArray2M = tgq.m(pjoVar);
        float[] fArr = (float[]) pjoVar.m(CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES);
        if (GcamModuleJNI.FloatArray2_size(floatArray2M.a, floatArray2M) <= 0 || fArr == null || fArr.length <= 0) {
            return Float.valueOf(-1.0f);
        }
        float fC = floatArray2M.c();
        float f = fArr[0];
        return Float.valueOf(fC / (f * f));
    }

    public static void f(out outVar, jgj jgjVar, jhh jhhVar) {
        outVar.getClass();
        jhhVar.getClass();
        if (out.d()) {
            jgjVar.g(jhhVar);
        } else {
            outVar.execute(new jhj((Object) jgjVar, jhhVar, 1));
        }
    }

    public static void g(out outVar, jgt jgtVar, jhh jhhVar) {
        outVar.getClass();
        jgtVar.getClass();
        jhhVar.getClass();
        if (out.d()) {
            jgtVar.k(jhhVar);
        } else {
            outVar.execute(new jhj((Object) jgtVar, jhhVar, 0));
        }
    }

    public static final int t(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 0) {
            return iArr[((length - 1) * i) / 100];
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static boolean u(idt idtVar) {
        return idtVar.e() || idtVar.b() || idtVar.c() || idtVar.d();
    }

    public static boolean v() {
        return (nvj.g == null || nvj.h == null || nvj.i == null || nvj.j == null) ? false : true;
    }

    public final synchronized void h() {
    }

    public final synchronized void i() {
    }

    public final synchronized void j() {
    }

    public final synchronized void k() {
    }

    public final synchronized void l() {
    }

    public final synchronized void m() {
    }

    public final synchronized void n() {
    }

    public final synchronized void o() {
    }

    public final synchronized void p() {
    }

    public final synchronized void q() {
    }

    public final synchronized void r() {
    }

    public final synchronized void s() {
    }
}
