package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxo extends View.AccessibilityDelegate {
    final /* synthetic */ SmartsChipView a;

    public lxo(SmartsChipView smartsChipView) {
        this.a = smartsChipView;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 65536) {
            SmartsChipView smartsChipView = this.a;
            if (!smartsChipView.a.isAccessibilityFocused() && !smartsChipView.c.isAccessibilityFocused() && smartsChipView.d) {
                smartsChipView.b();
            }
        } else if (accessibilityEvent.getEventType() == 1 && this.a.n) {
            view.performAccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLEAR_ACCESSIBILITY_FOCUS.getId(), null);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
