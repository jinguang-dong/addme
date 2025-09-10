package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dud implements InvocationHandler {
    private final ukx a;
    private final uiq b;

    public dud(ukx ukxVar, uiq uiqVar) {
        this.a = ukxVar;
        this.b = uiqVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        if (a.ao(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            ukx ukxVar = this.a;
            Object obj2 = objArr[0];
            if (!ukxVar.d(obj2)) {
                throw new ClassCastException("Value cannot be cast to ".concat(String.valueOf(ukxVar.b())));
            }
            obj2.getClass();
            this.b.a(obj2);
            return ufg.a;
        }
        if (a.ao(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (a.ao(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(this.b.hashCode());
        }
        if (a.ao(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
