package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteShutterButton extends ShutterButton {
    public RemoteShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    public final float a() {
        return getResources().getInteger(R.integer.wear_shutter_btn_size) / (e().A + b());
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        for (AccessibilityNodeInfo.AccessibilityAction accessibilityAction : accessibilityNodeInfo.getActionList()) {
            if (accessibilityAction.getId() == 32) {
                accessibilityNodeInfo.removeAction(accessibilityAction);
                return;
            }
        }
    }
}
