package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.smarts.SmartsChipView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxp extends mml {
    final /* synthetic */ SmartsChipView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxp(SmartsChipView smartsChipView, View.AccessibilityDelegate accessibilityDelegate) {
        super(accessibilityDelegate);
        this.a = smartsChipView;
    }

    @Override // defpackage.mml, android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            CharSequence contentDescription = view.getContentDescription();
            SmartsChipView smartsChipView = this.a;
            boolean zEquals = TextUtils.equals(smartsChipView.g, contentDescription);
            smartsChipView.g = contentDescription;
            if (zEquals) {
                return;
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
