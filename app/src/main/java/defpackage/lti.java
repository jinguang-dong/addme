package defpackage;

import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lti {
    private static final sgv f = sgv.g("lti");
    public final owq a;
    public AudioDeviceInfo e;
    private AudioDeviceInfo h;
    private AudioDeviceInfo i;
    private AudioDeviceInfo j;
    private final owq g = new ovx(false);
    public final owq b = new ovx(false);
    public final owq c = new ovx(false);
    public final owq d = new ovx(false);

    public lti(owq owqVar) {
        this.a = owqVar;
    }

    public final int a(lth lthVar) {
        AudioDeviceInfo audioDeviceInfo = this.h;
        if (lthVar.equals(lth.EXT_WIRED)) {
            audioDeviceInfo = this.i;
        } else if (lthVar.equals(lth.EXT_BLUETOOTH)) {
            audioDeviceInfo = this.j;
        }
        if (audioDeviceInfo == null) {
            ((sgt) f.c().M(4424)).v("no available audioDeviceInfo for %s", lthVar);
        }
        if (audioDeviceInfo != null) {
            return audioDeviceInfo.getType();
        }
        return 0;
    }

    public final int b() {
        AudioDeviceInfo audioDeviceInfo = this.e;
        if (audioDeviceInfo == null) {
            return 15;
        }
        return audioDeviceInfo.getType();
    }

    public final ltu c() {
        return (ltu) this.a.dL();
    }

    public final String d(lth lthVar) {
        AudioDeviceInfo audioDeviceInfo = this.h;
        if (lthVar.equals(lth.EXT_WIRED)) {
            audioDeviceInfo = this.i;
        } else if (lthVar.equals(lth.EXT_BLUETOOTH)) {
            audioDeviceInfo = this.j;
        }
        return audioDeviceInfo != null ? audioDeviceInfo.getProductName().toString() : "";
    }

    public final void e(lth lthVar, AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            audioDeviceInfo.getType();
        }
        int iOrdinal = lthVar.ordinal();
        if (iOrdinal == 1) {
            this.h = audioDeviceInfo;
            return;
        }
        if (iOrdinal == 2) {
            this.i = audioDeviceInfo;
            owq owqVar = this.g;
            owqVar.a(Boolean.valueOf(audioDeviceInfo != null));
            this.b.a((Boolean) ((ovx) owqVar).d);
            return;
        }
        if (iOrdinal != 3) {
            ((sgt) f.c().M(4428)).v("setAudioDeviceInfo type %s is not supported", lthVar);
        } else {
            this.j = audioDeviceInfo;
            this.c.a(Boolean.valueOf(audioDeviceInfo != null));
        }
    }

    public final void f(lth lthVar, Boolean bool) {
        int iOrdinal = lthVar.ordinal();
        if (iOrdinal == 2) {
            if (!bool.booleanValue() || g(lth.EXT_WIRED)) {
                this.b.a(bool);
                return;
            } else {
                ((sgt) f.c().M(4430)).s("setMicConnected failed, wired mic is not available");
                return;
            }
        }
        if (iOrdinal != 3) {
            ((sgt) f.c().M(4429)).v("setMicConnected type %s is not supported", lthVar);
        } else if (!bool.booleanValue() || g(lth.EXT_BLUETOOTH)) {
            this.d.a(bool);
        } else {
            ((sgt) f.c().M(4431)).s("setMicConnected failed, bluetooth is not available");
        }
    }

    public final boolean g(lth lthVar) {
        int iOrdinal = lthVar.ordinal();
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return ((Boolean) ((ovx) this.g).d).booleanValue();
        }
        if (iOrdinal == 3) {
            return ((Boolean) ((ovx) this.c).d).booleanValue();
        }
        ((sgt) f.c().M(4425)).v("isMicAvailable type %s is not supported", lthVar);
        return false;
    }

    public final boolean h(lth lthVar) {
        int iOrdinal = lthVar.ordinal();
        if (iOrdinal == 1) {
            return true;
        }
        if (iOrdinal == 2) {
            return ((Boolean) ((ovx) this.b).d).booleanValue();
        }
        if (iOrdinal == 3) {
            return ((Boolean) ((ovx) this.d).d).booleanValue();
        }
        ((sgt) f.c().M(4426)).v("getMicConnected type %s is not supported", lthVar);
        return false;
    }
}
