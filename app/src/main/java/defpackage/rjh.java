package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjh extends eq {
    public BottomSheetBehavior a;
    public FrameLayout b;
    public boolean c;
    boolean d;
    public boolean e;
    public boolean f;
    public rjg g;
    private FrameLayout h;
    private CoordinatorLayout i;
    private final boolean j;
    private final riz k;
    private tdy l;

    public rjh(Context context, int i) {
        super(context, i);
        this.d = true;
        this.e = true;
        this.k = new rjf(this);
        d();
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.j = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final View g(int i, View view, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        i();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.h.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            FrameLayout frameLayout = this.h;
            eod eodVar = new eod(this, 3);
            int[] iArr = con.a;
            cog.i(frameLayout, eodVar);
        }
        this.b.removeAllViews();
        if (layoutParams == null) {
            this.b.addView(view);
        } else {
            this.b.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new rjd(this, 0));
        con.i(this.b, new rje(this));
        this.b.setOnTouchListener(new nts(2));
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, rlo] */
    private final void h() {
        tdy tdyVar = this.l;
        if (tdyVar == null) {
            return;
        }
        if (!this.d) {
            tdyVar.b();
            return;
        }
        ((rlp) tdyVar.c).b(tdyVar.a, (View) tdyVar.b, false);
    }

    private final void i() throws Resources.NotFoundException {
        if (this.h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.h = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.h.findViewById(R.id.design_bottom_sheet);
            this.b = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.c(frameLayout2);
            this.a = bottomSheetBehaviorC;
            bottomSheetBehaviorC.ak(this.k);
            this.a.ap(this.d);
            this.l = new tdy(this.a, this.b);
        }
    }

    public final BottomSheetBehavior a() throws Resources.NotFoundException {
        if (this.a == null) {
            i();
        }
        return this.a;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehaviorA = a();
        if (!this.c || bottomSheetBehaviorA.x == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorA.ar(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            window.setDecorFitsSystemWindows(z2);
            rjg rjgVar = this.g;
            if (rjgVar != null) {
                rjgVar.d(window);
            }
        }
        h();
    }

    @Override // defpackage.eq, defpackage.ni, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        rjg rjgVar = this.g;
        if (rjgVar != null) {
            rjgVar.d(null);
        }
        tdy tdyVar = this.l;
        if (tdyVar != null) {
            tdyVar.b();
        }
    }

    @Override // defpackage.ni, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.x != 5) {
            return;
        }
        bottomSheetBehavior.ar(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.ap(z);
            }
            if (getWindow() != null) {
                h();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.eq, defpackage.ni, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(g(i, null, null));
    }

    @Override // defpackage.eq, defpackage.ni, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(0, view, null));
    }

    @Override // defpackage.eq, defpackage.ni, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(0, view, layoutParams));
    }
}
