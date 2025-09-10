package defpackage;

import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jkv implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ jkv(int i) {
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
                int i = jkx.n;
                return Optional.empty();
            case 1:
                return ((jju) obj).e;
            case 2:
                int i2 = jkx.n;
                return Optional.empty();
            case 3:
                int i3 = jkx.n;
                return Optional.empty();
            case 4:
                return ((jjq) obj).i;
            case 5:
                return ((jjq) obj).j;
            case 6:
                int i4 = jkx.n;
                return Optional.empty();
            case 7:
                return oxh.FPS_240_HFR_8X;
            case 8:
                return ((pjr) obj).a;
            case 9:
                return (kit) ((owf) obj).dL();
            case 10:
                return ((kit) obj).a;
            case 11:
                return Collection.EL.stream((Set) obj);
            case 12:
                return ((fre) obj).c();
            case 13:
                return Integer.valueOf(((fre) obj).a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Boolean.valueOf(!((syu) obj).isDone());
            case 15:
                return new iyz((fre) obj, 14);
            case 16:
                return Double.valueOf(kqn.a((pjo) obj));
            case 17:
                pjo pjoVar = (pjo) ujp.aQ(sbp.t(Comparator$CC.comparingDouble(new kql(1)), (List) obj));
                pjoVar.getClass();
                return pjoVar;
            case 18:
                return Boolean.valueOf(((Integer) obj).intValue() == gzr.SHUTTER_ASAP.ordinal());
            case 19:
                return ((peo) obj).d();
            default:
                return ((pjo) obj).j();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }
}
