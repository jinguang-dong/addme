package defpackage;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.image.ImageUtils;
import j$.time.Duration;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class hyn implements UnaryOperator {
    private final /* synthetic */ int a;

    public /* synthetic */ hyn(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        return this.a != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        if (this.a != 0) {
            Duration duration = fpo.a;
            return fpa.INITIALIZING;
        }
        InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8) obj;
        InterleavedImageU8 interleavedImageU82 = new InterleavedImageU8(interleavedImageU8.d(), interleavedImageU8.b(), interleavedImageU8.a());
        ImageUtils.a(interleavedImageU8.f(), interleavedImageU82.g());
        return interleavedImageU82;
    }

    public final /* synthetic */ Function compose(Function function) {
        return this.a != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
