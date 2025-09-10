package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyx implements jzf {
    private final jyw a;
    private final qfc b;
    private boolean c = false;
    private final ejt d;

    public jyx(jyw jywVar, qfc qfcVar, ejt ejtVar) {
        this.a = jywVar;
        this.b = qfcVar;
        this.d = ejtVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [sgt, shi] */
    @Override // defpackage.jzf
    public final synchronized boolean a(poj pojVar) {
        try {
            jyw jywVar = this.a;
            ejt ejtVar = this.d;
            jyw jywVar2 = ((jyy) jywVar).a;
            for (int i = 0; i < 3; i++) {
                try {
                    jyw jywVar3 = ((jyy) jywVar2).a;
                    long jIncrementAndGet = ((jyz) jywVar3).a.incrementAndGet();
                    long jD = pojVar.d();
                    jyv jyvVarA = ((jyz) jywVar3).b.a(new jzd(pojVar, jIncrementAndGet * 1000000), ejtVar);
                    long jConvert = TimeUnit.MICROSECONDS.convert(jD, TimeUnit.NANOSECONDS);
                    MediaCodec.BufferInfo bufferInfo = ((jza) jyvVarA).a;
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.presentationTimeUs = jConvert;
                    bufferInfo2.size = bufferInfo.size;
                    bufferInfo2.offset = bufferInfo.offset;
                    bufferInfo2.flags = bufferInfo.flags;
                    jzc jzcVar = new jzc(bufferInfo2, jyvVarA);
                    try {
                        jyv jyvVar = jzcVar.b;
                        MediaCodec mediaCodec = ((jza) jyvVar).b;
                        MediaFormat outputFormat = mediaCodec.getOutputFormat();
                        MediaCodec.BufferInfo bufferInfo3 = jzcVar.a;
                        MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                        bufferInfo4.presentationTimeUs = bufferInfo3.presentationTimeUs;
                        bufferInfo4.flags = bufferInfo3.flags;
                        bufferInfo4.offset = bufferInfo3.offset;
                        bufferInfo4.size = bufferInfo3.size;
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo4.size);
                        ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(((jza) jyvVar).c);
                        outputBuffer.getClass();
                        ByteBuffer byteBufferDuplicate = outputBuffer.duplicate();
                        MediaCodec.BufferInfo bufferInfo5 = ((jza) jyvVar).a;
                        byteBufferDuplicate.position(bufferInfo5.offset);
                        byteBufferDuplicate.limit(bufferInfo5.offset + bufferInfo5.size);
                        byteBufferAllocateDirect.put(byteBufferDuplicate.slice());
                        byteBufferAllocateDirect.rewind();
                        jzb jzbVar = new jzb(bufferInfo4, outputFormat, byteBufferAllocateDirect);
                        jzcVar.close();
                        MediaCodec.BufferInfo bufferInfo6 = jzbVar.a;
                        if (!this.c) {
                            this.b.a(ske.M(jzbVar.b));
                            this.c = true;
                        }
                        if ((bufferInfo6.flags & 4) == 0 && (bufferInfo6.flags & 2) == 0) {
                            this.b.b(jzbVar.c, bufferInfo6);
                        }
                    } finally {
                    }
                } catch (IllegalStateException e) {
                    ((sgt) ((sgt) jze.a.c().i(e)).M((char) 3177)).s("Encoding failed. Retrying...");
                }
            }
            throw new IllegalStateException("Max attempts to encode reached! Encoding failed!");
        } finally {
            pojVar.close();
        }
        return true;
    }

    @Override // defpackage.jzf, defpackage.paq, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.close();
    }
}
