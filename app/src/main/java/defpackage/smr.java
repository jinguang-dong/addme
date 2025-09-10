package defpackage;

import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
final class smr extends smt {
    final /* synthetic */ Stream a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smr(Stream stream, Function function, Function function2, Stream stream2) {
        super(stream, function, function2);
        this.a = stream2;
    }

    @Override // defpackage.smz
    public final Stream a() {
        return this.a;
    }
}
