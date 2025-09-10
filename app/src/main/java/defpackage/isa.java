package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isa extends PopupWindow {
    public final Context a;
    public final Window b;
    public final WindowManager c;
    public View.OnLayoutChangeListener d;
    public mxm e = mxm.PORTRAIT;
    public mxj f = mxj.PHONE_LAYOUT;
    public View g;
    public boolean h;
    public final fdq i;

    public isa(Context context, Window window, fdq fdqVar, WindowManager windowManager) {
        this.a = context;
        this.b = window;
        this.i = fdqVar;
        this.c = windowManager;
    }

    public final void a() {
        if (this.g == null || !this.h) {
            return;
        }
        if (!this.e.equals(mxm.LANDSCAPE) && !this.e.equals(mxm.REVERSE_LANDSCAPE)) {
            b();
            return;
        }
        Rect bounds = this.c.getCurrentWindowMetrics().getBounds();
        setWidth(bounds.width());
        setHeight(bounds.height());
        Window window = this.b;
        showAtLocation(window.getDecorView(), 0, 0, 0);
        window.getDecorView().addOnLayoutChangeListener(this.d);
    }

    public final void b() {
        this.b.getDecorView().removeOnLayoutChangeListener(this.d);
        dismiss();
    }
}
