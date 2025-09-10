package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.jupiter.uranus.UranusCharacterItem;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class irr extends View.AccessibilityDelegate {
    final /* synthetic */ irs a;

    public irr(irs irsVar) {
        this.a = irsVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            this.a.j();
        }
        return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        irs irsVar = this.a;
        Optional optionalF = irsVar.f(irsVar.v);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = irsVar.b;
        accessibilityNodeInfo.removeAction(accessibilityAction);
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = irsVar.c;
        accessibilityNodeInfo.removeAction(accessibilityAction2);
        if (irsVar.w) {
            if (optionalF.isPresent() && view.equals(optionalF.get())) {
                accessibilityNodeInfo.addAction(accessibilityAction2);
                return;
            }
            return;
        }
        UranusCharacterItem uranusCharacterItem = (UranusCharacterItem) view;
        if (!optionalF.isPresent() || uranusCharacterItem.equals(optionalF.get())) {
            return;
        }
        int i = uranusCharacterItem.j;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            accessibilityNodeInfo.addAction(accessibilityAction);
        }
    }
}
