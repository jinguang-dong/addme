package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface oyj extends paq {
    rwc b(MediaFormat mediaFormat);

    void c(MediaFormat mediaFormat);

    void d(oyk oykVar);

    void e(long j);

    void f(MediaFormat mediaFormat);

    void g();

    void h(oyk oykVar);

    void i(FileDescriptor fileDescriptor);

    void j();

    void k(long j);

    void l();

    void m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    void n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i);

    void o(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);

    boolean p();

    void q(Object obj);
}
