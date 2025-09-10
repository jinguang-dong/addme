package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bxr extends ujn implements uiu {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(Object obj, int i, byte[] bArr) {
        super(2, obj, afg.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.a = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        boolean zA;
        int i = this.a;
        if (i == 0) {
            bxv bxvVar = (bxv) this.e;
            Class cls = bxv.a;
            return Boolean.valueOf(bxvVar.B((bjm) obj, (bkg) obj2));
        }
        if (i != 1) {
            nkx nkxVar = (nkx) obj;
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            nkxVar.getClass();
            ((nfc) this.e).c(nkxVar, zBooleanValue);
            return ufg.a;
        }
        bka bkaVar = (bka) obj;
        bka bkaVar2 = (bka) obj2;
        afg afgVar = (afg) this.e;
        if (afgVar.w && (zA = bkaVar2.a()) != bkaVar.a()) {
            afgVar.a.a(Boolean.valueOf(zA));
            if (zA) {
                ukc.C(afgVar.C(), null, 0, new vf(afgVar, (uhb) null, 7), 3);
                aoq aoqVarF = afgVar.f();
                if (aoqVarF != null) {
                    aoqVarF.c();
                } else {
                    aoqVarF = null;
                }
                afgVar.c = aoqVarF;
                afgVar.d();
            } else {
                aoq aoqVar = afgVar.c;
                if (aoqVar != null) {
                    aoqVar.a();
                }
                afgVar.c = null;
                afh afhVarA = afgVar.a();
                if (afhVarA != null) {
                    afhVarA.a(null);
                }
            }
            bad.D(afgVar);
            ocq ocqVar = afgVar.e;
            if (ocqVar != null) {
                if (zA) {
                    ajx ajxVar = afgVar.b;
                    if (ajxVar != null) {
                        afgVar.h(ocqVar, new ajy(ajxVar));
                        afgVar.b = null;
                    }
                    ajx ajxVar2 = new ajx();
                    afgVar.h(ocqVar, ajxVar2);
                    afgVar.b = ajxVar2;
                } else {
                    ajx ajxVar3 = afgVar.b;
                    if (ajxVar3 != null) {
                        afgVar.h(ocqVar, new ajy(ajxVar3));
                        afgVar.b = null;
                    }
                }
            }
        }
        return ufg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(Object obj, int i) {
        super(2, obj, bxv.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxr(Object obj, int i, char[] cArr) {
        super(2, obj, nfc.class, "updateSelectedSupermode", "updateSelectedSupermode(Lcom/google/android/apps/camera/uistate/api/ApplicationSupermode;Z)V", 0);
        this.a = i;
    }
}
