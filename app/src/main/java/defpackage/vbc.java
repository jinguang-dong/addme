package defpackage;

import android.net.http.BidirectionalStream;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbc extends ExperimentalBidirectionalStream {
    private final BidirectionalStream a;
    private final vbh b;
    private final String c;
    private final Collection d;

    public vbc(BidirectionalStream bidirectionalStream, vbh vbhVar, String str, Collection collection) {
        this.a = bidirectionalStream;
        this.b = vbhVar;
        this.c = str;
        this.d = collection;
    }

    final void a(int i, vbt vbtVar, CronetException cronetException) {
        vbl.a(this.b, this.c, this.d, null, i, vbtVar, cronetException);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void cancel() {
        this.a.cancel();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void flush() {
        this.a.flush();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void read(ByteBuffer byteBuffer) {
        this.a.read(byteBuffer);
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void start() {
        this.a.start();
    }

    @Override // org.chromium.net.BidirectionalStream
    public final void write(ByteBuffer byteBuffer, boolean z) {
        this.a.write(byteBuffer, z);
    }
}
