package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyk extends TouchDelegate {
    public final ArrayList a;

    public nyk(View view) {
        super(new Rect(), view);
        this.a = new ArrayList();
    }

    public final void a(TouchDelegate touchDelegate) {
        this.a.add(touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList = this.a;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zOnTouchEvent |= ((TouchDelegate) arrayList.get(i)).onTouchEvent(motionEvent);
            motionEvent.setLocation(x, y);
        }
        return zOnTouchEvent;
    }
}
