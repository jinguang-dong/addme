package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nne extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ nnf a;

    public nne(nnf nnfVar) {
        this.a = nnfVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        nnf nnfVar = this.a;
        nnfVar.a = motionEvent.getX();
        nnfVar.b = motionEvent.getY();
        nnfVar.c = 1;
        return true;
    }
}
