package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface ta extends ri, sc {
    CaptureRequest.Builder a(int i);

    CaptureRequest.Builder b(TotalCaptureResult totalCaptureResult);

    String d();

    void f();

    boolean g(uo uoVar);

    boolean h(tp tpVar);

    boolean i(List list, tm tmVar);

    boolean j(List list, tm tmVar);

    boolean k(List list, tm tmVar);

    boolean l(InputConfiguration inputConfiguration, List list, tm tmVar);

    boolean m(tr trVar, List list, tm tmVar);
}
