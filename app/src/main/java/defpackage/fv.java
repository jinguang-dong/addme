package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fv extends gj implements View.OnKeyListener, PopupWindow.OnDismissListener, gm {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    public boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private gl y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new gr(this, 1);
    private final View.OnAttachStateChangeListener m = new ft(this, 0);
    private final ka n = new fu(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = y();

    public fv(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int y() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(defpackage.gb r17) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fv.z(gb):void");
    }

    @Override // defpackage.gm
    public final void c(gb gbVar, boolean z) {
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gbVar == ((tym) list.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < list.size()) {
            ((gb) ((tym) list.get(i2)).b).i(false);
        }
        tym tymVar = (tym) list.remove(i);
        ((gb) tymVar.b).m(this);
        if (this.f) {
            Object obj = tymVar.c;
            ((kc) obj).q.setExitTransition(null);
            ((jz) obj).q.setAnimationStyle(0);
        }
        ((jz) tymVar.c).k();
        int size2 = list.size();
        if (size2 > 0) {
            this.r = ((tym) list.get(size2 - 1)).a;
        } else {
            this.r = y();
        }
        if (size2 != 0) {
            if (z) {
                ((gb) ((tym) list.get(0)).b).i(false);
                return;
            }
            return;
        }
        k();
        gl glVar = this.y;
        if (glVar != null) {
            glVar.a(gbVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.gq
    public final ListView cD() {
        List list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        return ((tym) list.get(list.size() - 1)).c();
    }

    @Override // defpackage.gm
    public final void d(gl glVar) {
        this.y = glVar;
    }

    @Override // defpackage.gm
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gm
    public final boolean f(gt gtVar) {
        for (tym tymVar : this.b) {
            if (gtVar == tymVar.b) {
                tymVar.c().requestFocus();
                return true;
            }
        }
        if (!gtVar.hasVisibleItems()) {
            return false;
        }
        j(gtVar);
        gl glVar = this.y;
        if (glVar != null) {
            glVar.b(gtVar);
        }
        return true;
    }

    @Override // defpackage.gm
    public final void i() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            v(((tym) it.next()).c().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gj
    public final void j(gb gbVar) {
        gbVar.h(this, this.h);
        if (u()) {
            z(gbVar);
        } else {
            this.l.add(gbVar);
        }
    }

    @Override // defpackage.gq
    public final void k() {
        List list = this.b;
        int size = list.size();
        if (size <= 0) {
            return;
        }
        tym[] tymVarArr = (tym[]) list.toArray(new tym[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            jz jzVar = (jz) tymVarArr[size].c;
            if (jzVar.u()) {
                jzVar.k();
            }
        }
    }

    @Override // defpackage.gj
    public final void l(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // defpackage.gj
    public final void m(boolean z) {
        this.w = z;
    }

    @Override // defpackage.gj
    public final void n(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.gj
    public final void o(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        tym tymVar;
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                tymVar = null;
                break;
            }
            tymVar = (tym) list.get(i);
            if (!((jz) tymVar.c).u()) {
                break;
            } else {
                i++;
            }
        }
        if (tymVar != null) {
            ((gb) tymVar.b).i(false);
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
        this.z = onDismissListener;
    }

    @Override // defpackage.gj
    public final void q(boolean z) {
        this.x = z;
    }

    @Override // defpackage.gj
    public final void r(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.gq
    public final void s() {
        if (u()) {
            return;
        }
        List list = this.l;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z((gb) it.next());
        }
        list.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.gj
    protected final boolean t() {
        return false;
    }

    @Override // defpackage.gq
    public final boolean u() {
        List list = this.b;
        return list.size() > 0 && ((jz) ((tym) list.get(0)).c).u();
    }
}
