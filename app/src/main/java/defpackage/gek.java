package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gek extends BroadcastReceiver {
    final /* synthetic */ gem a;

    public gek(gem gemVar) {
        this.a = gemVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        gem gemVar = this.a;
        synchronized (gemVar.e) {
            String action = intent.getAction();
            if (!gemVar.h && action != null) {
                lti ltiVar = gemVar.f;
                if (ltiVar == null) {
                    ((sgt) gem.a.c().M(807)).s("audioDeviceStateManager is null");
                    return;
                }
                if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    if (intExtra == -1) {
                        ((sgt) gem.a.c().M(800)).s("receive SCO_AUDIO_STATE_ERROR");
                        AudioManager audioManager = gemVar.c;
                        audioManager.getClass();
                        audioManager.stopBluetoothSco();
                    } else if (intExtra == 0) {
                        gemVar.j = 3;
                        int i = gemVar.k;
                        if (i == 0) {
                            throw null;
                        }
                        if (i == 5) {
                            ((sgt) gem.a.c().M(803)).s("Retry to connect");
                            gemVar.a(ltiVar.d(lth.EXT_BLUETOOTH));
                            return;
                        }
                        if (i == 1) {
                            ((sgt) gem.a.c().M(802)).s("Disconnected from system, stop bluetooth sco");
                            AudioManager audioManager2 = gemVar.c;
                            audioManager2.getClass();
                            audioManager2.stopBluetoothSco();
                        }
                        ltiVar.f(lth.EXT_BLUETOOTH, false);
                        gemVar.k = 1;
                    } else if (intExtra == 1) {
                        SystemClock.uptimeMillis();
                        gemVar.j = 5;
                        int i2 = gemVar.k;
                        if (i2 == 0) {
                            throw null;
                        }
                        if (i2 == 3) {
                            ((sgt) gem.a.c().M(805)).s("Retry to disconnect");
                            gemVar.b();
                        } else {
                            ltiVar.f(lth.EXT_BLUETOOTH, true);
                            gemVar.k = 1;
                        }
                    } else if (intExtra == 2) {
                        gemVar.j = 4;
                    }
                }
            }
        }
    }
}
