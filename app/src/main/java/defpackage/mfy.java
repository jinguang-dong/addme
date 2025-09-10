package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mfy extends byi {
    private final int a;

    public mfy(Resources resources) {
        super((char[]) null);
        this.a = resources.getDimensionPixelSize(R.dimen.settings_changed_item_space);
    }

    @Override // defpackage.byi
    public final void bG(Rect rect, View view, RecyclerView recyclerView, ld ldVar) {
        int iC = recyclerView.c(view);
        recyclerView.l.getClass();
        if (iC != r3.a() - 1) {
            rect.bottom = this.a;
        }
    }
}
