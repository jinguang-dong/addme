package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dtb {
    protected final dtc a;
    public final int c;
    public final float d;
    public final dtj e;
    public int f;
    public float g;
    public float h;
    public float i;
    public boolean j;
    public boolean k;
    public boolean l;
    protected AmbientModeSupport.AmbientController n;
    private final int o;
    public final float b = 0.33f;
    public boolean m = false;

    public dtb(Context context, dtc dtcVar) {
        this.a = dtcVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = viewConfiguration.getScaledTouchSlop();
        this.c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.d = Resources.getSystem().getDisplayMetrics().widthPixels * 0.1f;
        this.e = new dtj(dtcVar);
    }

    public final void a(MotionEvent motionEvent) {
        cto ctoVar;
        if (motionEvent.getActionMasked() == 0) {
            dtj dtjVar = this.e;
            cto ctoVar2 = dtjVar.l;
            boolean z = true;
            if ((ctoVar2 == null || !ctoVar2.n) && ((ctoVar = dtjVar.m) == null || !ctoVar.n)) {
                z = false;
            }
            this.m = z;
        }
    }

    public final void b() {
        dtj dtjVar = this.e;
        VelocityTracker velocityTracker = dtjVar.f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        dtjVar.f = null;
        this.g = 0.0f;
        this.h = 0.0f;
        this.j = false;
        this.i = -2.1474836E9f;
        this.k = false;
        this.l = false;
    }

    public final void c(MotionEvent motionEvent) {
        if (this.j) {
            return;
        }
        float rawX = motionEvent.getRawX() - this.g;
        float rawY = motionEvent.getRawY() - this.h;
        int i = this.o;
        boolean z = false;
        if ((rawX * rawX) + (rawY * rawY) <= i * i) {
            this.j = false;
            return;
        }
        if (rawX > i + i && Math.abs(rawY) < Math.abs(rawX)) {
            z = true;
        }
        this.j = z;
    }

    protected final boolean d(View view, boolean z, float f, float f2, float f3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                float f4 = scrollX + f2;
                if (f4 >= childAt.getLeft() && f4 < childAt.getRight()) {
                    float f5 = f3 + scrollY;
                    if (f5 >= childAt.getTop() && f5 < childAt.getBottom()) {
                        if (d(childAt, true, f, f4 - childAt.getLeft(), f5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        return z && view.canScrollHorizontally((int) (-f));
    }
}
