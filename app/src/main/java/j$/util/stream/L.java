package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class L implements DoubleConsumer {
    public final /* synthetic */ int a;

    public /* synthetic */ L(int i) {
        this.a = i;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.a) {
        }
        return j$.desugar.sun.nio.fs.g.b(this, doubleConsumer);
    }

    private final void accept$j$$util$stream$Node$OfDouble$$ExternalSyntheticLambda0(double d) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfDouble$$ExternalSyntheticLambda0(double d) {
    }
}
