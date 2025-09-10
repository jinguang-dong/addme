package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class gep implements paq {
    private static final sgv g = sgv.g("gep");
    public final AudioManager a;
    public final AudioDeviceCallback b;
    public final Handler c;
    public final Object d;
    public boolean e;
    public boolean f;
    private final HandlerThread h;
    private final lti i;
    private final jod j;

    public gep(jod jodVar, AudioManager audioManager, lti ltiVar) {
        HandlerThread handlerThread = new HandlerThread("AudioDeviceChangeListenerImpl");
        this.h = handlerThread;
        this.d = new Object();
        this.e = false;
        this.f = false;
        this.j = jodVar;
        this.a = audioManager;
        this.i = ltiVar;
        this.b = new geo(this);
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        synchronized (this.d) {
            if (this.e) {
                return;
            }
            this.a.unregisterAudioDeviceCallback(this.b);
            this.f = false;
        }
    }

    public final void b() {
        AudioDeviceInfo audioDeviceInfo;
        jod jodVar = this.j;
        AudioManager audioManager = (AudioManager) jodVar.b;
        int i = 0;
        for (AudioDeviceInfo audioDeviceInfo2 : audioManager.getDevices(1)) {
            jod.h(audioDeviceInfo2);
        }
        lti ltiVar = this.i;
        if (ltiVar != null) {
            lth lthVar = lth.PHONE;
            AudioDeviceInfo[] devices = audioManager.getDevices(1);
            int length = devices.length;
            while (true) {
                if (i >= length) {
                    audioDeviceInfo = null;
                    break;
                }
                audioDeviceInfo = devices[i];
                if (audioDeviceInfo.getType() == 15) {
                    break;
                } else {
                    i++;
                }
            }
            ltiVar.e(lthVar, audioDeviceInfo);
            ltiVar.e(lth.EXT_WIRED, jodVar.g());
            ltiVar.e(lth.EXT_BLUETOOTH, jodVar.f());
        }
        ltiVar.g(lth.EXT_WIRED);
        ltiVar.g(lth.EXT_BLUETOOTH);
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d) {
            if (this.e) {
                ((sgt) g.c().M(830)).s("Already closed");
                return;
            }
            a();
            this.e = true;
            try {
                HandlerThread handlerThread = this.h;
                handlerThread.quit();
                handlerThread.join();
            } catch (InterruptedException unused) {
                ((sgt) g.b().M(829)).s("Could not complete shutting down AudioDeviceChangeListener.");
            }
        }
    }
}
