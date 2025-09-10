package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crx implements cqs {
    public final File a;
    public final byz b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public crx(File file, byz byzVar) {
        this.a = file;
        this.b = byzVar;
    }

    @Override // defpackage.cqs
    public final void a() {
        this.c.set(true);
    }

    protected final void b() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }
}
