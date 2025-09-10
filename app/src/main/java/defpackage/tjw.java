package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tjw extends tjz {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    public tjw(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    @Override // defpackage.tjz
    public final Object a(Class cls) {
        tjz.b(cls);
        return this.a.invoke(null, cls, Integer.valueOf(this.b));
    }
}
