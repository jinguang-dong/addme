package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqi extends FileOutputStream {
    final /* synthetic */ RandomAccessFile a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqi(FileDescriptor fileDescriptor, RandomAccessFile randomAccessFile) {
        super(fileDescriptor);
        this.a = randomAccessFile;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.a.close();
    }
}
