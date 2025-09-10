package j$.util.stream;

import j$.util.OptionalDouble;

/* loaded from: classes3.dex */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {
    OptionalDouble average();

    OptionalDouble min();
}
