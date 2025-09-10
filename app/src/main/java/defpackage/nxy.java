package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.clockwork.common.wearable.wearmaterial.picker.WearPickerColumn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nxy {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final int a(WearPickerColumn wearPickerColumn, int i, int i2, View view) {
        if (view.getVisibility() != 8) {
            wearPickerColumn.measureChildWithMargins(view, i, 0, i2, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            this.c = view.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            this.d = view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            this.e = View.combineMeasuredStates(this.e, view.getMeasuredState());
        } else {
            this.c = 0;
            this.d = 0;
        }
        this.a = Math.max(this.a, this.c);
        return this.d;
    }
}
