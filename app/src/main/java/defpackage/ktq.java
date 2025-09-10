package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ OptionsMenuView a;
    private boolean b;

    public ktq(OptionsMenuView optionsMenuView) {
        this.a = optionsMenuView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        OptionsMenuView optionsMenuView = this.a;
        this.b = optionsMenuView.getChildAt(optionsMenuView.getChildCount() + (-1)).getBottom() - (optionsMenuView.getHeight() + optionsMenuView.getScrollY()) == 0;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r1.getHeight() >= ((r1.findViewById(com.google.ar.core.R.id.options_menu_internal_list).getHeight() + r1.getPaddingTop()) + r1.getPaddingBottom())) goto L23;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L76
            if (r7 != 0) goto L6
            goto L76
        L6:
            com.google.android.apps.camera.optionsbar.view.OptionsMenuView r1 = r5.a
            mxm r2 = r1.j
            int r2 = r2.ordinal()
            r3 = 1
            if (r2 == r3) goto L31
            r4 = 2
            if (r2 == r4) goto L22
            float r6 = r6.getY()
            float r7 = r7.getY()
            float r6 = r6 - r7
            float r7 = java.lang.Math.abs(r9)
            goto L3e
        L22:
            float r7 = r7.getX()
            float r6 = r6.getX()
            float r6 = r7 - r6
            float r7 = java.lang.Math.abs(r8)
            goto L3e
        L31:
            float r6 = r6.getX()
            float r7 = r7.getX()
            float r6 = r6 - r7
            float r7 = java.lang.Math.abs(r8)
        L3e:
            r8 = 1117782016(0x42a00000, float:80.0)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L76
            r6 = 1133903872(0x43960000, float:300.0)
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L76
            mxm r6 = defpackage.mxm.PORTRAIT
            mxm r7 = r1.j
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L73
            boolean r6 = r5.b
            if (r6 != 0) goto L73
            r6 = 2131428236(0x7f0b038c, float:1.847811E38)
            android.view.View r6 = r1.findViewById(r6)
            int r6 = r6.getHeight()
            int r7 = r1.getHeight()
            int r8 = r1.getPaddingTop()
            int r6 = r6 + r8
            int r8 = r1.getPaddingBottom()
            int r6 = r6 + r8
            if (r7 < r6) goto L76
        L73:
            r5.b = r0
            return r3
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktq.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }
}
