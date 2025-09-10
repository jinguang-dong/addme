package defpackage;

import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqt implements pqv {
    private final InputStream a;

    public pqt(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.pqv
    public final int a() {
        return this.a.read();
    }

    @Override // defpackage.pqv
    public final pqu b(int i, int i2) {
        byte[] bArr = new byte[i];
        return new pqu(bArr, i2, 0, ByteStreams.read(this.a, bArr, 0, i));
    }

    @Override // defpackage.pqv
    public final void c(int i) throws IOException {
        ByteStreams.skipFully(this.a, i);
    }

    @Override // defpackage.pqv
    public final pqu d() {
        byte[] byteArray = ByteStreams.toByteArray(this.a);
        return new pqu(byteArray, 218, 0, byteArray.length);
    }
}
