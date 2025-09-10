package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class drq extends BroadcastReceiver {
    public boolean a;
    private final uif b;
    private final uif c;

    public drq(uif uifVar, uif uifVar2) {
        this.b = uifVar;
        this.c = uifVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (a.ao(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            this.c.a();
        } else {
            this.b.a();
        }
    }
}
