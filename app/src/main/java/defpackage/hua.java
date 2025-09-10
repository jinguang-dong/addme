package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hua extends View.AccessibilityDelegate {
    final /* synthetic */ huc a;

    public hua(huc hucVar) {
        this.a = hucVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        view.getClass();
        accessibilityNodeInfo.getClass();
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        huc hucVar = this.a;
        if (hucVar.v == 1) {
            huw huwVar = (huw) hucVar.e.dL();
            huv huvVarA = huw.c(huwVar, true ^ huwVar.c).a(false);
            ConstraintLayout constraintLayout = hucVar.l;
            if (constraintLayout == null) {
                ujp.c("container");
                constraintLayout = null;
            }
            Resources resources = constraintLayout.getResources();
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, resources.getString(R.string.serengeti_live_preview_tap_action, resources.getString(huvVarA.e))));
        }
    }
}
