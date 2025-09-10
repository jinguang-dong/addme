package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lpw extends BroadcastReceiver {
    final /* synthetic */ lpy a;

    public lpw(lpy lpyVar) {
        this.a = lpyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c = false;
    }
}
