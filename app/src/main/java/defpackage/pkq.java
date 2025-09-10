package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkq extends poh {
    public final Object a;
    public int b;

    public pkq(poo pooVar) {
        super(pooVar);
        this.a = new Object();
        this.b = 0;
    }

    private final poj j(poj pojVar) {
        if (pojVar == null) {
            return null;
        }
        this.b++;
        return new pkp(this, pojVar);
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj f() {
        synchronized (this.a) {
            if (this.b == c()) {
                return null;
            }
            return j(super.f());
        }
    }

    @Override // defpackage.poh, defpackage.poo
    public final poj g() {
        synchronized (this.a) {
            if (this.b == c()) {
                return null;
            }
            return j(super.g());
        }
    }
}
