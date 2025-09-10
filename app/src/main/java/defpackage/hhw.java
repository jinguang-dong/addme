package defpackage;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.composezoom.ZoomUi;
import com.google.android.apps.camera.ui.creativebutton.CreativeButton;
import com.google.android.apps.camera.ui.supermodeswitcher.SupermodeSwitcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hhw implements View.OnHoverListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hhw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i = this.b;
        if (i == 0) {
            if (!((hhx) this.a).a.isTouchExplorationEnabled()) {
                return false;
            }
            view.sendAccessibilityEvent(8);
            return true;
        }
        if (i == 1) {
            view.getClass();
            motionEvent.getClass();
            ZoomUi zoomUi = (ZoomUi) this.a;
            return ((Boolean) zoomUi.e().A.a()).booleanValue() && ((RectF) zoomUi.d.a()).contains(motionEvent.getX(), motionEvent.getY());
        }
        if (i == 2) {
            view.getClass();
            motionEvent.getClass();
            if (!((CreativeButton) this.a).a.isTouchExplorationEnabled()) {
                return false;
            }
            view.sendAccessibilityEvent(8);
            return true;
        }
        if (i == 3) {
            if (!((mtm) this.a).p.aa()) {
                return false;
            }
            view.sendAccessibilityEvent(8);
            return true;
        }
        view.getClass();
        motionEvent.getClass();
        if (!((SupermodeSwitcher) this.a).b.isTouchExplorationEnabled()) {
            return false;
        }
        view.sendAccessibilityEvent(8);
        return true;
    }
}
