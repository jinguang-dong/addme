package defpackage;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MultiResolutionStreamConfigurationMap;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pjn implements pjo {
    public final pjr a;
    public final scn b;
    private final pnq h;
    private final pbn i;
    private final pbc j;
    private final ozz l;
    private StreamConfigurationMap k = null;
    private final Object g = new Object();

    public pjn(pjr pjrVar, ozz ozzVar, Set set, pnq pnqVar, pbn pbnVar, pbc pbcVar) {
        this.a = pjrVar;
        this.l = ozzVar;
        this.b = scn.F(set);
        this.h = pnqVar;
        this.i = pbnVar;
        this.j = pbcVar.a("Characteristics");
    }

    private final StreamConfigurationMap Q() {
        StreamConfigurationMap streamConfigurationMap;
        synchronized (this.g) {
            if (this.k == null) {
                try {
                    this.i.f(a.bw(this.a.a, "StreamConfigurationMap(", ")#create"));
                    this.k = (StreamConfigurationMap) m(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                } catch (Exception e) {
                    this.j.e(mn.g(this.a.a, "Unable to obtain StreamConfigurationMap for camera "), e);
                    return null;
                } finally {
                    this.i.g();
                }
            }
            streamConfigurationMap = this.k;
        }
        return streamConfigurationMap;
    }

    @Override // defpackage.pjo
    public final Set A() {
        return this.l.a.k();
    }

    @Override // defpackage.pjo
    public final Set B() {
        return this.l.a.l();
    }

    @Override // defpackage.pjo
    public final Set C() {
        return this.b;
    }

    @Override // defpackage.pjo
    public final boolean D() {
        return (this.h.o && l().equals(pka.FRONT)) ? false : true;
    }

    @Override // defpackage.pjo
    public final boolean E() {
        Integer num = (Integer) m(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        return num != null && num.intValue() > 0;
    }

    @Override // defpackage.pjo
    public final boolean F() {
        Integer num = (Integer) m(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        Float f = (Float) m(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        return num != null && num.intValue() > 0 && f != null && f.floatValue() > 0.0f;
    }

    @Override // defpackage.pjo
    public final boolean G() {
        Float f = (Float) m(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
        if (f != null) {
            return f.floatValue() > 0.0f;
        }
        List listQ = q();
        return listQ.contains(1) || listQ.contains(2) || listQ.contains(4) || listQ.contains(3);
    }

    @Override // defpackage.pjo
    public final boolean H() {
        Range range = (Range) m(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null) {
            if (range.getLower() == null || ((Integer) range.getLower()).intValue() == 0) {
                return (range.getUpper() == null || ((Integer) range.getUpper()).intValue() == 0) ? false : true;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.pjo
    public final boolean I() {
        return J() || l() == pka.FRONT;
    }

    @Override // defpackage.pjo
    public final boolean J() {
        return ((Boolean) n(CameraCharacteristics.FLASH_INFO_AVAILABLE, false)).booleanValue();
    }

    @Override // defpackage.pjo
    public final boolean K() {
        try {
            return A().contains(CaptureRequest.CONTROL_ENABLE_ZSL);
        } catch (NoSuchFieldError unused) {
            return false;
        }
    }

    @Override // defpackage.pjo
    public final boolean L() {
        for (int i : (int[]) n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, c)) {
            if (i == 9) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pjo
    public final boolean M() {
        for (int i : (int[]) n(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES, c)) {
            if (i == 11) {
                return this.b.size() > 1;
            }
        }
        return false;
    }

    @Override // defpackage.pjo
    public final boolean N() {
        for (int i : (int[]) n(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES, c)) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pjo
    public final byte[] O() {
        byte[] bArr = f;
        CameraCharacteristics.Key key = nvi.a;
        return key != null ? (byte[]) n(key, bArr) : bArr;
    }

    @Override // defpackage.pjo
    public final pjm P() {
        MultiResolutionStreamConfigurationMap multiResolutionStreamConfigurationMap = (MultiResolutionStreamConfigurationMap) this.l.a(CameraCharacteristics.SCALER_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP);
        if (multiResolutionStreamConfigurationMap != null) {
            return new pjm(multiResolutionStreamConfigurationMap);
        }
        return null;
    }

    @Override // defpackage.pjo
    public final float a() {
        if (!H()) {
            return -1.0f;
        }
        Rational rational = (Rational) n(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP, Rational.ZERO);
        return rational.getNumerator() / rational.getDenominator();
    }

    @Override // defpackage.pjo
    public final float c() {
        Range range = (Range) m(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        return range != null ? ((Float) range.getUpper()).floatValue() : ((Float) n(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM, Float.valueOf(1.0f))).floatValue();
    }

    @Override // defpackage.pjo
    public final float d() {
        Range range = (Range) m(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (range != null) {
            return ((Float) range.getLower()).floatValue();
        }
        return 1.0f;
    }

    @Override // defpackage.pjo
    public final int e() {
        if (H()) {
            return ((Integer) ((Range) o(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getUpper()).intValue();
        }
        return -1;
    }

    @Override // defpackage.pnt
    public final Object ex(Class cls) {
        throw null;
    }

    @Override // defpackage.pjo
    public final int f() {
        if (H()) {
            return ((Integer) ((Range) o(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE)).getLower()).intValue();
        }
        return -1;
    }

    @Override // defpackage.pjo
    public final int g() {
        return ((Integer) o(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
    }

    @Override // defpackage.pjo
    public final long h(int i, pas pasVar) {
        StreamConfigurationMap streamConfigurationMapQ = Q();
        if (streamConfigurationMapQ == null) {
            return 0L;
        }
        return streamConfigurationMapQ.getOutputMinFrameDuration(i, ojl.bK(pasVar));
    }

    @Override // defpackage.pjo
    public final Rect i() {
        return (Rect) o(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
    }

    @Override // defpackage.pjo
    public final pjr j() {
        return this.a;
    }

    @Override // defpackage.pjo
    public final pjz k() {
        int[] iArr = (int[]) n(CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES, c);
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            arrayList.add(i2 != 1 ? i2 != 2 ? i2 != 128 ? pjz.NONE : pjz.EXTENDED : pjz.FULL : pjz.SIMPLE);
        }
        pjz pjzVar = pjz.FULL;
        if (arrayList.contains(pjzVar)) {
            return pjzVar;
        }
        pjz pjzVar2 = pjz.SIMPLE;
        return arrayList.contains(pjzVar2) ? pjzVar2 : pjz.NONE;
    }

    @Override // defpackage.pjo
    public final pka l() {
        int iIntValue = ((Integer) o(CameraCharacteristics.LENS_FACING)).intValue();
        return iIntValue == 1 ? pka.BACK : iIntValue == 0 ? pka.FRONT : pka.EXTERNAL;
    }

    @Override // defpackage.pjo
    public final Object m(CameraCharacteristics.Key key) {
        return this.l.a(key);
    }

    @Override // defpackage.pjo
    public final Object n(CameraCharacteristics.Key key, Object obj) {
        key.getClass();
        obj.getClass();
        Object objA = this.l.a.a(key);
        return objA == null ? obj : objA;
    }

    @Override // defpackage.pjo
    public final Object o(CameraCharacteristics.Key key) {
        key.getClass();
        Object objA = this.l.a.a(key);
        if (objA != null) {
            return objA;
        }
        Objects.toString(key);
        throw new pad("CameraMetadata missing value for key-".concat(key.toString()));
    }

    @Override // defpackage.pjo
    public final List p() {
        return ske.ag((int[]) n(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES, c));
    }

    @Override // defpackage.pjo
    public final List q() {
        return ske.ag((int[]) n(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, c));
    }

    @Override // defpackage.pjo
    public final List r() {
        return ske.ag((int[]) n(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES, c));
    }

    @Override // defpackage.pjo
    public final List s() {
        return ske.al((float[]) n(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS, d));
    }

    @Override // defpackage.pjo
    public final List t() {
        return ojl.bO((Size[]) n(CameraCharacteristics.JPEG_AVAILABLE_THUMBNAIL_SIZES, e));
    }

    @Override // defpackage.pjo
    public final List u() {
        float[] fArr = (float[]) this.l.a(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        fArr.getClass();
        Arrays.sort(fArr);
        ArrayList arrayList = new ArrayList();
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @Override // defpackage.pjo
    public final List v() {
        return Arrays.asList((Range[]) o(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    @Override // defpackage.pjo
    public final List w(pas pasVar) {
        StreamConfigurationMap streamConfigurationMapQ = Q();
        if (streamConfigurationMapQ == null) {
            return Collections.EMPTY_LIST;
        }
        Range<Integer>[] highSpeedVideoFpsRangesFor = streamConfigurationMapQ.getHighSpeedVideoFpsRangesFor(ojl.bK(pasVar));
        return highSpeedVideoFpsRangesFor == null ? Collections.EMPTY_LIST : Arrays.asList(highSpeedVideoFpsRangesFor);
    }

    @Override // defpackage.pjo
    public final List x() {
        StreamConfigurationMap streamConfigurationMapQ = Q();
        if (streamConfigurationMapQ == null) {
            return Collections.EMPTY_LIST;
        }
        Size[] highSpeedVideoSizes = streamConfigurationMapQ.getHighSpeedVideoSizes();
        if (highSpeedVideoSizes == null) {
            return Collections.EMPTY_LIST;
        }
        List listBO = ojl.bO(highSpeedVideoSizes);
        return Arrays.asList((pas[]) listBO.toArray(new pas[listBO.size()]));
    }

    @Override // defpackage.pjo
    public final List y(int i) {
        StreamConfigurationMap streamConfigurationMapQ = Q();
        return streamConfigurationMapQ == null ? Collections.EMPTY_LIST : ojl.bO(streamConfigurationMapQ.getOutputSizes(i));
    }

    @Override // defpackage.pjo
    public final List z() {
        StreamConfigurationMap streamConfigurationMapQ = Q();
        return streamConfigurationMapQ == null ? Collections.EMPTY_LIST : ojl.bO(streamConfigurationMapQ.getOutputSizes(SurfaceTexture.class));
    }
}
