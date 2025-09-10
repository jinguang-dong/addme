package defpackage;

import android.support.wearable.view.drawer.PageIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mz extends my {
    final /* synthetic */ PageIndicatorView a;

    public mz(PageIndicatorView pageIndicatorView) {
        this.a = pageIndicatorView;
    }

    @Override // defpackage.my
    public final void a() {
        PageIndicatorView pageIndicatorView = this.a;
        pageIndicatorView.c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(pageIndicatorView.a).setDuration(pageIndicatorView.b).start();
    }
}
