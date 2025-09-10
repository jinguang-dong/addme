package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfk implements rev {
    private static final String a = "rfk";
    private static HashMap b;
    private static HashMap c;
    private static HashMap d;

    static String b(Context context, int i) {
        return i >= 0 ? (String) rwc.i(qsz.c(context.getResources(), i)).e("id/0x".concat(String.valueOf(Integer.toHexString(i)))) : "NO_ID";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[PHI: r4
      0x00c0: PHI (r4v10 rfo) = (r4v5 rfo), (r4v5 rfo), (r4v12 rfo) binds: [B:32:0x009c, B:34:0x00a2, B:46:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc A[Catch: IllegalAccessException -> 0x014b, TryCatch #1 {IllegalAccessException -> 0x014b, blocks: (B:31:0x0098, B:33:0x009e, B:35:0x00a4, B:57:0x012b, B:58:0x012f, B:38:0x00c6, B:41:0x00d3, B:42:0x00dc, B:44:0x00e3, B:45:0x0103, B:47:0x010a, B:49:0x0111, B:51:0x0119, B:55:0x0125, B:52:0x011f), top: B:70:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[Catch: IllegalAccessException -> 0x014b, TryCatch #1 {IllegalAccessException -> 0x014b, blocks: (B:31:0x0098, B:33:0x009e, B:35:0x00a4, B:57:0x012b, B:58:0x012f, B:38:0x00c6, B:41:0x00d3, B:42:0x00dc, B:44:0x00e3, B:45:0x0103, B:47:0x010a, B:49:0x0111, B:51:0x0119, B:55:0x0125, B:52:0x011f), top: B:70:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010a A[Catch: IllegalAccessException -> 0x014b, TryCatch #1 {IllegalAccessException -> 0x014b, blocks: (B:31:0x0098, B:33:0x009e, B:35:0x00a4, B:57:0x012b, B:58:0x012f, B:38:0x00c6, B:41:0x00d3, B:42:0x00dc, B:44:0x00e3, B:45:0x0103, B:47:0x010a, B:49:0x0111, B:51:0x0119, B:55:0x0125, B:52:0x011f), top: B:70:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b A[Catch: IllegalAccessException -> 0x014b, TryCatch #1 {IllegalAccessException -> 0x014b, blocks: (B:31:0x0098, B:33:0x009e, B:35:0x00a4, B:57:0x012b, B:58:0x012f, B:38:0x00c6, B:41:0x00d3, B:42:0x00dc, B:44:0x00e3, B:45:0x0103, B:47:0x010a, B:49:0x0111, B:51:0x0119, B:55:0x0125, B:52:0x011f), top: B:70:0x0098 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void c(android.content.Context r16, java.lang.Object r17, defpackage.rfo r18, java.lang.String r19) throws java.lang.IllegalAccessException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfk.c(android.content.Context, java.lang.Object, rfo, java.lang.String):void");
    }

    private static Object d(Method method, Object obj) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof View)) {
            return method.invoke(obj, null);
        }
        View view = (View) obj;
        FutureTask futureTask = new FutureTask(new fsu(method, view, 13));
        Handler handler = view.getHandler();
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            return method.invoke(view, null);
        }
        handler.post(futureTask);
        while (true) {
            try {
                return futureTask.get(4000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
            } catch (CancellationException e) {
                throw new RuntimeException("Unexpected cancellation exception", e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IllegalAccessException) {
                    throw ((IllegalAccessException) cause);
                }
                if (cause instanceof InvocationTargetException) {
                    throw ((InvocationTargetException) cause);
                }
                throw new RuntimeException("Unexpected exception", cause);
            }
        }
    }

    private static void e(Context context, Object obj, rfo rfoVar, Class cls, String str, Set set) throws SecurityException {
        Object obj2;
        boolean z;
        Context context2 = context;
        for (Method method : j(cls)) {
            try {
                Object objD = d(method, obj);
                Class<?> returnType = method.getReturnType();
                ViewDebug.ExportedProperty exportedProperty = (ViewDebug.ExportedProperty) d.get(method);
                String str2 = exportedProperty.category().length() != 0 ? exportedProperty.category() + ":" : "";
                if (returnType == Integer.TYPE) {
                    try {
                        if (!exportedProperty.resolveId() || context2 == null) {
                            ViewDebug.FlagToString[] flagToStringArrFlagMapping = exportedProperty.flagMapping();
                            if (flagToStringArrFlagMapping.length > 0) {
                                g(rfoVar, flagToStringArrFlagMapping, ((Integer) objD).intValue(), str2 + str + method.getName() + "_", set);
                            }
                            ViewDebug.IntToString[] intToStringArrMapping = exportedProperty.mapping();
                            int length = intToStringArrMapping.length;
                            if (length > 0) {
                                Integer num = (Integer) objD;
                                int iIntValue = num.intValue();
                                int i = 0;
                                while (true) {
                                    if (i >= length) {
                                        obj2 = objD;
                                        z = false;
                                        break;
                                    }
                                    ViewDebug.IntToString intToString = intToStringArrMapping[i];
                                    ViewDebug.IntToString[] intToStringArr = intToStringArrMapping;
                                    if (intToString.from() == iIntValue) {
                                        obj2 = intToString.to();
                                        z = true;
                                        break;
                                    } else {
                                        i++;
                                        intToStringArrMapping = intToStringArr;
                                    }
                                }
                                if (z) {
                                    objD = obj2;
                                    context2 = context;
                                } else {
                                    context2 = context;
                                    objD = num;
                                }
                            } else {
                                context2 = context;
                            }
                        } else {
                            objD = b(context2, ((Integer) objD).intValue());
                        }
                        h(rfoVar, str2 + str + method.getName() + "()", objD, set);
                    } catch (IllegalAccessException | InvocationTargetException | TimeoutException unused) {
                        context2 = context;
                    }
                } else if (returnType == int[].class) {
                    context2 = context;
                    f(context2, rfoVar, exportedProperty, (int[]) objD, str2 + str + method.getName() + "_", "()", set);
                } else {
                    context2 = context;
                    if (returnType.isPrimitive() || !exportedProperty.deepExport()) {
                        h(rfoVar, str2 + str + method.getName() + "()", objD, set);
                    } else {
                        c(context2, objD, rfoVar, str + exportedProperty.prefix());
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException | TimeoutException unused2) {
            }
        }
    }

    private static void f(Context context, rfo rfoVar, ViewDebug.ExportedProperty exportedProperty, int[] iArr, String str, String str2, Set set) {
        ViewDebug.IntToString[] intToStringArrIndexMapping = exportedProperty.indexMapping();
        int length = intToStringArrIndexMapping.length;
        ViewDebug.IntToString[] intToStringArrMapping = exportedProperty.mapping();
        int length2 = intToStringArrMapping.length;
        boolean z = exportedProperty.resolveId() && context != null;
        int length3 = iArr.length;
        for (int i = 0; i < length3; i++) {
            int i2 = iArr[i];
            String strValueOf = String.valueOf(i);
            if (length > 0) {
                int length4 = intToStringArrIndexMapping.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length4) {
                        break;
                    }
                    ViewDebug.IntToString intToString = intToStringArrIndexMapping[i3];
                    if (intToString.from() == i) {
                        strValueOf = intToString.to();
                        break;
                    }
                    i3++;
                }
            }
            String strValueOf2 = null;
            if (length2 > 0) {
                int length5 = intToStringArrMapping.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length5) {
                        break;
                    }
                    ViewDebug.IntToString intToString2 = intToStringArrMapping[i4];
                    if (intToString2.from() == i2) {
                        strValueOf2 = intToString2.to();
                        break;
                    }
                    i4++;
                }
            }
            if (!z) {
                strValueOf2 = String.valueOf(i2);
            } else if (strValueOf2 == null) {
                strValueOf2 = b(context, i2);
            }
            h(rfoVar, str + strValueOf + str2, strValueOf2, set);
        }
    }

    private static void g(rfo rfoVar, ViewDebug.FlagToString[] flagToStringArr, int i, String str, Set set) {
        for (ViewDebug.FlagToString flagToString : flagToStringArr) {
            boolean zOutputIf = flagToString.outputIf();
            int iMask = flagToString.mask() & i;
            boolean z = iMask == flagToString.equals();
            if (z) {
                if (!zOutputIf) {
                    zOutputIf = false;
                    if (z) {
                    }
                }
                h(rfoVar, str.concat(String.valueOf(flagToString.name())), "0x".concat(String.valueOf(Integer.toHexString(iMask))), set);
            } else if (z && !zOutputIf) {
                h(rfoVar, str.concat(String.valueOf(flagToString.name())), "0x".concat(String.valueOf(Integer.toHexString(iMask))), set);
            }
        }
    }

    private static void h(rfo rfoVar, String str, Object obj, Set set) {
        String string;
        if (set.contains(str)) {
            return;
        }
        if (obj != null) {
            try {
                string = obj.getClass().isArray() ? Arrays.toString((Object[]) obj) : obj.toString();
                try {
                    string = string.replace("\n", "\\n");
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                string = "[EXCEPTION]";
            }
        } else {
            string = "null";
        }
        rfoVar.b(str, string);
        set.add(str);
    }

    private static Field[] i(Class cls) {
        Field[] declaredFields;
        if (b == null) {
            b = new HashMap();
        }
        if (d == null) {
            d = new HashMap(512);
        }
        HashMap map = b;
        Field[] fieldArr = (Field[]) map.get(cls);
        if (fieldArr != null) {
            return fieldArr;
        }
        ArrayList arrayList = new ArrayList();
        try {
            declaredFields = cls.getDeclaredFields();
        } catch (NoClassDefFoundError unused) {
            Log.w(a, "Failed to export ".concat(String.valueOf(cls.getName())));
            declaredFields = new Field[0];
        }
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(ViewDebug.ExportedProperty.class) && !field.getName().contains("$$robo$$")) {
                field.setAccessible(true);
                arrayList.add(field);
                d.put(field, (ViewDebug.ExportedProperty) field.getAnnotation(ViewDebug.ExportedProperty.class));
            }
        }
        Field[] fieldArr2 = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
        map.put(cls, fieldArr2);
        return fieldArr2;
    }

    private static Method[] j(Class cls) throws SecurityException {
        Method[] declaredMethods;
        if (c == null) {
            c = new HashMap(100);
        }
        if (d == null) {
            d = new HashMap(512);
        }
        HashMap map = c;
        Method[] methodArr = (Method[]) map.get(cls);
        if (methodArr != null) {
            return methodArr;
        }
        ArrayList arrayList = new ArrayList();
        try {
            declaredMethods = cls.getDeclaredMethods();
        } catch (NoClassDefFoundError unused) {
            Log.w(a, "Failed to export ".concat(String.valueOf(cls.getName())));
            declaredMethods = new Method[0];
        }
        for (Method method : declaredMethods) {
            if (method.getParameterTypes().length == 0 && method.isAnnotationPresent(ViewDebug.ExportedProperty.class) && method.getReturnType() != Void.class && !method.getName().contains("$$robo$$")) {
                method.setAccessible(true);
                arrayList.add(method);
                d.put(method, (ViewDebug.ExportedProperty) method.getAnnotation(ViewDebug.ExportedProperty.class));
            }
        }
        Method[] methodArr2 = (Method[]) arrayList.toArray(new Method[arrayList.size()]);
        map.put(cls, methodArr2);
        return methodArr2;
    }

    @Override // defpackage.rev
    public final void a(rfo rfoVar, View view) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        c(view.getContext(), view, rfoVar, "");
    }
}
