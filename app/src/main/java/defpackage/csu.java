package defpackage;

import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csu {
    public Object a;
    public final /* synthetic */ Object b;

    public csu(Object obj) {
        this.b = obj;
    }

    public final void a(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.b;
        cardView.d.set(i, i2, i3, i4);
        Rect rect = cardView.c;
        super/*android.widget.FrameLayout*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public final boolean b() {
        return ((CardView) this.b).b;
    }

    public final boolean c() {
        return ((CardView) this.b).a;
    }
}
