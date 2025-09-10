package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class geo extends AudioDeviceCallback {
    final /* synthetic */ gep a;

    public geo(gep gepVar) {
        this.a = gepVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.b();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.b();
    }
}
