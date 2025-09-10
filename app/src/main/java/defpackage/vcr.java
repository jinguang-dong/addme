package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcr implements vdb {
    public final /* synthetic */ vct a;
    public final /* synthetic */ boolean b;
    private final /* synthetic */ int c;

    public /* synthetic */ vcr(vct vctVar, boolean z, int i) {
        this.c = i;
        this.a = vctVar;
        this.b = z;
    }

    @Override // defpackage.vdb
    public final void a() throws IOException {
        if (this.c != 0) {
            vct vctVar = this.a;
            vdl vdlVar = vctVar.c;
            long length = vdlVar.getLength();
            vctVar.e = length;
            if (length == 0) {
                vctVar.f();
                return;
            }
            if (length <= 0 || length >= 8192) {
                vctVar.d = ByteBuffer.allocateDirect(8192);
            } else {
                vctVar.d = ByteBuffer.allocateDirect(((int) length) + 1);
            }
            long j = vctVar.e;
            if (j > 0) {
                vctVar.h.setFixedLengthStreamingMode(j);
            } else {
                vctVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                vctVar.c();
                return;
            } else {
                vctVar.a.set(1);
                vdlVar.rewind(vctVar);
                return;
            }
        }
        vct vctVar2 = this.a;
        long j2 = vctVar2.e;
        if (j2 != -1 && j2 - vctVar2.f < vctVar2.d.remaining()) {
            vctVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(vctVar2.f + vctVar2.d.remaining()), Long.valueOf(vctVar2.e))));
            return;
        }
        boolean z = this.b;
        if (vctVar2.d.remaining() == 0 && !z) {
            vctVar2.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = vctVar2.f;
        ByteBuffer byteBuffer = vctVar2.d;
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += vctVar2.i.write(byteBuffer);
        }
        vctVar2.j.flush();
        long j4 = j3 + iWrite;
        vctVar2.f = j4;
        long j5 = vctVar2.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                vctVar2.f();
                return;
            } else if (j5 == j4) {
                vctVar2.f();
                return;
            } else {
                vctVar2.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(vctVar2.f), Long.valueOf(vctVar2.e))));
                return;
            }
        }
        vctVar2.a.set(0);
        vctVar2.b();
    }
}
