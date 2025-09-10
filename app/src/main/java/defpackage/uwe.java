package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uwe {
    public static final uwc a = new uwc("NO_THREAD_ELEMENTS");
    private static final uiu b = new ane(13);
    private static final uiu c = new ane(14);
    private static final uiu d = new ane(15);

    public static final Object a(uhf uhfVar) {
        Object objFold = uhfVar.fold(0, b);
        objFold.getClass();
        return objFold;
    }

    public static final Object b(uhf uhfVar, Object obj) {
        if (obj == null) {
            obj = a(uhfVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? uhfVar.fold(new uwh(uhfVar, ((Number) obj).intValue()), d) : ((upj) obj).fO(uhfVar);
    }

    public static final void c(uhf uhfVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof uwh)) {
            Object objFold = uhfVar.fold(null, c);
            objFold.getClass();
            ((upj) objFold).fP(obj);
            return;
        }
        uwh uwhVar = (uwh) obj;
        upj[] upjVarArr = uwhVar.c;
        int length = upjVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            upj upjVar = upjVarArr[length];
            upjVar.getClass();
            upjVar.fP(uwhVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
