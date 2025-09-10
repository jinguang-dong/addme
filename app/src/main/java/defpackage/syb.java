package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public class syb extends syc {
    private final Future a;

    protected syb(Future future) {
        future.getClass();
        this.a = future;
    }

    @Override // defpackage.syc, defpackage.sai
    protected final /* synthetic */ Object a() {
        return this.a;
    }

    @Override // defpackage.syc
    protected final Future fj() {
        return this.a;
    }
}
