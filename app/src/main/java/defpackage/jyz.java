package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jyz implements jyw {
    final /* synthetic */ AtomicInteger a;
    final /* synthetic */ jyw b;

    public jyz(AtomicInteger atomicInteger, jyw jywVar) {
        this.a = atomicInteger;
        this.b = jywVar;
    }

    @Override // defpackage.jyw
    public final jyv a(poj pojVar, ejt ejtVar) {
        throw null;
    }

    @Override // defpackage.qfo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
