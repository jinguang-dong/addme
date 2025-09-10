package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class P implements LongConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ P(int i) {
        this.a = i;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.a;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.c(this, longConsumer);
    }

    private final void accept$j$$util$stream$Node$OfLong$$ExternalSyntheticLambda0(long j) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfLong$$ExternalSyntheticLambda0(long j) {
    }
}
