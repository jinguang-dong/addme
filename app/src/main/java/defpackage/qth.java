package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qth {
    public final Object a;
    public final Object b;

    private qth(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = byteBuffer;
        this.b = bufferInfo;
    }

    public static qth a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(bufferInfo.offset);
        byteBufferDuplicate.limit(bufferInfo.size + bufferInfo.offset);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBufferAllocateDirect.put(byteBufferDuplicate);
        byteBufferAllocateDirect.rewind();
        return new qth(byteBufferAllocateDirect, bufferInfo2);
    }

    public static qth b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(bufferInfo.offset);
        byteBufferDuplicate.limit(bufferInfo.size + bufferInfo.offset);
        return new qth(byteBufferDuplicate, bufferInfo2);
    }

    public qth(MediaFormat mediaFormat, qlv qlvVar, qlr qlrVar, Handler handler, boolean z, Surface surface, boolean z2) throws IOException {
        boolean z3;
        rvu qcjVar;
        if (z) {
            qcjVar = new pzw(18);
            z3 = true;
        } else if (surface != null) {
            z3 = false;
            qcjVar = new qcj(surface, 2);
        } else {
            z3 = false;
            qcjVar = null;
        }
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        boolean z4 = qia.a;
        qli qliVar = new qli(mediaCodecCreateEncoderByType, mediaFormat, qcjVar, z3, handler, z2);
        this.b = qliVar;
        if (qliVar.i.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        qliVar.o = qlrVar;
        qmc qmcVar = new qmc(qlvVar);
        if (qliVar.i.get()) {
            throw new IllegalStateException("Not allowed to update the frame processor after start.");
        }
        qliVar.n = qmcVar;
        this.a = qmcVar.b;
    }

    public qth(uem uemVar, uem uemVar2) {
        this.a = uemVar;
        uemVar2.getClass();
        this.b = uemVar2;
    }

    public qth(FileDescriptor fileDescriptor) {
        this.b = rwc.j(fileDescriptor);
        this.a = rvk.a;
    }
}
