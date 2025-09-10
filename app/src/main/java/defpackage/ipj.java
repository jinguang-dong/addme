package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ipj extends View.AccessibilityDelegate {
    final /* synthetic */ ipk a;

    public ipj(ipk ipkVar) {
        this.a = ipkVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        ipk ipkVar = this.a;
        boolean zBooleanValue = ((Boolean) ipkVar.l.dL()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ipkVar.m.dL()).booleanValue();
        Context context = ipkVar.a;
        accessibilityNodeInfo.setContentDescription(context.getResources().getString(zBooleanValue ? R.string.rear_camera_selfie_on_button_accessibility_description : zBooleanValue2 ? R.string.dual_screen_on_button_accessibility_description : R.string.entry_button_accessibility_description));
        if (zBooleanValue || zBooleanValue2) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, context.getResources().getString(R.string.turn_off_button_accessibility_description)));
        }
    }
}
