package j$.util.stream;

import j$.util.OptionalLong;

/* loaded from: classes3.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    Stream<Long> boxed();

    OptionalLong max();
}
