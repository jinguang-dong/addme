package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byf {
    public static final byf a = new byf();

    private byf() {
    }

    public final void a(View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(View view) {
        view.setViewTranslationCallback(bye.a);
    }
}
