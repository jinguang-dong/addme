package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.ui.hotshot.HotshotController;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mvp implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mvp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.b != 0) {
            ((gwv) this.a).u();
            return;
        }
        HotshotController hotshotController = (HotshotController) this.a;
        hotshotController.o();
        hotshotController.q();
    }
}
