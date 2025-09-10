package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fzj implements gab {
    private static final sgv a = sgv.g("fzj");
    private final fzk b;
    private final fzl c;

    public fzj(int i, int i2) throws IOException {
        fzk fzkVar = new fzk(i, i2);
        this.b = fzkVar;
        try {
            this.c = new fzl(fzkVar);
        } catch (IOException e) {
            throw new IOException("Failed to set up output stream pipe", e);
        }
    }

    private final void c() {
        fzk fzkVar = this.b;
        synchronized (fzkVar) {
            fzkVar.notifyAll();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [sgt, shi] */
    @Override // defpackage.gab
    public final qaq a(ByteBuffer byteBuffer, int i) {
        qaq qaqVarA;
        try {
            qaqVarA = this.b.a(byteBuffer, i);
        } catch (IOException e) {
            ((sgt) ((sgt) a.b().i(e)).M((char) 616)).s("Failed to read audio packet from audio piped input stream.");
            qaqVarA = null;
        }
        c();
        return qaqVarA;
    }

    public final void b(qaq qaqVar) throws IOException {
        if (!qaqVar.t().hasArray()) {
            throw new UnsupportedOperationException("Provided bytebuffer unsupported.");
        }
        try {
            fzk fzkVar = this.c.a;
            if (fzkVar == null) {
                throw new IOException("Pipe not connected");
            }
            if (!qaqVar.t().hasArray()) {
                throw new UnsupportedOperationException("Provided byte buffer unsupported.");
            }
            fzkVar.b(qaqVar);
            c();
        } catch (IOException e) {
            throw new IOException("Failed to write audio packet into audio piped output stream.", e);
        }
    }
}
