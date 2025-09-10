package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjx extends tjz {
    final /* synthetic */ Method a;

    public tjx(Method method) {
        this.a = method;
    }

    @Override // defpackage.tjz
    public final Object a(Class cls) {
        tjz.b(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
