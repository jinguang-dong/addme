package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import j$.time.Duration;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kat implements kao {
    public static final Duration a = Duration.ofSeconds(3);
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicInteger c = new AtomicInteger(0);
    public final MediaFormat d;
    public final llu e;
    public final pbc f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final qin j;
    private final Handler k;

    @Override // defpackage.kao
    public final MediaFormat a() {
        return this.d;
    }

    @Override // defpackage.kao
    public final jzf b(qfc qfcVar, pao paoVar, boolean z) throws IOException {
        AtomicInteger atomicInteger = this.c;
        if (atomicInteger.get() > 0) {
            this.f.h("Reached maximum number of active codecs running. Dropping moments track...");
            qfcVar.close();
            return new kbc(1);
        }
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("video/avc");
            atomicInteger.incrementAndGet();
            this.f.b("Created codec successfully; current count: " + atomicInteger.get());
            try {
                return new kas(this, mediaCodecCreateEncoderByType, this.k, paoVar, z).a(qfcVar);
            } catch (MediaCodec.CodecException e) {
                this.f.i("Exception trying to launch encoder...", e);
                mediaCodecCreateEncoderByType.release();
                qfcVar.close();
                this.c.decrementAndGet();
                return new kbc(1);
            }
        } catch (IOException e2) {
            qfcVar.close();
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.kao
    public final void c() {
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
    }

    public final void d(qlv qlvVar, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        byteBufferAllocateDirect.put(byteBuffer);
        byteBufferAllocateDirect.rewind();
        this.f.b("Submit image to muxer: " + bufferInfo.presentationTimeUs);
        qlvVar.b(byteBufferAllocateDirect, bufferInfo2);
    }

    public kat(MediaFormat mediaFormat, Handler handler, llu lluVar, qin qinVar, hbj hbjVar, pbc pbcVar) {
        this.d = mediaFormat;
        this.k = handler;
        this.e = lluVar;
        this.g = hbjVar.p(haa.H);
        this.h = hbjVar.p(haa.I);
        this.f = new pbg(pbcVar.a(ibINv.pNOlbkQL), mediaFormat.getInteger("width") + "x" + mediaFormat.getInteger("height"));
        int integer = mediaFormat.getInteger("color-format");
        a.I(integer == 21 || integer == 2141391872);
        pas pasVar = hpi.a;
        this.i = ((mediaFormat.getInteger("width") * mediaFormat.getInteger("height")) * 3) / 2;
        this.j = qinVar;
    }
}
