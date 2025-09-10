package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import com.google.android.camera.experimental2016.ExperimentalKeys;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nvh {
    public static final CaptureRequest.Key a;
    public static final CaptureResult.Key b;
    private static final boolean c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;
    private static final boolean g;
    private static final boolean h;
    private static final boolean i;
    private static final boolean j;
    private static final boolean k;
    private static final boolean l;
    private static final boolean m;
    private static final boolean n;

    static {
        boolean zB = nvr.b(1);
        c = zB;
        boolean zB2 = nvr.b(2);
        d = zB2;
        boolean zB3 = nvr.b(3);
        e = zB3;
        boolean zB4 = nvr.b(4);
        f = zB4;
        boolean zB5 = nvr.b(5);
        g = zB5;
        boolean zB6 = nvr.b(6);
        h = zB6;
        boolean zB7 = nvr.b(7);
        i = zB7;
        boolean zB8 = nvr.b(8);
        j = zB8;
        boolean zB9 = nvr.b(10);
        k = zB9;
        boolean zB10 = nvr.b(11);
        l = zB10;
        boolean zB11 = nvr.b(13);
        m = zB11;
        n = true;
        a = zB ? ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : zB2 ? com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : zB3 ? com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_CONTROL_HYBRID_AE : zB4 ? com.google.android.camera.experimental2019.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB5 ? com.google.android.camera.experimental2020_midyear.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB6 ? com.google.android.camera.experimental2020.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB7 ? com.google.android.camera.experimental2021.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB8 ? com.google.android.camera.experimental2022.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB9 ? com.google.android.camera.experimental2023.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB10 ? com.google.android.camera.experimental2024.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : zB11 ? com.google.android.camera.experimental2025.ExperimentalKeys.REQUEST_HYBRID_AE_ENABLE : null;
        if (zB) {
            CaptureResult.Key key = ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zB2) {
            CaptureResult.Key key2 = com.google.android.camera.experimental2017.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zB3) {
            CaptureResult.Key key3 = com.google.android.camera.experimental2018.ExperimentalKeys.EXPERIMENTAL_DYNAMIC_HYBRID_AE;
        } else if (zB4) {
            CaptureResult.Key key4 = com.google.android.camera.experimental2019.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB5) {
            CaptureResult.Key key5 = com.google.android.camera.experimental2020_midyear.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB6) {
            CaptureResult.Key key6 = com.google.android.camera.experimental2020.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB7) {
            CaptureResult.Key key7 = com.google.android.camera.experimental2021.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB8) {
            CaptureResult.Key key8 = com.google.android.camera.experimental2022.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB9) {
            CaptureResult.Key key9 = com.google.android.camera.experimental2023.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB10) {
            CaptureResult.Key key10 = com.google.android.camera.experimental2024.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        } else if (zB11) {
            CaptureResult.Key key11 = com.google.android.camera.experimental2025.ExperimentalKeys.RESULT_HYBRID_AE_ENABLE;
        }
        b = CaptureResult.CONTROL_AF_SCENE_CHANGE;
    }
}
