package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjg implements pop, pns {
    private final MediaMuxer a;

    public pjg(MediaMuxer mediaMuxer) {
        this.a = mediaMuxer;
    }

    @Override // defpackage.pop
    public final int a(MediaFormat mediaFormat) {
        return this.a.addTrack(mediaFormat);
    }

    @Override // defpackage.pop
    public final void c() {
        this.a.release();
    }

    @Override // defpackage.pop
    public final void d(float f, float f2) {
        this.a.setLocation(f, f2);
    }

    @Override // defpackage.pop
    public final void e(int i) {
        this.a.setOrientationHint(i);
    }

    @Override // defpackage.pop
    public final /* synthetic */ void f(long j, long j2) {
        throw new UnsupportedOperationException("Can't write Timestamp metadata using ".concat(String.valueOf(getClass().getSimpleName())));
    }

    @Override // defpackage.pop
    public final void g() {
        this.a.start();
    }

    @Override // defpackage.pop
    public final void h() {
        this.a.stop();
    }

    @Override // defpackage.pop
    public final void i(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a.writeSampleData(i, byteBuffer, bufferInfo);
    }

    @Override // defpackage.pns
    public final qaq j() {
        throw null;
    }

    @Override // defpackage.pop
    public final boolean k() {
        return false;
    }

    @Override // defpackage.pop
    public final boolean l() {
        return false;
    }

    @Override // defpackage.pop
    public final void b(String str, Object obj) {
        throw new UnsupportedOperationException(pAAtrB.cLJlIK);
    }
}
