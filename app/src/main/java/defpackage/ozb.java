package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozb implements plx {
    private final qla a;

    public ozb(qla qlaVar) {
        this.a = qlaVar;
    }

    @Override // defpackage.plx
    public final int a() {
        return ((qlb) this.a).a.getAudioSessionId();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.plx
    public final int b() {
        return ((qlb) this.a).a.getAudioSource();
    }

    @Override // defpackage.plx
    public final int c() {
        return ((qlb) this.a).a.getRecordingState();
    }

    @Override // defpackage.plx, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.plx
    public final AudioFormat d() {
        return this.a.a();
    }

    @Override // defpackage.plx
    public final void e() {
        this.a.c();
    }

    @Override // defpackage.plx
    public final void f() {
        this.a.d();
    }

    @Override // defpackage.plx
    public final qaq g(ByteBuffer byteBuffer, int i) {
        qkz qkzVarB = this.a.b(byteBuffer, i);
        if (qkzVarB == null) {
            return null;
        }
        return new qaq(qkzVarB);
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.a.setPreferredDevice(audioDeviceInfo);
    }

    @Override // android.media.MicrophoneDirection
    public final boolean setPreferredMicrophoneDirection(int i) {
        return this.a.setPreferredMicrophoneDirection(i);
    }

    @Override // android.media.MicrophoneDirection
    public final boolean setPreferredMicrophoneFieldDimension(float f) {
        return this.a.setPreferredMicrophoneFieldDimension(f);
    }
}
