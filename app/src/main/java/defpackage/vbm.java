package defpackage;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbm extends UploadDataProvider {
    private final org.chromium.net.UploadDataProvider a;

    public vbm(org.chromium.net.UploadDataProvider uploadDataProvider) {
        this.a = uploadDataProvider;
    }

    @Override // android.net.http.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // android.net.http.UploadDataProvider
    public final long getLength() {
        return this.a.getLength();
    }

    @Override // android.net.http.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        this.a.read(new vbn(uploadDataSink), byteBuffer);
    }

    @Override // android.net.http.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.a.rewind(new vbn(uploadDataSink));
    }
}
