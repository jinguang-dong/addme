package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Optional;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tej implements paq {
    public final tdv a;
    public tfv b;
    public sbp c;

    public tej(tdv tdvVar) {
        szv.a.m();
        Method method = tsi.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                tsi.c(((Long) tsi.b.invoke(objInvoke, null)).longValue(), ((Integer) tsi.c.invoke(objInvoke, null)).intValue());
            } catch (Throwable th) {
                throw new AssertionError(th);
            }
        } else {
            tsi.b(System.currentTimeMillis());
        }
        this.a = tdvVar;
        int i = sbp.d;
        this.c = sex.a;
    }

    public final Optional a() {
        return this.a.a();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        Iterable$EL.forEach(this.c, new tch(9));
        this.a.close();
    }
}
