package defpackage;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncl extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ShutterButton a;

    public ncl(ShutterButton shutterButton) {
        this.a = shutterButton;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ShutterButton shutterButton = this.a;
        RectF rectF = shutterButton.m;
        float f = rectF.right - rectF.left;
        float f2 = ((rectF.bottom - rectF.top) * 0.20000005f) / 2.0f;
        rectF.top -= f2;
        rectF.bottom += f2;
        float f3 = (f * 0.20000005f) / 2.0f;
        rectF.left -= f3;
        rectF.right += f3;
        if (shutterButton.m.contains(motionEvent.getX(), motionEvent.getY()) && shutterButton.r() && shutterButton.d() != ncn.PHOTO_LONGPRESS_LOCKED) {
            ndo ndoVar = shutterButton.d;
            if (shutterButton.g.compareAndSet(false, true)) {
                shutterButton.x = motionEvent;
                if (ndoVar != null) {
                    ndoVar.h();
                }
            }
        }
    }
}
