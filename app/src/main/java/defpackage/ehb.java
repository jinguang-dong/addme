package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehb implements eha {
    private final List a;
    private elo c = null;
    private float d = -1.0f;
    private elo b = g(0.0f);

    public ehb(List list) {
        this.a = list;
    }

    private final elo g(float f) {
        List list = this.a;
        elo eloVar = (elo) list.get(list.size() - 1);
        if (f >= eloVar.c()) {
            return eloVar;
        }
        for (int size = list.size() - 2; size > 0; size--) {
            elo eloVar2 = (elo) list.get(size);
            if (this.b != eloVar2 && eloVar2.d(f)) {
                return eloVar2;
            }
        }
        return (elo) list.get(0);
    }

    @Override // defpackage.eha
    public final float a() {
        return ((elo) this.a.get(r1.size() - 1)).b();
    }

    @Override // defpackage.eha
    public final float b() {
        return ((elo) this.a.get(0)).c();
    }

    @Override // defpackage.eha
    public final elo c() {
        return this.b;
    }

    @Override // defpackage.eha
    public final boolean d(float f) {
        elo eloVar = this.c;
        elo eloVar2 = this.b;
        if (eloVar == eloVar2 && this.d == f) {
            return true;
        }
        this.c = eloVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.eha
    public final boolean e() {
        return false;
    }

    @Override // defpackage.eha
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
