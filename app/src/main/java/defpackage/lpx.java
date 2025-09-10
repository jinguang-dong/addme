package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lpx extends BroadcastReceiver {
    final /* synthetic */ lpy a;

    public lpx(lpy lpyVar) {
        this.a = lpyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lpy lpyVar = this.a;
        lpyVar.c = true;
        if (lpyVar.b) {
            lpyVar.a.f("Ignoring ScreenOff shutdown behavior, the activity is still started.");
        } else {
            lpyVar.c("Received ScreenOff broadcast after onStop: ".concat(String.valueOf(String.valueOf(intent))));
        }
    }
}
