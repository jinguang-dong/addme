package defpackage;

import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coh {
    public coh() {
    }

    public static cpp a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        cpp cppVarN = cpp.n(rootWindowInsets);
        cppVarN.q(cppVarN);
        cppVarN.p(view.getRootView());
        return cppVarN;
    }

    public static void b(View view, int i, int i2) {
        view.setScrollIndicators(i, 3);
    }

    public static boolean c(String str, uif uifVar) {
        try {
            boolean zBooleanValue = ((Boolean) uifVar.a()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static boolean d(uif uifVar) {
        try {
            uifVar.a();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean e(Method method, Class cls) {
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public static boolean f(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    public static boolean g(Class cls, Class cls2) throws SecurityException {
        Method[] methods = cls2.getMethods();
        methods.getClass();
        for (Method method : methods) {
            if (!c(cls.getName() + '#' + method.getName() + " is not valid", new aet(cls, method, 16))) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(Method method, ukx ukxVar) {
        return e(method, ske.av(ukxVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.duy i(android.content.Context r9, androidx.window.extensions.layout.WindowLayoutInfo r10) {
        /*
            dvc r0 = new dvc
            r1 = 0
            r0.<init>(r1)
            boolean r0 = r9.isUiContext()
            if (r0 == 0) goto L15
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r9 = r9.getSystemService(r0)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
            goto L21
        L15:
            android.content.Context r9 = r9.getApplicationContext()
            java.lang.Class<android.view.WindowManager> r0 = android.view.WindowManager.class
            java.lang.Object r9 = r9.getSystemService(r0)
            android.view.WindowManager r9 = (android.view.WindowManager) r9
        L21:
            duz r0 = new duz
            android.view.WindowMetrics r2 = r9.getCurrentWindowMetrics()
            android.graphics.Rect r2 = r2.getBounds()
            r2.getClass()
            android.view.WindowMetrics r9 = r9.getCurrentWindowMetrics()
            float r9 = r9.getDensity()
            duc r3 = new duc
            r3.<init>(r2)
            r0.<init>(r3, r9)
            java.util.List r9 = r10.getDisplayFeatures()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L4e:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lfb
            java.lang.Object r2 = r9.next()
            androidx.window.extensions.layout.DisplayFeature r2 = (androidx.window.extensions.layout.DisplayFeature) r2
            boolean r3 = r2 instanceof androidx.window.extensions.layout.FoldingFeature
            if (r3 == 0) goto Lf3
            androidx.window.extensions.layout.FoldingFeature r2 = (androidx.window.extensions.layout.FoldingFeature) r2
            r2.getClass()
            int r3 = r2.getType()
            r4 = 2
            r5 = 1
            if (r3 == r5) goto L72
            if (r3 == r4) goto L6f
            goto Lf3
        L6f:
            duq r3 = defpackage.duq.b
            goto L74
        L72:
            duq r3 = defpackage.duq.a
        L74:
            int r6 = r2.getState()
            if (r6 == r5) goto L81
            if (r6 == r4) goto L7e
            goto Lf3
        L7e:
            dup r4 = defpackage.dup.b
            goto L83
        L81:
            dup r4 = defpackage.dup.a
        L83:
            duc r5 = new duc
            android.graphics.Rect r6 = r2.getBounds()
            r6.getClass()
            r5.<init>(r6)
            duc r6 = r0.a
            android.graphics.Rect r6 = r6.c()
            int r7 = r5.a()
            if (r7 != 0) goto La2
            int r7 = r5.b()
            if (r7 != 0) goto La2
            goto Lf3
        La2:
            int r7 = r5.b()
            int r8 = r6.width()
            if (r7 == r8) goto Lb7
            int r7 = r5.a()
            int r8 = r6.height()
            if (r7 == r8) goto Lb7
            goto Lf3
        Lb7:
            int r7 = r5.b()
            int r8 = r6.width()
            if (r7 >= r8) goto Lcc
            int r7 = r5.a()
            int r8 = r6.height()
            if (r7 >= r8) goto Lcc
            goto Lf3
        Lcc:
            int r7 = r5.b()
            int r8 = r6.width()
            if (r7 != r8) goto Le1
            int r5 = r5.a()
            int r6 = r6.height()
            if (r5 != r6) goto Le1
            goto Lf3
        Le1:
            dur r5 = new dur
            duc r6 = new duc
            android.graphics.Rect r2 = r2.getBounds()
            r2.getClass()
            r6.<init>(r2)
            r5.<init>(r6, r3, r4)
            goto Lf4
        Lf3:
            r5 = r1
        Lf4:
            if (r5 == 0) goto L4e
            r10.add(r5)
            goto L4e
        Lfb:
            duy r9 = new duy
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coh.i(android.content.Context, androidx.window.extensions.layout.WindowLayoutInfo):duy");
    }

    public static void j(String str) {
        Trace.beginSection(k(str));
    }

    public static String k(String str) {
        String str2 = str.length() <= 127 ? str : null;
        if (str2 != null) {
            return str2;
        }
        String strSubstring = str.substring(0, 127);
        strSubstring.getClass();
        return strSubstring;
    }

    public coh(byte[] bArr) {
        new HashMap();
    }
}
