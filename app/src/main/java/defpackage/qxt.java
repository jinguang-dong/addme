package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qxt {
    private static final Object a = new Object();
    public static final /* synthetic */ int d = 0;
    private static volatile qxs e;
    private static volatile boolean f;
    private static final qyc g;
    private static final AtomicInteger h;
    final qxr b;
    final String c;
    private Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;
    private volatile boolean m;

    static {
        new AtomicReference();
        g = new qyc();
        h = new AtomicInteger();
    }

    public qxt(qxr qxrVar, String str, Object obj, boolean z) {
        if (qxrVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = qxrVar;
        this.c = str;
        this.i = obj;
        this.l = z;
        this.m = false;
    }

    public static void e() {
        h.incrementAndGet();
    }

    public static void f(Context context) {
        if (e != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (e == null) {
                synchronized (obj) {
                    qxs qxsVar = e;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (qxsVar == null || qxsVar.a != context) {
                        if (qxsVar != null) {
                            qwu.a();
                            qxv.a();
                            qwz.a();
                        }
                        e = new qxs(context, rnt.y(new qxi(context, 0)));
                        e();
                    }
                }
            }
        }
    }

    private final String g(String str) {
        boolean zIsEmpty = str.isEmpty();
        String str2 = this.c;
        return zIsEmpty ? str2 : str.concat(String.valueOf(str2));
    }

    public abstract Object a(Object obj);

    public final Object c() {
        if (this.m) {
            synchronized (this) {
                if (this.m) {
                    Object objA = a(this.i);
                    objA.getClass();
                    this.i = objA;
                    this.m = false;
                }
            }
        }
        return this.i;
    }

    public final String d() {
        return g(this.b.c);
    }

    public qxt(qxr qxrVar, String str, String str2) {
        if (qxrVar.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.b = qxrVar;
        this.c = str;
        this.i = str2;
        this.l = true;
        this.m = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x020b A[Catch: all -> 0x0239, TRY_LEAVE, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x002d, B:16:0x0039, B:22:0x0053, B:24:0x005e, B:26:0x006e, B:58:0x012c, B:60:0x0134, B:61:0x0136, B:80:0x0168, B:82:0x016b, B:83:0x016d, B:85:0x0175, B:88:0x017d, B:90:0x0183, B:91:0x0187, B:111:0x01d3, B:116:0x01e3, B:118:0x01e7, B:121:0x01f0, B:127:0x020b, B:124:0x01fd, B:114:0x01db, B:131:0x0212, B:133:0x0215, B:135:0x021b, B:138:0x0223, B:139:0x0228, B:140:0x022c, B:28:0x0080, B:30:0x0088, B:53:0x00fc, B:55:0x0102, B:56:0x011e, B:31:0x0095, B:32:0x0097, B:51:0x00ee, B:144:0x0233, B:145:0x0234, B:146:0x0236, B:147:0x0237, B:92:0x0188, B:94:0x018c, B:96:0x0194, B:98:0x019f, B:97:0x019a, B:99:0x01a1, B:101:0x01a5, B:103:0x01a9, B:105:0x01ad, B:108:0x01c5, B:109:0x01cd, B:110:0x01d2, B:33:0x0098, B:35:0x00a0, B:36:0x00ac, B:38:0x00ae, B:40:0x00ba, B:42:0x00c8, B:49:0x00e3, B:50:0x00ed, B:44:0x00d2, B:45:0x00d6, B:46:0x00dc, B:62:0x0137, B:64:0x013b, B:66:0x014a, B:73:0x015b, B:74:0x015f, B:75:0x0162, B:76:0x0163, B:65:0x013f, B:71:0x0151), top: B:163:0x001e, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0234 A[Catch: all -> 0x0239, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x002d, B:16:0x0039, B:22:0x0053, B:24:0x005e, B:26:0x006e, B:58:0x012c, B:60:0x0134, B:61:0x0136, B:80:0x0168, B:82:0x016b, B:83:0x016d, B:85:0x0175, B:88:0x017d, B:90:0x0183, B:91:0x0187, B:111:0x01d3, B:116:0x01e3, B:118:0x01e7, B:121:0x01f0, B:127:0x020b, B:124:0x01fd, B:114:0x01db, B:131:0x0212, B:133:0x0215, B:135:0x021b, B:138:0x0223, B:139:0x0228, B:140:0x022c, B:28:0x0080, B:30:0x0088, B:53:0x00fc, B:55:0x0102, B:56:0x011e, B:31:0x0095, B:32:0x0097, B:51:0x00ee, B:144:0x0233, B:145:0x0234, B:146:0x0236, B:147:0x0237, B:92:0x0188, B:94:0x018c, B:96:0x0194, B:98:0x019f, B:97:0x019a, B:99:0x01a1, B:101:0x01a5, B:103:0x01a9, B:105:0x01ad, B:108:0x01c5, B:109:0x01cd, B:110:0x01d2, B:33:0x0098, B:35:0x00a0, B:36:0x00ac, B:38:0x00ae, B:40:0x00ba, B:42:0x00c8, B:49:0x00e3, B:50:0x00ed, B:44:0x00d2, B:45:0x00d6, B:46:0x00dc, B:62:0x0137, B:64:0x013b, B:66:0x014a, B:73:0x015b, B:74:0x015f, B:75:0x0162, B:76:0x0163, B:65:0x013f, B:71:0x0151), top: B:163:0x001e, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[PHI: r3
      0x004c: PHI (r3v1 rwc) = (r3v0 rwc), (r3v0 rwc), (r3v4 rwc) binds: [B:11:0x0027, B:13:0x002b, B:15:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x0239, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x002d, B:16:0x0039, B:22:0x0053, B:24:0x005e, B:26:0x006e, B:58:0x012c, B:60:0x0134, B:61:0x0136, B:80:0x0168, B:82:0x016b, B:83:0x016d, B:85:0x0175, B:88:0x017d, B:90:0x0183, B:91:0x0187, B:111:0x01d3, B:116:0x01e3, B:118:0x01e7, B:121:0x01f0, B:127:0x020b, B:124:0x01fd, B:114:0x01db, B:131:0x0212, B:133:0x0215, B:135:0x021b, B:138:0x0223, B:139:0x0228, B:140:0x022c, B:28:0x0080, B:30:0x0088, B:53:0x00fc, B:55:0x0102, B:56:0x011e, B:31:0x0095, B:32:0x0097, B:51:0x00ee, B:144:0x0233, B:145:0x0234, B:146:0x0236, B:147:0x0237, B:92:0x0188, B:94:0x018c, B:96:0x0194, B:98:0x019f, B:97:0x019a, B:99:0x01a1, B:101:0x01a5, B:103:0x01a9, B:105:0x01ad, B:108:0x01c5, B:109:0x01cd, B:110:0x01d2, B:33:0x0098, B:35:0x00a0, B:36:0x00ac, B:38:0x00ae, B:40:0x00ba, B:42:0x00c8, B:49:0x00e3, B:50:0x00ed, B:44:0x00d2, B:45:0x00d6, B:46:0x00dc, B:62:0x0137, B:64:0x013b, B:66:0x014a, B:73:0x015b, B:74:0x015f, B:75:0x0162, B:76:0x0163, B:65:0x013f, B:71:0x0151), top: B:163:0x001e, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c A[Catch: all -> 0x0239, TryCatch #5 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x002d, B:16:0x0039, B:22:0x0053, B:24:0x005e, B:26:0x006e, B:58:0x012c, B:60:0x0134, B:61:0x0136, B:80:0x0168, B:82:0x016b, B:83:0x016d, B:85:0x0175, B:88:0x017d, B:90:0x0183, B:91:0x0187, B:111:0x01d3, B:116:0x01e3, B:118:0x01e7, B:121:0x01f0, B:127:0x020b, B:124:0x01fd, B:114:0x01db, B:131:0x0212, B:133:0x0215, B:135:0x021b, B:138:0x0223, B:139:0x0228, B:140:0x022c, B:28:0x0080, B:30:0x0088, B:53:0x00fc, B:55:0x0102, B:56:0x011e, B:31:0x0095, B:32:0x0097, B:51:0x00ee, B:144:0x0233, B:145:0x0234, B:146:0x0236, B:147:0x0237, B:92:0x0188, B:94:0x018c, B:96:0x0194, B:98:0x019f, B:97:0x019a, B:99:0x01a1, B:101:0x01a5, B:103:0x01a9, B:105:0x01ad, B:108:0x01c5, B:109:0x01cd, B:110:0x01d2, B:33:0x0098, B:35:0x00a0, B:36:0x00ac, B:38:0x00ae, B:40:0x00ba, B:42:0x00c8, B:49:0x00e3, B:50:0x00ed, B:44:0x00d2, B:45:0x00d6, B:46:0x00dc, B:62:0x0137, B:64:0x013b, B:66:0x014a, B:73:0x015b, B:74:0x015f, B:75:0x0162, B:76:0x0163, B:65:0x013f, B:71:0x0151), top: B:163:0x001e, inners: #0, #1, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxt.b():java.lang.Object");
    }
}
