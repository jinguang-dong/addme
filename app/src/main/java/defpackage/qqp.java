package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qqp {
    public final qqn a;
    public final uem b;
    public final qvr c;
    public final uem d;
    public final tzj e;
    private final qnl f;
    private final Executor g;

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, uem] */
    public qqp(qqn qqnVar, uem uemVar, qnl qnlVar, rcg rcgVar, uem uemVar2, Executor executor, tzj tzjVar, uem uemVar3) {
        this.a = qqnVar;
        this.f = qnlVar;
        this.b = uemVar;
        this.g = executor;
        this.d = new iyd(uemVar2, 5);
        Context contextB = ((imm) rcgVar.f).b();
        Executor executor2 = (Executor) rcgVar.b.a();
        executor2.getClass();
        qvu qvuVar = (qvu) rcgVar.c.a();
        qvuVar.getClass();
        ((Boolean) rcgVar.a.a()).booleanValue();
        this.c = new qvr(contextB, executor2, qvuVar, tzjVar, true, (rwc) ((tzu) rcgVar.e).a, uemVar3, ((qvq) rcgVar.d).a());
        this.e = tzjVar;
    }

    public final long a(String str) {
        if (this.f.a) {
            return -1L;
        }
        qvr qvrVar = this.c;
        qvo qvoVar = qvrVar.c;
        int iIntValue = ((Integer) qvoVar.b.a()).intValue();
        if (iIntValue == 0) {
            return -1L;
        }
        if (iIntValue != Integer.MAX_VALUE) {
            synchronized (qvoVar.a) {
                if (qvoVar.c >= iIntValue) {
                    long j = qvoVar.d;
                    qpt qptVar = qvoVar.e;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return -1L;
                    }
                }
            }
        }
        boolean z = qvrVar.b;
        qvv qvvVar = qvrVar.a;
        if (z) {
            return qvvVar.a(str);
        }
        return -1L;
    }

    public final syu b(final qqm qqmVar) {
        return this.f.a ? ske.K() : ske.R(new sxh() { // from class: qqo
            /* JADX WARN: Removed duplicated region for block: B:220:0x0573 A[Catch: RuntimeException -> 0x0670, TryCatch #2 {RuntimeException -> 0x0670, blocks: (B:212:0x054f, B:214:0x0553, B:216:0x0557, B:217:0x0559, B:219:0x055e, B:220:0x0573, B:222:0x0579, B:224:0x0587, B:226:0x0594, B:227:0x0596, B:229:0x059e), top: B:287:0x054f }] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, rww] */
            /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.Object, rww] */
            /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object, uem] */
            /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object, uem] */
            /* JADX WARN: Type inference failed for: r11v81, types: [java.lang.Object, uem] */
            /* JADX WARN: Type inference failed for: r4v21, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r6v6, types: [sgt, shi] */
            @Override // defpackage.sxh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.syu a() {
                /*
                    Method dump skipped, instructions count: 1745
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qqo.a():syu");
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }
}
