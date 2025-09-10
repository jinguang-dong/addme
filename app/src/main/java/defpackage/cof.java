package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cof implements View.OnApplyWindowInsetsListener {
    final /* synthetic */ cny a;

    public cof(View view, cny cnyVar) {
        this.a = cnyVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return this.a.a(view, cpp.o(windowInsets, view)).e();
    }
}
