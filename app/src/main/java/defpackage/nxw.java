package defpackage;

import android.view.MotionEvent;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxw implements kt {
    final /* synthetic */ WearPickerColumn a;
    private boolean b;

    public nxw(WearPickerColumn wearPickerColumn) {
        this.a = wearPickerColumn;
    }

    @Override // defpackage.kt
    public final boolean g(MotionEvent motionEvent) {
        WearPickerColumn wearPickerColumn = this.a;
        if (!wearPickerColumn.isActivated() && !wearPickerColumn.b.y()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.b = true;
                action = 0;
            }
            if (this.b && wearPickerColumn.a.onTouchEvent(motionEvent)) {
                this.b = false;
                wearPickerColumn.callOnClick();
            }
            if (action == 1 || action == 3) {
                this.b = false;
            }
        }
        return false;
    }

    @Override // defpackage.kt
    public final void h() {
    }

    @Override // defpackage.kt
    public final void i(MotionEvent motionEvent) {
    }
}
