package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nts implements View.OnTouchListener {
    private final /* synthetic */ int a;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            if (motionEvent.getAction() == 0) {
                view.animate().scaleX(1.1f).scaleY(1.1f);
            } else if (motionEvent.getAction() == 1) {
                view.animate().scaleX(1.0f).scaleY(1.0f);
            }
        }
        return false;
    }
}
