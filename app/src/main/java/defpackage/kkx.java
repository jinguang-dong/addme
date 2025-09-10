package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import com.google.android.apps.camera.focusindicator.CIAk.YyLACfm;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkx implements kkn {
    final /* synthetic */ ejt a;
    private final /* synthetic */ int b;

    public kkx(ejt ejtVar, int i) {
        this.b = i;
        this.a = ejtVar;
    }

    public /* synthetic */ kkx(ejt ejtVar, int i, byte[] bArr) {
        this.b = i;
        this.a = ejtVar;
    }

    @Override // defpackage.kkn
    public final kkz a(kko kkoVar) {
        int i = this.b;
        if (i == 0) {
            hbp hbpVarS = this.a.s(kkoVar);
            ArrayList arrayList = new ArrayList();
            jsv.m("legacy", hbpVarS.n(2), arrayList);
            return new kkz("legacy", arrayList);
        }
        if (i == 1) {
            ejt ejtVar = this.a;
            hbp hbpVarS2 = ejtVar.s(kkoVar);
            ArrayList arrayList2 = new ArrayList();
            jsv.m("single image", hbpVarS2.j(), arrayList2);
            jsv.m("limited or full", hbpVarS2.n(0, 1, 3), arrayList2);
            jsv.m("hw jpeg, sw jpeg, reprocessing", hbpVarS2.m(kkq.HW_JPEG, kkq.SW_JPEG, kkq.REPROCESSING), arrayList2);
            ejt ejtVar2 = (ejt) hbpVarS2.a;
            jsv.m(YyLACfm.OshiLFFCkzLam, ejtVar2.t().o(CaptureResult.FLASH_STATE, 3), arrayList2);
            jsv.m("edge", hbpVarS2.h(), arrayList2);
            jsv.m("noise reduction", hbpVarS2.k(), arrayList2);
            jsv.m("af converged", ejtVar2.t().p(CaptureResult.CONTROL_AF_STATE, 2, 6, 0, 4, 5), arrayList2);
            int[] iArr = (int[]) ((pkb) ejtVar.a).m(CameraCharacteristics.COLOR_CORRECTION_AVAILABLE_ABERRATION_MODES);
            if (iArr != null && iArr.length > 1) {
                jsv.m("aberration", hbpVarS2.l(Integer.class, CaptureResult.COLOR_CORRECTION_ABERRATION_MODE, 0, scn.H(1, 2), scn.H(1, 2)), arrayList2);
            }
            return new kkz("flash", arrayList2);
        }
        if (i != 2) {
            hbp hbpVarS3 = this.a.s(kkoVar);
            ArrayList arrayList3 = new ArrayList();
            jsv.m("single image", hbpVarS3.j(), arrayList3);
            jsv.m("limited or full", hbpVarS3.n(0, 1), arrayList3);
            jsv.m("processing method", hbpVarS3.m(kkq.NPF_REPROCESSING), arrayList3);
            jsv.m("flash off", hbpVarS3.i(), arrayList3);
            return new kkz("npf reprocessing", arrayList3);
        }
        hbp hbpVarS4 = this.a.s(kkoVar);
        ArrayList arrayList4 = new ArrayList();
        jsv.m("single image", hbpVarS4.j(), arrayList4);
        jsv.m("limited or full", hbpVarS4.n(0, 1, 3), arrayList4);
        jsv.m("hw_jpeg, sw_jpeg, reprocessing", hbpVarS4.m(kkq.HW_JPEG, kkq.SW_JPEG, kkq.REPROCESSING), arrayList4);
        jsv.m("flash off", hbpVarS4.i(), arrayList4);
        jsv.m("edge", hbpVarS4.h(), arrayList4);
        jsv.m("noise reduction", hbpVarS4.k(), arrayList4);
        return new kkz("regular", arrayList4);
    }
}
