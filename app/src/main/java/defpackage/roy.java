package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class roy extends row {
    public static final /* synthetic */ int t = 0;
    private static final int[] u = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    private final AccessibilityManager v;
    private boolean w;

    private roy(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.v = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:0: B:3:0x0002->B:36:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.roy k(android.content.Context r6, android.view.View r7, java.lang.CharSequence r8) {
        /*
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto L9
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L9:
            boolean r2 = r7 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L1c
            int r1 = r7.getId()
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L19
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L2d
        L19:
            r1 = r7
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1c:
            if (r7 == 0) goto L2a
            android.view.ViewParent r7 = r7.getParent()
            boolean r2 = r7 instanceof android.view.View
            if (r2 == 0) goto L29
            android.view.View r7 = (android.view.View) r7
            goto L2a
        L29:
            r7 = r0
        L2a:
            if (r7 != 0) goto L2
            r7 = r1
        L2d:
            if (r7 == 0) goto L6e
            if (r6 != 0) goto L35
            android.content.Context r6 = r7.getContext()
        L35:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r6)
            int[] r1 = defpackage.roy.u
            android.content.res.TypedArray r1 = r6.obtainStyledAttributes(r1)
            r2 = 0
            r3 = -1
            int r4 = r1.getResourceId(r2, r3)
            r5 = 1
            int r5 = r1.getResourceId(r5, r3)
            r1.recycle()
            r1 = 2131624045(0x7f0e006d, float:1.8875259E38)
            if (r4 == r3) goto L57
            if (r5 == r3) goto L57
            r1 = 2131624178(0x7f0e00f2, float:1.8875528E38)
        L57:
            android.view.View r0 = r0.inflate(r1, r7, r2)
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0
            roy r1 = new roy
            r1.<init>(r6, r7, r0, r0)
            com.google.android.material.snackbar.SnackbarContentLayout r6 = r1.m()
            android.widget.TextView r6 = r6.a
            r6.setText(r8)
            r1.k = r3
            return r1
        L6e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "No suitable parent found from the given view. Please provide a valid view."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roy.k(android.content.Context, android.view.View, java.lang.CharSequence):roy");
    }

    private final SnackbarContentLayout m() {
        return (SnackbarContentLayout) this.j.getChildAt(0);
    }

    @Override // defpackage.row
    public final int a() {
        return this.v.getRecommendedTimeoutMillis(this.k, (true != this.w ? 0 : 4) | 3);
    }

    public final void l(View.OnClickListener onClickListener) {
        CharSequence text = this.i.getText(R.string.mode_settings);
        Button button = m().b;
        if (TextUtils.isEmpty(text)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.w = false;
        } else {
            this.w = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new ipd(this, onClickListener, 13, null));
        }
    }
}
