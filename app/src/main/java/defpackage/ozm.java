package defpackage;

import android.media.MediaRecorder;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ozm implements ozp {
    private static final AtomicInteger b = new AtomicInteger(0);
    public final MediaRecorder a;
    private boolean c = false;
    private rwc d = rvk.a;

    public ozm(MediaRecorder mediaRecorder) {
        this.a = mediaRecorder;
        b.getAndIncrement();
    }

    @Override // defpackage.ozp
    public final synchronized void A(int i, int i2) {
        if (this.c) {
            return;
        }
        this.a.setVideoSize(i, i2);
    }

    @Override // defpackage.ozp
    public final synchronized void B() {
        if (this.c) {
            return;
        }
        try {
            this.a.start();
        } catch (RuntimeException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void C() {
        if (this.c) {
            return;
        }
        try {
            this.a.stop();
        } catch (RuntimeException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void D() {
        if (this.c) {
            return;
        }
        this.a.setVideoSource(2);
    }

    @Override // defpackage.ozp
    public final MediaRecorder a() {
        return this.a;
    }

    @Override // defpackage.ozp
    public final synchronized Surface b() {
        if (this.c) {
            return null;
        }
        if (this.d.h()) {
            return (Surface) this.d.c();
        }
        return this.a.getSurface();
    }

    @Override // defpackage.ozp
    public final synchronized void c() {
        if (this.c) {
            return;
        }
        try {
            this.a.pause();
        } catch (RuntimeException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void d() {
        if (this.c) {
            return;
        }
        try {
            this.a.prepare();
        } catch (IOException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void e() {
        if (this.c) {
            return;
        }
        this.a.release();
        this.c = true;
    }

    @Override // defpackage.ozp
    public final synchronized void f() {
        if (this.c) {
            return;
        }
        this.d = rvk.a;
        this.a.reset();
    }

    @Override // defpackage.ozp
    public final synchronized void g() {
        if (this.c) {
            return;
        }
        try {
            this.a.resume();
        } catch (RuntimeException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void h(int i) {
        if (this.c) {
            return;
        }
        this.a.setAudioChannels(i);
    }

    @Override // defpackage.ozp
    public final synchronized void i(int i) {
        if (this.c) {
            return;
        }
        this.a.setAudioEncoder(i);
    }

    @Override // defpackage.ozp
    public final synchronized void j(int i) {
        if (this.c) {
            return;
        }
        this.a.setAudioEncodingBitRate(i);
    }

    @Override // defpackage.ozp
    public final synchronized void k(int i) {
        if (this.c) {
            return;
        }
        this.a.setAudioSamplingRate(i);
    }

    @Override // defpackage.ozp
    public final synchronized void l(int i) {
        if (this.c) {
            return;
        }
        this.a.setAudioSource(i);
    }

    @Override // defpackage.ozp
    public final synchronized void m(double d) {
        if (this.c) {
            return;
        }
        this.a.setCaptureRate(d);
    }

    @Override // defpackage.ozp
    public final synchronized void n(Surface surface) {
        if (this.c) {
            return;
        }
        this.a.setInputSurface(surface);
        this.d = rwc.j(surface);
    }

    @Override // defpackage.ozp
    public final synchronized void o(float f, float f2) {
        if (this.c) {
            return;
        }
        this.a.setLocation(f, f2);
    }

    @Override // defpackage.ozp
    public final synchronized void p(long j) {
        if (this.c) {
            return;
        }
        this.a.setMaxFileSize(j);
    }

    @Override // defpackage.ozp
    public final void q(FileDescriptor fileDescriptor) throws IOException {
        if (this.c) {
            return;
        }
        try {
            this.a.setNextOutputFile(fileDescriptor);
        } catch (IOException e) {
            throw new ozn(e);
        }
    }

    @Override // defpackage.ozp
    public final synchronized void r(MediaRecorder.OnErrorListener onErrorListener) {
        if (this.c) {
            return;
        }
        this.a.setOnErrorListener(onErrorListener);
    }

    @Override // defpackage.ozp
    public final synchronized void s(MediaRecorder.OnInfoListener onInfoListener) {
        if (this.c) {
            return;
        }
        this.a.setOnInfoListener(onInfoListener);
    }

    @Override // defpackage.ozp
    public final synchronized void t(int i) {
        if (this.c) {
            return;
        }
        this.a.setOrientationHint(i);
    }

    @Override // defpackage.ozp
    public final synchronized void u(FileDescriptor fileDescriptor) {
        if (this.c) {
            return;
        }
        this.a.setOutputFile(fileDescriptor);
    }

    @Override // defpackage.ozp
    public final synchronized void v(String str) {
        if (this.c) {
            return;
        }
        this.a.setOutputFile(str);
    }

    @Override // defpackage.ozp
    public final synchronized void w(int i) {
        if (this.c) {
            return;
        }
        this.a.setOutputFormat(i);
    }

    @Override // defpackage.ozp
    public final synchronized void x(int i) {
        if (this.c) {
            return;
        }
        this.a.setVideoEncoder(i);
    }

    @Override // defpackage.ozp
    public final synchronized void y(int i) {
        if (this.c) {
            return;
        }
        this.a.setVideoEncodingBitRate(i);
    }

    @Override // defpackage.ozp
    public final synchronized void z(int i) {
        if (this.c) {
            return;
        }
        this.a.setVideoFrameRate(i);
    }
}
