package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnm extends View.AccessibilityDelegate {
    final cnn a;

    public cnm(cnn cnnVar) {
        this.a = cnnVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        cpw cpwVarA = this.a.a(view);
        if (cpwVarA != null) {
            return (AccessibilityNodeProvider) cpwVarA.b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        cpt cptVar = new cpt(accessibilityNodeInfo);
        int[] iArr = con.a;
        boolean zD = cok.d(view);
        Boolean.valueOf(zD).getClass();
        cptVar.w(zD);
        boolean zC = cok.c(view);
        Boolean.valueOf(zC).getClass();
        cptVar.r(zC);
        cptVar.u(cok.a(view));
        cptVar.y(com.b(view));
        this.a.c(view, cptVar);
        accessibilityNodeInfo.getText();
        List listP = cnn.P(view);
        for (int i = 0; i < listP.size(); i++) {
            cptVar.h((cps) listP.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
