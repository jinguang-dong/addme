package defpackage;

import android.app.Activity;
import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txd extends txx {
    final /* synthetic */ Activity a;
    final /* synthetic */ PendingIntent b;
    final /* synthetic */ int c;

    public txd(Activity activity, PendingIntent pendingIntent, int i) {
        this.a = activity;
        this.b = pendingIntent;
        this.c = i;
    }

    @Override // defpackage.txy
    public final void b() {
        Activity activity = this.a;
        activity.runOnUiThread(new txc(activity, this.b, this.c));
    }
}
