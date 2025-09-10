package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkj implements tiw {
    private final tjb a;
    private final /* synthetic */ int b;

    public tkj(tjb tjbVar, int i) {
        this.b = i;
        this.a = tjbVar;
    }

    @Override // defpackage.tiw
    public final tiv a(tih tihVar, tmk tmkVar) {
        Type[] actualTypeArguments;
        if (this.b != 0) {
            Class cls = tmkVar.a;
            if (!Collection.class.isAssignableFrom(cls)) {
                return null;
            }
            Type typeD = tjh.d(tmkVar.b, cls, Collection.class);
            return new tkb(new tkx(tihVar.a(new tmk(typeD instanceof ParameterizedType ? ((ParameterizedType) typeD).getActualTypeArguments()[0] : Object.class))), this.a.a(tmkVar, false));
        }
        Class cls2 = tmkVar.a;
        if (!Map.class.isAssignableFrom(cls2)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls2)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeD2 = tjh.d(tmkVar.b, cls2, Map.class);
            actualTypeArguments = typeD2 instanceof ParameterizedType ? ((ParameterizedType) typeD2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type = actualTypeArguments[0];
        return new tki(new tkx((type == Boolean.TYPE || type == Boolean.class) ? tma.f : tihVar.a(new tmk(type))), new tkx(tihVar.a(new tmk(actualTypeArguments[1]))), this.a.a(tmkVar, false));
    }
}
