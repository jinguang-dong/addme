package defpackage;

import android.view.ScaleGestureDetector;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqi implements ScaleGestureDetector.OnScaleGestureListener {
    final /* synthetic */ ScaleGestureDetector.OnScaleGestureListener a;
    final /* synthetic */ nqf b;
    final /* synthetic */ nql c;
    final /* synthetic */ hbj d;

    public nqi(nql nqlVar, ScaleGestureDetector.OnScaleGestureListener onScaleGestureListener, nqf nqfVar, hbj hbjVar) {
        this.a = onScaleGestureListener;
        this.b = nqfVar;
        this.d = hbjVar;
        this.c = nqlVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        gzi gziVar = hba.a;
        this.a.onScale(scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        boolean z = nql.b;
        this.c.j = true;
        this.a.onScaleBegin(scaleGestureDetector);
        this.b.c();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        boolean z = nql.b;
        this.a.onScaleEnd(scaleGestureDetector);
    }
}
