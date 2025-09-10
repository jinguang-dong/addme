package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpu extends AccessibilityNodeProvider {
    final cpw a;

    public cpu(cpw cpwVar) {
        this.a = cpwVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        cpt cptVarA = this.a.a(i);
        if (cptVarA == null) {
            return null;
        }
        return cptVarA.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        cpt cptVarB = this.a.b(i);
        if (cptVarB == null) {
            return null;
        }
        return cptVarB.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.d(i, i2, bundle);
    }
}
