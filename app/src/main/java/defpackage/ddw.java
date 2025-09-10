package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ddw implements dey {
    public final dfa f;
    public final String g;
    public boolean h;

    public ddw(dfa dfaVar, String str) {
        this.f = dfaVar;
        this.g = str;
    }

    protected final void k() {
        if (this.h) {
            cog.q(21, "statement is closed");
            throw new uer();
        }
    }

    @Override // defpackage.dey
    public final /* synthetic */ boolean l() {
        return b(0) != 0;
    }

    protected final void m() {
        this.h = true;
    }
}
