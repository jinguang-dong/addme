package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rnl {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_focused};
    public static final int[] c = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] d = {R.attr.state_selected};

    private rnl() {
    }

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        int iAlpha = Color.alpha(colorForState);
        return cmg.e(colorForState, Math.min(iAlpha + iAlpha, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }
}
