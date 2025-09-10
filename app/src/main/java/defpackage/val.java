package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class val implements vae {
    public final vap a;
    public final vad b = new vad();
    public boolean c;

    public val(vap vapVar) {
        this.a = vapVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.vap
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // defpackage.vae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(defpackage.vaf r19) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.val.d(vaf):long");
    }

    @Override // defpackage.vap
    public final long e(vad vadVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        vad vadVar2 = this.b;
        if (vadVar2.b == 0 && this.a.e(vadVar2, 8192L) == -1) {
            return -1L;
        }
        return vadVar2.e(vadVar, Math.min(8192L, vadVar2.b));
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.vae
    public final boolean l(long j) {
        vad vadVar;
        if (j < 0) {
            throw new IllegalArgumentException(mn.h(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            vadVar = this.b;
            if (vadVar.b >= j) {
                return true;
            }
        } while (this.a.e(vadVar, 8192L) != -1);
        return false;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        vad vadVar = this.b;
        if (vadVar.b == 0 && this.a.e(vadVar, 8192L) == -1) {
            return -1;
        }
        return vadVar.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + GAQqzWiWWcYOgy.YONzi;
    }
}
