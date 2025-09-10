package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltz implements ltp, paq {
    public final pau a;
    final /* synthetic */ lua b;
    private final Executor c;

    public ltz(lua luaVar, pau pauVar, Executor executor) {
        this.b = luaVar;
        this.a = pauVar;
        this.c = executor;
    }

    @Override // defpackage.ltp
    public final void a(String str) {
        Object objD;
        lua luaVar = this.b;
        if (!luaVar.b.equals(str) || (objD = luaVar.d()) == null) {
            return;
        }
        this.c.execute(new lor(this, objD, 4, (byte[]) null));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.a.g(this);
    }
}
