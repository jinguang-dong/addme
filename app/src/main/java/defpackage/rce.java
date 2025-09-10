package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rce extends rdb {
    public static final /* synthetic */ int a = 0;
    private final List b;

    public rce(OutputStream outputStream, List list) {
        super(outputStream);
        this.b = list;
        qpt.W(outputStream != null, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((rdv) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        this.out.write(i);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rdv) it.next()).a(1);
        }
    }

    @Override // defpackage.rdb, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rdv) it.next()).a(bArr.length);
        }
    }

    @Override // defpackage.rdb, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((rdv) it.next()).a(i2);
        }
    }
}
