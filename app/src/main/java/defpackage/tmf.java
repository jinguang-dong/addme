package defpackage;

import com.google.android.apps.camera.ui.zoomlock.Gx.nWEkBGOQPWQp;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmf {
    public static final tmc a;

    static {
        tmc tmdVar;
        try {
            tmdVar = new tme();
        } catch (ReflectiveOperationException unused) {
            tmdVar = new tmd();
        }
        a = tmdVar;
    }

    public static RuntimeException a(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static RuntimeException b(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.12.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String c(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        i(constructor, sb);
        return sb.toString();
    }

    public static String d(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String f(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee ".concat(sla.x((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
    }

    public static void g(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new tim("Failed making " + e(accessibleObject, false) + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + f(e), e);
        }
    }

    public static boolean h(Class cls) {
        if (Modifier.isStatic(cls.getModifiers())) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static void i(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String e(AccessibleObject accessibleObject, boolean z) {
        String strConcat;
        if (accessibleObject instanceof Field) {
            strConcat = "field '" + d((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            i(method, sb);
            String string = sb.toString();
            strConcat = "method '" + method.getDeclaringClass().getName() + "#" + string + "'";
        } else if (accessibleObject instanceof Constructor) {
            strConcat = "constructor '" + c((Constructor) accessibleObject) + "'";
        } else {
            strConcat = nWEkBGOQPWQp.yWFAqTzmeIVqZb.concat(String.valueOf(accessibleObject.toString()));
        }
        if (!z || !Character.isLowerCase(strConcat.charAt(0))) {
            return strConcat;
        }
        return Character.toUpperCase(strConcat.charAt(0)) + strConcat.substring(1);
    }
}
