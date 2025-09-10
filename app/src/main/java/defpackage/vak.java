package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vak extends InputStream implements InputStreamRetargetInterface {
    final /* synthetic */ val a;

    public vak(val valVar) {
        this.a = valVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        val valVar = this.a;
        if (valVar.c) {
            throw new IOException("closed");
        }
        return (int) Math.min(valVar.b.b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        val valVar = this.a;
        if (valVar.c) {
            throw new IOException("closed");
        }
        vad vadVar = valVar.b;
        if (vadVar.b == 0 && valVar.a.e(vadVar, 8192L) == -1) {
            return -1;
        }
        return vadVar.b() & 255;
    }

    public final String toString() {
        val valVar = this.a;
        Objects.toString(valVar);
        return valVar.toString().concat(".inputStream()");
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final long transferTo(OutputStream outputStream) throws IOException {
        outputStream.getClass();
        val valVar = this.a;
        if (!valVar.c) {
            long j = 0;
            while (true) {
                vad vadVar = valVar.b;
                if (vadVar.b == 0 && valVar.a.e(vadVar, 8192L) == -1) {
                    return j;
                }
                long j2 = vadVar.b;
                j += j2;
                ukc.T(j2, 0L, j2);
                vam vamVar = vadVar.a;
                while (j2 > 0) {
                    vamVar.getClass();
                    int iMin = (int) Math.min(j2, vamVar.c - vamVar.b);
                    outputStream.write(vamVar.a, vamVar.b, iMin);
                    int i = vamVar.b + iMin;
                    vamVar.b = i;
                    long j3 = iMin;
                    vadVar.b -= j3;
                    j2 -= j3;
                    if (i == vamVar.c) {
                        vam vamVarA = vamVar.a();
                        vadVar.a = vamVarA;
                        van.b(vamVar);
                        vamVar = vamVarA;
                    }
                }
            }
        } else {
            throw new IOException(KsvNaXS.LVHrIHqHimJh);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        bArr.getClass();
        val valVar = this.a;
        if (!valVar.c) {
            ukc.T(bArr.length, i, i2);
            vad vadVar = valVar.b;
            if (vadVar.b == 0 && valVar.a.e(vadVar, 8192L) == -1) {
                return -1;
            }
            return vadVar.c(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
