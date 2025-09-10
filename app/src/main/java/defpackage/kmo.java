package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmo extends oww {
    private final AtomicReference a;
    private final kmz b;
    private final kmz c;
    private final kmz d;
    private final kmz e;
    private final kmz f;
    private final kmz g;

    public kmo(owf owfVar, kmz kmzVar, kmz kmzVar2, kmz kmzVar3, kmz kmzVar4, kmz kmzVar5, kmz kmzVar6) {
        super(owfVar);
        this.a = new AtomicReference();
        this.b = kmzVar;
        this.c = kmzVar2;
        this.d = kmzVar3;
        this.e = kmzVar4;
        this.f = kmzVar5;
        this.g = kmzVar6;
    }

    @Override // defpackage.oww
    protected final /* bridge */ /* synthetic */ Object d(Object obj) {
        kiq kiqVar = (kiq) obj;
        int iOrdinal = kiqVar.ordinal();
        kmz kmzVar = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? null : this.g : this.f : this.e : this.d : this.c : this.b;
        this.a.getAndSet(kiqVar);
        kmzVar.getClass();
        return kmzVar;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("normal", this.b);
        rwbVarW.b("normalFlash", this.c);
        rwbVarW.b("hdrPlus", this.d);
        rwbVarW.b("hdrPlusTorch", this.e);
        rwbVarW.b("hdrPlusZsl", this.f);
        return rwbVarW.toString();
    }
}
