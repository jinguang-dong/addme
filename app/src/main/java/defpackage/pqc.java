package defpackage;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pqc extends FileOutputStream {
    final /* synthetic */ pqd a;
    private final int b;
    private final FileOutputStream c;
    private boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc(pqd pqdVar, FileOutputStream fileOutputStream) {
        super(fileOutputStream.getFD());
        this.a = pqdVar;
        this.b = pqd.a.incrementAndGet();
        this.d = false;
        this.c = fileOutputStream;
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        IOException iOException;
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            try {
                pqd pqdVar = this.a;
                AtomicInteger atomicInteger = pqd.a;
                prh prhVar = pqdVar.d;
                Os.fdatasync(getFD());
                iOException = null;
            } catch (ErrnoException e) {
                iOException = new IOException(e);
            }
            try {
                super.close();
            } catch (IOException e2) {
                if (iOException == null) {
                    iOException = new IOException(e2);
                }
            }
            try {
                this.c.close();
            } catch (IOException e3) {
                if (iOException == null) {
                    iOException = new IOException(e3);
                }
            }
            if (iOException == null) {
            } else {
                throw iOException;
            }
        } finally {
            pqd pqdVar2 = this.a;
            AtomicInteger atomicInteger2 = pqd.a;
            pqdVar2.c.writeLock().unlock();
            toString();
        }
    }

    public final String toString() {
        return "MediaOutputStream-" + this.b;
    }
}
