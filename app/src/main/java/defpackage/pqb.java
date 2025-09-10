package defpackage;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqb extends FileInputStream implements InputStreamRetargetInterface {
    final /* synthetic */ pqd a;
    private final int b;
    private final FileInputStream c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqb(pqd pqdVar, FileInputStream fileInputStream) {
        super(fileInputStream.getFD());
        this.a = pqdVar;
        this.b = pqd.b.incrementAndGet();
        this.d = false;
        this.c = fileInputStream;
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        IOException iOException;
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            try {
                super.close();
                iOException = null;
            } catch (IOException e) {
                iOException = new IOException(e);
            }
            try {
                this.c.close();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = new IOException(e2);
                }
            }
            if (iOException == null) {
            } else {
                throw iOException;
            }
        } finally {
            pqd pqdVar = this.a;
            AtomicInteger atomicInteger = pqd.a;
            pqdVar.c.readLock().unlock();
            toString();
        }
    }

    public final String toString() {
        return "MediaInputStream-" + this.b;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }
}
