package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final class i extends o implements Spliterator {
    public final /* synthetic */ int i;
    public long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(k[] kVarArr, int i, int i2, int i3, long j, int i4) {
        super(kVarArr, i, i2, i3);
        this.i = i4;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.i) {
        }
        return this.j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                while (true) {
                    k kVarA = a();
                    if (kVarA == null) {
                        break;
                    } else {
                        consumer.accept(kVarA.b);
                    }
                }
            default:
                consumer.getClass();
                while (true) {
                    k kVarA2 = a();
                    if (kVarA2 == null) {
                        break;
                    } else {
                        consumer.accept(kVarA2.c);
                    }
                }
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        switch (this.i) {
        }
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.i) {
        }
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        switch (this.i) {
        }
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.i) {
            case 0:
                consumer.getClass();
                k kVarA = a();
                if (kVarA != null) {
                    consumer.accept(kVarA.b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                k kVarA2 = a();
                if (kVarA2 != null) {
                    consumer.accept(kVarA2.c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.i) {
            case 0:
                int i = this.f;
                int i2 = this.g;
                int i3 = (i + i2) >>> 1;
                if (i3 <= i) {
                    return null;
                }
                k[] kVarArr = this.a;
                this.g = i3;
                long j = this.j >>> 1;
                this.j = j;
                return new i(kVarArr, this.h, i3, i2, j, 0);
            default:
                int i4 = this.f;
                int i5 = this.g;
                int i6 = (i4 + i5) >>> 1;
                if (i6 <= i4) {
                    return null;
                }
                k[] kVarArr2 = this.a;
                this.g = i6;
                long j2 = this.j >>> 1;
                this.j = j2;
                return new i(kVarArr2, this.h, i6, i5, j2, 1);
        }
    }
}
