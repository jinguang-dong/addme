package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahi implements PointerInputEventHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ahi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, uif] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final bqc bqcVar, uhb uhbVar) throws Throwable {
        int i = this.b;
        int i2 = 0;
        int i3 = 1;
        if (i == 0) {
            bqo bqoVar = new bqo();
            ujz ujzVar = new ujz();
            Object obj = this.a;
            ahn ahnVar = (ahn) obj;
            bry bryVar = ahnVar.g;
            ujzVar.a = bryVar != null ? byi.t(bryVar) : 0L;
            Object objI = ung.i(new ahh(ahnVar, bqcVar, new cgt(obj, bqoVar, i3), new ahg(bqoVar, bqcVar, ahnVar, i2), new aei(obj, 2), new aei(obj, 3), new ais(ahnVar, ujzVar, bqoVar, i3), null), uhbVar);
            return objI == uhi.a ? objI : ufg.a;
        }
        if (i == 1) {
            Object objA = ((aen) this.a).a(bqcVar, uhbVar);
            return objA == uhi.a ? objA : ufg.a;
        }
        final ocq ocqVarBN = byi.bN(bqcVar);
        final bqo bqoVar2 = new bqo();
        final ?? r12 = this.a;
        Object objBa = a.ba(bqcVar, new dku(new add(6), i3), new add(5), new agx(i3), new agx(i2), null, new uiu() { // from class: mta
            @Override // defpackage.uiu
            public final Object a(Object obj2, Object obj3) {
                bpv bpvVar = (bpv) obj2;
                bpvVar.getClass();
                long j = bpvVar.c;
                bqo bqoVar3 = bqoVar2;
                bqoVar3.c(bpvVar.b, j);
                if (Math.abs(byi.bM(ocqVarBN, Float.intBitsToFloat((int) (((bkf) obj3).a & 4294967295L)), Float.intBitsToFloat((int) (bqoVar3.a() & 4294967295L)))) >= ((int) (((bql) bqcVar).g & 4294967295L))) {
                    r12.a();
                }
                return ufg.a;
            }
        }, uhbVar);
        uhi uhiVar = uhi.a;
        if (objBa != uhiVar) {
            objBa = ufg.a;
        }
        return objBa == uhiVar ? objBa : ufg.a;
    }
}
