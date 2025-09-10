package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.pro.feature.lens.LensFeatureControlsView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkb extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ LensFeatureControlsView a;

    public lkb(LensFeatureControlsView lensFeatureControlsView) {
        this.a = lensFeatureControlsView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.a();
    }
}
