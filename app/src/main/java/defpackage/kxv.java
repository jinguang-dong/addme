package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import android.util.Rational;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.CyclopsParameters;
import com.google.googlex.gcam.FloatArray4;
import com.google.googlex.gcam.FloatArray9;
import com.google.googlex.gcam.FrameRequest;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.GcamModuleJNI;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kxv {
    private static final Byte c;
    private static final Byte d;
    public final juy a;
    public final kvg b;
    private final tgq e;
    private final boolean f;
    private final hbj g;

    static {
        byte b = 0;
        Byte b2 = (byte) 0;
        c = b2;
        if (nvl.s != null) {
            b = 3;
        } else {
            b2.byteValue();
        }
        d = Byte.valueOf(b);
    }

    public kxv(hbj hbjVar, tgq tgqVar, pjo pjoVar, juy juyVar, kvg kvgVar) {
        this.g = hbjVar;
        this.e = tgqVar;
        this.f = pjoVar.l() == pka.FRONT;
        this.a = juyVar;
        this.b = kvgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v7 */
    private final obu d(pfg pfgVar, FrameRequest frameRequest, poe poeVar) {
        boolean z;
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        boolean z2;
        float[] fArr;
        gzi gziVar = gzs.a;
        pjo pjoVarH = this.e.h(poeVar);
        float fA = frameRequest.a();
        float fFrameRequest_desired_analog_gain_get = GcamModuleJNI.FrameRequest_desired_analog_gain_get(frameRequest.a, frameRequest);
        float fFrameRequest_desired_digital_gain_get = GcamModuleJNI.FrameRequest_desired_digital_gain_get(frameRequest.a, frameRequest);
        pfgVar.e(CaptureRequest.CONTROL_MODE, 1);
        pfgVar.e(CaptureRequest.CONTROL_AE_MODE, 0);
        long jF = tgq.f(fA);
        pfgVar.e(CaptureRequest.SENSOR_EXPOSURE_TIME, Long.valueOf(jF));
        long jF2 = tgq.f(GcamModuleJNI.FrameRequest_desired_additional_sensor_frame_duration_ms_get(frameRequest.a, frameRequest));
        if (jF2 >= 0.0f) {
            pfgVar.e(CaptureRequest.SENSOR_FRAME_DURATION, Long.valueOf(jF + jF2));
        } else {
            pfgVar.e(CaptureRequest.SENSOR_FRAME_DURATION, 0L);
        }
        pfgVar.e(CaptureRequest.SENSOR_SENSITIVITY, Integer.valueOf((int) (fFrameRequest_desired_digital_gain_get * fFrameRequest_desired_analog_gain_get * tgq.m(pjoVarH).c())));
        if (frameRequest.b() >= 0.0f) {
            pfgVar.e(CaptureRequest.CONTROL_AF_MODE, 0);
            pfgVar.e(CaptureRequest.LENS_FOCUS_DISTANCE, Float.valueOf(frameRequest.b()));
        }
        CyclopsParameters cyclopsParametersE = frameRequest.e();
        if (!GcamModuleJNI.CyclopsParameters_apply_isp_tonemapping_get(cyclopsParametersE.a, cyclopsParametersE) || (key2 = nvk.b) == null) {
            z = 1;
        } else {
            float fFrameRequest_short_tet_get = GcamModuleJNI.FrameRequest_short_tet_get(frameRequest.a, frameRequest);
            float fFrameRequest_long_tet_get = GcamModuleJNI.FrameRequest_long_tet_get(frameRequest.a, frameRequest);
            float fFrameRequest_portrait_tet_get = GcamModuleJNI.FrameRequest_portrait_tet_get(frameRequest.a, frameRequest);
            CaptureResult.Key key3 = nvk.c;
            float f = -1.0f;
            if (key3 == null || (fArr = (float[]) poeVar.a(key3)) == null) {
                z2 = true;
            } else {
                z2 = true;
                if (fArr.length >= 4) {
                    f = fArr[3];
                    z2 = true;
                }
            }
            ArrayList arrayList = new ArrayList();
            Float fValueOf = Float.valueOf(0.0f);
            arrayList.add(fValueOf);
            arrayList.add(Float.valueOf(fFrameRequest_short_tet_get));
            arrayList.add(Float.valueOf(fFrameRequest_long_tet_get));
            arrayList.add(Float.valueOf(f));
            arrayList.add(fValueOf);
            arrayList.add(Float.valueOf(fFrameRequest_portrait_tet_get));
            pfgVar.e(key2, ske.am(arrayList));
            z = z2;
        }
        pfgVar.e(CaptureRequest.BLACK_LEVEL_LOCK, Boolean.valueOf(GcamModuleJNI.FrameRequest_try_to_lock_black_level_get(frameRequest.a, frameRequest)));
        long jFrameRequest_awb_get = GcamModuleJNI.FrameRequest_awb_get(frameRequest.a, frameRequest);
        AwbInfo awbInfo = jFrameRequest_awb_get == 0 ? null : new AwbInfo(jFrameRequest_awb_get, false);
        if (GcamModuleJNI.AwbInfo_IsValid(awbInfo.a, awbInfo)) {
            pfgVar.e(CaptureRequest.CONTROL_AWB_MODE, 0);
            pfgVar.e(CaptureRequest.COLOR_CORRECTION_MODE, 0);
            int[] iArrY = tgq.y(tgq.v(pjoVarH).intValue());
            long jAwbInfo_rggb_gains_get = GcamModuleJNI.AwbInfo_rggb_gains_get(awbInfo.a, awbInfo);
            FloatArray4 floatArray4 = jAwbInfo_rggb_gains_get == 0 ? null : new FloatArray4(jAwbInfo_rggb_gains_get, false);
            pfgVar.e(CaptureRequest.COLOR_CORRECTION_GAINS, new RggbChannelVector(floatArray4.a(iArrY[0]), floatArray4.a(iArrY[z]), floatArray4.a(iArrY[2]), floatArray4.a(iArrY[3])));
            long jAwbInfo_rgb2rgb_get = GcamModuleJNI.AwbInfo_rgb2rgb_get(awbInfo.a, awbInfo);
            FloatArray9 floatArray9 = jAwbInfo_rgb2rgb_get == 0 ? null : new FloatArray9(jAwbInfo_rgb2rgb_get, false);
            rnt.D(GcamModuleJNI.FloatArray9_size(floatArray9.a, floatArray9) == 9 ? z : false, "ccm must have length %s.", 9);
            Rational[] rationalArr = new Rational[9];
            for (int i = 0; i < 9; i++) {
                rationalArr[i] = new Rational((int) (floatArray9.a(i) * 10000.0f), 10000);
            }
            pfgVar.e(CaptureRequest.COLOR_CORRECTION_TRANSFORM, new ColorSpaceTransform(rationalArr));
        }
        pfgVar.e(CaptureRequest.STATISTICS_LENS_SHADING_MAP_MODE, 1);
        pfgVar.e(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1);
        pfgVar.e(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(nvj.k != null ? 128 : pjoVarH.k().e));
        pfgVar.e(CaptureRequest.STATISTICS_HOT_PIXEL_MAP_MODE, Boolean.valueOf(GcamModuleJNI.FrameRequest_android_statistics_hot_pixel_map_mode_get(frameRequest.a, frameRequest)));
        pfg pfgVarA = pfg.a(pfgVar);
        if (frameRequest.d() == tbq.f || frameRequest.d() == tbq.c || (key = nvl.s) == null) {
            ezh.S(this.g, pfgVarA);
        } else {
            pfgVarA.e(key, d);
        }
        return new obu(pfgVarA.b(), new FrameRequest(GcamModuleJNI.new_FrameRequest__SWIG_1(FrameRequest.c(frameRequest), frameRequest), z), (byte[]) null);
    }

    final int a() {
        hbj hbjVar = this.g;
        if (hbjVar.p(gzs.aa)) {
            return 1;
        }
        return (!hbjVar.p(gzo.at) || this.f) ? 0 : 2;
    }

    public final List b(long j, pfg pfgVar, FrameRequestVector frameRequestVector, poe poeVar, int i) {
        rnt.L(frameRequestVector.a() >= ((long) i));
        rnt.L(frameRequestVector.a() > 0);
        ArrayList arrayList = new ArrayList(i);
        FrameRequest frameRequestB = frameRequestVector.b(0);
        obu obuVarD = d(pfgVar, frameRequestB, poeVar);
        arrayList.add(obuVarD);
        FrameRequest frameRequest = frameRequestB;
        for (int i2 = 1; i2 < i; i2++) {
            FrameRequest frameRequestB2 = frameRequestVector.b(i2);
            if (!GcamModuleJNI.FrameRequest_Equals(frameRequestB2.a, frameRequestB2, FrameRequest.c(frameRequest), frameRequest)) {
                obuVarD = d(pfgVar, frameRequestB2, poeVar);
                frameRequest = frameRequestB2;
            }
            arrayList.add(obuVarD);
        }
        return arrayList;
    }

    public final void c(pfg pfgVar, kmk kmkVar, pdv pdvVar, int i, int i2, kit kitVar) {
        pfgVar.c(pdvVar);
        kmkVar.e(i + i2);
        pfgVar.g(new kxu(kmkVar));
        if (!this.g.p(gzo.ac)) {
            pfgVar.e(CaptureRequest.CONTROL_CAPTURE_INTENT, 0);
        }
        CaptureRequest.Key key = nvh.a;
        if (key != null) {
            pfgVar.e(key, Integer.valueOf(a()));
        }
        Optional optional = this.a.a;
        if (optional.isPresent()) {
            pfgVar.e((CaptureRequest.Key) optional.get(), 0);
        }
        pfgVar.f(kitVar.a);
    }
}
