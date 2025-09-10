package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hhz implements View.OnTouchListener {
    private final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.a == 0) {
            return view.getVisibility() == 0;
        }
        if (motionEvent.getAction() == 0) {
            view.animate().scaleX(1.05f);
            view.animate().scaleY(1.05f);
        } else if (motionEvent.getAction() == 1) {
            view.animate().scaleX(1.0f);
            view.animate().scaleY(1.0f);
        }
        return false;
    }
}
