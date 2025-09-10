package defpackage;

import android.content.Context;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enf {
    private static final eny a = new eny("CamAgntFact");
    private static final String b;
    private static ene c;
    private static ene d;
    private static int e;
    private static int f;

    static {
        eny enyVar = eoa.a;
        String str = "0";
        try {
            str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "camera2.portability.force_api", "0");
        } catch (Exception e2) {
            enz.b(eoa.a, "Exception while getting system property: ", e2);
        }
        b = str;
    }

    public static synchronized ene a(Context context) {
        if (c() == 2) {
            if (c == null) {
                c = new emr();
                e = 1;
            } else {
                e++;
            }
            return c;
        }
        if (d == null) {
            d = new emd(context);
            f = 1;
        } else {
            f++;
        }
        return d;
    }

    public static synchronized void b() {
        ene eneVar;
        if (c() == 2) {
            int i = e - 1;
            e = i;
            if (i == 0 && (eneVar = c) != null) {
                eneVar.g(true);
                enu enuVar = ((emr) eneVar).f;
                synchronized (enuVar.b) {
                    enuVar.b = true;
                }
                Queue queue = enuVar.a;
                synchronized (queue) {
                    queue.notifyAll();
                }
                ((emr) eneVar).e.b();
                c = null;
            }
        } else {
            int i2 = f - 1;
            f = i2;
            if (i2 == 0 && d != null) {
                d = null;
            }
        }
    }

    private static int c() {
        String str = b;
        if (str.equals("1")) {
            enz.e(a);
            return 2;
        }
        if (!str.equals("2")) {
            return 2;
        }
        enz.e(a);
        return 3;
    }
}
