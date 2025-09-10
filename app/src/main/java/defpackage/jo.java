package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jo implements Runnable {
    public static final ThreadLocal a = new ThreadLocal();
    static final Comparator b = new bur(1);
    long d;
    public long e;
    public final ArrayList c = new ArrayList();
    private final ArrayList f = new ArrayList();

    private static final lg b(RecyclerView recyclerView, int i, long j) {
        int iC = recyclerView.g.c();
        for (int i2 = 0; i2 < iC; i2++) {
            lg lgVarI = RecyclerView.i(recyclerView.g.f(i2));
            if (lgVarI.c == i && !lgVarI.s()) {
                return null;
            }
        }
        kv kvVar = recyclerView.e;
        if (j == Long.MAX_VALUE) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } finally {
                recyclerView.S(false);
                Trace.endSection();
            }
        }
        recyclerView.Q();
        lg lgVarO = kvVar.o(i, j);
        if (lgVarO != null) {
            if (!lgVarO.r() || lgVarO.s()) {
                kvVar.c(lgVarO, false);
            } else {
                kvVar.j(lgVarO.a);
            }
        }
        return lgVarO;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r && this.d == 0) {
            this.d = RecyclerView.at();
            recyclerView.post(this);
        }
        jm jmVar = recyclerView.N;
        jmVar.a = i;
        jmVar.b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo.run():void");
    }
}
