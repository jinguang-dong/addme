package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.evcomp.EvCompSlider;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ked implements View.OnHoverListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ked(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i = this.b;
        if (i == 0) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) ((kef) this.a).a.getSystemService("accessibility");
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            view.sendAccessibilityEvent(8);
            return true;
        }
        if (i == 1) {
            if (!((EvCompSlider) this.a).a.isTouchExplorationEnabled()) {
                return false;
            }
            view.sendAccessibilityEvent(8);
            return true;
        }
        view.getClass();
        motionEvent.getClass();
        if (!((AccessibilityManager) ((nhz) this.a).j).isTouchExplorationEnabled()) {
            return false;
        }
        view.sendAccessibilityEvent(8);
        return true;
    }
}
