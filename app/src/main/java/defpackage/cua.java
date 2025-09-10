package defpackage;

import android.media.MediaDataSource;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cua extends MediaDataSource {
    long a;
    final /* synthetic */ cub b;

    public cua(cub cubVar) {
        this.b = cubVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.a;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + this.b.available()) {
                    return -1;
                }
                this.b.c(j);
                this.a = j;
            }
            cub cubVar = this.b;
            if (i2 > cubVar.available()) {
                i2 = cubVar.available();
            }
            int i3 = cubVar.read(bArr, i, i2);
            if (i3 >= 0) {
                this.a += i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
