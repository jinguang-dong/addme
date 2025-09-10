package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gk {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final gb e;
    private final boolean f;
    private final int g;
    private boolean h;
    private gl i;
    private gj j;
    private final PopupWindow.OnDismissListener k;

    public gk(Context context, gb gbVar, View view, boolean z) {
        this(context, gbVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final gj a() {
        if (this.j == null) {
            Context context = this.d;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            gj fvVar = Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new fv(context, this.a, this.g, this.f) : new gs(context, this.e, this.a, this.g, this.f);
            fvVar.j(this.e);
            fvVar.p(this.k);
            fvVar.l(this.a);
            fvVar.d(this.i);
            fvVar.m(this.h);
            fvVar.n(this.b);
            this.j = fvVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.k();
        }
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        gj gjVar = this.j;
        if (gjVar != null) {
            gjVar.m(z);
        }
    }

    public final void e(gl glVar) {
        this.i = glVar;
        gj gjVar = this.j;
        if (gjVar != null) {
            gjVar.d(glVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        gj gjVarA = a();
        gjVarA.q(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            gjVarA.o(i);
            gjVarA.r(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            gjVarA.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        gjVarA.s();
    }

    public final boolean g() {
        gj gjVar = this.j;
        return gjVar != null && gjVar.u();
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public gk(Context context, gb gbVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new htm(this, 1);
        this.d = context;
        this.e = gbVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
