package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktl extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ Runnable a;

    public ktl(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        motionEvent2.getClass();
        this.a.run();
        return true;
    }
}
