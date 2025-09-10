package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.MotionEvent;
import com.google.android.apps.camera.ui.layout.GcaLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqs extends GcaLayout {
    public lqs(Context context) {
        super(context);
        setTag(toString());
        setVisibility(8);
    }

    public static final syu g() {
        final szh szhVar = new szh();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: lqr
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                obv obvVar = new obv();
                SystemClock.uptimeMillis();
                obvVar.a = SystemClock.elapsedRealtimeNanos();
                szhVar.e(obvVar);
            }
        });
        return szhVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
