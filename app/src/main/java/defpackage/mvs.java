package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.camera.ui.hotshot.HotshotController;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvs extends View.AccessibilityDelegate {
    final /* synthetic */ List a;
    final /* synthetic */ HotshotController b;

    public mvs(HotshotController hotshotController, List list) {
        this.a = list;
        this.b = hotshotController;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) throws Resources.NotFoundException {
        if (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 65536) {
            if (accessibilityEvent.getEventType() == 32768) {
                sgv sgvVar = HotshotController.a;
                if (view.getId() != -1) {
                    view.getResources().getResourceName(view.getId());
                }
            }
            this.b.r(this.a);
        }
        super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
