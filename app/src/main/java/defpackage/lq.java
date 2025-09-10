package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lq extends kr {
    public lu a;
    public boolean b;

    public lq(int i, int i2) {
        super(i, i2);
    }

    public final int d() {
        lu luVar = this.a;
        if (luVar == null) {
            return -1;
        }
        return luVar.e;
    }

    public lq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public lq(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public lq(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
