package defpackage;

import android.content.Context;
import android.view.Choreographer;
import android.view.SurfaceView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class nfw extends SurfaceView {
    public static final sgv a = sgv.g("nfw");
    public final String b;
    public int c;

    public nfw(Context context, String str) {
        super(context);
        this.c = 0;
        this.b = str;
    }

    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new nfs(runnable, 0));
    }

    private static String c(View view) {
        StringBuilder sb = new StringBuilder();
        Object parent = view.getParent();
        if (parent instanceof View) {
            sb.append(c((View) parent));
            sb.append("->");
        }
        sb.append(view.getClass().getSimpleName());
        sb.append("(w=");
        sb.append(view.getWidth());
        sb.append(", h=");
        sb.append(view.getHeight());
        sb.append(")");
        return sb.toString();
    }

    public final void b() {
        getMeasuredWidth();
        getMeasuredHeight();
        getWidth();
        getHeight();
        getVisibility();
        getWindowVisibility();
        getHolder().getSurface().isValid();
        isAttachedToWindow();
        getHolder().getSurface();
        c(this);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        a(new Runnable() { // from class: nfu
            @Override // java.lang.Runnable
            public final void run() {
                nfw.a(new nft(this.a));
            }
        });
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        b();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        b();
    }
}
