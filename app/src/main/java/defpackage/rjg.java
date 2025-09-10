package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjg extends riz {
    private final Boolean a;
    private final cpp b;
    private Window c;
    private boolean d;

    public rjg(View view, cpp cppVar) {
        this.b = cppVar;
        rnx rnxVar = BottomSheetBehavior.c(view).d;
        ColorStateList colorStateListG = rnxVar != null ? rnxVar.g() : view.getBackgroundTintList();
        if (colorStateListG != null) {
            this.a = Boolean.valueOf(qpt.U(colorStateListG.getDefaultColor()));
            return;
        }
        ColorStateList colorStateListJ = qpt.J(view.getBackground());
        Integer numValueOf = colorStateListJ != null ? Integer.valueOf(colorStateListJ.getDefaultColor()) : null;
        if (numValueOf != null) {
            this.a = Boolean.valueOf(qpt.U(numValueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    private final void e(View view) {
        cpp cppVar = this.b;
        if (view.getTop() < cppVar.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                rkf.b(window, bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), cppVar.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                rkf.b(window2, this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Override // defpackage.riz
    public final void a(View view, float f) {
        e(view);
    }

    @Override // defpackage.riz
    public final void b(View view, int i) {
        e(view);
    }

    @Override // defpackage.riz
    public final void c(View view) {
        e(view);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.WindowInsetsController, java.lang.Object] */
    public final void d(Window window) {
        if (this.c == window) {
            return;
        }
        this.c = window;
        if (window != null) {
            window.getDecorView();
            this.d = (new cpq(window, (byte[]) null).a.getSystemBarsAppearance() & 8) != 0;
        }
    }
}
