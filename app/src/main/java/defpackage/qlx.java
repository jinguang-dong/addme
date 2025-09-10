package defpackage;

import java.io.FileDescriptor;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlx {
    public final Executor a;
    private syu e = null;
    public syu b = ske.M(null);
    public syu c = ske.M(null);
    private syu f = ske.M(null);
    public boolean d = true;

    public qlx(Executor executor) {
        this.a = executor;
    }

    public final qlt a() {
        syu syuVar = this.e;
        if (syuVar == null) {
            throw new IllegalArgumentException("Output not properly specified");
        }
        syn synVarV = syn.v(syuVar);
        qpl qplVar = new qpl(1);
        Executor executor = this.a;
        return new qlu(swz.i(synVarV, qplVar, executor), this.f, this.b, this.c, this.d, executor);
    }

    public final void b(int i) {
        this.f = ske.M(Integer.valueOf(i));
    }

    public final void c(FileDescriptor fileDescriptor) {
        this.e = ske.M(fileDescriptor);
    }
}
