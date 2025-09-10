package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obm extends oao {
    public static obm a;

    public obm(oar oarVar) {
        super(oarVar);
    }

    protected static final String C(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return obj.toString();
        }
        char cCharAt = obj.toString().charAt(0);
        String strValueOf = String.valueOf(Math.abs(l.longValue()));
        StringBuilder sb = new StringBuilder();
        String str = cCharAt != '-' ? "" : "-";
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length() - 1)));
        sb.append("...");
        sb.append(str);
        sb.append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d));
        return sb.toString();
    }

    @Override // defpackage.oao
    protected final void a() {
        synchronized (obm.class) {
            a = this;
        }
    }

    public final void b(obj objVar, String str) {
        u("Discarding hit. ".concat(str), objVar != null ? objVar.toString() : "no hit data");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[Catch: all -> 0x0156, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000d, B:32:0x0060, B:33:0x0061, B:37:0x006e, B:39:0x00a8, B:40:0x00ac, B:42:0x00b3, B:46:0x00bc, B:48:0x00d0, B:51:0x00f6, B:67:0x0153, B:52:0x00f7, B:54:0x0109, B:55:0x0120, B:58:0x0123, B:60:0x013d, B:61:0x0144, B:62:0x014e, B:7:0x000e, B:9:0x0012, B:11:0x0020, B:13:0x0024, B:17:0x002d, B:18:0x0033, B:20:0x0037, B:25:0x004b, B:27:0x004f, B:22:0x003f, B:24:0x0047, B:28:0x005c), top: B:74:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[Catch: all -> 0x0156, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000d, B:32:0x0060, B:33:0x0061, B:37:0x006e, B:39:0x00a8, B:40:0x00ac, B:42:0x00b3, B:46:0x00bc, B:48:0x00d0, B:51:0x00f6, B:67:0x0153, B:52:0x00f7, B:54:0x0109, B:55:0x0120, B:58:0x0123, B:60:0x013d, B:61:0x0144, B:62:0x014e, B:7:0x000e, B:9:0x0012, B:11:0x0020, B:13:0x0024, B:17:0x002d, B:18:0x0033, B:20:0x0037, B:25:0x004b, B:27:0x004f, B:22:0x003f, B:24:0x0047, B:28:0x005c), top: B:74:0x0003, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(int r8, java.lang.String r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obm.c(int, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void");
    }
}
