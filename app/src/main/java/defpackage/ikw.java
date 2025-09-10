package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ikw implements ilo {
    public static final sgv a = sgv.g("ikw");
    public MediaCodec b;
    public boolean c;
    public boolean d;
    private final MediaFormat e;

    public ikw() throws IOException {
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 44100, 1);
        this.c = false;
        this.d = false;
        this.b = mediaCodecCreateEncoderByType;
        this.e = mediaFormatCreateAudioFormat;
    }

    @Override // defpackage.ilo
    public final MediaCodec a() {
        return this.b;
    }

    @Override // defpackage.ilo
    public final void b() {
        this.c = true;
    }

    @Override // defpackage.ilo
    public final void c() {
        this.d = false;
        this.b.stop();
        this.b.release();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    @Override // defpackage.ilo
    public final boolean d() {
        if (this.d) {
            ((sgt) a.b().M(2106)).s("AudioEncoder already started!");
            return true;
        }
        MediaFormat mediaFormat = this.e;
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("bitrate", 128000);
        mediaFormat.setInteger("max-input-size", 16384);
        try {
            this.b.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
            this.b.start();
            this.d = true;
            return true;
        } catch (Exception e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 2105)).s("Exception when configuring MediaCodec.");
            this.b.release();
            try {
                this.b = MediaCodec.createEncoderByType("audio/mp4a-latm");
                return false;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }
}
