package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qut extends qpt implements qov, qqs {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final qqp b;
    public final Context e;
    public final tzj f;
    public final qvj g;
    private final qoz h;
    private final Executor i;

    public qut(qqq qqqVar, Context context, qoz qozVar, Executor executor, tzj tzjVar, qvj qvjVar, uem uemVar) {
        super((char[]) null);
        this.b = qqqVar.a(executor, tzjVar, uemVar);
        this.i = executor;
        this.e = context;
        this.f = tzjVar;
        this.g = qvjVar;
        this.h = qozVar;
    }

    @Override // defpackage.qqs
    public final void cA() {
        this.h.a(this);
    }

    @Override // defpackage.qov
    public final void i(qna qnaVar) {
        this.h.b(this);
        ske.R(new sxh() { // from class: qus
            /* JADX WARN: Removed duplicated region for block: B:176:0x041f  */
            /* JADX WARN: Removed duplicated region for block: B:179:0x0443  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, uem] */
            /* JADX WARN: Type inference failed for: r12v24, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r2v14, types: [sgt, shi] */
            /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, uem] */
            /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, uem] */
            @Override // defpackage.sxh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.syu a() throws java.lang.Throwable {
                /*
                    Method dump skipped, instructions count: 1138
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qus.a():syu");
            }
        }, this.i);
    }

    @Override // defpackage.qov
    public final /* synthetic */ void j(qna qnaVar) {
    }
}
