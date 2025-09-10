package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rgs implements rgr {
    @Override // defpackage.rgr
    public final boolean disableSubpipeline(long j, String str) {
        return true;
    }

    @Override // defpackage.rgr
    public final boolean enableSubpipeline(long j, String str) {
        return true;
    }

    @Override // defpackage.rgr
    public final long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5) {
        return 1L;
    }

    @Override // defpackage.rgr
    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1L;
    }

    @Override // defpackage.rgr
    public final long initializeFrameManager() {
        return 1L;
    }

    @Override // defpackage.rgr
    public final long initializeIsolationCallback() {
        return 1L;
    }

    @Override // defpackage.rgr
    public final long initializeResultsCallback() {
        return 1L;
    }

    @Override // defpackage.rgr
    public final boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return true;
    }

    @Override // defpackage.rgr
    public final boolean stop(long j) {
        return true;
    }

    @Override // defpackage.rgr
    public final void a() {
    }

    @Override // defpackage.rgr
    public final void start(long j) {
    }

    @Override // defpackage.rgr
    public final void waitUntilIdle(long j) {
    }

    @Override // defpackage.rgr
    public final void resetSchedulingOptimizerOptions(long j, byte[] bArr) {
    }

    @Override // defpackage.rgr
    public final void close(long j, long j2, long j3, long j4, long j5) {
    }
}
