package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.wear.ambient.AmbientMode;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mni implements jhh, jhc, jgz, jft {
    public final out a;
    public final owf b;
    public rjh c;
    public mnh d;
    public View.OnScrollChangeListener e;
    public NestedScrollView h;
    public final mdy k;
    public final hbj l;
    public AmbientMode.AmbientController n;
    private final View.OnLayoutChangeListener o;
    private final Activity q;
    private final paq r;
    public int j = 1;
    public long g = 0;
    public tpc m = snz.a.m();
    public final List i = new ArrayList();
    public int f = -1;
    private final View.OnScrollChangeListener p = new View.OnScrollChangeListener() { // from class: mmz
        @Override // android.view.View.OnScrollChangeListener
        public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
            View.OnScrollChangeListener onScrollChangeListener = this.a.e;
            if (onScrollChangeListener != null) {
                onScrollChangeListener.onScrollChange(view, i, i2, i3, i4);
            }
        }
    };

    public mni(out outVar, Activity activity, jgt jgtVar, mdy mdyVar, hbj hbjVar, owf owfVar) {
        this.a = outVar;
        this.q = activity;
        this.b = owfVar;
        this.l = hbjVar;
        int i = 8;
        this.o = new fjt(this, i);
        this.k = mdyVar;
        outVar.c(new lsn(this, jgtVar, 19, null));
        this.r = owfVar.dK(new mix(this, i), sxo.a);
    }

    public final int c() {
        Activity activity = this.q;
        WindowManager windowManager = activity.getWindowManager();
        return ((windowManager.getCurrentWindowMetrics().getBounds().height() / 2) - windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.systemBars()).bottom) - ((int) activity.getResources().getDimension(R.dimen.bottom_sheet_jarvis_top_margin));
    }

    public final ViewGroup d(int i, Context context, int i2) {
        FrameLayout frameLayout;
        if (i >= 0) {
            frameLayout = new FrameLayout(context);
            View.inflate(context, R.layout.title_text, frameLayout);
            ((TextView) frameLayout.findViewById(R.id.sheet_title)).setText(i);
        } else {
            frameLayout = null;
        }
        return e(frameLayout, context, i2);
    }

    public final ViewGroup e(View view, Context context, int i) {
        FrameLayout frameLayout;
        out.a();
        h();
        rjh rjhVar = this.c;
        if (rjhVar != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) rjhVar.findViewById(R.id.sheet_content);
            nestedScrollView.getClass();
            nestedScrollView.removeAllViews();
        }
        if (i == 0) {
            i = R.style.Theme_BottomSheet;
        }
        rjh rjhVar2 = new rjh(context, i);
        this.c = rjhVar2;
        rjhVar2.setContentView(R.layout.bottom_sheet_frame);
        rjhVar2.c = true;
        View viewInflate = View.inflate(context, R.layout.handle_bar, null);
        FrameLayout frameLayout2 = (FrameLayout) rjhVar2.findViewById(R.id.bottomsheet_handle_bar_container);
        if (frameLayout2 != null) {
            frameLayout2.addView(viewInflate);
            frameLayout2.setVisibility(0);
        }
        Window window = rjhVar2.getWindow();
        window.getClass();
        window.addFlags(1024);
        NestedScrollView nestedScrollView2 = (NestedScrollView) rjhVar2.findViewById(R.id.sheet_content);
        nestedScrollView2.getClass();
        nestedScrollView2.addOnLayoutChangeListener(this.o);
        nestedScrollView2.setOnScrollChangeListener(this.p);
        if (view != null && (frameLayout = (FrameLayout) rjhVar2.findViewById(R.id.sheet_title_frame)) != null) {
            frameLayout.addView(view);
        }
        return nestedScrollView2;
    }

    @Override // defpackage.jhc
    public final void ea() {
        h();
    }

    @Override // defpackage.jgz
    public final void et() {
        rjh rjhVar = this.c;
        if (rjhVar != null) {
            rjhVar.c = false;
            rjhVar.cancel();
        }
        paq paqVar = this.r;
        if (paqVar != null) {
            paqVar.close();
        }
    }

    public final void f(mng mngVar) {
        this.i.add(mngVar);
    }

    public final void g(ViewGroup viewGroup) {
        mnh mnhVar = this.d;
        if (mnhVar != null) {
            mnhVar.a(this.f);
        }
        rjh rjhVar = this.c;
        if (rjhVar == null) {
            return;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) rjhVar.findViewById(R.id.sheet_content);
        nestedScrollView.getClass();
        this.h = nestedScrollView;
        if (((muj) this.b.dL()).b == 5) {
            rjhVar.a().e = c();
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new mnf(viewGroup, new lor(this, rjhVar, 10)));
        rjhVar.a().v = true;
        rjhVar.a().ap(true);
        rjhVar.a().ak(new mne(rjhVar));
    }

    public final void h() {
        this.a.c(new mjh(this, 20));
    }

    public final void i(mng mngVar) {
        this.i.remove(mngVar);
    }

    @Override // defpackage.jft
    public final void j(Configuration configuration) {
        this.f = configuration.orientation;
    }

    public final boolean k() {
        rjh rjhVar = this.c;
        return rjhVar != null && rjhVar.isShowing();
    }

    public final void l(final int i, final DialogInterface.OnDismissListener onDismissListener, final rwc rwcVar) {
        rjh rjhVar = this.c;
        if (rjhVar != null) {
            rjhVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mmy
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    Iterator it = this.a.i.iterator();
                    while (it.hasNext()) {
                        ((mng) it.next()).eE(i);
                    }
                }
            });
            this.c.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: mna
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    rwc rwcVar2 = rwcVar;
                    if (rwcVar2.h()) {
                        ((DialogInterface.OnCancelListener) rwcVar2.c()).onCancel(dialogInterface);
                    }
                }
            });
            this.c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: mnb
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    mni mniVar = this.a;
                    int i2 = mniVar.j;
                    if (i2 != 1 && mniVar.g != 0) {
                        tpc tpcVar = mniVar.m;
                        if (!tpcVar.b.C()) {
                            tpcVar.o();
                        }
                        snz snzVar = (snz) tpcVar.b;
                        snz snzVar2 = snz.a;
                        int i3 = i2 - 1;
                        if (i2 == 0) {
                            throw null;
                        }
                        snzVar.c = i3;
                        snzVar.b |= 1;
                        long jCurrentTimeMillis = System.currentTimeMillis() - mniVar.g;
                        if (!tpcVar.b.C()) {
                            tpcVar.o();
                        }
                        snz snzVar3 = (snz) tpcVar.b;
                        snzVar3.b |= 2;
                        snzVar3.d = jCurrentTimeMillis;
                        AmbientMode.AmbientController ambientController = mniVar.n;
                        if (ambientController != null) {
                            tpc tpcVar2 = mniVar.m;
                            if (!tpcVar2.b.C()) {
                                tpcVar2.o();
                            }
                            snz snzVar4 = (snz) tpcVar2.b;
                            tpw tpwVar = snzVar4.e;
                            if (!tpwVar.c()) {
                                snzVar4.e = tph.v(tpwVar);
                            }
                            tnq.e(((iux) ambientController.a).a, snzVar4.e);
                        }
                        mniVar.k.h((snz) mniVar.m.l());
                    }
                    DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                    if (onDismissListener2 != null) {
                        onDismissListener2.onDismiss(dialogInterface);
                    }
                    Iterator it = mniVar.i.iterator();
                    while (it.hasNext()) {
                        ((mng) it.next()).e(i);
                    }
                }
            });
        }
    }

    public final void m(int i, int i2, View view) {
        n(i, i2, view, null);
    }

    public final void n(int i, int i2, View view, DialogInterface.OnDismissListener onDismissListener) {
        p(i, i2, view, onDismissListener, null);
    }

    public final void o(int i, int i2, View view) {
        if (this.l.p(gzo.aO)) {
            return;
        }
        this.a.execute(new mnd(this, i2, view, i, 0));
        this.j = i;
        this.g = System.currentTimeMillis();
        this.m = snz.a.m();
        this.n = null;
    }

    public final void p(int i, int i2, View view, DialogInterface.OnDismissListener onDismissListener, AmbientMode.AmbientController ambientController) {
        q(i, i2, view, onDismissListener, ambientController, rvk.a);
    }

    public final void q(final int i, final int i2, final View view, final DialogInterface.OnDismissListener onDismissListener, AmbientMode.AmbientController ambientController, final rwc rwcVar) {
        if (this.l.p(gzo.aO)) {
            return;
        }
        this.a.execute(new Runnable() { // from class: mnc
            @Override // java.lang.Runnable
            public final void run() {
                mni mniVar = this.a;
                int i3 = i2;
                View view2 = view;
                ViewGroup viewGroupD = mniVar.d(i3, view2.getContext(), 0);
                viewGroupD.addView(view2);
                mniVar.g(viewGroupD);
                if (mniVar.c != null) {
                    rwc rwcVar2 = rwcVar;
                    mniVar.l(i, onDismissListener, rwcVar2);
                    rjh rjhVar = mniVar.c;
                    rjhVar.getClass();
                    rjhVar.show();
                }
            }
        });
        this.j = i;
        this.g = System.currentTimeMillis();
        this.m = snz.a.m();
        this.n = ambientController;
    }
}
