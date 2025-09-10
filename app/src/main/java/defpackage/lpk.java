package defpackage;

import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lpk implements pau {
    Integer a = -1;
    boolean b;
    final /* synthetic */ Executor c;
    final /* synthetic */ pau d;
    final /* synthetic */ lpl e;

    public lpk(lpl lplVar, Executor executor, pau pauVar) {
        this.c = executor;
        this.d = pauVar;
        this.e = lplVar;
    }

    @Override // defpackage.pau
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Integer num = (Integer) obj;
        if (Objects.equals(num, this.a) || num.intValue() < 0) {
            return;
        }
        if (num.intValue() >= this.e.a) {
            if (!this.b) {
                this.b = true;
            }
            this.a = num;
        }
        this.b = false;
        this.c.execute(new lor(this.d, num, 2));
        this.a = num;
    }
}
