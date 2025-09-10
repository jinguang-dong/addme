package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mg implements View.OnClickListener {
    final fp a;
    final /* synthetic */ mi b;

    public mg(mi miVar) {
        this.b = miVar;
        this.a = new fp(miVar.a.getContext(), miVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mi miVar = this.b;
        Window.Callback callback = miVar.d;
        if (callback == null || !miVar.e) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
