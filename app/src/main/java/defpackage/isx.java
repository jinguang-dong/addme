package defpackage;

import android.os.ConditionVariable;
import com.google.googlex.gcam.BurstSpec;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class isx {
    final iby a;
    final ldi b;
    final int c;
    final pos d;
    final szh e;
    int o;
    ite n = null;
    final List f = new ArrayList();
    int k = 0;
    int l = 0;
    long m = 0;
    final szh g = new szh();
    final szh h = new szh();
    final ConditionVariable i = new ConditionVariable(true);
    final List j = new ArrayList();

    public isx(iby ibyVar, ldi ldiVar, int i, pos posVar, szh szhVar) {
        this.o = 0;
        this.a = ibyVar;
        this.b = ldiVar;
        this.d = posVar;
        this.e = szhVar;
        this.o = 0;
        BurstSpec burstSpec = ldiVar.o;
        if (burstSpec != null) {
            int i2 = 0;
            for (int i3 = 0; i3 < burstSpec.c().a(); i3++) {
                if (burstSpec.c().b(i3).d() == tbq.c) {
                    i2++;
                }
            }
            this.c = Math.min(i, i2);
        } else {
            this.c = i;
        }
        shl shlVar = shx.a;
        ibyVar.a();
    }
}
