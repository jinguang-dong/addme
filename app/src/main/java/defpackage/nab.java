package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nab implements rvu {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ nab(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.b != 0) {
            return Integer.valueOf(((iwt) obj).equals(iwt.LANDSCAPE) ? this.a + 1 : 4);
        }
        sgv sgvVar = nae.a;
        View view = (View) ((Map.Entry) obj).getValue();
        if (view.getWidth() == 0) {
            ((sgt) nae.a.c().M(5238)).v("Trying to measure distance to chip %s with zero width i.e. before layout", nae.b(view).getText());
        }
        int i = this.a;
        return Integer.valueOf(Math.min(Math.abs(i - view.getLeft()), Math.abs(i - (view.getRight() - 1))));
    }
}
