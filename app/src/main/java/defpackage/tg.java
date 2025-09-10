package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tg extends uht implements uiu {
    /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(uhb uhbVar, int i) {
        super(2, uhbVar);
        this.b = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            return ((tg) c((byi) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i == 1) {
            return ((tg) c((byi) obj, (uhb) obj2)).b(ufg.a);
        }
        if (i != 2) {
            return ((tg) c((uta) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((tg) c((bak) obj, (uhb) obj2)).b(ufg.a);
    }

    @Override // defpackage.uhn
    public final Object b(Object obj) {
        int i = this.b;
        if (i == 0) {
            rnt.aN(obj);
            return Boolean.valueOf(!(((byi) this.a) instanceof th));
        }
        if (i != 1) {
            if (i != 2) {
                rnt.aN(obj);
                return Boolean.valueOf(((uta) this.a) != uta.a);
            }
            rnt.aN(obj);
            return Boolean.valueOf(((bak) this.a) == bak.a);
        }
        rnt.aN(obj);
        byi byiVar = (byi) this.a;
        if (!(byiVar instanceof td) && !(byiVar instanceof tc)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        int i = this.b;
        if (i == 0) {
            tg tgVar = new tg(uhbVar, 0);
            tgVar.a = obj;
            return tgVar;
        }
        if (i == 1) {
            tg tgVar2 = new tg(uhbVar, 1, (byte[]) null);
            tgVar2.a = obj;
            return tgVar2;
        }
        if (i != 2) {
            tg tgVar3 = new tg(uhbVar, 3, (short[]) null);
            tgVar3.a = obj;
            return tgVar3;
        }
        tg tgVar4 = new tg(uhbVar, 2, (char[]) null);
        tgVar4.a = obj;
        return tgVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(uhb uhbVar, int i, byte[] bArr) {
        super(2, uhbVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(uhb uhbVar, int i, char[] cArr) {
        super(2, uhbVar);
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(uhb uhbVar, int i, short[] sArr) {
        super(2, uhbVar);
        this.b = i;
    }
}
