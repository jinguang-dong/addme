package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.media.AudioTimestamp;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qlc implements qla {
    private final qla a;
    private final ExecutorService b;
    private final int c;
    private final long d;
    private long e = 0;
    private long f = 0;
    private volatile Future g = null;
    private volatile boolean h = false;

    public qlc(qla qlaVar, ExecutorService executorService) {
        this.a = qlaVar;
        this.b = executorService;
        this.c = qld.a(qlaVar.a()) * Math.max(1, qlaVar.a().getChannelCount());
        this.d = 1000000000 / qlaVar.a().getSampleRate();
    }

    private final long e() {
        return ((qlb) this.a).b != 0 ? SystemClock.elapsedRealtimeNanos() : System.nanoTime();
    }

    private final synchronized void f() {
        if (this.h) {
            ske.V(this.g);
        }
    }

    @Override // defpackage.qla
    public final AudioFormat a() {
        throw null;
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.qla
    public final synchronized qkz b(ByteBuffer byteBuffer, int i) {
        qkz qkzVarB;
        if (!this.h) {
            return null;
        }
        if (this.g.isDone()) {
            do {
                qkzVarB = this.a.b(byteBuffer, i);
                if (qkzVarB == null) {
                    return null;
                }
            } while (qkzVarB.c < this.e);
            return qkzVarB;
        }
        long jE = this.e;
        if (jE == 0) {
            jE = e();
            this.e = jE;
        }
        if (jE > e()) {
            return null;
        }
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        int i2 = i / this.c;
        audioTimestamp.framePosition = this.f;
        audioTimestamp.nanoTime = this.e;
        qkz qkzVar = new qkz(byteBuffer, i, this.e);
        long j = i2;
        this.f += j;
        this.e += j * this.d;
        byteBuffer.rewind();
        byteBuffer.put(new byte[i]);
        return qkzVar;
    }

    @Override // defpackage.qla
    public final synchronized void c() {
        if (this.h) {
            Log.w("SSAudioStream", "AudioStream already started.");
        } else {
            this.h = true;
            this.g = this.b.submit(new oze(this.a, 16));
        }
    }

    @Override // defpackage.qla, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.h) {
            d();
        }
        this.a.close();
    }

    @Override // defpackage.qla
    public final synchronized void d() {
        if (!this.h) {
            Log.w("SSAudioStream", "Trying to stop an un-started AudioStream.");
            return;
        }
        f();
        this.a.d();
        this.h = false;
        this.g = null;
        this.e = 0L;
        this.f = 0L;
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
