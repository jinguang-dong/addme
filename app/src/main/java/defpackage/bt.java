package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bt {
    public static final /* synthetic */ int a = 0;
    private static final aaa b = new aaa();

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        aaa aaaVar = b;
        aaa aaaVar2 = (aaa) aaaVar.get(classLoader);
        if (aaaVar2 == null) {
            aaaVar2 = new aaa();
            aaaVar.put(classLoader, aaaVar2);
        }
        Class cls = (Class) aaaVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        aaaVar2.put(str, cls2);
        return cls2;
    }

    public bm b(String str) {
        throw null;
    }
}
