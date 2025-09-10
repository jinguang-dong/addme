package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ges implements paq {
    private static final sgv c = sgv.g("ges");
    public final lti a;
    public final AccessibilityManager b;
    private AudioRouting d;
    private paq g;
    private final jod h;
    private final Object f = new Object();
    private boolean e = false;

    public ges(jod jodVar, lti ltiVar, AccessibilityManager accessibilityManager) {
        this.h = jodVar;
        this.a = ltiVar;
        this.b = accessibilityManager;
    }

    public final void a(AudioRouting audioRouting) {
        if (audioRouting == null) {
            return;
        }
        lti ltiVar = this.a;
        AudioDeviceInfo audioDeviceInfoG = (ltiVar.c().equals(ltu.EXT_WIRED) && ltiVar.h(lth.EXT_WIRED)) ? this.h.g() : (ltiVar.c().equals(ltu.EXT_BLUETOOTH) && ltiVar.h(lth.EXT_BLUETOOTH)) ? this.h.f() : null;
        boolean preferredDevice = audioRouting.setPreferredDevice(audioDeviceInfoG);
        if (audioDeviceInfoG == null) {
            ltiVar.e = null;
            return;
        }
        jod.h(audioDeviceInfoG);
        if (!preferredDevice) {
            audioRouting.setPreferredDevice(null);
        }
        ltiVar.e = audioRouting.getPreferredDevice();
    }

    public final void b(AudioRouting audioRouting) {
        synchronized (this.f) {
            if (this.e) {
                ((sgt) c.c().M(846)).s("Ignore start. Already closed");
                return;
            }
            if (this.d != null) {
                c();
            }
            if (audioRouting.getRoutedDevice() != null) {
                audioRouting.getRoutedDevice().getType();
            }
            this.d = audioRouting;
            a(audioRouting);
            lti ltiVar = this.a;
            this.g = owl.a(ltiVar.b, ltiVar.d).dK(new glc(this, audioRouting, 1, null), sxo.a);
        }
    }

    public final void c() {
        synchronized (this.f) {
            if (this.e) {
                ((sgt) c.c().M(848)).s("Ignore stop. Already closed");
                return;
            }
            this.d = null;
            paq paqVar = this.g;
            if (paqVar != null) {
                paqVar.close();
                this.g = null;
            }
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f) {
            if (this.e) {
                ((sgt) c.c().M(843)).s("Already closed");
            } else {
                c();
                this.e = true;
            }
        }
    }
}
