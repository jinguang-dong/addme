package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fju implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ fjz a;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        fjz fjzVar = this.a;
        int scrollX = fjzVar.J.getScrollX();
        int width = fjzVar.J.getChildAt(0).getWidth() - fjzVar.J.getWidth();
        if (scrollX == 0) {
            fjzVar.r(fjzVar.K);
        } else if (scrollX == width) {
            fjzVar.r(fjzVar.L);
        }
    }
}
