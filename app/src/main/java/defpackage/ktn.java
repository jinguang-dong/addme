package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ktn extends View.AccessibilityDelegate {
    final /* synthetic */ kto a;

    public ktn(kto ktoVar) {
        this.a = ktoVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        kto ktoVar = this.a;
        Resources resources = ktoVar.getResources();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, resources.getString(R.string.options_help_on_click, resources.getString(ktoVar.k.b))));
    }
}
