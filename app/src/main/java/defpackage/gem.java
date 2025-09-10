package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.media.AudioManager;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gem implements paq {
    public static final sgv a = sgv.g("gem");
    public final Activity b;
    public final AudioManager c;
    public final lti f;
    public final BroadcastReceiver i;
    public final hbj l;
    public final our d = new our();
    public final Object e = new Object();
    public boolean g = false;
    public int j = 3;
    public int k = 1;
    public boolean h = false;

    public gem(Activity activity, AudioManager audioManager, lti ltiVar, hbj hbjVar) {
        new gek(this);
        this.i = new gel(this);
        this.b = activity;
        this.c = audioManager;
        this.f = ltiVar;
        this.l = hbjVar;
    }

    public final void a(String str) {
        synchronized (this.e) {
            if (this.h) {
                ((sgt) a.c().M(822)).s("Already closed. Ignore start()");
                return;
            }
            if (str.isEmpty()) {
                return;
            }
            int i = this.j;
            if (i == 0) {
                throw null;
            }
            if (i == 5) {
                return;
            }
            this.k = 5;
            if (i == 2) {
                ((sgt) a.c().M(819)).s("Bluetooth audio is disconnecting, retry later");
                return;
            }
            lti ltiVar = this.f;
            lth lthVar = lth.EXT_BLUETOOTH;
            ltiVar.a(lthVar);
            if (ltiVar.a(lthVar) == 26) {
                this.j = 5;
                ltiVar.f(lthVar, true);
                this.k = 1;
            } else {
                gzi gziVar = gym.a;
                this.j = 5;
                ltiVar.f(lthVar, true);
                this.k = 1;
                SystemClock.uptimeMillis();
                this.c.startBluetoothSco();
            }
        }
    }

    public final void b() {
        synchronized (this.e) {
            int i = this.j;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                return;
            }
            this.k = 3;
            if (i == 4) {
                ((sgt) a.c().M(826)).s("Bluetooth audio is connecting, retry later");
                return;
            }
            lti ltiVar = this.f;
            lth lthVar = lth.EXT_BLUETOOTH;
            if (ltiVar.a(lthVar) == 26) {
                this.j = 3;
                ltiVar.f(lthVar, false);
                this.k = 1;
            } else {
                this.j = 2;
                gzi gziVar = gym.a;
                this.j = 3;
                ltiVar.f(lthVar, false);
                this.k = 1;
                this.c.stopBluetoothSco();
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            if (this.h) {
                ((sgt) a.c().M(811)).s("Already closed");
                return;
            }
            this.c.stopBluetoothSco();
            this.d.close();
            Activity activity = this.b;
            gzi gziVar = gym.a;
            activity.unregisterReceiver(this.i);
            this.h = true;
        }
    }
}
