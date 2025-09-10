package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
final class cvs {
    static final cvs a = new cvs();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, cvr cvrVar, cwa cwaVar, Class cls) {
        cwa cwaVar2 = (cwa) map.get(cvrVar);
        if (cwaVar2 == null || cwaVar == cwaVar2) {
            if (cwaVar2 == null) {
                map.put(cvrVar, cwaVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + cvrVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + cwaVar2 + ", new value " + cwaVar);
    }

    public final cvq a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(map, (cvr) entry.getKey(), (cwa) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!cwh.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                cwa cwaVarA = onLifecycleEvent.a();
                if (length > 1) {
                    if (!cwa.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (cwaVarA != cwa.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new cvr(i, method), cwaVarA, cls);
                z = true;
            }
        }
        cvq cvqVar = new cvq(map);
        this.c.put(cls, cvqVar);
        this.b.put(cls, Boolean.valueOf(z));
        return cvqVar;
    }

    final cvq b(Class cls) {
        cvq cvqVar = (cvq) this.c.get(cls);
        return cvqVar != null ? cvqVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
