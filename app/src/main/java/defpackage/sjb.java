package defpackage;

import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sjb {
    public static final sjd a = a(sjd.d);

    private static sjd a(String[] strArr) {
        sjm sjmVar;
        try {
            sjmVar = sjn.a;
        } catch (NoClassDefFoundError unused) {
            sjmVar = null;
        }
        if (sjmVar != null) {
            return sjmVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (sjd) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
