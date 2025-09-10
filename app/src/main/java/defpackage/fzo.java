package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class fzo implements plx {
    private static final sgv a = sgv.g("fzo");
    private final plx b;
    private final gab c;
    private final gae d;
    private final Object e = new Object();
    private int f = 1;

    public fzo(plx plxVar, gae gaeVar, gab gabVar) {
        this.b = plxVar;
        this.c = gabVar;
        this.d = gaeVar;
    }

    @Override // defpackage.plx
    public final int a() {
        return this.b.a();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.b.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.plx
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.plx
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.plx, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.e) {
            this.d.close();
            this.f = 4;
        }
    }

    @Override // defpackage.plx
    public final AudioFormat d() {
        return this.b.d();
    }

    @Override // defpackage.plx
    public final void e() {
        synchronized (this.e) {
            this.d.b();
            this.f = 2;
        }
    }

    @Override // defpackage.plx
    public final void f() {
        synchronized (this.e) {
            this.d.c();
            this.f = 3;
        }
    }

    @Override // defpackage.plx
    public final qaq g(ByteBuffer byteBuffer, int i) {
        synchronized (this.e) {
            int i2 = this.f;
            if (i2 == 0) {
                throw null;
            }
            if (i2 == 4) {
                ((sgt) a.c().M(618)).s("Ignore to read due to stream closed.");
                return null;
            }
            return this.c.a(byteBuffer, i);
        }
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.b.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.b.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.b.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.b.setPreferredDevice(audioDeviceInfo);
    }

    @Override // android.media.MicrophoneDirection
    public final boolean setPreferredMicrophoneDirection(int i) {
        return this.b.setPreferredMicrophoneDirection(i);
    }

    @Override // android.media.MicrophoneDirection
    public final boolean setPreferredMicrophoneFieldDimension(float f) {
        return this.b.setPreferredMicrophoneFieldDimension(f);
    }
}
