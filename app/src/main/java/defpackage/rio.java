package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rio implements View.OnAttachStateChangeListener {
    final /* synthetic */ clc a;
    private final /* synthetic */ int b;

    public rio(clc clcVar, int i) {
        this.b = i;
        this.a = clcVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        if (this.b != 0) {
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.a;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.b;
            if (touchExplorationStateChangeListener == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.a) == null) {
                return;
            }
            accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            hideBottomViewOnScrollBehavior.b = null;
            return;
        }
        HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.a;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideViewOnScrollBehavior.b;
        if (touchExplorationStateChangeListener2 == null || (accessibilityManager = hideViewOnScrollBehavior.a) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
        hideViewOnScrollBehavior.b = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
