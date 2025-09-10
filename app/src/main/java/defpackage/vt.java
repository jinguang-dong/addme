package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vt {
    public static final /* synthetic */ int a = 0;
    private static final List b;

    static {
        rnt.ae(new Integer[]{2, 4, 3});
        rnt.ae(new Integer[]{2, 3});
        rnt.ae(new Integer[]{2, 6, 4, 5});
        ske.bj(3);
        ske.bj(3);
        rnt.ae(new Integer[]{4, 5});
        rnt.ae(new Integer[]{2, 4, 3});
        rnt.ae(new Integer[]{2, 3});
        ske.ba(new uev(CaptureRequest.CONTROL_AF_TRIGGER, 1));
        ske.ba(new uev(CaptureRequest.CONTROL_AF_TRIGGER, 2));
        ske.ba(new uev(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
        ske.bc(new uev(CaptureRequest.CONTROL_AF_TRIGGER, 1), new uev(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1));
        new umr().O(new re());
        rnt.ae(new Integer[]{0, 1, 2, 4});
        List listAe = rnt.ae(new Integer[]{0, 3, 1, 2, 6});
        b = listAe;
        rnt.ae(new Integer[]{0, 1, 2});
        ske.ba(new uev(CaptureRequest.CONTROL_AE_LOCK, true));
        ske.bc(new uev(CaptureRequest.CONTROL_AF_TRIGGER, 2), new uev(CaptureRequest.CONTROL_AE_LOCK, true));
        ske.ba(new uev(CaptureRequest.CONTROL_AE_LOCK, false));
        ske.ba(new uev(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        ske.bc(new uev(CaptureRequest.CONTROL_AF_TRIGGER, 2), new uev(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2));
        ske.ba(new uev(CaptureResult.CONTROL_AF_STATE, listAe));
    }
}
