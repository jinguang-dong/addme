package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtl extends View.AccessibilityDelegate {
    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 2048) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
