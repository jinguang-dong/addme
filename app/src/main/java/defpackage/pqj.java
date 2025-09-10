package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqj implements ppw {
    private final File a;
    private final pqe b;

    public pqj(File file, pqe pqeVar) {
        this.a = file;
        this.b = pqeVar;
    }

    public static pqj l(pqe pqeVar, ppu ppuVar) {
        return new pqj(pqeVar.b(ppuVar), pqeVar);
    }

    private final void m() throws IOException {
        File parentFile = this.a.getParentFile();
        parentFile.getClass();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Unable to create or find media storage directory");
        }
    }

    @Override // defpackage.ppv
    public final long a() {
        File file = this.a;
        if (file.exists()) {
            return file.length();
        }
        return -1L;
    }

    @Override // defpackage.ppv
    public final FileInputStream b() {
        return new FileInputStream(this.a);
    }

    @Override // defpackage.ppv
    public final FileOutputStream c() {
        throw null;
    }

    @Override // defpackage.ppv
    public final void d() throws IOException {
        m();
        try {
            File file = this.a;
            if (file.exists()) {
                return;
            }
            file.createNewFile();
        } catch (Throwable th) {
            throw new IOException("Unable to create " + this.a.toString() + "!", th);
        }
    }

    @Override // defpackage.ppv
    public final boolean e() {
        return this.a.canRead();
    }

    @Override // defpackage.ppv
    public final boolean f() {
        File file = this.a;
        if (file.exists()) {
            return file.canWrite();
        }
        File parentFile = file.getParentFile();
        while (parentFile != null && !parentFile.exists()) {
            parentFile = parentFile.getParentFile();
        }
        boolean z = false;
        if (parentFile != null && parentFile.canExecute() && parentFile.canWrite()) {
            z = true;
        }
        if (!z) {
            String.format(Locale.ROOT, "Cannot write to %s, with earliestExistingParentFolder=%s()", file.getAbsoluteFile(), parentFile);
        }
        return z;
    }

    @Override // defpackage.ppv
    public final FileOutputStream g() throws IOException {
        m();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
            return new pqi(randomAccessFile.getFD(), randomAccessFile);
        } catch (Throwable th) {
            throw new IOException("Unable to create " + this.a.toString() + "!", th);
        }
    }

    @Override // defpackage.ppw
    public final Uri h() {
        return Uri.EMPTY;
    }

    @Override // defpackage.ppw
    public final pqe i() {
        return this.b;
    }

    @Override // defpackage.ppw
    public final boolean k() {
        return this.a.canWrite();
    }

    public final String toString() {
        return this.b.toString() + ": " + this.a.getAbsolutePath();
    }

    @Override // defpackage.ppw
    public final void j() {
    }
}
