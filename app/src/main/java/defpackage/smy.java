package defpackage;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class smy extends smz {
    public final Stream a;
    public final Stream b;

    public smy(Stream stream, Stream stream2) {
        stream.getClass();
        this.a = stream;
        stream2.getClass();
        this.b = stream2;
    }

    @Override // defpackage.smz
    public final smz b(Function function) {
        throw null;
    }

    @Override // defpackage.smz
    public final smz c(Function function) {
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Stream stream = this.a;
        try {
            this.b.close();
            stream.close();
        } catch (Throwable th) {
            try {
                stream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.smz
    public final Stream d(BiFunction biFunction) {
        return StreamSupport.stream(new foj(this, biFunction, 12), 16, false).onClose(new smv(this.a, 0)).onClose(new smv(this.b, 0));
    }

    @Override // defpackage.smz
    public final Object e() {
        throw null;
    }

    public final void f(BiConsumer biConsumer) {
        smx smxVar = new smx(this);
        while (smxVar.a()) {
            biConsumer.accept(smxVar.a.a, smxVar.b.a);
        }
    }
}
