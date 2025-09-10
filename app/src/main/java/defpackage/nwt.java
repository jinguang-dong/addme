package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.BaseInterpolator;
import android.view.animation.PathInterpolator;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwt {
    private static final nwr i = new nwq();
    public final float a;
    public final float b;
    protected final ViewGroup c;
    public boolean e;
    public final ContentObserver f;
    public boolean g;
    final View.OnAttachStateChangeListener h;
    private final nwr k;
    private float l;
    private float m;
    protected final Rect d = new Rect();
    private final Rect j = new Rect();
    private final BaseInterpolator n = new PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);
    private final BaseInterpolator o = new PathInterpolator(0.3f, 0.0f, 0.7f, 1.0f);

    public nwt(ViewGroup viewGroup, nwr nwrVar) {
        ft ftVar = new ft(this, 3);
        this.h = ftVar;
        this.c = viewGroup;
        this.k = nwrVar;
        DisplayMetrics displayMetrics = viewGroup.getContext().getResources().getDisplayMetrics();
        float fMin = ((Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density) - 192.0f) / 48.0f;
        this.a = ((-0.15000004f) * fMin) + 0.6f;
        this.b = (fMin * (-0.049999997f)) + 0.2f;
        this.f = new nws(this, viewGroup.getHandler());
        viewGroup.addOnAttachStateChangeListener(ftVar);
        this.e = g(viewGroup.getContext());
    }

    public static boolean g(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "reduce_motion", 0) != 0;
    }

    private final void h(ViewGroup viewGroup, boolean z) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                if (childAt instanceof ViewGroup) {
                    h((ViewGroup) childAt, childAt instanceof nwl);
                }
                if (z) {
                    b(childAt);
                }
            }
        }
    }

    public final float a(View view) {
        Rect rect = this.j;
        view.getDrawingRect(rect);
        rect.offset(0, (int) view.getTranslationY());
        ViewGroup viewGroup = this.c;
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        Rect rect2 = new Rect();
        viewGroup.getGlobalVisibleRect(rect2);
        rect.offset(rect2.left, rect2.top);
        nwr nwrVar = this.e ? i : this.k;
        view.getWidth();
        view.getHeight();
        if (view.getLayerType() != 2) {
            view.setLayerType(2, null);
        }
        float f = 0.35f;
        if (view.getHeight() < this.l && view.getHeight() > this.m) {
            float height = view.getHeight();
            float f2 = this.m;
            f = 0.35f + (((height - f2) / (this.l - f2)) * 0.20000002f);
        } else if (view.getHeight() >= this.m) {
            f = 0.55f;
        }
        Rect rect3 = this.d;
        int iHeight = (int) (rect3.height() * f);
        if (!nwrVar.b(view) || !nwrVar.a(view)) {
            iHeight = Math.min(iHeight, view.getHeight());
        }
        int i2 = rect3.top + iHeight;
        int i3 = rect3.bottom - iHeight;
        float scaleX = view.getScaleX();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.setPivotX((viewGroup.getWidth() * 0.5f) - view.getLeft());
        if (marginLayoutParams == null) {
            return 1.0f;
        }
        if (rect.top > i3) {
            view.setPivotY(-marginLayoutParams.topMargin);
            return this.o.getInterpolation((rect3.bottom - rect.top) / iHeight);
        }
        if (rect.bottom < i2) {
            float f3 = iHeight;
            view.setPivotY(view.getMeasuredHeight() + marginLayoutParams.bottomMargin);
            return this.n.getInterpolation((rect.bottom - rect3.top) / f3);
        }
        if (scaleX == 1.0f) {
            return 1.0f;
        }
        nwrVar.c();
        return 1.0f;
    }

    final void b(View view) {
        if (f(view)) {
            float fA = a(view);
            Object tag = view.getTag(R.id.animating_item);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                if (this.e) {
                    c(view);
                } else {
                    d(view, fA);
                }
            }
        }
    }

    public final void c(View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public final void d(View view, float f) {
        view.setAlpha((f * 0.5f) + 0.5f);
        float f2 = (f * 0.3f) + 0.7f;
        view.setScaleX(f2);
        view.setScaleY(f2);
    }

    public final void e() {
        ViewGroup viewGroup = this.c;
        int i2 = viewGroup.getResources().getDisplayMetrics().widthPixels;
        int i3 = viewGroup.getResources().getDisplayMetrics().heightPixels;
        this.d.set(0, 0, i2, i3);
        this.l = r3.height() * this.a;
        this.m = r3.height() * this.b;
        h(viewGroup, true);
    }

    public final boolean f(View view) {
        Object parent = view.getParent();
        if (parent == this.c) {
            return true;
        }
        if (parent instanceof View) {
            return f((View) parent);
        }
        return false;
    }
}
