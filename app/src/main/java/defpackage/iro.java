package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class iro extends View.AccessibilityDelegate {
    final /* synthetic */ irs a;

    public iro(irs irsVar) {
        this.a = irsVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        irs irsVar = this.a;
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, irsVar.g.getString(true != irsVar.w ? R.string.uranus_collapse_button_action_accessibility : R.string.uranus_expand_button_action_accessibility)));
    }
}
