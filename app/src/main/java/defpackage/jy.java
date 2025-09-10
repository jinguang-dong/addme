package defpackage;

import android.widget.AbsListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jy implements AbsListView.OnScrollListener {
    final /* synthetic */ jz a;

    public jy(jz jzVar) {
        this.a = jzVar;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            jz jzVar = this.a;
            if (jzVar.w() || jzVar.q.getContentView() == null) {
                return;
            }
            av avVar = jzVar.r;
            jzVar.o.removeCallbacks(avVar);
            avVar.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
