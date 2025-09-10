package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gco implements pau {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private boolean c = true;
    private final /* synthetic */ int d;

    public gco(Object obj, Object obj2, int i) {
        this.d = i;
        this.b = obj2;
        this.a = obj;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        if (this.d == 0) {
            Range range = (Range) obj;
            if (this.c) {
                this.c = false;
                return;
            } else {
                gcp.e(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range, (pfu) this.b);
                return;
            }
        }
        Boolean bool = (Boolean) obj;
        if (this.c) {
            this.c = false;
        } else {
            if (bool.booleanValue() || ((Boolean) ((ovx) ((qrh) this.b).d).d).booleanValue()) {
                return;
            }
            ((fcy) this.a).close();
        }
    }
}
