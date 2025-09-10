package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gel extends BroadcastReceiver {
    final /* synthetic */ gem a;

    public gel(gem gemVar) {
        this.a = gemVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gem gemVar = this.a;
        synchronized (gemVar.e) {
            String action = intent.getAction();
            if (!gemVar.h && action != null) {
                if (gemVar.f == null) {
                    ((sgt) gem.a.c().M(809)).s("audioDeviceStateManager is null");
                } else {
                    if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                        intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    }
                }
            }
        }
    }
}
