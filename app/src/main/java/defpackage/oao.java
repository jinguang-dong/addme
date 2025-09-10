package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class oao extends oan {
    private boolean a;

    protected oao(oar oarVar) {
        super(oarVar);
    }

    public final void A() {
        a();
        this.a = true;
    }

    public final boolean B() {
        return this.a;
    }

    protected abstract void a();

    public final void z() {
        if (!B()) {
            throw new IllegalStateException("Not initialized");
        }
    }
}
