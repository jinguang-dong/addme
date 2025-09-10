package defpackage;

import android.view.ScaleGestureDetector;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkj implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ qwz a;

    public nkj(qwz qwzVar) {
        this.a = qwzVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.a.c(scaleGestureDetector.getScaleFactor());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.a.d();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getScaleFactor();
        this.a.e(2);
    }
}
