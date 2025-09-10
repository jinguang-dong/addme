package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mi {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    public hg f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public mi(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.t;
        this.l = toolbar.u;
        this.k = this.c != null;
        this.j = toolbar.e();
        pmg pmgVarJ = pmg.J(toolbar.getContext(), null, fa.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = pmgVarJ.z(15);
        if (z) {
            CharSequence charSequenceB = pmgVarJ.B(27);
            if (!TextUtils.isEmpty(charSequenceB)) {
                g(charSequenceB);
            }
            CharSequence charSequenceB2 = pmgVarJ.B(25);
            if (!TextUtils.isEmpty(charSequenceB2)) {
                this.l = charSequenceB2;
                if ((this.b & 8) != 0) {
                    toolbar.r(charSequenceB2);
                }
            }
            Drawable drawableZ = pmgVarJ.z(20);
            if (drawableZ != null) {
                e(drawableZ);
            }
            Drawable drawableZ2 = pmgVarJ.z(17);
            if (drawableZ2 != null) {
                this.h = drawableZ2;
                r();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                q();
            }
            d(pmgVarJ.u(10, 0));
            int iX = pmgVarJ.x(9, 0);
            if (iX != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iX, (ViewGroup) toolbar, false);
                View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                d(this.b | 16);
            }
            int iW = pmgVarJ.w(13, 0);
            if (iW > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = iW;
                toolbar.setLayoutParams(layoutParams);
            }
            int iS = pmgVarJ.s(7, -1);
            int iS2 = pmgVarJ.s(3, -1);
            if (iS >= 0 || iS2 >= 0) {
                int iMax = Math.max(iS, 0);
                int iMax2 = Math.max(iS2, 0);
                toolbar.k();
                toolbar.s.a(iMax, iMax2);
            }
            int iX2 = pmgVarJ.x(28, 0);
            if (iX2 != 0) {
                Context context = toolbar.getContext();
                toolbar.l = iX2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, iX2);
                }
            }
            int iX3 = pmgVarJ.x(26, 0);
            if (iX3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.m = iX3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iX3);
                }
            }
            int iX4 = pmgVarJ.x(22, 0);
            if (iX4 != 0) {
                toolbar.q(iX4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        pmgVarJ.D();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.m = i2 != 0 ? a().getString(i2) : null;
                p();
            }
        }
        this.m = toolbar.h();
        mg mgVar = new mg(this);
        toolbar.m();
        toolbar.d.setOnClickListener(mgVar);
    }

    private final void o(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.s(charSequence);
            if (this.k) {
                con.j(toolbar.getRootView(), charSequence);
            }
        }
    }

    private final void p() {
        if ((this.b & 4) != 0) {
            if (!TextUtils.isEmpty(this.m)) {
                this.a.o(this.m);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.o(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void q() {
        if ((this.b & 4) == 0) {
            this.a.p(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.j;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.p(drawable);
    }

    private final void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.i) == null) {
            drawable = this.h;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    Toolbar toolbar = this.a;
                    toolbar.s(this.c);
                    toolbar.r(this.l);
                } else {
                    Toolbar toolbar2 = this.a;
                    toolbar2.s(null);
                    toolbar2.r(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.g) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        r();
    }

    public final void f() {
        this.e = true;
    }

    public final void g(CharSequence charSequence) {
        this.k = true;
        o(charSequence);
    }

    public final void h(int i) {
        this.a.setVisibility(i);
    }

    public final void i(CharSequence charSequence) {
        if (this.k) {
            return;
        }
        o(charSequence);
    }

    public final boolean j() {
        return this.a.u();
    }

    public final boolean k() {
        hg hgVar;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (hgVar = actionMenuView.c) == null || !hgVar.k()) ? false : true;
    }

    public final boolean l() {
        return this.a.v();
    }

    public final boolean m() {
        return this.a.w();
    }

    public final ejs n(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        ejs ejsVarM = con.m(this.a);
        ejsVarM.j(f);
        ejsVarM.k(j);
        ejsVarM.l(new mh(this, i));
        return ejsVarM;
    }
}
