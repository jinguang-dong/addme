package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkt extends tkp {
    static final Map a;
    private final Constructor b;
    private final Object[] c;
    private final Map d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, false);
        a = map;
    }

    public tkt(Class cls, tks tksVar, boolean z) throws SecurityException {
        super(tksVar);
        this.d = new HashMap();
        tmc tmcVar = tmf.a;
        Constructor constructorA = tmcVar.a(cls);
        this.b = constructorA;
        if (z) {
            tku.b(null, constructorA);
        } else {
            tmf.g(constructorA);
        }
        String[] strArrD = tmcVar.d(cls);
        for (int i = 0; i < strArrD.length; i++) {
            this.d.put(strArrD[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = a.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.tkp
    public final /* bridge */ /* synthetic */ Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.tkp
    public final /* bridge */ /* synthetic */ void e(Object obj, tml tmlVar, tkq tkqVar) {
        Map map = this.d;
        String str = tkqVar.b;
        Object[] objArr = (Object[]) obj;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException(a.by(str, tmf.c(this.b), "Could not find the index in the constructor '", "' for field with name '", "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."));
        }
        tiv tivVar = tkqVar.d;
        int iIntValue = num.intValue();
        Object objA = tivVar.a(tmlVar);
        if (objA != null || !tkqVar.e) {
            objArr[iIntValue] = objA;
            return;
        }
        throw new tip("null is not allowed as value for record component '" + str + "' of primitive type; at path " + tmlVar.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.tkp
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object d(Object[] objArr) {
        try {
            return this.b.newInstance(objArr);
        } catch (IllegalAccessException e) {
            throw tmf.b(e);
        } catch (IllegalArgumentException | InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + tmf.c(this.b) + "' with args " + Arrays.toString(objArr), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("Failed to invoke constructor '" + tmf.c(this.b) + "' with args " + Arrays.toString(objArr), e3.getCause());
        }
    }
}
