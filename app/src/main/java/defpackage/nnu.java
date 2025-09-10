package defpackage;

import android.view.View;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnu {
    private static final Duration b = Duration.ofMillis(200);
    private static final Duration c = Duration.ofMillis(100);
    public static final Duration a = Duration.ofMillis(150);

    public static void a(final int i, final View view, final boolean z) {
        view.animate().cancel();
        if (z) {
            view.setClickable(false);
        }
        final boolean z2 = i == 0;
        if (z2) {
            view.setVisibility(0);
        }
        view.animate().alpha(i == 0 ? 1.0f : 0.0f).setDuration((z2 ? b : a).toMillis()).setStartDelay(z2 ? c.toMillis() : 0L).setInterpolator(new cvn()).withEndAction(new Runnable() { // from class: nnt
            @Override // java.lang.Runnable
            public final void run() {
                Duration duration = nnu.a;
                View view2 = view;
                if (z) {
                    view2.setClickable(z2);
                }
                view2.setVisibility(i);
            }
        }).start();
    }
}
