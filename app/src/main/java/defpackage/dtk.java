package defpackage;

import androidx.wear.widget.drawer.PageIndicatorView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtk extends dtf {
    final /* synthetic */ PageIndicatorView a;

    public dtk(PageIndicatorView pageIndicatorView) {
        this.a = pageIndicatorView;
    }

    @Override // defpackage.dtf
    public final void a() {
        PageIndicatorView pageIndicatorView = this.a;
        pageIndicatorView.c = false;
        pageIndicatorView.animate().alpha(0.0f).setListener(null).setStartDelay(pageIndicatorView.a).setDuration(pageIndicatorView.b).start();
    }
}
