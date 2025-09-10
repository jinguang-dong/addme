package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.camera.optionsbar.view.OptionsMenuView;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktj implements View.OnTouchListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.b;
        if (i == 0) {
            view.getClass();
            motionEvent.getClass();
            ((GestureDetector) this.a).onTouchEvent(motionEvent);
            return false;
        }
        if (i != 1) {
            return ((OptionsMenuView) this.a).g.onTouchEvent(motionEvent);
        }
        ((AtomicReference) this.a).set(Float.valueOf(motionEvent.getX()));
        return false;
    }
}
