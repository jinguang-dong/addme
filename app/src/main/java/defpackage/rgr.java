package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface rgr {
    void a();

    void close(long j, long j2, long j3, long j4, long j5);

    boolean disableSubpipeline(long j, String str);

    boolean enableSubpipeline(long j, String str);

    long initialize(byte[] bArr, long j, long j2, long j3, long j4, long j5);

    long initializeFrameBufferReleaseCallback(long j);

    long initializeFrameManager();

    long initializeIsolationCallback();

    long initializeResultsCallback();

    boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    void resetSchedulingOptimizerOptions(long j, byte[] bArr);

    void start(long j);

    boolean stop(long j);

    void waitUntilIdle(long j);
}
