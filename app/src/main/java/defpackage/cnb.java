package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cnb {
    public static final zd a = new zd(16);
    public static final ExecutorService b;
    public static final Object c;
    public static final aaa d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new psh(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new aaa();
    }

    public static String a(List list, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((cmx) list.get(i2)).f);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0206 A[Catch: all -> 0x0237, TRY_ENTER, TryCatch #11 {all -> 0x0237, blocks: (B:48:0x00fa, B:91:0x0206, B:92:0x0209, B:103:0x0230, B:104:0x0233, B:105:0x0236), top: B:217:0x00fa, outer: #10 }] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.qev b(java.lang.String r28, android.content.Context r29, java.util.List r30, int r31) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnb.b(java.lang.String, android.content.Context, java.util.List, int):qev");
    }
}
