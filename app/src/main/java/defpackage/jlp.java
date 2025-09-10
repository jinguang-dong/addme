package defpackage;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jlp {
    private static final sgv d = sgv.g("jlp");
    public final Executor b;
    private final long e;
    public final EnumMap c = new EnumMap(jll.class);
    public final Object a = new Object();

    public jlp(qhz qhzVar, Executor executor) {
        this.e = qhzVar.a;
        this.b = executor;
    }

    private final long b() {
        long j;
        synchronized (this.a) {
            EnumMap enumMap = this.c;
            Iterator it = enumMap.keySet().iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                jLongValue += ((Long) ((ovx) ((jlo) enumMap.get((jll) it.next())).c.d()).d).longValue();
            }
            j = this.e - jLongValue;
        }
        return j;
    }

    public final void a() {
        ovx ovxVar;
        Object obj = this.a;
        synchronized (obj) {
            b();
            EnumMap enumMap = this.c;
            for (jll jllVar : enumMap.keySet()) {
                ovxVar = ((jlo) enumMap.get(jllVar)).a;
                synchronized (obj) {
                    long jB = b();
                    long jLongValue = ((Long) ((owi) ((jlo) enumMap.get(jllVar)).c.c()).a).longValue();
                    if (jLongValue < 0) {
                        ((sgt) d.c().M(2825)).D("Feature (%s) reports negative shot memory: %d. Disabling.", jllVar.name(), jLongValue);
                    } else {
                        z = jLongValue <= jB;
                        jllVar.name();
                    }
                    ovxVar.a(Boolean.valueOf(z));
                }
            }
            return;
        }
        ovxVar.a(Boolean.valueOf(z));
    }
}
