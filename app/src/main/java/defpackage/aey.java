package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aey extends uht implements uiv {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ aen c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aey(aew aewVar, uhb uhbVar, int i) {
        super(3, uhbVar);
        this.e = i;
        this.c = aewVar;
    }

    @Override // defpackage.uiv
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        if (this.e != 0) {
            long j = ((bkf) obj2).a;
            aey aeyVar = new aey((aew) this.c, (uhb) obj3, 1);
            aeyVar.d = (ail) obj;
            aeyVar.b = j;
            return aeyVar.b(ufg.a);
        }
        long j2 = ((bkf) obj2).a;
        aey aeyVar2 = new aey((aez) this.c, (uhb) obj3, 0);
        aeyVar2.d = (ail) obj;
        aeyVar2.b = j2;
        return aeyVar2.b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        if (this.e != 0) {
            uhi uhiVar = uhi.a;
            int i = this.a;
            rnt.aN(obj);
            if (i == 0) {
                Object obj2 = this.d;
                long j = this.b;
                aen aenVar = this.c;
                if (aenVar.a) {
                    this.a = 1;
                    if (aenVar.r((ail) obj2, j, this) == uhiVar) {
                        return uhiVar;
                    }
                }
            }
            return ufg.a;
        }
        uhi uhiVar2 = uhi.a;
        if (this.a != 0) {
            rnt.aN(obj);
        } else {
            rnt.aN(obj);
            Object obj3 = this.d;
            long j2 = this.b;
            aen aenVar2 = this.c;
            if (aenVar2.a) {
                this.a = 1;
                if (aenVar2.r((ail) obj3, j2, this) == uhiVar2) {
                    return uhiVar2;
                }
            }
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aey(aez aezVar, uhb uhbVar, int i) {
        super(3, uhbVar);
        this.e = i;
        this.c = aezVar;
    }
}
