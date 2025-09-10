package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.compositevideoview.CompositeVideoView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mom extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ CompositeVideoView a;

    public mom(CompositeVideoView compositeVideoView) {
        this.a = compositeVideoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        this.a.d.performClick();
        return true;
    }
}
