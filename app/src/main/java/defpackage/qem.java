package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Log;
import androidx.media3.muxer.NativeAnnexBToAvccConverter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qem implements pop {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final List b = new ArrayList();
    private final pbn c;
    private final qaq d;

    public qem(FileOutputStream fileOutputStream, boolean z, pbn pbnVar) throws IOException {
        this.c = pbnVar;
        try {
            czp czpVar = new czp(fileOutputStream);
            czpVar.a = 1;
            czpVar.b = new NativeAnnexBToAvccConverter();
            czpVar.b();
            czpVar.c = !z;
            this.d = new qaq(czpVar.a());
        } catch (Exception e) {
            Log.e("GcaMediaMuxer", "Error creating the GCA muxer", e);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Log.e("GcaMediaMuxer", "Error closing the output stream.", e2);
            }
            throw new qen(e);
        }
    }

    @Override // defpackage.pop
    public final int a(MediaFormat mediaFormat) {
        List list = this.b;
        try {
            list.add(Integer.valueOf(this.d.b(list.size(), mediaFormat)));
            if (coi.v(mediaFormat) != null) {
                this.d.c(new czb("com.android.capture.fps", cza.e(r5.intValue()), 23));
            }
            return this.b.size() - 1;
        } catch (czs e) {
            throw new qen(e);
        }
    }

    @Override // defpackage.pop
    public final void b(String str, Object obj) {
        czb czbVar;
        if (obj instanceof String) {
            czbVar = new czb(str, cza.d((String) obj), 1);
        } else {
            if (!(obj instanceof Float)) {
                throw new IllegalArgumentException("Unsupported metadata");
            }
            czbVar = new czb(str, cza.e(((Float) obj).floatValue()), 23);
        }
        this.d.c(czbVar);
    }

    @Override // defpackage.pop
    public final void c() {
        j();
    }

    @Override // defpackage.pop
    public final void d(float f, float f2) {
        this.d.c(new czc(f, f2));
    }

    @Override // defpackage.pop
    public final void e(int i) {
        this.d.c(new czd(i));
    }

    @Override // defpackage.pop
    public final synchronized void f(long j, long j2) {
        this.d.c(new cze(cze.a(j), cze.a(j2)));
    }

    @Override // defpackage.pop
    public final void h() {
        j();
    }

    @Override // defpackage.pop
    public final void i(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.d.e(((Integer) this.b.get(i)).intValue(), byteBuffer, bufferInfo);
        } catch (czs e) {
            throw new qen(e);
        }
    }

    public final void j() {
        try {
            if (this.a.getAndSet(true)) {
                return;
            }
            pbn pbnVar = this.c;
            pbnVar.h("GcaMediaMuxer#close");
            this.d.d();
            pbnVar.g();
        } catch (czs e) {
            throw new qen(e);
        }
    }

    @Override // defpackage.pop
    public final boolean k() {
        return true;
    }

    @Override // defpackage.pop
    public final boolean l() {
        return true;
    }

    @Override // defpackage.pop
    public final void g() {
    }
}
