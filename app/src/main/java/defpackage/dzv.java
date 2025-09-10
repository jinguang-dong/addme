package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzv extends uht implements uiv {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public dzv(uhb uhbVar) {
        super(3, uhbVar);
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dzv dzvVar = new dzv((uhb) obj3);
        dzvVar.c = (url) obj;
        dzvVar.b = (Object[]) obj2;
        return dzvVar.b(ufg.a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, url] */
    @Override // defpackage.uhn
    public final Object b(Object obj) {
        cpo cpoVar;
        uhi uhiVar = uhi.a;
        int i = this.a;
        rnt.aN(obj);
        if (i == 0) {
            ?? r7 = this.c;
            cpo[] cpoVarArr = (cpo[]) this.b;
            int length = cpoVarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    cpoVar = null;
                    break;
                }
                cpoVar = cpoVarArr[i2];
                if (!a.ao(cpoVar, dzn.a)) {
                    break;
                }
                i2++;
            }
            if (cpoVar == null) {
                cpoVar = dzn.a;
            }
            this.a = 1;
            if (r7.a(cpoVar, this) == uhiVar) {
                return uhiVar;
            }
        }
        return ufg.a;
    }
}
