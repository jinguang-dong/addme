package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpb extends owx {
    private final kpa a;

    public kpb(owq owqVar, kpa kpaVar) {
        super(owqVar);
        this.a = kpaVar;
    }

    @Override // defpackage.owx
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        String str = (String) obj;
        kpa kpaVar = kpa.AUTO;
        if (kpaVar.d.equals(str)) {
            return kpaVar;
        }
        kpa kpaVar2 = kpa.c;
        if (kpaVar2.d.equals(str)) {
            return kpaVar2;
        }
        kpa kpaVar3 = this.a;
        kpa kpaVar4 = kpa.a;
        return kpaVar4.d.equals(str) ? kpaVar4 : kpaVar3;
    }

    @Override // defpackage.owx
    protected final /* synthetic */ Object c(Object obj) {
        return ((kpa) obj).d;
    }
}
