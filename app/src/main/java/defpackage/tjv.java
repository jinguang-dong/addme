package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjv extends tjz {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    public tjv(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    @Override // defpackage.tjz
    public final Object a(Class cls) {
        tjz.b(cls);
        return this.a.invoke(this.b, cls);
    }
}
