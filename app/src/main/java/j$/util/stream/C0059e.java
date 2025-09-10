package j$.util.stream;

import j$.util.Map;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.stream.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0059e implements BiFunction, Function {
    public final /* synthetic */ Function a;

    public /* synthetic */ C0059e(Function function) {
        this.a = function;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Map map = (Map) obj;
        Set set = Collectors.a;
        Map.EL.b(map, new C0059e(this.a));
        return map;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo30andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Set set = Collectors.a;
        return this.a.apply(obj2);
    }
}
