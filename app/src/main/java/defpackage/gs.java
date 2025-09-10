package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gs extends gj implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, gm {
    final kc a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final gb f;
    private final fy h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private gl o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new gr(this, 0);
    private final View.OnAttachStateChangeListener l = new ft(this, 2);
    private int s = 0;

    public gs(Context context, gb gbVar, View view, int i, boolean z) {
        this.e = context;
        this.f = gbVar;
        this.i = z;
        this.h = new fy(gbVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new kc(context, i);
        gbVar.h(this, context);
    }

    @Override // defpackage.gm
    public final void c(gb gbVar, boolean z) {
        if (gbVar != this.f) {
            return;
        }
        k();
        gl glVar = this.o;
        if (glVar != null) {
            glVar.a(gbVar, z);
        }
    }

    @Override // defpackage.gq
    public final ListView cD() {
        return this.a.e;
    }

    @Override // defpackage.gm
    public final void d(gl glVar) {
        this.o = glVar;
    }

    @Override // defpackage.gm
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gm
    public final boolean f(gt gtVar) {
        if (gtVar.hasVisibleItems()) {
            gk gkVar = new gk(this.e, gtVar, this.c, this.i, this.k);
            gkVar.e(this.o);
            gkVar.d(gj.w(gtVar));
            gkVar.c = this.m;
            this.m = null;
            this.f.i(false);
            kc kcVar = this.a;
            int width = kcVar.g;
            int iB = kcVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                width += this.n.getWidth();
            }
            if (!gkVar.g()) {
                if (gkVar.a != null) {
                    gkVar.f(width, iB, true, true);
                }
            }
            gl glVar = this.o;
            if (glVar != null) {
                glVar.b(gtVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gm
    public final void i() {
        this.q = false;
        fy fyVar = this.h;
        if (fyVar != null) {
            fyVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gq
    public final void k() {
        if (u()) {
            this.a.k();
        }
    }

    @Override // defpackage.gj
    public final void l(View view) {
        this.n = view;
    }

    @Override // defpackage.gj
    public final void m(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.gj
    public final void n(int i) {
        this.s = i;
    }

    @Override // defpackage.gj
    public final void o(int i) {
        this.a.g = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        k();
        return true;
    }

    @Override // defpackage.gj
    public final void p(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.gj
    public final void q(boolean z) {
        this.t = z;
    }

    @Override // defpackage.gj
    public final void r(int i) {
        this.a.j(i);
    }

    @Override // defpackage.gq
    public final void s() {
        View view;
        if (u()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        kc kcVar = this.a;
        kcVar.v(this);
        kcVar.m = this;
        kcVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        kcVar.l = view2;
        kcVar.j = this.s;
        if (!this.q) {
            this.r = x(this.h, this.e, this.j);
            this.q = true;
        }
        kcVar.r(this.r);
        kcVar.x();
        kcVar.t(this.g);
        kcVar.s();
        jh jhVar = kcVar.e;
        jhVar.setOnKeyListener(this);
        if (this.t) {
            gb gbVar = this.f;
            if (gbVar.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) jhVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(gbVar.e);
                }
                frameLayout.setEnabled(false);
                jhVar.addHeaderView(frameLayout, null, false);
            }
        }
        kcVar.e(this.h);
        kcVar.s();
    }

    @Override // defpackage.gq
    public final boolean u() {
        return !this.p && this.a.u();
    }

    @Override // defpackage.gj
    public final void j(gb gbVar) {
    }
}
