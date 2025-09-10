package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nxp extends ki implements View.OnGenericMotionListener, View.OnTouchListener {
    public int d = -1;
    public final kk e = new nxo(this);

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        motionEvent.getAxisValue(26);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return true;
    }
}
