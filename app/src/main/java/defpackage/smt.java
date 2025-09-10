package defpackage;

import j$.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public class smt extends smz {
    private final Stream a;
    public final Function b;
    public final Function c;

    public smt(Stream stream, Function function, Function function2) {
        stream.getClass();
        this.a = stream;
        function.getClass();
        this.b = function;
        function2.getClass();
        this.c = function2;
    }

    @Override // defpackage.smz
    public final smz b(Function function) {
        return new smt(this.a, this.b.mo30andThen(function), this.c);
    }

    @Override // defpackage.smz
    public final smz c(Function function) {
        return new smt(this.a, this.b, this.c.mo30andThen(function));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.smz
    public final Stream d(BiFunction biFunction) {
        return this.a.map(new fmu(this, biFunction, 5));
    }

    @Override // defpackage.smz
    public final Object e() {
        int i = 6;
        return this.a.collect(ryv.a(new npd(this.b, i), new npd(this.c, i)));
    }
}
