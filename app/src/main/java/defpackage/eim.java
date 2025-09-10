package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eim implements eip {
    private final eif a;
    private final eif b;

    public eim(eif eifVar, eif eifVar2) {
        this.a = eifVar;
        this.b = eifVar2;
    }

    @Override // defpackage.eip
    public final ehd a() {
        return new ehq(this.a.a(), this.b.a());
    }

    @Override // defpackage.eip
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.eip
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
