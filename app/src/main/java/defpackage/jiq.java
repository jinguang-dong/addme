package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jiq implements jiw {
    private final sgv a = sgv.g("jiq");

    @Override // defpackage.jiw
    public final synchronized void a(sod sodVar) {
        sgv sgvVar = this.a;
        sgt sgtVar = (sgt) sgvVar.c().M(2780);
        soc socVarB = soc.b(sodVar.f);
        if (socVarB == null) {
            socVarB = soc.UNKNOWN_TYPE;
        }
        sgtVar.v("----------------------\nStart event: %s", socVarB);
        for (String str : sodVar.toString().split("\n", -1)) {
            ((sgt) sgvVar.c().M(2782)).v("%s", str);
        }
        sgt sgtVar2 = (sgt) sgvVar.c().M(2781);
        soc socVarB2 = soc.b(sodVar.f);
        if (socVarB2 == null) {
            socVarB2 = soc.UNKNOWN_TYPE;
        }
        sgtVar2.v("End Event: %s\n", socVarB2);
    }
}
