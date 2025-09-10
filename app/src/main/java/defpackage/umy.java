package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class umy {
    public static final uhf a(uhf uhfVar, uhf uhfVar2) {
        return !e(uhfVar2) ? uhfVar.plus(uhfVar2) : d(uhfVar, uhfVar2, false);
    }

    public static final uhf b(und undVar, uhf uhfVar) {
        uhf uhfVarD = d(undVar.c(), uhfVar, true);
        uhf uhfVarPlus = unf.a ? uhfVarD.plus(new unb(unf.c.incrementAndGet())) : uhfVarD;
        una unaVar = unr.a;
        return (uhfVarD == unaVar || uhfVarD.get(uhc.k) != null) ? uhfVarPlus : uhfVarPlus.plus(unaVar);
    }

    public static final upp c(uhb uhbVar, uhf uhfVar, Object obj) {
        upp uppVar = null;
        if (!(uhbVar instanceof uhq)) {
            return null;
        }
        if (uhfVar.get(upq.a) != null) {
            uhq uhqVarCK = (uhq) uhbVar;
            while (true) {
                if ((uhqVarCK instanceof uno) || (uhqVarCK = uhqVarCK.cK()) == null) {
                    break;
                }
                if (uhqVarCK instanceof upp) {
                    uppVar = (upp) uhqVarCK;
                    break;
                }
            }
            if (uppVar != null) {
                uppVar.U(uhfVar, obj);
            }
        }
        return uppVar;
    }

    private static final uhf d(uhf uhfVar, uhf uhfVar2, final boolean z) {
        boolean zE = e(uhfVar);
        boolean zE2 = e(uhfVar2);
        if (!zE && !zE2) {
            return uhfVar.plus(uhfVar2);
        }
        final uka ukaVar = new uka();
        ukaVar.a = uhfVar2;
        uhg uhgVar = uhg.a;
        uhf uhfVar3 = (uhf) uhfVar.fold(uhgVar, new uiu() { // from class: umx
            @Override // defpackage.uiu
            public final Object a(Object obj, Object obj2) {
                uhf uhfVar4 = (uhf) obj;
                uhd uhdVar = (uhd) obj2;
                if (!(uhdVar instanceof umv)) {
                    return uhfVar4.plus(uhdVar);
                }
                uka ukaVar2 = ukaVar;
                if (((uhf) ukaVar2.a).get(uhdVar.getKey()) == null) {
                    return uhfVar4.plus(z ? ((umv) uhdVar).a() : (umv) uhdVar);
                }
                ukaVar2.a = ((uhf) ukaVar2.a).minusKey(uhdVar.getKey());
                return uhfVar4.plus(((umv) uhdVar).b());
            }
        });
        if (zE2) {
            ukaVar.a = ((uhf) ukaVar.a).fold(uhgVar, new aud(9));
        }
        return uhfVar3.plus((uhf) ukaVar.a);
    }

    private static final boolean e(uhf uhfVar) {
        return ((Boolean) uhfVar.fold(false, new ane(10))).booleanValue();
    }
}
