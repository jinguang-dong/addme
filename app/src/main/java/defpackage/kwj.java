package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kwj implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ kwj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo30andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Float.valueOf(((lxa) obj).b());
            case 1:
                return ((jyf) obj).a;
            case 2:
                return Float.valueOf(((lxa) obj).a());
            case 3:
                return ((obu) obj).b;
            case 4:
                return ((peo) obj).d();
            case 5:
                Stream streamDistinct = Collection.EL.stream(((pdk) obj).c().d()).map(new kwj(6)).distinct();
                int i = sbp.d;
                return (sbp) streamDistinct.collect(ryv.a);
            case 6:
                return ((peo) obj).d();
            case 7:
                return ((obu) obj).b;
            case 8:
                return ((peo) obj).d();
            case 9:
                return ((lau) obj).a;
            case 10:
                return Collection.EL.stream((sbp) obj);
            case 11:
                return ((Integer) obj).toString();
            case 12:
                return ((ljz) obj).b;
            case 13:
                return ((ljz) obj).e;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return qpt.bO(((Long) obj).longValue(), "%d", "%ds");
            case 15:
                return Long.valueOf(((lnx) obj).a);
            case 16:
                int i2 = lol.a;
                return Float.valueOf(((loh) obj).f);
            case 17:
                Float f = (Float) obj;
                f.floatValue();
                return f;
            case 18:
                return ((krz) obj).h();
            case 19:
                return (ksa) ((krz) obj).j().dL();
            default:
                return Boolean.valueOf(((gxj) obj) == gxj.b);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
